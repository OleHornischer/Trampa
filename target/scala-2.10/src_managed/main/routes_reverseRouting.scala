// @SOURCE:C:/Projects/Trampa_Play/conf/routes
// @HASH:158329e5476813cab46f7971d934e0c62f318848
// @DATE:Thu May 16 13:01:15 CEST 2013

import Routes.{prefix => _prefix, defaultPrefix => _defaultPrefix}
import play.core._
import play.core.Router._
import play.core.j._

import play.api.mvc._


import Router.queryString


// @LINE:28
// @LINE:27
// @LINE:26
// @LINE:23
// @LINE:22
// @LINE:21
// @LINE:20
// @LINE:19
// @LINE:18
// @LINE:17
// @LINE:16
// @LINE:15
// @LINE:14
// @LINE:11
// @LINE:10
package securesocial.controllers {

// @LINE:28
// @LINE:27
// @LINE:26
class ReverseProviderController {
    

// @LINE:28
def notAuthorized(): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "not-authorized")
}
                                                

// @LINE:27
def authenticateByPost(provider:String): Call = {
   Call("POST", _prefix + { _defaultPrefix } + "authenticate/" + implicitly[PathBindable[String]].unbind("provider", provider))
}
                                                

// @LINE:26
def authenticate(provider:String): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "authenticate/" + implicitly[PathBindable[String]].unbind("provider", provider))
}
                                                
    
}
                          

// @LINE:23
// @LINE:22
class ReversePasswordChange {
    

// @LINE:22
def page(): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "password")
}
                                                

// @LINE:23
def handlePasswordChange(): Call = {
   Call("POST", _prefix + { _defaultPrefix } + "password")
}
                                                
    
}
                          

// @LINE:11
// @LINE:10
class ReverseLoginPage {
    

// @LINE:11
def logout(): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "logout")
}
                                                

// @LINE:10
def login(): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "login")
}
                                                
    
}
                          

// @LINE:21
// @LINE:20
// @LINE:19
// @LINE:18
// @LINE:17
// @LINE:16
// @LINE:15
// @LINE:14
class ReverseRegistration {
    

// @LINE:19
def handleStartResetPassword(): Call = {
   Call("POST", _prefix + { _defaultPrefix } + "reset")
}
                                                

// @LINE:15
def handleStartSignUp(): Call = {
   Call("POST", _prefix + { _defaultPrefix } + "signup")
}
                                                

// @LINE:17
def handleSignUp(token:String): Call = {
   Call("POST", _prefix + { _defaultPrefix } + "signup/" + implicitly[PathBindable[String]].unbind("token", token))
}
                                                

// @LINE:14
def startSignUp(): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "signup")
}
                                                

// @LINE:20
def resetPassword(token:String): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "reset/" + implicitly[PathBindable[String]].unbind("token", token))
}
                                                

// @LINE:18
def startResetPassword(): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "reset")
}
                                                

// @LINE:16
def signUp(token:String): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "signup/" + implicitly[PathBindable[String]].unbind("token", token))
}
                                                

// @LINE:21
def handleResetPassword(token:String): Call = {
   Call("POST", _prefix + { _defaultPrefix } + "reset/" + implicitly[PathBindable[String]].unbind("token", token))
}
                                                
    
}
                          
}
                  

// @LINE:37
// @LINE:34
// @LINE:33
// @LINE:32
// @LINE:7
// @LINE:6
package controllers {

// @LINE:34
// @LINE:33
// @LINE:32
class ReverseItemController {
    

// @LINE:34
def delete(id:Long): Call = {
   Call("POST", _prefix + { _defaultPrefix } + "items/" + implicitly[PathBindable[Long]].unbind("id", id) + "/delete")
}
                                                

// @LINE:32
def all(): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "items")
}
                                                

// @LINE:33
def create(): Call = {
   Call("POST", _prefix + { _defaultPrefix } + "items")
}
                                                
    
}
                          

// @LINE:7
// @LINE:6
class ReverseApplication {
    

// @LINE:7
def help(): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "help")
}
                                                

// @LINE:6
def index(): Call = {
   Call("GET", _prefix)
}
                                                
    
}
                          

