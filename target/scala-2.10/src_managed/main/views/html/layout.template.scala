
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
object layout extends BaseScalaTemplate[play.api.templates.Html,Format[play.api.templates.Html]](play.api.templates.HtmlFormat) with play.api.templates.Template2[String,Html,play.api.templates.Html] {

    /**/
    def apply/*1.2*/(title: String)(content: Html):play.api.templates.Html = {
        _display_ {

Seq[Any](format.raw/*1.32*/("""

<!DOCTYPE html>

<html>
    <head>
        <title>"""),_display_(Seq[Any](/*7.17*/title)),format.raw/*7.22*/("""</title>
        <link rel="stylesheet" media="screen" href=""""),_display_(Seq[Any](/*8.54*/routes/*8.60*/.Assets.at("stylesheets/main.css"))),format.raw/*8.94*/("""">
        <link rel="shortcut icon" type="image/png" href=""""),_display_(Seq[Any](/*9.59*/routes/*9.65*/.Assets.at("images/favicon.png"))),format.raw/*9.97*/("""">
        <script src=""""),_display_(Seq[Any](/*10.23*/routes/*10.29*/.Assets.at("javascripts/jquery-1.9.0.min.js"))),format.raw/*10.74*/("""" type="text/javascript"></script>
    </head>
    <body>

        <div id="wrapper">
            <div id="headerwrap">
                <div id="header">
                    <p>Trampa</p>
                    """),format.raw/*18.42*/("""
                    <div class="cleaner">&nbsp;</div>
                </div>
            </div>
            <div id="navigationwrap">
                <div id="navigation">
                    <p>This is the Menu</p>
                </div>
            </div>
            <div id="contentliquid"><div id="contentwrap">
                <div id="content">
                    """),_display_(Seq[Any](/*29.22*/content)),format.raw/*29.29*/("""
                </div>
            </div></div>
            <div id="footerwrap">
                <div id="footer">
                    <small>&copy; Trampa</small>
                </div>
            </div>
        </div>
    </body>
</html>
"""))}
    }
    
    def render(title:String,content:Html): play.api.templates.Html = apply(title)(content)
    
    def f:((String) => (Html) => play.api.templates.Html) = (title) => (content) => apply(title)(content)
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Thu May 16 11:27:36 CEST 2013
                    SOURCE: C:/Projects/Trampa_Play/app/views/layout.scala.html
                    HASH: f70b6c60a3f52e8e57657776c6ecf9e9470f8217
                    MATRIX: 511->1|618->31|706->84|732->89|829->151|843->157|898->191|994->252|1008->258|1061->290|1122->315|1137->321|1204->366|1440->595|1850->969|1879->976
                    LINES: 19->1|22->1|28->7|28->7|29->8|29->8|29->8|30->9|30->9|30->9|31->10|31->10|31->10|39->18|50->29|50->29
                    -- GENERATED --
                */
            