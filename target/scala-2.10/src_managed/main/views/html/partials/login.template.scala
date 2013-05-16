
package views.html.partials

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
object login extends BaseScalaTemplate[play.api.templates.Html,Format[play.api.templates.Html]](play.api.templates.HtmlFormat) with play.api.templates.Template0[play.api.templates.Html] {

    /**/
    def apply():play.api.templates.Html = {
        _display_ {

Seq[Any](format.raw/*2.1*/("""<div id="login">
   """),format.raw/*17.12*/("""
</div>"""))}
    }
    
    def render(): play.api.templates.Html = apply()
    
    def f:(() => play.api.templates.Html) = () => apply()
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Thu May 16 11:57:07 CEST 2013
                    SOURCE: C:/Projects/Trampa_Play/app/views/partials/login.scala.html
                    HASH: 7eba09d46f5e1f7170a0ea91717358fe67eb4f42
                    MATRIX: 578->1|626->444
                    LINES: 22->2|23->17
                    -- GENERATED --
                */
            