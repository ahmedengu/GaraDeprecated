
package views.html

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object adminMain_Scope0 {
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

class adminMain extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template2[String,Html,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(title: String)(content: Html):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.32*/("""
"""),format.raw/*2.1*/("""<html lang="en">
    <head>
        <meta charset="utf-8">
        <meta http-equiv="X-UA-Compatible" content="IE=edge">
        <meta name="viewport" content="width=device-width, initial-scale=1">
        <title>Admin Dashboard - """),_display_(/*7.35*/title),format.raw/*7.40*/("""</title>
            <!-- Bootstrap core CSS -->
        <link href=""""),_display_(/*9.22*/routes/*9.28*/.Assets.at("bootstrap/css/bootstrap.css")),format.raw/*9.69*/("""" rel="stylesheet">
            <!-- Custom styles for this template -->
        <link href=""""),_display_(/*11.22*/routes/*11.28*/.Assets.at("dashboard.css")),format.raw/*11.55*/("""" rel="stylesheet">
            <!--[if lt IE 9]>
        <!-- HTML5 shim and Respond.js for IE8 support of HTML5 elements and media queries -->
            <!--[if lt IE 9]>
      <script src="https://oss.maxcdn.com/html5shiv/3.7.2/html5shiv.min.js"></script>
      <script src="https://oss.maxcdn.com/respond/1.4.2/respond.min.js"></script>
              <![endif]-->
        <script src=""""),_display_(/*18.23*/routes/*18.29*/.Assets.at("assets/js/jquery.min.js")),format.raw/*18.66*/(""""></script>
        <script src=""""),_display_(/*19.23*/routes/*19.29*/.Assets.at("bootstrap/js/bootstrap.min.js")),format.raw/*19.72*/(""""></script>
            <!-- IE10 viewport hack for Surface/desktop Windows 8 bug -->
        <script src=""""),_display_(/*21.23*/routes/*21.29*/.Assets.at("assets/js/ie10-viewport-bug-workaround.js")),format.raw/*21.84*/(""""></script>
    </head>
    <body id="dim_wrapper" style="width:100%; height:100%; background: rgb(245, 245, 245); z-index:10">
        <nav class="navbar navbar-inverse navbar-fixed-top">
            <div class="container-fluid">
                <div class="navbar-header">
                    <a class="navbar-brand" href=""""),_display_(/*27.52*/routes/*27.58*/.AdminCRUD.index()),format.raw/*27.76*/("""">Admin Dashboard</a>
                </div>
            </div>
        </nav>
        <div class="container-fluid">
        """),_display_(/*32.10*/content),format.raw/*32.17*/("""
        """),format.raw/*33.9*/("""</div>

    </body>
</html>

"""))
      }
    }
  }

  def render(title:String,content:Html): play.twirl.api.HtmlFormat.Appendable = apply(title)(content)

  def f:((String) => (Html) => play.twirl.api.HtmlFormat.Appendable) = (title) => (content) => apply(title)(content)

  def ref: this.type = this

}


}

/**/
object adminMain extends adminMain_Scope0.adminMain
              /*
                  -- GENERATED --
                  DATE: Sat May 14 23:38:27 EET 2016
                  SOURCE: C:/Users/ahmedengu/Documents/IdeaProjects/Gara/app/views/adminMain.scala.html
                  HASH: 573fc11748095caa0150cf13292ba07a5ee91581
                  MATRIX: 758->1|883->31|911->33|1174->270|1199->275|1297->347|1311->353|1372->394|1495->490|1510->496|1558->523|1984->922|1999->928|2057->965|2119->1000|2134->1006|2198->1049|2335->1159|2350->1165|2426->1220|2785->1552|2800->1558|2839->1576|2997->1707|3025->1714|3062->1724
                  LINES: 27->1|32->1|33->2|38->7|38->7|40->9|40->9|40->9|42->11|42->11|42->11|49->18|49->18|49->18|50->19|50->19|50->19|52->21|52->21|52->21|58->27|58->27|58->27|63->32|63->32|64->33
                  -- GENERATED --
              */
          