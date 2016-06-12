
package views.html

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object memberAreaIndex_Scope0 {
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

class memberAreaIndex extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template4[String,String,String,Boolean,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(title: String,description: String,keywords: String,isDriver: Boolean):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.72*/("""

"""),_display_(/*3.2*/memberArea(title,description,keywords)/*3.40*/ {_display_(Seq[Any](format.raw/*3.42*/("""
    """),format.raw/*4.5*/("""<section id="content-3-22" class="content-block-nopad content-3-22">
        """),_display_(/*5.10*/if(isDriver)/*5.22*/{_display_(Seq[Any](format.raw/*5.23*/("""
            """),format.raw/*6.13*/("""<div class="overlay overlay-green">
                <div class="container text-center" data-animation-1 data-animation-trigger-1="load" data-animation-type-1="pulse">
                    <div class="col-md-6 col-md-offset-3 text-center">
                        <a href=""""),_display_(/*9.35*/routes/*9.41*/.Application.BecomeDriverGet()),format.raw/*9.71*/("""" class="btn btn-block btn-outline btn-outline-lg outline-light">add your car</a>
                    </div>
                </div>
                    <!-- /.container -->
            </div>
        """)))}/*14.10*/else/*14.14*/{_display_(Seq[Any](format.raw/*14.15*/("""
            """),format.raw/*15.13*/("""<div class="overlay overlay-green">
                <div class="container text-center" data-animation-1 data-animation-trigger-1="load" data-animation-type-1="pulse">
                    <h1 class="pad90" data-animation-1 data-animation-trigger-1="hover" data-animation-type-1="flash">Want to make some money</h1>
                    <h2>Become a driver</h2>
                    <div class="col-md-6 col-md-offset-3 text-center">
                        <a href=""""),_display_(/*20.35*/routes/*20.41*/.Application.BecomeDriverGet()),format.raw/*20.71*/("""" class="btn btn-block btn-outline btn-outline-lg outline-light">Strart Here</a>
                    </div>
                </div>
                    <!-- /.container -->
            </div>
        """)))}),format.raw/*25.10*/("""
    """),format.raw/*26.5*/("""</section>

    <section id="content-3-8" class="content-block content-3-7">
        <div class="container">
            <div class="col-sm-12" data-animation-1 data-animation-trigger-1="hover" data-animation-type-1="pulse">
                <div class="underlined-title">
                    <h1>Choose your Source</h1>
                    <hr>
                </div>
            </div>
        </div>
    </section>
    <div class="map min-height-500px" data-map-lat="31.309842" data-map-long="30.065063" align data-animation-1 data-animation-trigger-1="hover" data-animation-type-1="bounce" data-map-zoom="16"></div>

    <section id="content-3-8" class="content-block content-3-7">
        <div class="container">
            <div class="col-sm-12" data-animation-1 data-animation-trigger-1="hover" data-animation-type-1="pulse">
                <div class="underlined-title">
                    <h1>Choose your destination</h1>
                    <hr>
                </div>
            </div>
        </div>
    </section>
    <div class="map min-height-500px" data-map-lat="31.309842" data-map-long="30.065063" align data-animation-1 data-animation-trigger-1="hover" data-animation-type-1="bounce" data-map-zoom="16"></div>


    <section id="content-3-7" class="content-block content-3-7">
        <div class="container">
            <div class="col-sm-12">
                <div class="underlined-title">
                    <hr>
                    <button type="button" class="btn white bg-marina bg-transparent-hover black-hover btn-block" data-animation-1 data-animation-trigger-1="click" data-animation-type-1="shake" data-target="#modal1" data-toggle="modal">Get your Ride!</button>
                </div>
            </div>
        </div>
    </section>


    <div class="modal fade pg-show-modal" id="modal1" tabindex="-1" role="dialog" aria-hidden="true">
        <div class="modal-dialog">
            <div class="modal-content">
                <div class="modal-header">
                    <button type="button" class="close" data-dismiss="modal" aria-hidden="true">&times;</button>
                    <h4 class="modal-title">Drivers</h4>
                </div>
                <div class="modal-body">
                    <section class="content-block">
                        <div class="row">
                            <div class="col-sm-6 col-md-4">
                                <div class="thumbnail">
                                    <img src=""""),_display_(/*77.48*/routes/*77.54*/.Assets.at("placeholders/img7.jpg")),format.raw/*77.89*/("""" alt="">
                                    <div class="caption">
                                        <h3>Ahmed</h3>

                                        <p><a href="#" class="btn btn-primary" role="button">Button</a> </p>
                                    </div>
                                </div>
                            </div>
                            <div class="col-sm-6 col-md-4">
                                <div class="thumbnail">
                                    <img src=""""),_display_(/*87.48*/routes/*87.54*/.Assets.at("placeholders/img7.jpg")),format.raw/*87.89*/("""" alt="">
                                    <div class="caption">
                                        <h3>Mohamed</h3>

                                        <p><a href="#" class="btn btn-primary" role="button">Button</a> </p>
                                    </div>
                                </div>
                            </div>
                            <div class="col-sm-6 col-md-4">
                                <div class="thumbnail">
                                    <img src=""""),_display_(/*97.48*/routes/*97.54*/.Assets.at("placeholders/img7.jpg")),format.raw/*97.89*/("""" alt="">
                                    <div class="caption">
                                        <h3>Hesham</h3>

                                        <p><a href="#" class="btn btn-primary" role="button">Button</a> </p>
                                    </div>
                                </div>
                            </div>
                        </div>
                        <div class="row">
                            <div class="col-sm-6 col-md-4">
                                <div class="thumbnail">
                                    <img src=""""),_display_(/*109.48*/routes/*109.54*/.Assets.at("placeholders/img7.jpg")),format.raw/*109.89*/("""" alt="">
                                    <div class="caption">
                                        <h3>Ahmed</h3>

                                        <p><a href="#" class="btn btn-primary" role="button">Button</a> </p>
                                    </div>
                                </div>
                            </div>
                            <div class="col-sm-6 col-md-4">
                                <div class="thumbnail">
                                    <img src=""""),_display_(/*119.48*/routes/*119.54*/.Assets.at("placeholders/img7.jpg")),format.raw/*119.89*/("""" alt="">
                                    <div class="caption">
                                        <h3>Mohamed</h3>

                                        <p><a href="#" class="btn btn-primary" role="button">Button</a> </p>
                                    </div>
                                </div>
                            </div>
                            <div class="col-sm-6 col-md-4">
                                <div class="thumbnail">
                                    <img src=""""),_display_(/*129.48*/routes/*129.54*/.Assets.at("placeholders/img7.jpg")),format.raw/*129.89*/("""" alt="">
                                    <div class="caption">
                                        <h3>Hesham</h3>

                                        <p><a href="#" class="btn btn-primary" role="button">Button</a> </p>
                                    </div>
                                </div>
                            </div>
                        </div>
                            <!-- /.container -->
                    </section>
                </div>
            </div>
        </div>
    </div>

""")))}),format.raw/*145.2*/("""
"""))
      }
    }
  }

  def render(title:String,description:String,keywords:String,isDriver:Boolean): play.twirl.api.HtmlFormat.Appendable = apply(title,description,keywords,isDriver)

  def f:((String,String,String,Boolean) => play.twirl.api.HtmlFormat.Appendable) = (title,description,keywords,isDriver) => apply(title,description,keywords,isDriver)

  def ref: this.type = this

}


}

