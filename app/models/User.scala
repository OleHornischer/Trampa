package models

import models._
import play.libs.Scala

/**
 * Created with IntelliJ IDEA.
 * User: hornisch
 * Date: 13.05.13
 * Time: 17:02
 * To change this template use File | Settings | File Templates.
 */
case class User(id: Long,
                firstName: String,
                lastName: String,
                userName: String,
                email: String,
                password: String,
                street: String,
                houseNumber: String,
                postcode: String,
                countryCode: String,
                balance: Int) {

  override def equals(that: Any): Boolean = {
    that match {
      case u: User => this.id equals u.id
      case _ => false
    }
  }
}
