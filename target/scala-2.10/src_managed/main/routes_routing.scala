// @SOURCE:C:/Projects/Trampa_Play/conf/routes
// @HASH:158329e5476813cab46f7971d934e0c62f318848
// @DATE:Thu May 16 13:01:15 CEST 2013


import play.core._
import play.core.Router._
import play.core.j._

import play.api.mvc._


import Router.queryString

object Routes extends Router.Routes {

private var _prefix = "/"

def setPrefix(prefix: String) {
  _prefix = prefix  
  List[(String,Routes)]().foreach {
    case (p, router) => router.setPrefix(prefix + (if(prefix.endsWith("/")) "" else "/") + p)
  }
}

def prefix = _prefix

lazy val defaultPrefix = { if(Routes.prefix.endsWith("/")) "" else "/" } 


// @LINE:6
private[this] lazy val controllers_Application_index0 = Route("GET", PathPattern(List(StaticPart(Routes.prefix))))
        

// @LINE:7
private[this] lazy val controllers_Application_help1 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("help"))))
        

// @LINE:10
private[this] lazy val securesocial_controllers_LoginPage_login2 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("login"))))
        

// @LINE:11
private[this] lazy val securesocial_controllers_LoginPage_logout3 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("logout"))))
        

// @LINE:14
private[this] lazy val securesocial_controllers_Registration_startSignUp4 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("signup"))))
        

// @LINE:15
private[this] lazy val securesocial_controllers_Registration_handleStartSignUp5 = Route("POST", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("signup"))))
        

// @LINE:16
private[this] lazy val securesocial_controllers_Registration_signUp6 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("signup/"),DynamicPart("token", """[^/]+"""))))
        

// @LINE:17
private[this] lazy val securesocial_controllers_Registration_handleSignUp7 = Route("POST", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("signup/"),DynamicPart("token", """[^/]+"""))))
        

// @LINE:18
private[this] lazy val securesocial_controllers_Registration_startResetPassword8 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("reset"))))
        

// @LINE:19
private[this] lazy val securesocial_controllers_Registration_handleStartResetPassword9 = Route("POST", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("reset"))))
        

// @LINE:20
private[this] lazy val securesocial_controllers_Registration_resetPassword10 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("reset/"),DynamicPart("token", """[^/]+"""))))
        

// @LINE:21
private[this] lazy val securesocial_controllers_Registration_handleResetPassword11 = Route("POST", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("reset/"),DynamicPart("token", """[^/]+"""))))
        

// @LINE:22
private[this] lazy val securesocial_controllers_PasswordChange_page12 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("password"))))
        

// @LINE:23
private[this] lazy val securesocial_controllers_PasswordChange_handlePasswordChange13 = Route("POST", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("password"))))
        

// @LINE:26
private[this] lazy val securesocial_controllers_ProviderController_authenticate14 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("authenticate/"),DynamicPart("provider", """[^/]+"""))))
        

// @LINE:27
private[this] lazy val securesocial_controllers_ProviderController_authenticateByPost15 = Route("POST", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("authenticate/"),DynamicPart("provider", """[^/]+"""))))
        

// @LINE:28
private[this] lazy val securesocial_controllers_ProviderController_notAuthorized16 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("not-authorized"))))
        

// @LINE:32
private[this] lazy val controllers_ItemController_all17 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("items"))))
        

// @LINE:33
private[this] lazy val controllers_ItemController_create18 = Route("POST", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("items"))))
        

// @LINE:34
private[this] lazy val controllers_ItemController_delete19 = Route("POST", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("items/"),DynamicPart("id", """[^/]+"""),StaticPart("/delete"))))
        

// @LINE:37
private[this] lazy val controllers_Assets_at20 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("assets/"),DynamicPart("file", """.+"""))))
        
