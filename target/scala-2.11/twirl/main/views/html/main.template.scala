
package views.html

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object main_Scope0 {
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

class main extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template4[String,String,String,Html,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(title: String, description: String, keywords: String)(content: Html):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.71*/("""
"""),format.raw/*2.1*/("""<!DOCTYPE html>
<html lang="en" style="height: 100%;">
    <head>
        <meta charset="utf-8">
        <title>"""),_display_(/*6.17*/title),format.raw/*6.22*/("""</title>
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <meta name="keywords" content=""""),_display_(/*8.41*/title),format.raw/*8.46*/(""" """),format.raw/*8.47*/(""", """),_display_(/*8.50*/keywords),format.raw/*8.58*/("""" />
        <meta name="description" content=""""),_display_(/*9.44*/title),format.raw/*9.49*/(""" """),format.raw/*9.50*/("""- """),_display_(/*9.53*/description),format.raw/*9.64*/("""" />
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

        <script type="text/javascript" src=""""),_display_(/*24.46*/routes/*24.52*/.Assets.at("js/respond.min.js")),format.raw/*24.83*/("""" ></script>
        <script type="text/javascript" src=""""),_display_(/*25.46*/routes/*25.52*/.Assets.at("js/html5shiv.js")),format.raw/*25.81*/("""" ></script>

        <![endif]-->
        <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/animate.css/3.4.0/animate.min.css">
    </head>
    <body data-spy="scroll" data-target="nav">

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
            box-shadow: 0 0 3px rgba(0, 0, 0, .3);
            visibility: visible;
            display: block;
            z-index: 9999;
        ">Beta v0.1</div>

        <header id="header-1" class="soft-scroll header-1">
                <!-- Navbar -->
            <nav class="main-nav navbar-fixed-top headroom headroom--pinned bg-marina">
                <div class="container">
                        <!-- Brand and toggle -->
                    <div class="navbar-header">
                        <button type="button" class="navbar-toggle" data-toggle="collapse" data-target=".navbar-collapse">
                            <span class="sr-only">Toggle navigation</span>
                            <span class="icon-bar"></span>
                            <span class="icon-bar"></span>
                            <span class="icon-bar"></span>
                        </button>
                        <a href=""""),_display_(/*62.35*/routes/*62.41*/.Application.index()),format.raw/*62.61*/("""">
                            <img src=""""),_display_(/*63.40*/routes/*63.46*/.Assets.at("images/logo.png")),format.raw/*63.75*/("""" class="brand-img img-responsive">
                        </a>
                    </div>
                        <!-- Navigation -->
                    <div class="collapse navbar-collapse">
                        <ul class="nav navbar-nav navbar-right">
                            <li class="active nav-item">
                                <a class="clouds-hover soft-scroll">Home</a>
                            </li>
                            <li class="nav-item">
                                <a href="#content-2-7" class="soft-scroll">Why?</a>
                            </li>
                            <li class="nav-item">
                                <a href="#content-2-2" class="soft-scroll">features</a>
                            </li>
                            <li class="nav-item">
                                <a href="#content-3-6" class="soft-scroll">how it works?</a>
                            </li>

                                <!--//dropdown-->
                            <li class="nav-item">
                                <a href="#content-team" class="soft-scroll">team</a>
                            </li>
                            <li class="nav-item">
                                <a class="loginButton black-hover" href="/login">login</a>
                            </li>
                        </ul>
                            <!--//nav-->
                    </div>
                        <!--// End Navigation -->
                </div>
                    <!--// End Container -->
                """),_display_(/*95.18*/if(flash.containsKey("alertMessage"))/*95.55*/ {_display_(Seq[Any](format.raw/*95.57*/("""
                    """),format.raw/*96.21*/("""<div class="alert """),_display_(/*96.40*/if(flash.containsKey("alertMessageType"))/*96.81*/ {_display_(Seq[Any](format.raw/*96.83*/(""" """),_display_(/*96.85*/flash/*96.90*/.get("alertMessageType")),format.raw/*96.114*/(""" """)))}/*96.117*/else/*96.122*/{_display_(Seq[Any](format.raw/*96.123*/("""alert-success""")))}),format.raw/*96.137*/("""" style="text-align: center;">
                        <button type="button" class="close" data-dismiss="alert" aria-hidden="true">&times;</button>
                        """),_display_(/*98.26*/if(flash.containsKey("alertMessageStrong"))/*98.69*/ {_display_(Seq[Any](format.raw/*98.71*/("""<strong> """),_display_(/*98.81*/flash/*98.86*/.get("alertMessageStrong")),format.raw/*98.112*/(""" """),format.raw/*98.113*/("""</strong> """)))}),format.raw/*98.124*/(""" """),_display_(/*98.126*/flash/*98.131*/.get("alertMessage")),format.raw/*98.151*/("""
                    """),format.raw/*99.21*/("""</div>""")))}),format.raw/*99.28*/("""

            """),format.raw/*101.13*/("""</nav>
                <!--// End Navbar -->

        </header>
        """),_display_(/*105.10*/content),format.raw/*105.17*/("""
        """),format.raw/*106.9*/("""<section class="content-block-nopad bg-deepocean footer-wrap-1-3">
            <div class="container footer-1-3">
                <div class="col-md-4 pull-left">
                    <img src=""""),_display_(/*109.32*/routes/*109.38*/.Assets.at("images/logo.png")),format.raw/*109.67*/("""" class="brand-img img-responsive" data-animation-1 data-animation-trigger-1="hover" data-animation-type-1="bounce">
                    <ul class="social social-light">
                        <li>
                            <a href="http://www.facebook.com/g-ara-1711870822420636/"><i class="fa fa-2x fa-facebook"></i></a>
                        </li>
                        <li>
                            <a href="#"><i class="fa fa-2x fa-twitter"></i></a>
                        </li>
                    </ul>
                        <!-- /.social -->
                </div>
                <div class="col-md-3 pull-right">
                    <p class="address-bold-line" data-animation-1="" data-animation-trigger-1="hover" data-animation-type-1="bounce">
                        Download The App:</p>
                    <img src="https://mlsvc01-prod.s3.amazonaws.com/7e69fcc9001/3769a535-7b20-4f0a-ba3d-471f24c61c9d.png" class="img-rounded img-responsive" width="50%" height="50%" align="" data-animation-1="" data-animation-trigger-1="hover" data-animation-type-1="jello">
                    <img src="http://www.tapsmart.com/wp-content/uploads/2014/04/Download_on_the_App_Store_Badge_US-UK_135x40_0824.png" width="50%" height="50%" class="img-responsive" data-animation-1="" data-animation-trigger-1="hover" data-animation-type-1="jello">
                </div>
                <div class="col-xs-12 footer-text" data-animation-1 data-animation-trigger-1="hover" data-animation-type-1="bounce">
                    <p data-animation-1 data-animation-trigger-1="hover" data-animation-type-1="jello">
                        All copyrights resevied Gara 2016</p>
                </div>
            </div>
                <!-- /.container -->
        </section>
        <script type="text/javascript" src=""""),_display_(/*133.46*/routes/*133.52*/.Assets.at("js/jquery-1.11.1.min.js")),format.raw/*133.89*/(""""></script>
        <script type="text/javascript" src=""""),_display_(/*134.46*/routes/*134.52*/.Assets.at("js/bootstrap.min.js")),format.raw/*134.85*/(""""></script>
        <script type="text/javascript" src=""""),_display_(/*135.46*/routes/*135.52*/.Assets.at("js/plugins.js")),format.raw/*135.79*/(""""></script>
        <script src="https://maps.google.com/maps/api/js?sensor=true"></script>
        <script type="text/javascript" src=""""),_display_(/*137.46*/routes/*137.52*/.Assets.at("js/bskit-scripts.js")),format.raw/*137.85*/(""""></script>
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
object main extends main_Scope0.main
              /*
                  -- GENERATED --
                  DATE: Fri Jun 10 18:22:51 EET 2016
                  SOURCE: C:/Users/ahmedengu/Documents/IdeaProjects/Gara/app/views/main.scala.html
                  HASH: 478610b81171e0b662e91fa4f1b88ba2ca92b352
                  MATRIX: 762->1|926->70|953->71|1092->184|1117->189|1271->317|1296->322|1324->323|1353->326|1381->334|1455->382|1480->387|1508->388|1537->391|1568->402|1641->448|1656->454|1705->482|1786->536|1801->542|1867->587|1935->628|1950->634|2009->672|2381->1017|2396->1023|2454->1060|2522->1101|2537->1107|2587->1136|2655->1177|2670->1183|2719->1211|2787->1252|2802->1258|2851->1286|3077->1485|3092->1491|3144->1522|3229->1580|3244->1586|3294->1615|4822->3116|4837->3122|4878->3142|4947->3184|4962->3190|5012->3219|6612->4792|6658->4829|6698->4831|6747->4852|6793->4871|6843->4912|6883->4914|6912->4916|6926->4921|6972->4945|6994->4948|7008->4953|7048->4954|7094->4968|7294->5141|7346->5184|7386->5186|7423->5196|7437->5201|7485->5227|7515->5228|7558->5239|7588->5241|7603->5246|7645->5266|7694->5287|7732->5294|7775->5308|7876->5381|7905->5388|7942->5397|8164->5591|8180->5597|8231->5626|10083->7450|10099->7456|10158->7493|10243->7550|10259->7556|10314->7589|10399->7646|10415->7652|10464->7679|10629->7816|10645->7822|10700->7855
                  LINES: 27->1|32->1|33->2|37->6|37->6|39->8|39->8|39->8|39->8|39->8|40->9|40->9|40->9|40->9|40->9|41->10|41->10|41->10|43->12|43->12|43->12|44->13|44->13|44->13|48->17|48->17|48->17|49->18|49->18|49->18|50->19|50->19|50->19|51->20|51->20|51->20|55->24|55->24|55->24|56->25|56->25|56->25|93->62|93->62|93->62|94->63|94->63|94->63|126->95|126->95|126->95|127->96|127->96|127->96|127->96|127->96|127->96|127->96|127->96|127->96|127->96|127->96|129->98|129->98|129->98|129->98|129->98|129->98|129->98|129->98|129->98|129->98|129->98|130->99|130->99|132->101|136->105|136->105|137->106|140->109|140->109|140->109|164->133|164->133|164->133|165->134|165->134|165->134|166->135|166->135|166->135|168->137|168->137|168->137
                  -- GENERATED --
              */
          