package dataaccess

import anorm.SqlParser._
import anorm._
import play.api.db.DB
import anorm.~
import models.User
import play.api.Play.current

/**
 * Created with IntelliJ IDEA.
 * User: hornisch
 * Date: 14.05.13
 * Time: 19:44
 * To change this template use File | Settings | File Templates.
 */
object UserDAO {

  val user = {
    get[Long]("id") ~
      get[String]("firstName") ~
      get[String]("lastName") ~
      get[String]("userName") ~
      get[String]("email") ~
      get[String]("password") ~
      get[String]("street") ~
      get[String]("houseNumber") ~
      get[String]("postcode") ~
      get[String]("countryCode") ~
      get[Int]("balance") map {
      case id ~ firstName ~ lastName ~ userName ~ email ~ password ~ street ~ houseNumber ~ postcode ~ countryCode ~ balance =>
        User(id, firstName, lastName, userName, email, password, street, houseNumber, postcode, countryCode, balance)
    }
  }

  def all(): List[User] = DB.withConnection {
    implicit c =>
      SQL("select * from user").as(user *)
  }

  def byId(option: Option[String]): Option[User] = {
    Option(DB.withConnection {
      implicit c =>
        SQL("select * from user where id = {id}").on("id" -> option.getOrElse(None)).single(user)
    })
  }

  def create(firstName: String,
             lastName: String,
             userName: String,
             email: String,
             password: String,
             street: String,
             houseNumber: String,
             postcode: String,
             countryCode: String,
             balance: Int): Option[Long] = {
    var id: Option[Long] = null

    DB.withConnection {
      implicit c =>
        id = SQL( """
                   insert into user(firstName, lastName, userName, email, password, street, houseNumber, postcode, countryCode, balance)
                   values (
                    {firstName}, {lastName}, {userName}, {email}, {password}, {street}, {houseNumber}, {postcode}, {countryCode}, {balance}
                   )
                  """).on(
          "firstName" -> firstName,
          "lastName" -> lastName,
          "userName" -> userName,
          "email" -> email,
          "password" -> password,
          "street" -> street,
          "houseNumber" -> houseNumber,
          "postcode" -> postcode,
          "countryCode" -> countryCode,
          "balance" -> balance).executeInsert()
    }
    id
  }

  def delete(id: Long) {
    DB.withConnection {
      implicit c =>
        SQL("delete from user where id = {id}").on("id" -> id).executeUpdate()
    }
  }

}








