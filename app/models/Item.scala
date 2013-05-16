package models

import anorm._
import anorm.SqlParser._
import play.api.db._
import play.api.Play.current

/**
 * Created with IntelliJ IDEA.
 * User: hornisch
 * Date: 12.05.13
 * Time: 18:26
 * To change this template use File | Settings | File Templates.
 */
case class Item(id: Long, title: String, description: String, price: Int) {
  override def equals(that: Any): Boolean = {
    that match {
      case i: Item => this.id.equals(i.id)
      case _ => false
    }
  }
}

