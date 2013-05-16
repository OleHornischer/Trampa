
package views.html.error

import play.templates._
import play.templates.TemplateMagic._

import play.api.templates._
import play.api.templates.PlayMagic._
import models._
import controllers._
import play.api.i18n._
import play.api.mvc._
import play.api.data._
import views.html._
/**/
object accessFailed extends BaseScalaTemplate[play.api.templates.Html,Format[play.api.templates.Html]](play.api.templates.HtmlFormat) with play.api.templates.Template0[play.api.templates.Html] {

    /**/
    def apply():play.api.templates.Html = {
        _display_ {

Seq[Any](_display_(Seq[Any](/*1.2*/layout("Access denied")/*1.25*/ {_display_(Seq[Any](format.raw/*1.27*/("""

    <h1>Access Denied</h1>

    This resource is not available for you. If you think you should be able to access this resource contact the system
    administrator.

""")))})),format.raw/*8.2*/("""
"""))}
    }
    
    def render(): play.api.templates.Html = apply()
    
    def f:(() => play.api.templates.Html) = () => apply()
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Tue May 14 20:20:42 CEST 2013
                    SOURCE: C:/Projects/Trampa_Play/app/views/error/accessFailed.scala.html
                    HASH: 28c18486bf9be1204274c48ef2d71b8327ba66e8
                    MATRIX: 591->1|622->24|661->26|868->203
                    LINES: 22->1|22->1|22->1|29->8
                    -- GENERATED --
                */
            