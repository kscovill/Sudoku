
package views.html

import play.twirl.api._
import play.twirl.api.TemplateMagic._

import play.api.templates.PlayMagic._
import models._
import controllers._
import java.lang._
import java.util._
import scala.collection.JavaConversions._
import scala.collection.JavaConverters._
import play.api.i18n._
import play.core.j.PlayMagicForJava._
import play.mvc._
import play.data._
import play.api.data.Field
import play.mvc.Http.Context.Implicit._
import views.html._

/**/
object index extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template2[String,Form[Task],play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(message: String, taskForm: Form[Task]):play.twirl.api.HtmlFormat.Appendable = {
      _display_ {
implicit def /*2.2*/implicitFieldConstructor/*2.26*/ = {{ helper.FieldConstructor(twitterBootstrapInput.render) }};
Seq[Any](format.raw/*1.41*/("""
"""),format.raw/*2.87*/("""

"""),_display_(/*4.2*/main("Welcome to Play 2.0")/*4.29*/ {_display_(Seq[Any](format.raw/*4.31*/("""

    """),format.raw/*6.5*/("""<div class="navbar navbar-fixed-top">
        <div class="navbar-inner">
            <div class="container-fluid">
                <a id="titleLink" class="brand" href="/">"""),_display_(/*9.59*/message/*9.66*/.toUpperCase),format.raw/*9.78*/("""</a>
            </div>
        </div>
    </div>

    <div class="container">
        <ul id="tasks"></ul>

        """),_display_(/*17.10*/helper/*17.16*/.form(action = routes.Application.addTask(), 'class -> "well form-horizontal")/*17.94*/ {_display_(Seq[Any](format.raw/*17.96*/("""
            """),_display_(/*18.14*/helper/*18.20*/.inputText(taskForm("contents"), '_label -> "Contents")),format.raw/*18.75*/("""
            """),format.raw/*19.13*/("""<div class="controls">
                <input type="submit" class="btn btn-primary"/>
            </div>
        """)))}),format.raw/*22.10*/("""
    """),format.raw/*23.5*/("""</div>

""")))}),format.raw/*25.2*/("""
"""))}
  }

  def render(message:String,taskForm:Form[Task]): play.twirl.api.HtmlFormat.Appendable = apply(message,taskForm)

  def f:((String,Form[Task]) => play.twirl.api.HtmlFormat.Appendable) = (message,taskForm) => apply(message,taskForm)

  def ref: this.type = this

}
              /*
                  -- GENERATED --
                  DATE: Mon Feb 13 12:02:08 MST 2017
                  SOURCE: C:/Users/Kyle/Documents/College/Soph2/web_design/project/app/views/index.scala.html
                  HASH: f436d92a1ad5cd4f08e0a7236084f9d5a040f9f3
                  MATRIX: 734->1|853->42|885->66|976->40|1004->127|1032->130|1067->157|1106->159|1138->165|1337->338|1352->345|1384->357|1529->475|1544->481|1631->559|1671->561|1712->575|1727->581|1803->636|1844->649|1989->763|2021->768|2060->777
                  LINES: 26->1|28->2|28->2|29->1|30->2|32->4|32->4|32->4|34->6|37->9|37->9|37->9|45->17|45->17|45->17|45->17|46->18|46->18|46->18|47->19|50->22|51->23|53->25
                  -- GENERATED --
              */
          