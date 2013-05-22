package controllers

import securesocial.controllers.TemplatesPlugin
import securesocial.controllers.Registration._
import securesocial.controllers.PasswordChange.ChangeInfo
import securesocial.core.{Identity, SecuredRequest}
import play.api.mvc.{RequestHeader, Request}
import play.api.templates.{Html, Txt}
import play.api.data.Form

/**
 * Created with IntelliJ IDEA.
 * User: hornisch
 * Date: 19.05.13
 * Time: 21:44
 * To change this template use File | Settings | File Templates.
 */
class SecurityController(application: play.Application) extends TemplatesPlugin {

  def getLoginPage[A](implicit request: Request[A], form:Form[(String, String)], msg: Option[String]): Html = views.html.security.login(form, msg)

  def getAlreadyRegisteredEmail(userIdentity: Identity)(implicit request: RequestHeader): (Option[Txt], Option[Html]) = (None, Some(views.html.security.mails.alreadyRegisteredEmail(user = userIdentity)))

  def getNotAuthorizedPage[A](implicit request: Request[A]): Html = views.html.security.notAuthorized()

  def getPasswordChangePage[A](implicit request: SecuredRequest[A], form:Form[ChangeInfo]): Html = views.html.security.passwordChange(form)

  def getPasswordChangedNoticeEmail(user: Identity)(implicit request: RequestHeader): (Option[Txt], Option[Html]) = (None, Some(views.html.security.mails.passwordChangedNotice(user)))

  def getResetPasswordPage[A](implicit request: Request[A], form:Form[(String, String)], token: String): Html = views.html.security.resetPasswordPage(form, token)

  def getSendPasswordResetEmail(user: Identity,token:String)(implicit request: RequestHeader): (Option[Txt], Option[Html]) = (None, Some(views.html.security.mails.passwordResetEmail(user, token)))

  def getSignUpEmail(token: String)(implicit request: RequestHeader): (Option[Txt], Option[Html]) = (None, Some(views.html.security.mails.signUpEmail(token)))

  def getSignUpPage[A](implicit request: Request[A], form:Form[RegistrationInfo], token: String): Html = views.html.security.signUp(form, token)

  def getStartResetPasswordPage[A](implicit request: Request[A], form:Form[String]): Html = views.html.security.startResetPassword(form)

  def getStartSignUpPage[A](implicit request: Request[A], form:Form[String]): Html = views.html.security.startSignUp(form)

  def getUnknownEmailNotice()(implicit request: RequestHeader): (Option[Txt], Option[Html]) = (None, Some(views.html.security.mails.unknownEmailNotice(request)))

  def getWelcomeEmail(user: Identity)(implicit request: RequestHeader): (Option[Txt], Option[Html]) = (None, Some(views.html.security.mails.welcomeEmail(user)))


}
