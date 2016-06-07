
package views.html

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object login_Scope0 {
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

class login extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template4[String,String,String,Form[models.garaDB.tables.pojos.Member],play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(title: String,description: String,keywords: String,myForm: Form[models.garaDB.tables.pojos.Member]):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.102*/("""


"""),_display_(/*4.2*/onePageForms(title,description,keywords)/*4.42*/ {_display_(Seq[Any](format.raw/*4.44*/("""


        """),format.raw/*7.9*/("""<div class="container verticalAllign" >
        <div class="row">
            <div class="col-md-5">
                <a href="/"><h1 class="white">Gara</h1></a>
                <p class="white">Don't have an account?</p>
                <div class="form-group">
                    <a class="btn btn-primary btn-block" href="/register">Register Now!</a>
                </div>
            </div>
            <div class="col-md-5">
                """),_display_(/*17.18*/if(myForm.hasErrors)/*17.38*/ {_display_(Seq[Any](format.raw/*17.40*/("""

                    """),_display_(/*19.22*/if(myForm.errors.size() > 0)/*19.50*/ {_display_(Seq[Any](format.raw/*19.52*/("""
                        """),format.raw/*20.25*/("""<div class="alert alert-danger">
                            <strong>errors:</strong>
                            """),_display_(/*22.30*/for((key, value) <- myForm.errors) yield /*22.64*/ {_display_(Seq[Any](format.raw/*22.66*/("""
                                """),format.raw/*23.33*/("""<p>
                                """),_display_(/*24.34*/for(err <- value) yield /*24.51*/ {_display_(Seq[Any](format.raw/*24.53*/("""
                                    """),_display_(/*25.38*/err/*25.41*/.message().toString()),format.raw/*25.62*/("""
                                """)))}),format.raw/*26.34*/("""
                                """),format.raw/*27.33*/("""</p>
                            """)))}),format.raw/*28.30*/("""
                        """),format.raw/*29.25*/("""</div>

                    """)))}),format.raw/*31.22*/("""
                """)))}),format.raw/*32.18*/("""

                """),format.raw/*34.17*/("""<form action="/login" method="post">
                    <div class="form-group">
                        <input type="text" name="username" placeholder="Username" class="form-control">
                    </div>
                    <div class="form-group">
                        <input type="password" name="password" placeholder="Password" class="form-control">
                    </div>
                    <input type="submit" value="login" class="btn btn-primary btn-block">
                </form>
            </div>
                <!-- /.col -->
                <!-- /.col -->
        </div>
            <!-- /.row -->
    </div>

    <script >
            document.getElementById("thebody").style.height="100%";
            document.getElementById("promo-1").style.height="90%";
            document.getElementById("thefooter").style.height="10%";

    </script>
""")))}),format.raw/*56.2*/("""
"""))
      }
    }
  }

  def render(title:String,description:String,keywords:String,myForm:Form[models.garaDB.tables.pojos.Member]): play.twirl.api.HtmlFormat.Appendable = apply(title,description,keywords,myForm)

  def f:((String,String,String,Form[models.garaDB.tables.pojos.Member]) => play.twirl.api.HtmlFormat.Appendable) = (title,description,keywords,myForm) => apply(title,description,keywords,myForm)

  def ref: this.type = this

}


}

/**/
object login extends login_Scope0.login
              /*
                  -- GENERATED --
                  DATE: Tue May 31 23:33:54 EET 2016
                  SOURCE: C:/Users/ahmedengu/Documents/IdeaProjects/Gara/app/views/login.scala.html
                  HASH: abb0fabe9eb6566d9951830b68ee104c99b0cf13
                  MATRIX: 799->1|995->101|1027->108|1075->148|1114->150|1154->164|1639->622|1668->642|1708->644|1760->669|1797->697|1837->699|1891->725|2035->842|2085->876|2125->878|2187->912|2252->950|2285->967|2325->969|2391->1008|2403->1011|2445->1032|2511->1067|2573->1101|2639->1136|2693->1162|2755->1193|2805->1212|2853->1232|3781->2130
                  LINES: 27->1|32->1|35->4|35->4|35->4|38->7|48->17|48->17|48->17|50->19|50->19|50->19|51->20|53->22|53->22|53->22|54->23|55->24|55->24|55->24|56->25|56->25|56->25|57->26|58->27|59->28|60->29|62->31|63->32|65->34|87->56
                  -- GENERATED --
              */
          