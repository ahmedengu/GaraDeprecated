
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

class becomeDriver extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template4[String,String,String,Form[models.garaDB.tables.pojos.Driver],play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(title: String,description: String,keywords: String,myForm: Form[models.garaDB.tables.pojos.Driver]):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.102*/("""

"""),_display_(/*3.2*/memberArea(title,description,keywords)/*3.40*/ {_display_(Seq[Any](format.raw/*3.42*/("""

    """),format.raw/*5.5*/("""<div class="container">
        <br />
        <h1>Become a Driver</h1>
        <hr />
        """),_display_(/*9.10*/if(myForm.hasErrors)/*9.30*/ {_display_(Seq[Any](format.raw/*9.32*/("""

            """),_display_(/*11.14*/if(myForm.errors.size() > 0)/*11.42*/ {_display_(Seq[Any](format.raw/*11.44*/("""
                """),format.raw/*12.17*/("""<div class="alert alert-danger">
                    <strong>errors:</strong>
                    """),_display_(/*14.22*/for((key, value) <- myForm.errors) yield /*14.56*/ {_display_(Seq[Any](format.raw/*14.58*/("""
                        """),format.raw/*15.25*/("""<p>
                        """),_display_(/*16.26*/for(err <- value) yield /*16.43*/ {_display_(Seq[Any](format.raw/*16.45*/("""
                            """),_display_(/*17.30*/err/*17.33*/.message().toString()),format.raw/*17.54*/("""
                        """)))}),format.raw/*18.26*/("""
                        """),format.raw/*19.25*/("""</p>
                    """)))}),format.raw/*20.22*/("""
                """),format.raw/*21.17*/("""</div>

            """)))}),format.raw/*23.14*/("""
        """)))}),format.raw/*24.10*/("""
        """),format.raw/*25.9*/("""<form action="/member/becomeDriver" method="post">
            <div class="form-group">
                <input type="text" name="licensenumber" placeholder="licenseNumber" class="form-control">
            </div>
            <div class="form-group">
                <input type="text" name="licensepic" placeholder="licensePic" class="form-control">
            </div>
            <div class="form-group">
                <input type="text" name="identycardpic" placeholder="identyCardPic" class="form-control">
            </div>
            <div class="form-group">
                <input type="text" name="licenseexpiredate" placeholder="licenseExpireDate" class="form-control">
            </div>
            <div class="form-group">
                <input type="submit" value="Go!" class="btn btn-primary btn-block bg-marina">
            </div>
        </form>
    </div>

""")))}),format.raw/*44.2*/("""
"""))
      }
    }
  }

  def render(title:String,description:String,keywords:String,myForm:Form[models.garaDB.tables.pojos.Driver]): play.twirl.api.HtmlFormat.Appendable = apply(title,description,keywords,myForm)

  def f:((String,String,String,Form[models.garaDB.tables.pojos.Driver]) => play.twirl.api.HtmlFormat.Appendable) = (title,description,keywords,myForm) => apply(title,description,keywords,myForm)

  def ref: this.type = this

}


}

/**/
object becomeDriver extends becomeDriver_Scope0.becomeDriver
              /*
                  -- GENERATED --
                  DATE: Sun Jun 12 04:51:07 EET 2016
                  SOURCE: C:/Users/ahmedengu/Documents/IdeaProjects/Gara/app/views/becomeDriver.scala.html
                  HASH: 3506906de9e4f268a41d45e56b224cfd58ee91b6
                  MATRIX: 813->1|1009->101|1039->106|1085->144|1124->146|1158->154|1284->254|1312->274|1351->276|1395->293|1432->321|1472->323|1518->341|1646->442|1696->476|1736->478|1790->504|1847->534|1880->551|1920->553|1978->584|1990->587|2032->608|2090->635|2144->661|2202->688|2248->706|2302->729|2344->740|2381->750|3310->1649
                  LINES: 27->1|32->1|34->3|34->3|34->3|36->5|40->9|40->9|40->9|42->11|42->11|42->11|43->12|45->14|45->14|45->14|46->15|47->16|47->16|47->16|48->17|48->17|48->17|49->18|50->19|51->20|52->21|54->23|55->24|56->25|75->44
                  -- GENERATED --
              */
          