// @LINE:37
class ReverseAssets {
    

// @LINE:37
def at(file:String): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "assets/" + implicitly[PathBindable[String]].unbind("file", file))
}
                                                
    
}
                          
}
                  


// @LINE:28
// @LINE:27
// @LINE:26
// @LINE:23
// @LINE:22
// @LINE:21
// @LINE:20
// @LINE:19
// @LINE:18
// @LINE:17
// @LINE:16
// @LINE:15
// @LINE:14
// @LINE:11
// @LINE:10
package securesocial.controllers.javascript {

// @LINE:28
// @LINE:27
// @LINE:26
class ReverseProviderController {
    

// @LINE:28
def notAuthorized : JavascriptReverseRoute = JavascriptReverseRoute(
   "securesocial.controllers.ProviderController.notAuthorized",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "not-authorized"})
      }
   """
)
                        

// @LINE:27
def authenticateByPost : JavascriptReverseRoute = JavascriptReverseRoute(
   "securesocial.controllers.ProviderController.authenticateByPost",
   """
      function(provider) {
      return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "authenticate/" + (""" + implicitly[PathBindable[String]].javascriptUnbind + """)("provider", provider)})
      }
   """
)
                        

// @LINE:26
def authenticate : JavascriptReverseRoute = JavascriptReverseRoute(
   "securesocial.controllers.ProviderController.authenticate",
   """
      function(provider) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "authenticate/" + (""" + implicitly[PathBindable[String]].javascriptUnbind + """)("provider", provider)})
      }
   """
)
                        
    
}
              

// @LINE:23
// @LINE:22
class ReversePasswordChange {
    

// @LINE:22
def page : JavascriptReverseRoute = JavascriptReverseRoute(
   "securesocial.controllers.PasswordChange.page",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "password"})
      }
   """
)
                        

// @LINE:23
def handlePasswordChange : JavascriptReverseRoute = JavascriptReverseRoute(
   "securesocial.controllers.PasswordChange.handlePasswordChange",
   """
      function() {
      return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "password"})
      }
   """
)
                        
    
}
              

// @LINE:11
// @LINE:10
class ReverseLoginPage {
    

// @LINE:11
def logout : JavascriptReverseRoute = JavascriptReverseRoute(
   "securesocial.controllers.LoginPage.logout",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "logout"})
      }
   """
)
                        

// @LINE:10
def login : JavascriptReverseRoute = JavascriptReverseRoute(
   "securesocial.controllers.LoginPage.login",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "login"})
      }
   """
)
                        
    
}
              

// @LINE:21
// @LINE:20
// @LINE:19
// @LINE:18
// @LINE:17
// @LINE:16
// @LINE:15
// @LINE:14
class ReverseRegistration {
    

// @LINE:19
def handleStartResetPassword : JavascriptReverseRoute = JavascriptReverseRoute(
   "securesocial.controllers.Registration.handleStartResetPassword",
   """
      function() {
      return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "reset"})
      }
   """
)
                        

// @LINE:15
def handleStartSignUp : JavascriptReverseRoute = JavascriptReverseRoute(
   "securesocial.controllers.Registration.handleStartSignUp",
   """
      function() {
      return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "signup"})
      }
   """
)
                        

// @LINE:17
def handleSignUp : JavascriptReverseRoute = JavascriptReverseRoute(
   "securesocial.controllers.Registration.handleSignUp",
   """
      function(token) {
      return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "signup/" + (""" + implicitly[PathBindable[String]].javascriptUnbind + """)("token", token)})
      }
   """
)
                        

// @LINE:14
def startSignUp : JavascriptReverseRoute = JavascriptReverseRoute(
   "securesocial.controllers.Registration.startSignUp",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "signup"})
      }
   """
)
                        

// @LINE:20
def resetPassword : JavascriptReverseRoute = JavascriptReverseRoute(
   "securesocial.controllers.Registration.resetPassword",
   """
      function(token) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "reset/" + (""" + implicitly[PathBindable[String]].javascriptUnbind + """)("token", token)})
      }
   """
)
                        

// @LINE:18
def startResetPassword : JavascriptReverseRoute = JavascriptReverseRoute(
   "securesocial.controllers.Registration.startResetPassword",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "reset"})
      }
   """
)
                        

