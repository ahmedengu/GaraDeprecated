
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
                    <h1 data-animation-1 data-animation-trigger-1="hover" data-animation-type-1="pulse">Get your Ride</h1>
                    <hr>
                    <button type="button" class="btn white bg-marina bg-transparent-hover black-hover btn-block" data-animation-1 data-animation-trigger-1="click" data-animation-type-1="shake" data-target="#modal1" data-toggle="modal">Click me Now!</button>
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
                                    <img src=""""),_display_(/*78.48*/routes/*78.54*/.Assets.at("placeholders/img7.jpg")),format.raw/*78.89*/("""" alt="">
                                    <div class="caption">
                                        <h3>Ahmed</h3>

                                        <p><a href="#" class="btn btn-primary" role="button">Button</a> </p>
                                    </div>
                                </div>
                            </div>
                            <div class="col-sm-6 col-md-4">
                                <div class="thumbnail">
                                    <img src=""""),_display_(/*88.48*/routes/*88.54*/.Assets.at("placeholders/img7.jpg")),format.raw/*88.89*/("""" alt="">
                                    <div class="caption">
                                        <h3>Mohamed</h3>

                                        <p><a href="#" class="btn btn-primary" role="button">Button</a> </p>
                                    </div>
                                </div>
                            </div>
                            <div class="col-sm-6 col-md-4">
                                <div class="thumbnail">
                                    <img src=""""),_display_(/*98.48*/routes/*98.54*/.Assets.at("placeholders/img7.jpg")),format.raw/*98.89*/("""" alt="">
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
                                    <img src=""""),_display_(/*110.48*/routes/*110.54*/.Assets.at("placeholders/img7.jpg")),format.raw/*110.89*/("""" alt="">
                                    <div class="caption">
                                        <h3>Ahmed</h3>

                                        <p><a href="#" class="btn btn-primary" role="button">Button</a> </p>
                                    </div>
                                </div>
                            </div>
                            <div class="col-sm-6 col-md-4">
                                <div class="thumbnail">
                                    <img src=""""),_display_(/*120.48*/routes/*120.54*/.Assets.at("placeholders/img7.jpg")),format.raw/*120.89*/("""" alt="">
                                    <div class="caption">
                                        <h3>Mohamed</h3>

                                        <p><a href="#" class="btn btn-primary" role="button">Button</a> </p>
                                    </div>
                                </div>
                            </div>
                            <div class="col-sm-6 col-md-4">
                                <div class="thumbnail">
                                    <img src=""""),_display_(/*130.48*/routes/*130.54*/.Assets.at("placeholders/img7.jpg")),format.raw/*130.89*/("""" alt="">
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

""")))}),format.raw/*146.2*/("""
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
                  DATE: Sun Jun 12 02:18:51 EET 2016
                  SOURCE: C:/Users/ahmedengu/Documents/IdeaProjects/Gara/app/views/memberAreaIndex.scala.html
                  HASH: 0eb5676669385bd9aa03544b7a47b778f2cea1ca
                  MATRIX: 787->1|952->71|982->76|1028->114|1067->116|1099->122|1204->201|1224->213|1262->214|1303->228|1604->503|1618->509|1668->539|1893->745|1906->749|1945->750|1987->764|2483->1233|2498->1239|2549->1269|2785->1474|2818->1480|5502->4137|5517->4143|5573->4178|6123->4701|6138->4707|6194->4742|6746->5267|6761->5273|6817->5308|7444->5907|7460->5913|7517->5948|8068->6471|8084->6477|8141->6512|8694->7037|8710->7043|8767->7078|9346->7626
                  LINES: 27->1|32->1|34->3|34->3|34->3|35->4|36->5|36->5|36->5|37->6|40->9|40->9|40->9|45->14|45->14|45->14|46->15|51->20|51->20|51->20|56->25|57->26|109->78|109->78|109->78|119->88|119->88|119->88|129->98|129->98|129->98|141->110|141->110|141->110|151->120|151->120|151->120|161->130|161->130|161->130|177->146
                  -- GENERATED --
              */
          