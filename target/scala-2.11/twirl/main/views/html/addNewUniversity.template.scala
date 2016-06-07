
package views.html

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object addNewUniversity_Scope0 {
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

class addNewUniversity extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template4[String,String,String,Form[models.garaDB.tables.pojos.University],play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(title: String,description: String,keywords: String,myForm: Form[models.garaDB.tables.pojos.University]):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.106*/("""


"""),_display_(/*4.2*/onePageForms(title,description,keywords)/*4.42*/ {_display_(Seq[Any](format.raw/*4.44*/("""


    """),format.raw/*7.5*/("""<div class="container verticalAllign">
        """),_display_(/*8.10*/if(myForm.hasErrors)/*8.30*/ {_display_(Seq[Any](format.raw/*8.32*/("""

            """),_display_(/*10.14*/if(myForm.errors.size() > 0)/*10.42*/ {_display_(Seq[Any](format.raw/*10.44*/("""
                """),format.raw/*11.17*/("""<div class="alert alert-danger">
                    <strong>errors:</strong>
                    """),_display_(/*13.22*/for((key, value) <- myForm.errors) yield /*13.56*/ {_display_(Seq[Any](format.raw/*13.58*/("""
                        """),format.raw/*14.25*/("""<p>
                        """),_display_(/*15.26*/for(err <- value) yield /*15.43*/ {_display_(Seq[Any](format.raw/*15.45*/("""
                            """),_display_(/*16.30*/err/*16.33*/.message().toString()),format.raw/*16.54*/("""
                        """)))}),format.raw/*17.26*/("""
                        """),format.raw/*18.25*/("""</p>
                    """)))}),format.raw/*19.22*/("""
                """),format.raw/*20.17*/("""</div>

            """)))}),format.raw/*22.14*/("""
        """)))}),format.raw/*23.10*/("""
        """),format.raw/*24.9*/("""<div class="row">
            <div class="col-md-5">
                <a href="/"><h1 class="white">Gara</h1></a>
                <p class="white">Carpooling platform for universities! </p>
                <div class="form-group">
                    <a class="btn btn-primary btn-block" href="/login">Login!</a>
                    <a class="btn btn-primary btn-block" href="/register">register!</a>
                </div>
            </div>
            <div class="col-md-5">
                <form enctype="multipart/form-data" action="/newUniversity" method="post">
                    <div class="form-group">
                        <input type="text" placeholder="Name" name="name" class="form-control">
                    </div>
                    <div class="form-group">
                        <input type="text" placeholder="Url" name="url" class="form-control">
                    </div>
                    <div class="form-group">
                        <input type="text" class="form-control" name="emailformat" placeholder="Student email domain (xyz.edu)">
                    </div>
                    <div class="form-group">
                        <input type="email" class="form-control" name="contactpersonemail" placeholder="contact person email">
                    </div>
                    <input hidden type="text"  name="cityid" value="1">

                    <input type="submit" value="Add New University Now" class="btn btn-primary btn-block bg-pomegranate">
                </form>
            </div>
                <!-- /.col -->
                <!-- /.col -->
        </div>
            <!-- /.row -->
    </div>
""")))}),format.raw/*57.2*/("""
"""))
      }
    }
  }

  def render(title:String,description:String,keywords:String,myForm:Form[models.garaDB.tables.pojos.University]): play.twirl.api.HtmlFormat.Appendable = apply(title,description,keywords,myForm)

  def f:((String,String,String,Form[models.garaDB.tables.pojos.University]) => play.twirl.api.HtmlFormat.Appendable) = (title,description,keywords,myForm) => apply(title,description,keywords,myForm)

  def ref: this.type = this

}


}

/**/
object addNewUniversity extends addNewUniversity_Scope0.addNewUniversity
              /*
                  -- GENERATED --
                  DATE: Sat May 28 01:50:18 EET 2016
                  SOURCE: C:/Users/ahmedengu/Documents/IdeaProjects/Gara/app/views/addNewUniversity.scala.html
                  HASH: 0efd35bdf2f8fea2b8e19b88345dd8cdc441fd24
                  MATRIX: 825->1|1025->105|1057->112|1105->152|1144->154|1180->164|1255->213|1283->233|1322->235|1366->252|1403->280|1443->282|1489->300|1617->401|1667->435|1707->437|1761->463|1818->493|1851->510|1891->512|1949->543|1961->546|2003->567|2061->594|2115->620|2173->647|2219->665|2273->688|2315->699|2352->709|4071->2398
                  LINES: 27->1|32->1|35->4|35->4|35->4|38->7|39->8|39->8|39->8|41->10|41->10|41->10|42->11|44->13|44->13|44->13|45->14|46->15|46->15|46->15|47->16|47->16|47->16|48->17|49->18|50->19|51->20|53->22|54->23|55->24|88->57
                  -- GENERATED --
              */
          