// @LINE:16
def signUp : JavascriptReverseRoute = JavascriptReverseRoute(
   "securesocial.controllers.Registration.signUp",
   """
      function(token) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "signup/" + (""" + implicitly[PathBindable[String]].javascriptUnbind + """)("token", token)})
      }
   """
)
                        

// @LINE:21
def handleResetPassword : JavascriptReverseRoute = JavascriptReverseRoute(
   "securesocial.controllers.Registration.handleResetPassword",
   """
      function(token) {
      return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "reset/" + (""" + implicitly[PathBindable[String]].javascriptUnbind + """)("token", token)})
      }
   """
)
                        
    
}
              
}
        

// @LINE:37
// @LINE:34
// @LINE:33
// @LINE:32
// @LINE:7
// @LINE:6
package controllers.javascript {

// @LINE:34
// @LINE:33
// @LINE:32
class ReverseItemController {
    

// @LINE:34
def delete : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.ItemController.delete",
   """
      function(id) {
      return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "items/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("id", id) + "/delete"})
      }
   """
)
                        

// @LINE:32
def all : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.ItemController.all",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "items"})
      }
   """
)
                        

// @LINE:33
def create : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.ItemController.create",
   """
      function() {
      return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "items"})
      }
   """
)
                        
    
}
              

// @LINE:7
// @LINE:6
class ReverseApplication {
    

// @LINE:7
def help : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Application.help",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "help"})
      }
   """
)
                        

// @LINE:6
def index : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Application.index",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + """"})
      }
   """
)
                        
    
}
              

// @LINE:37
class ReverseAssets {
    

// @LINE:37
def at : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Assets.at",
   """
      function(file) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "assets/" + (""" + implicitly[PathBindable[String]].javascriptUnbind + """)("file", file)})
      }
   """
)
                        
    
}
              
}
        


// @LINE:28
// @LINE:27
// @LINE:26
// @LINE:23
// @LINE:22
// @LINE:21
// @LINE:20
// @LINE:19
// @LINE:18
// @LINE:17
// @LINE:16
// @LINE:15
// @LINE:14
// @LINE:11
// @LINE:10
package securesocial.controllers.ref {

// @LINE:28
// @LINE:27
// @LINE:26
class ReverseProviderController {
    

// @LINE:28
def notAuthorized(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   securesocial.controllers.ProviderController.notAuthorized(), HandlerDef(this, "securesocial.controllers.ProviderController", "notAuthorized", Seq(), "GET", """""", _prefix + """not-authorized""")
)
                      

// @LINE:27
def authenticateByPost(provider:String): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   securesocial.controllers.ProviderController.authenticateByPost(provider), HandlerDef(this, "securesocial.controllers.ProviderController", "authenticateByPost", Seq(classOf[String]), "POST", """""", _prefix + """authenticate/$provider<[^/]+>""")
)
                      

// @LINE:26
def authenticate(provider:String): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   securesocial.controllers.ProviderController.authenticate(provider), HandlerDef(this, "securesocial.controllers.ProviderController", "authenticate", Seq(classOf[String]), "GET", """ Providers entry points""", _prefix + """authenticate/$provider<[^/]+>""")
)
                      
    
}
                          

// @LINE:23
// @LINE:22
class ReversePasswordChange {
    

// @LINE:22
def page(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   securesocial.controllers.PasswordChange.page(), HandlerDef(this, "securesocial.controllers.PasswordChange", "page", Seq(), "GET", """""", _prefix + """password""")
)
                      

// @LINE:23
def handlePasswordChange(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   securesocial.controllers.PasswordChange.handlePasswordChange(), HandlerDef(this, "securesocial.controllers.PasswordChange", "handlePasswordChange", Seq(), "POST", """""", _prefix + """password""")
)
                      
    
}
                          

// @LINE:11
// @LINE:10
class ReverseLoginPage {
    

// @LINE:11
def logout(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   securesocial.controllers.LoginPage.logout(), HandlerDef(this, "securesocial.controllers.LoginPage", "logout", Seq(), "GET", """""", _prefix + """logout""")
)
                      

// @LINE:10
def login(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   securesocial.controllers.LoginPage.login(), HandlerDef(this, "securesocial.controllers.LoginPage", "login", Seq(), "GET", """ Login page""", _prefix + """login""")
)
                      
    
}
                          

