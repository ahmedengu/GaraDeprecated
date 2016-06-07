
package views.html

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object memberArea_Scope0 {
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

class memberArea extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template4[String,String,String,Html,play.twirl.api.HtmlFormat.Appendable] {

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
                        <a href="/">
                            <img src=""""),_display_(/*61.40*/routes/*61.46*/.Assets.at("images/logo.png")),format.raw/*61.75*/("""" class="brand-img img-responsive">
                        </a>
                    </div>
                    <div class="collapse navbar-collapse">
                        <ul class="nav navbar-nav navbar-right">
                            <li class="active nav-item">
                                <a href="/" class="clouds-hover soft-scroll">Home</a>
                            </li>
                            <li class="nav-item">
                                <a href="#content-3-8" class="soft-scroll">choose your destination</a>
                            </li>
                            <li class="nav-item">
                                <a href="#content-3-7" class="soft-scroll">get your ride</a>
                            </li>
                                <!--//dropdown-->
                            <li class="nav-item">
                                <a class="loginButton black-hover" href="/logout">logout</a>
                            </li>
                        </ul>
                            <!--//nav-->
                    </div>
                        <!-- Navigation -->
                        <!--// End Navigation -->
                </div>
                    <!--// End Container -->
            </nav>
                <!--// End Navbar -->
        </header>
        <section id="content-3-1" class="content-block-nopad content-3-1">
        <div class="overlay overlay-blue">
            <div class="container text-center" data-animation-1 data-animation-trigger-1="load" data-animation-type-1="pulse">
                <h1 class="pad90" data-animation-1 data-animation-trigger-1="hover" data-animation-type-1="flash">Welcome Back """),_display_(/*92.129*/title),format.raw/*92.134*/("""</h1>
                <h2>Download the app</h2>
                <div class="col-md-6 col-md-offset-3 text-center">
                    <div class="col-md-6">
                        <a href="#" class="btn btn-block btn-outline btn-outline-lg outline-light">Android</a>
                    </div>
                    <div class="col-md-6">
                        <a href="#" class="btn btn-block btn-outline btn-outline-lg outline-light">IOS</a>
                    </div>
                </div>
            </div>
                <!-- /.container -->
        </div>
    </section>
       """),_display_(/*106.9*/content),format.raw/*106.16*/("""
        """),format.raw/*107.9*/("""<div class="copyright-bar bg-black margin-bottom0 pad-bottom0 loginfooter">
            <div class="container">
                <p class="pull-left small">© Gara</p>
            </div>
        </div>
        <script type="text/javascript" src=""""),_display_(/*112.46*/routes/*112.52*/.Assets.at("js/jquery-1.11.1.min.js")),format.raw/*112.89*/(""""></script>
        <script type="text/javascript" src=""""),_display_(/*113.46*/routes/*113.52*/.Assets.at("js/bootstrap.min.js")),format.raw/*113.85*/(""""></script>
        <script type="text/javascript" src=""""),_display_(/*114.46*/routes/*114.52*/.Assets.at("js/plugins.js")),format.raw/*114.79*/(""""></script>
        <script src="https://maps.google.com/maps/api/js?sensor=true"></script>
        <script type="text/javascript" src=""""),_display_(/*116.46*/routes/*116.52*/.Assets.at("js/bskit-scripts.js")),format.raw/*116.85*/(""""></script>
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
object memberArea extends memberArea_Scope0.memberArea
              /*
                  -- GENERATED --
                  DATE: Wed Jun 01 00:26:39 EET 2016
                  SOURCE: C:/Users/ahmedengu/Documents/IdeaProjects/Gara/app/views/memberArea.scala.html
                  HASH: 46c17d16c6d64d1c68c80e6b506eceec844dddfa
                  MATRIX: 774->1|936->68|964->70|1107->187|1132->192|1288->322|1313->327|1341->328|1370->331|1398->339|1473->388|1498->393|1526->394|1555->397|1586->408|1660->455|1675->461|1724->489|1807->545|1822->551|1888->596|1957->638|1972->644|2031->682|2407->1031|2422->1037|2480->1074|2549->1116|2564->1122|2614->1151|2683->1193|2698->1199|2747->1227|2816->1269|2831->1275|2880->1303|3110->1506|3125->1512|3177->1543|3263->1602|3278->1608|3328->1637|4929->3211|4944->3217|4994->3246|6745->4969|6772->4974|7403->5578|7432->5585|7470->5595|7748->5845|7764->5851|7823->5888|7909->5946|7925->5952|7980->5985|8066->6043|8082->6049|8131->6076|8298->6215|8314->6221|8369->6254
                  LINES: 27->1|32->1|33->2|37->6|37->6|39->8|39->8|39->8|39->8|39->8|40->9|40->9|40->9|40->9|40->9|41->10|41->10|41->10|43->12|43->12|43->12|44->13|44->13|44->13|48->17|48->17|48->17|49->18|49->18|49->18|50->19|50->19|50->19|51->20|51->20|51->20|55->24|55->24|55->24|56->25|56->25|56->25|92->61|92->61|92->61|123->92|123->92|137->106|137->106|138->107|143->112|143->112|143->112|144->113|144->113|144->113|145->114|145->114|145->114|147->116|147->116|147->116
                  -- GENERATED --
              */
          