
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
        """),_display_(/*46.10*/if(flash.containsKey("alertMessage"))/*46.47*/ {_display_(Seq[Any](format.raw/*46.49*/("""
            """),format.raw/*47.13*/("""<div class="alert """),_display_(/*47.32*/if(flash.containsKey("alertMessageType"))/*47.73*/ {_display_(Seq[Any](format.raw/*47.75*/(""" """),_display_(/*47.77*/flash/*47.82*/.get("alertMessageType")),format.raw/*47.106*/(""" """)))}/*47.109*/else/*47.114*/{_display_(Seq[Any](format.raw/*47.115*/("""alert-success""")))}),format.raw/*47.129*/("""" style="text-align: center;margin-bottom: 0px">
                <button type="button" class="close" data-dismiss="alert" aria-hidden="true">&times;</button>
                """),_display_(/*49.18*/if(flash.containsKey("alertMessageStrong"))/*49.61*/ {_display_(Seq[Any](format.raw/*49.63*/("""<strong> """),_display_(/*49.73*/flash/*49.78*/.get("alertMessageStrong")),format.raw/*49.104*/(""" """),format.raw/*49.105*/("""</strong> """)))}),format.raw/*49.116*/(""" """),_display_(/*49.118*/flash/*49.123*/.get("alertMessage")),format.raw/*49.143*/("""
            """),format.raw/*50.13*/("""</div>""")))}),format.raw/*50.20*/("""
        """),format.raw/*51.9*/("""<section id="promo-1" class="content-block promo-1 bg-offwhite" >

            """),_display_(/*53.14*/content),format.raw/*53.21*/("""
        """),format.raw/*54.9*/("""</section>
        <div class="copyright-bar bg-black margin-bottom0 pad-bottom0" id="thefooter">
            <div class="container">
                <p class="pull-left small">© Gara</p>
            </div>
        </div>
        <script type="text/javascript" src=""""),_display_(/*60.46*/routes/*60.52*/.Assets.at("js/jquery-1.11.1.min.js")),format.raw/*60.89*/(""""></script>
        <script type="text/javascript" src=""""),_display_(/*61.46*/routes/*61.52*/.Assets.at("js/bootstrap.min.js")),format.raw/*61.85*/(""""></script>
        <script type="text/javascript" src=""""),_display_(/*62.46*/routes/*62.52*/.Assets.at("js/plugins.js")),format.raw/*62.79*/(""""></script>
        <script src="https://maps.google.com/maps/api/js?sensor=true"></script>
        <script type="text/javascript" src=""""),_display_(/*64.46*/routes/*64.52*/.Assets.at("js/bskit-scripts.js")),format.raw/*64.85*/(""""></script>
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
                  DATE: Fri Jun 10 18:27:58 EET 2016
                  SOURCE: C:/Users/ahmedengu/Documents/IdeaProjects/Gara/app/views/onePageForms.scala.html
                  HASH: b9c29f4f1f4ed2dc2ddcec065c401eba6b0ca50d
                  MATRIX: 778->1|940->68|968->70|1110->186|1135->191|1291->321|1319->329|1394->378|1425->389|1499->436|1514->442|1563->470|1646->526|1661->532|1727->577|1796->619|1811->625|1870->663|2246->1012|2261->1018|2319->1055|2388->1097|2403->1103|2453->1132|2522->1174|2537->1180|2586->1208|2655->1250|2670->1256|2719->1284|2922->1460|2937->1466|2987->1495|3047->1528|3062->1534|3114->1565|3914->2338|3960->2375|4000->2377|4042->2391|4088->2410|4138->2451|4178->2453|4207->2455|4221->2460|4267->2484|4289->2487|4303->2492|4343->2493|4389->2507|4593->2684|4645->2727|4685->2729|4722->2739|4736->2744|4784->2770|4814->2771|4857->2782|4887->2784|4902->2789|4944->2809|4986->2823|5024->2830|5061->2840|5170->2922|5198->2929|5235->2939|5535->3212|5550->3218|5608->3255|5693->3313|5708->3319|5762->3352|5847->3410|5862->3416|5910->3443|6076->3582|6091->3588|6145->3621
                  LINES: 27->1|32->1|33->2|37->6|37->6|39->8|39->8|40->9|40->9|41->10|41->10|41->10|43->12|43->12|43->12|44->13|44->13|44->13|48->17|48->17|48->17|49->18|49->18|49->18|50->19|50->19|50->19|51->20|51->20|51->20|54->23|54->23|54->23|55->24|55->24|55->24|77->46|77->46|77->46|78->47|78->47|78->47|78->47|78->47|78->47|78->47|78->47|78->47|78->47|78->47|80->49|80->49|80->49|80->49|80->49|80->49|80->49|80->49|80->49|80->49|80->49|81->50|81->50|82->51|84->53|84->53|85->54|91->60|91->60|91->60|92->61|92->61|92->61|93->62|93->62|93->62|95->64|95->64|95->64
                  -- GENERATED --
              */
          