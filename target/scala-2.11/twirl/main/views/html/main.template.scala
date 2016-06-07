
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
  def apply/*1.2*/(title: String,description: String,keywords: String)(content: Html):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.69*/("""
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
            box-shadow: 0 0 3px rgba(0,0,0,.3);
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
            </nav>
                <!--// End Navbar -->
        </header>
        """),_display_(/*98.10*/content),format.raw/*98.17*/("""
        """),format.raw/*99.9*/("""<section class="content-block-nopad bg-deepocean footer-wrap-1-3">
            <div class="container footer-1-3">
                <div class="col-md-4 pull-left">
                    <img src=""""),_display_(/*102.32*/routes/*102.38*/.Assets.at("images/logo.png")),format.raw/*102.67*/("""" class="brand-img img-responsive" data-animation-1 data-animation-trigger-1="hover" data-animation-type-1="bounce">
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
        <script type="text/javascript" src=""""),_display_(/*126.46*/routes/*126.52*/.Assets.at("js/jquery-1.11.1.min.js")),format.raw/*126.89*/(""""></script>
        <script type="text/javascript" src=""""),_display_(/*127.46*/routes/*127.52*/.Assets.at("js/bootstrap.min.js")),format.raw/*127.85*/(""""></script>
        <script type="text/javascript" src=""""),_display_(/*128.46*/routes/*128.52*/.Assets.at("js/plugins.js")),format.raw/*128.79*/(""""></script>
        <script src="https://maps.google.com/maps/api/js?sensor=true"></script>
        <script type="text/javascript" src=""""),_display_(/*130.46*/routes/*130.52*/.Assets.at("js/bskit-scripts.js")),format.raw/*130.85*/(""""></script>
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
                  DATE: Wed Jun 01 00:25:39 EET 2016
                  SOURCE: C:/Users/ahmedengu/Documents/IdeaProjects/Gara/app/views/main.scala.html
                  HASH: 451962c79588ea0b32973b0e8c5496b06a898946
                  MATRIX: 762->1|924->68|951->69|1090->182|1115->187|1269->315|1294->320|1322->321|1351->324|1379->332|1453->380|1478->385|1506->386|1535->389|1566->400|1639->446|1654->452|1703->480|1784->534|1799->540|1865->585|1933->626|1948->632|2007->670|2379->1015|2394->1021|2452->1058|2520->1099|2535->1105|2585->1134|2653->1175|2668->1181|2717->1209|2785->1250|2800->1256|2849->1284|3075->1483|3090->1489|3142->1520|3227->1578|3242->1584|3292->1613|4817->3111|4832->3117|4873->3137|4942->3179|4957->3185|5007->3214|6674->4854|6702->4861|6738->4870|6960->5064|6976->5070|7027->5099|8879->6923|8895->6929|8954->6966|9039->7023|9055->7029|9110->7062|9195->7119|9211->7125|9260->7152|9425->7289|9441->7295|9496->7328
                  LINES: 27->1|32->1|33->2|37->6|37->6|39->8|39->8|39->8|39->8|39->8|40->9|40->9|40->9|40->9|40->9|41->10|41->10|41->10|43->12|43->12|43->12|44->13|44->13|44->13|48->17|48->17|48->17|49->18|49->18|49->18|50->19|50->19|50->19|51->20|51->20|51->20|55->24|55->24|55->24|56->25|56->25|56->25|93->62|93->62|93->62|94->63|94->63|94->63|129->98|129->98|130->99|133->102|133->102|133->102|157->126|157->126|157->126|158->127|158->127|158->127|159->128|159->128|159->128|161->130|161->130|161->130
                  -- GENERATED --
              */
          