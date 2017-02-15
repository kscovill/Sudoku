
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
object twitterBootstrapInput extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template1[helper.FieldElements,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(elements: helper.FieldElements):play.twirl.api.HtmlFormat.Appendable = {
      _display_ {

Seq[Any](format.raw/*1.34*/("""

"""),format.raw/*3.1*/("""<div class="control-group """),_display_(/*3.28*/if(elements.hasErrors)/*3.50*/ {_display_(Seq[Any](format.raw/*3.52*/("""error""")))}),format.raw/*3.58*/("""">
    <label for=""""),_display_(/*4.18*/elements/*4.26*/.id),format.raw/*4.29*/("""" class="control-label">"""),_display_(/*4.54*/elements/*4.62*/.label),format.raw/*4.68*/("""</label>
    <div class="controls">
        """),_display_(/*6.10*/elements/*6.18*/.input),format.raw/*6.24*/("""
        """),format.raw/*7.9*/("""<span class="help-inline">"""),_display_(/*7.36*/elements/*7.44*/.errors.mkString(", ")),format.raw/*7.66*/("""</span>
    </div>
</div>"""))}
  }

  def render(elements:helper.FieldElements): play.twirl.api.HtmlFormat.Appendable = apply(elements)

  def f:((helper.FieldElements) => play.twirl.api.HtmlFormat.Appendable) = (elements) => apply(elements)

  def ref: this.type = this

}
              /*
                  -- GENERATED --
                  DATE: Mon Feb 13 12:02:08 MST 2017
                  SOURCE: C:/Users/Kyle/Documents/College/Soph2/web_design/project/app/views/twitterBootstrapInput.scala.html
                  HASH: dfcf7265ca5556e7da8c5adcc15128c1280874bc
                  MATRIX: 753->1|873->33|901->35|954->62|984->84|1023->86|1059->92|1105->112|1121->120|1144->123|1195->148|1211->156|1237->162|1308->207|1324->215|1350->221|1385->230|1438->257|1454->265|1496->287
                  LINES: 26->1|29->1|31->3|31->3|31->3|31->3|31->3|32->4|32->4|32->4|32->4|32->4|32->4|34->6|34->6|34->6|35->7|35->7|35->7|35->7
                  -- GENERATED --
              */
          