package dataaccess

import anorm.SqlParser._
import anorm._
import models.Item
import play.api.db.DB
import play.api.Play.current
import anorm.~

/**
 * Created with IntelliJ IDEA.
 * User: hornisch
 * Date: 14.05.13
 * Time: 16:16
 * To change this template use File | Settings | File Templates.
 */
object ItemDAO {

  val item = {
    get[Long]("id") ~
      get[String]("title") ~
      get[String]("description") ~
      get[Int]("price") map {
      case id~title~description~price => Item(id, title, description, price)
    }
  }

  def all() : List[Item] = DB.withConnection { implicit c =>
    SQL("select * from item").as(item *)
  }

  def create(title: String, description: String, price: Int) : Option[Long] = {
    var id : Option[Long] = null

    DB.withConnection{ implicit c =>
      id = SQL("insert into item(title, description, price) values ({title}, {description}, {price})").on(
        "title" -> title, "description" -> description, "price" -> price).executeInsert()
    }
    id
  }

  def delete(id: Long) {
    DB.withConnection { implicit c =>
      SQL("delete from item where id = {id}").on("id" -> id).executeUpdate()
    }
  }
}