def documentation = List(("""GET""", prefix,"""controllers.Application.index"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """help""","""controllers.Application.help"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """login""","""securesocial.controllers.LoginPage.login"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """logout""","""securesocial.controllers.LoginPage.logout"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """signup""","""securesocial.controllers.Registration.startSignUp"""),("""POST""", prefix + (if(prefix.endsWith("/")) "" else "/") + """signup""","""securesocial.controllers.Registration.handleStartSignUp"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """signup/$token<[^/]+>""","""securesocial.controllers.Registration.signUp(token:String)"""),("""POST""", prefix + (if(prefix.endsWith("/")) "" else "/") + """signup/$token<[^/]+>""","""securesocial.controllers.Registration.handleSignUp(token:String)"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """reset""","""securesocial.controllers.Registration.startResetPassword"""),("""POST""", prefix + (if(prefix.endsWith("/")) "" else "/") + """reset""","""securesocial.controllers.Registration.handleStartResetPassword"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """reset/$token<[^/]+>""","""securesocial.controllers.Registration.resetPassword(token:String)"""),("""POST""", prefix + (if(prefix.endsWith("/")) "" else "/") + """reset/$token<[^/]+>""","""securesocial.controllers.Registration.handleResetPassword(token:String)"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """password""","""securesocial.controllers.PasswordChange.page"""),("""POST""", prefix + (if(prefix.endsWith("/")) "" else "/") + """password""","""securesocial.controllers.PasswordChange.handlePasswordChange"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """authenticate/$provider<[^/]+>""","""securesocial.controllers.ProviderController.authenticate(provider:String)"""),("""POST""", prefix + (if(prefix.endsWith("/")) "" else "/") + """authenticate/$provider<[^/]+>""","""securesocial.controllers.ProviderController.authenticateByPost(provider:String)"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """not-authorized""","""securesocial.controllers.ProviderController.notAuthorized"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """items""","""controllers.ItemController.all"""),("""POST""", prefix + (if(prefix.endsWith("/")) "" else "/") + """items""","""controllers.ItemController.create"""),("""POST""", prefix + (if(prefix.endsWith("/")) "" else "/") + """items/$id<[^/]+>/delete""","""controllers.ItemController.delete(id:Long)"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """assets/$file<.+>""","""controllers.Assets.at(path:String = "/public", file:String)""")).foldLeft(List.empty[(String,String,String)]) { (s,e) => e match {
  case r @ (_,_,_) => s :+ r.asInstanceOf[(String,String,String)]
  case l => s ++ l.asInstanceOf[List[(String,String,String)]] 
}}
       
    
def routes:PartialFunction[RequestHeader,Handler] = {        

// @LINE:6
case controllers_Application_index0(params) => {
   call { 
        invokeHandler(controllers.Application.index, HandlerDef(this, "controllers.Application", "index", Nil,"GET", """ Home page""", Routes.prefix + """"""))
   }
}
        

// @LINE:7
case controllers_Application_help1(params) => {
   call { 
        invokeHandler(controllers.Application.help, HandlerDef(this, "controllers.Application", "help", Nil,"GET", """""", Routes.prefix + """help"""))
   }
}
        

// @LINE:10
case securesocial_controllers_LoginPage_login2(params) => {
   call { 
        invokeHandler(securesocial.controllers.LoginPage.login, HandlerDef(this, "securesocial.controllers.LoginPage", "login", Nil,"GET", """ Login page""", Routes.prefix + """login"""))
   }
}
        

// @LINE:11
case securesocial_controllers_LoginPage_logout3(params) => {
   call { 
        invokeHandler(securesocial.controllers.LoginPage.logout, HandlerDef(this, "securesocial.controllers.LoginPage", "logout", Nil,"GET", """""", Routes.prefix + """logout"""))
   }
}
        

// @LINE:14
case securesocial_controllers_Registration_startSignUp4(params) => {
   call { 
        invokeHandler(securesocial.controllers.Registration.startSignUp, HandlerDef(this, "securesocial.controllers.Registration", "startSignUp", Nil,"GET", """ User Registration and password handling""", Routes.prefix + """signup"""))
   }
}
        

// @LINE:15
case securesocial_controllers_Registration_handleStartSignUp5(params) => {
   call { 
        invokeHandler(securesocial.controllers.Registration.handleStartSignUp, HandlerDef(this, "securesocial.controllers.Registration", "handleStartSignUp", Nil,"POST", """""", Routes.prefix + """signup"""))
   }
}
        

// @LINE:16
case securesocial_controllers_Registration_signUp6(params) => {
   call(params.fromPath[String]("token", None)) { (token) =>
        invokeHandler(securesocial.controllers.Registration.signUp(token), HandlerDef(this, "securesocial.controllers.Registration", "signUp", Seq(classOf[String]),"GET", """""", Routes.prefix + """signup/$token<[^/]+>"""))
   }
}
        

// @LINE:17
case securesocial_controllers_Registration_handleSignUp7(params) => {
   call(params.fromPath[String]("token", None)) { (token) =>
        invokeHandler(securesocial.controllers.Registration.handleSignUp(token), HandlerDef(this, "securesocial.controllers.Registration", "handleSignUp", Seq(classOf[String]),"POST", """""", Routes.prefix + """signup/$token<[^/]+>"""))
   }
}
        

// @LINE:18
case securesocial_controllers_Registration_startResetPassword8(params) => {
   call { 
        invokeHandler(securesocial.controllers.Registration.startResetPassword, HandlerDef(this, "securesocial.controllers.Registration", "startResetPassword", Nil,"GET", """""", Routes.prefix + """reset"""))
   }
}
        

// @LINE:19
case securesocial_controllers_Registration_handleStartResetPassword9(params) => {
   call { 
        invokeHandler(securesocial.controllers.Registration.handleStartResetPassword, HandlerDef(this, "securesocial.controllers.Registration", "handleStartResetPassword", Nil,"POST", """""", Routes.prefix + """reset"""))
   }
}
        

// @LINE:20
case securesocial_controllers_Registration_resetPassword10(params) => {
   call(params.fromPath[String]("token", None)) { (token) =>
        invokeHandler(securesocial.controllers.Registration.resetPassword(token), HandlerDef(this, "securesocial.controllers.Registration", "resetPassword", Seq(classOf[String]),"GET", """""", Routes.prefix + """reset/$token<[^/]+>"""))
   }
}
        

// @LINE:21
case securesocial_controllers_Registration_handleResetPassword11(params) => {
   call(params.fromPath[String]("token", None)) { (token) =>
        invokeHandler(securesocial.controllers.Registration.handleResetPassword(token), HandlerDef(this, "securesocial.controllers.Registration", "handleResetPassword", Seq(classOf[String]),"POST", """""", Routes.prefix + """reset/$token<[^/]+>"""))
   }
}
        

// @LINE:22
case securesocial_controllers_PasswordChange_page12(params) => {
   call { 
        invokeHandler(securesocial.controllers.PasswordChange.page, HandlerDef(this, "securesocial.controllers.PasswordChange", "page", Nil,"GET", """""", Routes.prefix + """password"""))
   }
}
        

// @LINE:23
case securesocial_controllers_PasswordChange_handlePasswordChange13(params) => {
   call { 
        invokeHandler(securesocial.controllers.PasswordChange.handlePasswordChange, HandlerDef(this, "securesocial.controllers.PasswordChange", "handlePasswordChange", Nil,"POST", """""", Routes.prefix + """password"""))
   }
}
        

// @LINE:26
case securesocial_controllers_ProviderController_authenticate14(params) => {
   call(params.fromPath[String]("provider", None)) { (provider) =>
        invokeHandler(securesocial.controllers.ProviderController.authenticate(provider), HandlerDef(this, "securesocial.controllers.ProviderController", "authenticate", Seq(classOf[String]),"GET", """ Providers entry points""", Routes.prefix + """authenticate/$provider<[^/]+>"""))
   }
}
        

// @LINE:27
case securesocial_controllers_ProviderController_authenticateByPost15(params) => {
   call(params.fromPath[String]("provider", None)) { (provider) =>
        invokeHandler(securesocial.controllers.ProviderController.authenticateByPost(provider), HandlerDef(this, "securesocial.controllers.ProviderController", "authenticateByPost", Seq(classOf[String]),"POST", """""", Routes.prefix + """authenticate/$provider<[^/]+>"""))
   }
}
        

// @LINE:28
case securesocial_controllers_ProviderController_notAuthorized16(params) => {
   call { 
        invokeHandler(securesocial.controllers.ProviderController.notAuthorized, HandlerDef(this, "securesocial.controllers.ProviderController", "notAuthorized", Nil,"GET", """""", Routes.prefix + """not-authorized"""))
   }
}
        

// @LINE:32
case controllers_ItemController_all17(params) => {
   call { 
        invokeHandler(controllers.ItemController.all, HandlerDef(this, "controllers.ItemController", "all", Nil,"GET", """ Items""", Routes.prefix + """items"""))
   }
}
        

// @LINE:33
case controllers_ItemController_create18(params) => {
   call { 
        invokeHandler(controllers.ItemController.create, HandlerDef(this, "controllers.ItemController", "create", Nil,"POST", """""", Routes.prefix + """items"""))
   }
}
        

// @LINE:34
case controllers_ItemController_delete19(params) => {
   call(params.fromPath[Long]("id", None)) { (id) =>
        invokeHandler(controllers.ItemController.delete(id), HandlerDef(this, "controllers.ItemController", "delete", Seq(classOf[Long]),"POST", """""", Routes.prefix + """items/$id<[^/]+>/delete"""))
   }
}
        

// @LINE:37
case controllers_Assets_at20(params) => {
   call(Param[String]("path", Right("/public")), params.fromPath[String]("file", None)) { (path, file) =>
        invokeHandler(controllers.Assets.at(path, file), HandlerDef(this, "controllers.Assets", "at", Seq(classOf[String], classOf[String]),"GET", """ Map static resources from the /public folder to the /assets URL path""", Routes.prefix + """assets/$file<.+>"""))
   }
}
        
}
    
}
        