/**/
object memberAreaIndex extends memberAreaIndex_Scope0.memberAreaIndex
              /*
                  -- GENERATED --
                  DATE: Sun Jun 12 03:32:35 EET 2016
                  SOURCE: C:/Users/ahmedengu/Documents/IdeaProjects/Gara/app/views/memberAreaIndex.scala.html
                  HASH: 64bfdcd05be0cef4ffca3ec97918ff8094a7d99a
                  MATRIX: 787->1|952->71|982->76|1028->114|1067->116|1099->122|1204->201|1224->213|1262->214|1303->228|1604->503|1618->509|1668->539|1893->745|1906->749|1945->750|1987->764|2483->1233|2498->1239|2549->1269|2785->1474|2818->1480|5379->4014|5394->4020|5450->4055|6000->4578|6015->4584|6071->4619|6623->5144|6638->5150|6694->5185|7321->5784|7337->5790|7394->5825|7945->6348|7961->6354|8018->6389|8571->6914|8587->6920|8644->6955|9223->7503
                  LINES: 27->1|32->1|34->3|34->3|34->3|35->4|36->5|36->5|36->5|37->6|40->9|40->9|40->9|45->14|45->14|45->14|46->15|51->20|51->20|51->20|56->25|57->26|108->77|108->77|108->77|118->87|118->87|118->87|128->97|128->97|128->97|140->109|140->109|140->109|150->119|150->119|150->119|160->129|160->129|160->129|176->145
                  -- GENERATED --
              */
          