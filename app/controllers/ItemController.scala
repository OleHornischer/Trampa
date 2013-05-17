package controllers

import play.api.mvc._
import dataaccess.ItemDAO
import play.api.data.Form
import play.api.data.Forms._
import models.Item
import securesocial.core.{Identity, Authorization}

/**
 * Created with IntelliJ IDEA.
 * User: hornisch
 * Date: 14.05.13
 * Time: 17:33
 * To change this template use File | Settings | File Templates.
 */
object ItemController extends Controller with securesocial.core.SecureSocial {


  val itemForm = Form(
    mapping (
      "id" -> ignored(0L),
      "title" -> nonEmptyText,
      "description" -> nonEmptyText,
      "price" -> number.verifying( _ > 0)
    ) (Item.apply) (Item.unapply)
  )

  def all = Action {
    Ok(views.html.index(ItemDAO.all(), itemForm))
  }

  def create = Action { implicit request =>
    itemForm.bindFromRequest.fold(
      errors => BadRequest(views.html.index(ItemDAO.all(), errors)),
      item => {
        ItemDAO.create(item.title, item.description, item.price)
        Redirect(routes.ItemController.all)
      }
    )
  }

  def delete(id: Long) = Action { implicit  request =>
    ItemDAO.delete(id)
    Redirect(routes.ItemController.all)
  }
}
