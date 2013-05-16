
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
object index extends BaseScalaTemplate[play.api.templates.Html,Format[play.api.templates.Html]](play.api.templates.HtmlFormat) with play.api.templates.Template2[List[Item],Form[Item],play.api.templates.Html] {

    /**/
    def apply/*1.2*/(items: List[Item], itemForm: Form[Item]):play.api.templates.Html = {
        _display_ {import helper._


Seq[Any](format.raw/*1.43*/("""

"""),format.raw/*4.1*/("""
"""),_display_(Seq[Any](/*5.2*/layout("All items")/*5.21*/ {_display_(Seq[Any](format.raw/*5.23*/("""
    
    <h1>"""),_display_(Seq[Any](/*7.10*/items/*7.15*/.size)),format.raw/*7.20*/(""" item(s)</h1>

    <ul>
        """),_display_(Seq[Any](/*10.10*/items/*10.15*/.map/*10.19*/ { item =>_display_(Seq[Any](format.raw/*10.29*/("""
            <li>
                <h3>"""),_display_(Seq[Any](/*12.22*/item/*12.26*/.title)),format.raw/*12.32*/("""</h3>
                <p>"""),_display_(Seq[Any](/*13.21*/item/*13.25*/.description)),format.raw/*13.37*/("""</p>
                """),_display_(Seq[Any](/*14.18*/form(routes.ItemController.delete(item.id))/*14.61*/ {_display_(Seq[Any](format.raw/*14.63*/("""
                    <input type="submit" value="Delete" />
                """)))})),format.raw/*16.18*/("""
            </li>
        """)))})),format.raw/*18.10*/("""
    </ul>

    <h2>Create a new item</h2>
    """),_display_(Seq[Any](/*22.6*/form(routes.ItemController.create)/*22.40*/ {_display_(Seq[Any](format.raw/*22.42*/("""
        """),_display_(Seq[Any](/*23.10*/inputText(itemForm("title")))),format.raw/*23.38*/("""
        """),_display_(Seq[Any](/*24.10*/inputText(itemForm("description")))),format.raw/*24.44*/("""
        """),_display_(Seq[Any](/*25.10*/inputText(itemForm("price")))),format.raw/*25.38*/("""

        <input type="submit" value="Create" />
    """)))})),format.raw/*28.6*/("""
""")))})),format.raw/*29.2*/("""
"""))}
    }
    
    def render(items:List[Item],itemForm:Form[Item]): play.api.templates.Html = apply(items,itemForm)
    
    def f:((List[Item],Form[Item]) => play.api.templates.Html) = (items,itemForm) => apply(items,itemForm)
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Tue May 14 17:45:26 CEST 2013
                    SOURCE: C:/Projects/Trampa_Play/app/views/index.scala.html
                    HASH: 1294019e57c39a7fe92af42497871e85104e60c0
                    MATRIX: 520->1|654->42|682->61|718->63|745->82|784->84|834->99|847->104|873->109|942->142|956->147|969->151|1017->161|1092->200|1105->204|1133->210|1195->236|1208->240|1242->252|1300->274|1352->317|1392->319|1501->396|1561->424|1644->472|1687->506|1727->508|1773->518|1823->546|1869->556|1925->590|1971->600|2021->628|2106->682|2139->684
                    LINES: 19->1|23->1|25->4|26->5|26->5|26->5|28->7|28->7|28->7|31->10|31->10|31->10|31->10|33->12|33->12|33->12|34->13|34->13|34->13|35->14|35->14|35->14|37->16|39->18|43->22|43->22|43->22|44->23|44->23|45->24|45->24|46->25|46->25|49->28|50->29
                    -- GENERATED --
                */
            