// @LINE:21
// @LINE:20
// @LINE:19
// @LINE:18
// @LINE:17
// @LINE:16
// @LINE:15
// @LINE:14
class ReverseRegistration {
    

// @LINE:19
def handleStartResetPassword(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   securesocial.controllers.Registration.handleStartResetPassword(), HandlerDef(this, "securesocial.controllers.Registration", "handleStartResetPassword", Seq(), "POST", """""", _prefix + """reset""")
)
                      

// @LINE:15
def handleStartSignUp(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   securesocial.controllers.Registration.handleStartSignUp(), HandlerDef(this, "securesocial.controllers.Registration", "handleStartSignUp", Seq(), "POST", """""", _prefix + """signup""")
)
                      

// @LINE:17
def handleSignUp(token:String): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   securesocial.controllers.Registration.handleSignUp(token), HandlerDef(this, "securesocial.controllers.Registration", "handleSignUp", Seq(classOf[String]), "POST", """""", _prefix + """signup/$token<[^/]+>""")
)
                      

// @LINE:14
def startSignUp(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   securesocial.controllers.Registration.startSignUp(), HandlerDef(this, "securesocial.controllers.Registration", "startSignUp", Seq(), "GET", """ User Registration and password handling""", _prefix + """signup""")
)
                      

// @LINE:20
def resetPassword(token:String): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   securesocial.controllers.Registration.resetPassword(token), HandlerDef(this, "securesocial.controllers.Registration", "resetPassword", Seq(classOf[String]), "GET", """""", _prefix + """reset/$token<[^/]+>""")
)
                      

// @LINE:18
def startResetPassword(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   securesocial.controllers.Registration.startResetPassword(), HandlerDef(this, "securesocial.controllers.Registration", "startResetPassword", Seq(), "GET", """""", _prefix + """reset""")
)
                      

// @LINE:16
def signUp(token:String): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   securesocial.controllers.Registration.signUp(token), HandlerDef(this, "securesocial.controllers.Registration", "signUp", Seq(classOf[String]), "GET", """""", _prefix + """signup/$token<[^/]+>""")
)
                      

// @LINE:21
def handleResetPassword(token:String): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   securesocial.controllers.Registration.handleResetPassword(token), HandlerDef(this, "securesocial.controllers.Registration", "handleResetPassword", Seq(classOf[String]), "POST", """""", _prefix + """reset/$token<[^/]+>""")
)
                      
    
}
                          
}
                  

// @LINE:37
// @LINE:34
// @LINE:33
// @LINE:32
// @LINE:7
// @LINE:6
package controllers.ref {

// @LINE:34
// @LINE:33
// @LINE:32
class ReverseItemController {
    

// @LINE:34
def delete(id:Long): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.ItemController.delete(id), HandlerDef(this, "controllers.ItemController", "delete", Seq(classOf[Long]), "POST", """""", _prefix + """items/$id<[^/]+>/delete""")
)
                      

// @LINE:32
def all(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.ItemController.all(), HandlerDef(this, "controllers.ItemController", "all", Seq(), "GET", """ Items""", _prefix + """items""")
)
                      

// @LINE:33
def create(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.ItemController.create(), HandlerDef(this, "controllers.ItemController", "create", Seq(), "POST", """""", _prefix + """items""")
)
                      
    
}
                          

// @LINE:7
// @LINE:6
class ReverseApplication {
    

// @LINE:7
def help(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Application.help(), HandlerDef(this, "controllers.Application", "help", Seq(), "GET", """""", _prefix + """help""")
)
                      

// @LINE:6
def index(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Application.index(), HandlerDef(this, "controllers.Application", "index", Seq(), "GET", """ Home page""", _prefix + """""")
)
                      
    
}
                          

// @LINE:37
class ReverseAssets {
    

// @LINE:37
def at(path:String, file:String): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Assets.at(path, file), HandlerDef(this, "controllers.Assets", "at", Seq(classOf[String], classOf[String]), "GET", """ Map static resources from the /public folder to the /assets URL path""", _prefix + """assets/$file<.+>""")
)
                      
    
}
                          
}
                  
      