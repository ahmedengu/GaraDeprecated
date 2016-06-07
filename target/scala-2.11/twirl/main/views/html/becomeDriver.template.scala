
package views.html

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object becomeDriver_Scope0 {
import models._
import controllers._
import play.api.i18n._
import views.html._
import play.api.templates.PlayMagic._
import java.lang._
import java.util._
import scala.collection.JavaConversions._
import scala.collection.JavaConverters._
import play.core.j.PlayMagicForJava._
import play.mvc._
import play.data._
import play.api.data.Field
import play.mvc.Http.Context.Implicit._

class becomeDriver extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template3[String,String,String,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(title: String,description: String,keywords: String):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.54*/("""

"""),_display_(/*3.2*/memberArea(title,description,keywords)/*3.40*/ {_display_(Seq[Any](format.raw/*3.42*/("""

    """),format.raw/*5.5*/("""<form action="/login" method="post">
        <div class="form-group">
            <input type="text" name="username" placeholder="Username" class="form-control">
        </div>
        <div class="form-group">
            <input type="password" name="password" placeholder="Password" class="form-control">
        </div>
        <input type="submit" value="login" class="btn btn-primary btn-block">
    </form>

""")))}),format.raw/*15.2*/("""
"""))
      }
    }
  }

  def render(title:String,description:String,keywords:String): play.twirl.api.HtmlFormat.Appendable = apply(title,description,keywords)

  def f:((String,String,String) => play.twirl.api.HtmlFormat.Appendable) = (title,description,keywords) => apply(title,description,keywords)

  def ref: this.type = this

}


}

/**/
object becomeDriver extends becomeDriver_Scope0.becomeDriver
              /*
                  -- GENERATED --
                  DATE: Sat May 28 02:14:23 EET 2016
                  SOURCE: C:/Users/ahmedengu/Documents/IdeaProjects/Gara/app/views/becomeDriver.scala.html
                  HASH: 5f1e4fc67c62773118741f40cc761d6ec0728dd1
                  MATRIX: 773->1|920->53|950->58|996->96|1035->98|1069->106|1522->529
                  LINES: 27->1|32->1|34->3|34->3|34->3|36->5|46->15
                  -- GENERATED --
              */
          