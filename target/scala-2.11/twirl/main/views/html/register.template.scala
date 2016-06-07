
package views.html

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object register_Scope0 {
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

class register extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template4[String,String,String,Form[models.garaDB.tables.pojos.Member],play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(title: String,description: String,keywords: String,myForm: Form[models.garaDB.tables.pojos.Member]):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.102*/("""


"""),_display_(/*4.2*/onePageForms(title,description,keywords)/*4.42*/ {_display_(Seq[Any](format.raw/*4.44*/("""


    """),format.raw/*7.5*/("""<div class="container verticalAllign">

        """),_display_(/*9.10*/if(myForm.hasErrors)/*9.30*/ {_display_(Seq[Any](format.raw/*9.32*/("""

                """),_display_(/*11.18*/if(myForm.errors.size() > 0)/*11.46*/ {_display_(Seq[Any](format.raw/*11.48*/("""
                    """),format.raw/*12.21*/("""<div class="alert alert-danger">
                        <strong>errors:</strong>
                    """),_display_(/*14.22*/for((key, value) <- myForm.errors) yield /*14.56*/ {_display_(Seq[Any](format.raw/*14.58*/("""
                        """),format.raw/*15.25*/("""<p>
                        """),_display_(/*16.26*/for(err <- value) yield /*16.43*/ {_display_(Seq[Any](format.raw/*16.45*/("""
                            """),_display_(/*17.30*/err/*17.33*/.message().toString()),format.raw/*17.54*/("""
                        """)))}),format.raw/*18.26*/("""
                        """),format.raw/*19.25*/("""</p>
                    """)))}),format.raw/*20.22*/("""
                    """),format.raw/*21.21*/("""</div>

                """)))}),format.raw/*23.18*/("""
        """)))}),format.raw/*24.10*/("""

        """),format.raw/*26.9*/("""<div class="row">
            <div class="col-md-5">
                <a href="/"><h1 class="white">Gara</h1></a>
                <p class="white">Already a member?</p>
                <div class="form-group">
                    <a class="btn btn-primary btn-block" href="/login">Login!</a>
                </div>
            </div>
            <div class="col-md-5">



                <form enctype="multipart/form-data" action="/register" method="post">
                    <div class="form-group">
                        <input type="text"  placeholder="Name" id="thename" name="name" class="form-control" value=""""),_display_(/*40.118*/myForm("name")/*40.132*/.value),format.raw/*40.138*/("""">
                    </div>
                    <div class="form-group">
                        <input type="text" placeholder="Username" id="theusername" name="username" class="form-control" value=""""),_display_(/*43.129*/myForm("username")/*43.147*/.value),format.raw/*43.153*/("""">
                    </div>
                    <div class="form-group">
                        <input type="email" placeholder="Student email address" id="thestudentEmail" name="studentemail" class="form-control" value=""""),_display_(/*46.151*/myForm("studentemail")/*46.173*/.value),format.raw/*46.179*/("""">
                    </div>
                    <div class="form-group">
                        <input type="password" placeholder="Password" name="password" class="form-control" value=""""),_display_(/*49.116*/myForm("password")/*49.134*/.value),format.raw/*49.140*/("""">
                    </div>
                    <div class="form-group">
                        <input type="text" class="form-control" name="phonenumber" placeholder="Phone number" value=""""),_display_(/*52.119*/myForm("phonenumber")/*52.140*/.value),format.raw/*52.146*/("""">
                    </div>

                    <input type="submit" value="Register Now!" class="btn btn-primary btn-block">
                </form>
            </div>
                <!-- /.col -->
                <!-- /.col -->
        </div>
            <!-- /.row -->
    </div>

    <script>

            function thefuc() """),format.raw/*66.31*/("""{"""),format.raw/*66.32*/("""
                """),format.raw/*67.17*/("""function getParameterByName(name, url) """),format.raw/*67.56*/("""{"""),format.raw/*67.57*/("""
                    """),format.raw/*68.21*/("""if (!url) url = window.location.href;
                    name = name.replace(/[\[\]]/g, "\\$&");
                    var regex = new RegExp("[?&]" + name + "(=([^&#]*)|&|#|$)"),
                            results = regex.exec(url);
                    if (!results) return null;
                    if (!results[2]) return '';
                    return decodeURIComponent(results[2].replace(/\+/g, " "));
                """),format.raw/*75.17*/("""}"""),format.raw/*75.18*/("""
"""),format.raw/*76.1*/("""if(getParameterByName("name").length>0)
                document.getElementById("thename").value =getParameterByName("name");
                if(getParameterByName("studentEmail").length>0)

                    document.getElementById("thestudentEmail").value =getParameterByName("studentEmail");
                if(getParameterByName("username").length>0)

                    document.getElementById("theusername").value =getParameterByName("username");

            """),format.raw/*85.13*/("""}"""),format.raw/*85.14*/("""

            """),format.raw/*87.13*/("""thefuc();
    </script>
""")))}),format.raw/*89.2*/("""
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
object register extends register_Scope0.register
              /*
                  -- GENERATED --
                  DATE: Fri May 27 22:37:10 EET 2016
                  SOURCE: C:/Users/ahmedengu/Documents/IdeaProjects/Gara/app/views/register.scala.html
                  HASH: 0515dbb1f14ad45c131006515e830ca51b39fff5
                  MATRIX: 805->1|1001->101|1033->108|1081->148|1120->150|1156->160|1233->211|1261->231|1300->233|1348->254|1385->282|1425->284|1475->306|1607->411|1657->445|1697->447|1751->473|1808->503|1841->520|1881->522|1939->553|1951->556|1993->577|2051->604|2105->630|2163->657|2213->679|2271->706|2313->717|2352->729|3013->1362|3037->1376|3065->1382|3299->1588|3327->1606|3355->1612|3611->1840|3643->1862|3671->1868|3892->2061|3920->2079|3948->2085|4172->2281|4203->2302|4231->2308|4605->2654|4634->2655|4680->2673|4747->2712|4776->2713|4826->2735|5285->3166|5314->3167|5343->3169|5849->3647|5878->3648|5922->3664|5979->3691
                  LINES: 27->1|32->1|35->4|35->4|35->4|38->7|40->9|40->9|40->9|42->11|42->11|42->11|43->12|45->14|45->14|45->14|46->15|47->16|47->16|47->16|48->17|48->17|48->17|49->18|50->19|51->20|52->21|54->23|55->24|57->26|71->40|71->40|71->40|74->43|74->43|74->43|77->46|77->46|77->46|80->49|80->49|80->49|83->52|83->52|83->52|97->66|97->66|98->67|98->67|98->67|99->68|106->75|106->75|107->76|116->85|116->85|118->87|120->89
                  -- GENERATED --
              */
          