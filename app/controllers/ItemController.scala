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
    Ok(views.html.item.search(ItemDAO.all()))
  }

  def details(id: Long) = Action { implicit request =>
    Ok(views.html.item.details(ItemDAO.byId(id)))
  }

  def create = SecuredAction { implicit request =>
    Ok(views.html.item.create(itemForm))
  }

  def handleCreate = Action { implicit request =>
    itemForm.bindFromRequest.fold(
      errors => BadRequest(views.html.item.create(errors)),
      item => {
        val id = ItemDAO.create(item.title, item.description, item.price).get
        Redirect(routes.ItemController.details(id))
      }
    )
  }

  def edit(id: Long) = Action { implicit request =>
    val item = ItemDAO.byId(id)
    Ok(views.html.item.edit(id, itemForm.fill(item)))
  }

  def handleEdit(id: Long) = Action { implicit request =>
    itemForm.bindFromRequest.fold(
      errors => BadRequest(views.html.item.create(errors)),
      item => {
        ItemDAO.update(id, item)
        Redirect(routes.ItemController.details(id))
      }
    )
  }

  def delete(id: Long) = Action { implicit  request =>
    ItemDAO.delete(id)
    // TODO: redirect to user home, when exists
    Redirect(routes.ItemController.all)
  }
}
