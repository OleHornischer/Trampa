
package views.html

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
object help extends BaseScalaTemplate[play.api.templates.Html,Format[play.api.templates.Html]](play.api.templates.HtmlFormat) with play.api.templates.Template1[String,play.api.templates.Html] {

    /**/
    def apply/*1.2*/(message: String):play.api.templates.Html = {
        _display_ {

Seq[Any](format.raw/*1.19*/("""


    
    """),_display_(Seq[Any](/*5.6*/play20/*5.12*/.welcome(message))),format.raw/*5.29*/("""

"""))}
    }
    
    def render(message:String): play.api.templates.Html = apply(message)
    
    def f:((String) => play.api.templates.Html) = (message) => apply(message)
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Tue May 14 19:39:27 CEST 2013
                    SOURCE: C:/Projects/Trampa_Play/app/views/help.scala.html
                    HASH: ff8a8c192459ab2ee22f675da784ae315f546e83
                    MATRIX: 504->1|598->18|645->31|659->37|697->54
                    LINES: 19->1|22->1|26->5|26->5|26->5
                    -- GENERATED --
                */
            