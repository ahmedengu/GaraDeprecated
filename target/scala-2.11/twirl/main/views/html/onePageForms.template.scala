
package views.html

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object onePageForms_Scope0 {
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

class onePageForms extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template4[String,String,String,Html,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(title: String,description: String,keywords: String)(content: Html):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.69*/("""
"""),format.raw/*2.1*/("""<!DOCTYPE html>
<html lang="en" style="height:100%;">
    <head>
        <meta charset="utf-8">
        <title>"""),_display_(/*6.17*/title),format.raw/*6.22*/("""</title>
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <meta name="keywords" content=""""),_display_(/*8.41*/keywords),format.raw/*8.49*/("""" />
        <meta name="description" content=""""),_display_(/*9.44*/description),format.raw/*9.55*/("""" />
        <link rel="shortcut icon" href=""""),_display_(/*10.42*/routes/*10.48*/.Assets.at("images/fav.ico")),format.raw/*10.76*/("""">
            <!-- Core CSS -->
        <link href=""""),_display_(/*12.22*/routes/*12.28*/.Assets.at("bootstrap/css/bootstrap.min.css")),format.raw/*12.73*/("""" rel="stylesheet">
        <link href=""""),_display_(/*13.22*/routes/*13.28*/.Assets.at("css/font-awesome.min.css")),format.raw/*13.66*/("""" rel="stylesheet">
        <link href="http://fonts.googleapis.com/css?family=Open+Sans:300italic,400italic,600italic,700italic,400,300,600,700" rel="stylesheet">
        <link href="http://fonts.googleapis.com/css?family=Lato:300,400,700,300italic,400italic,700italic" rel="stylesheet">
            <!-- Style Library -->
        <link href=""""),_display_(/*17.22*/routes/*17.28*/.Assets.at("css/style-library-1.css")),format.raw/*17.65*/("""" rel="stylesheet">
        <link href=""""),_display_(/*18.22*/routes/*18.28*/.Assets.at("css/plugins.css")),format.raw/*18.57*/("""" rel="stylesheet">
        <link href=""""),_display_(/*19.22*/routes/*19.28*/.Assets.at("css/blocks.css")),format.raw/*19.56*/("""" rel="stylesheet">
        <link href=""""),_display_(/*20.22*/routes/*20.28*/.Assets.at("css/custom.css")),format.raw/*20.56*/("""" rel="stylesheet">
            <!-- HTML5 shim, for IE6-8 support of HTML5 elements. All other JS at the end of file. -->
            <!--[if lt IE 9]>
      <script src=""""),_display_(/*23.21*/routes/*23.27*/.Assets.at("js/html5shiv.js")),format.raw/*23.56*/(""""></script>
      <script src=""""),_display_(/*24.21*/routes/*24.27*/.Assets.at("js/respond.min.js")),format.raw/*24.58*/(""""></script>
    <![endif]-->
        <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/animate.css/3.4.0/animate.min.css">
    </head>
    <body data-spy="scroll" data-target="nav" id="thebody">
        <div style="
            width: 200px;
            background: #2980B9;
            position: fixed;
            top: 25px;
            left: -50px;
            text-align: center;
            line-height: 50px;
            letter-spacing: 1px;
            color: #f0f0f0;
            transform: rotate(-45deg);
            -webkit-transform: rotate(-45deg);
            box-shadow: 0 0 3px rgba(0,0,0,.3);
            visibility: visible;
            display: block;
            z-index: 9999;
        ">Beta v0.1</div>
        <section id="promo-1" class="content-block promo-1 bg-offwhite" >
            """),_display_(/*47.14*/content),format.raw/*47.21*/("""
        """),format.raw/*48.9*/("""</section>
        <div class="copyright-bar bg-black margin-bottom0 pad-bottom0" id="thefooter">
            <div class="container">
                <p class="pull-left small">© Gara</p>
            </div>
        </div>
        <script type="text/javascript" src=""""),_display_(/*54.46*/routes/*54.52*/.Assets.at("js/jquery-1.11.1.min.js")),format.raw/*54.89*/(""""></script>
        <script type="text/javascript" src=""""),_display_(/*55.46*/routes/*55.52*/.Assets.at("js/bootstrap.min.js")),format.raw/*55.85*/(""""></script>
        <script type="text/javascript" src=""""),_display_(/*56.46*/routes/*56.52*/.Assets.at("js/plugins.js")),format.raw/*56.79*/(""""></script>
        <script src="https://maps.google.com/maps/api/js?sensor=true"></script>
        <script type="text/javascript" src=""""),_display_(/*58.46*/routes/*58.52*/.Assets.at("js/bskit-scripts.js")),format.raw/*58.85*/(""""></script>
        <script type="text/javascript" src="https://cdn.rawgit.com/MhdAljuboori/6ea3a3fa48248e3a132a/raw/animator.js"></script>
        <script type="text/javascript" src="https://cdnjs.cloudflare.com/ajax/libs/waypoints/4.0.0/jquery.waypoints.min.js"></script>
    </body>
</html>
"""))
      }
    }
  }

  def render(title:String,description:String,keywords:String,content:Html): play.twirl.api.HtmlFormat.Appendable = apply(title,description,keywords)(content)

  def f:((String,String,String) => (Html) => play.twirl.api.HtmlFormat.Appendable) = (title,description,keywords) => (content) => apply(title,description,keywords)(content)

  def ref: this.type = this

}


}

/**/
object onePageForms extends onePageForms_Scope0.onePageForms
              /*
                  -- GENERATED --
                  DATE: Wed Jun 01 00:26:39 EET 2016
                  SOURCE: C:/Users/ahmedengu/Documents/IdeaProjects/Gara/app/views/onePageForms.scala.html
                  HASH: 6b22fc61719e13219267c5283ee41639a1d33adc
                  MATRIX: 778->1|940->68|968->70|1110->186|1135->191|1291->321|1319->329|1394->378|1425->389|1499->436|1514->442|1563->470|1646->526|1661->532|1727->577|1796->619|1811->625|1870->663|2246->1012|2261->1018|2319->1055|2388->1097|2403->1103|2453->1132|2522->1174|2537->1180|2586->1208|2655->1250|2670->1256|2719->1284|2922->1460|2937->1466|2987->1495|3047->1528|3062->1534|3114->1565|3993->2417|4021->2424|4058->2434|4358->2707|4373->2713|4431->2750|4516->2808|4531->2814|4585->2847|4670->2905|4685->2911|4733->2938|4899->3077|4914->3083|4968->3116
                  LINES: 27->1|32->1|33->2|37->6|37->6|39->8|39->8|40->9|40->9|41->10|41->10|41->10|43->12|43->12|43->12|44->13|44->13|44->13|48->17|48->17|48->17|49->18|49->18|49->18|50->19|50->19|50->19|51->20|51->20|51->20|54->23|54->23|54->23|55->24|55->24|55->24|78->47|78->47|79->48|85->54|85->54|85->54|86->55|86->55|86->55|87->56|87->56|87->56|89->58|89->58|89->58
                  -- GENERATED --
              */
          