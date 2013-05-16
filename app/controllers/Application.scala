package controllers

import play.api.mvc._


object Application extends Controller {
  
  def index = Action {
    Redirect(routes.ItemController.all)
  }

  def help =  Action {
    Ok(views.html.help("Play 2.0 Help"))
  }

  def authenticate = TODO
}
