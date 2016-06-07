
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

class memberAreaIndex extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template3[String,String,String,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(title: String,description: String,keywords: String):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.54*/("""

"""),_display_(/*3.2*/memberArea(title,description,keywords)/*3.40*/ {_display_(Seq[Any](format.raw/*3.42*/("""
    """),format.raw/*4.5*/("""<section id="content-3-22" class="content-block-nopad content-3-22">
        <div class="overlay overlay-green">
            <div class="container text-center" data-animation-1 data-animation-trigger-1="load" data-animation-type-1="pulse">
                <h1 class="pad90" data-animation-1 data-animation-trigger-1="hover" data-animation-type-1="flash">Want to make some money</h1>
                <h2>Become a driver</h2>
                <div class="col-md-6 col-md-offset-3 text-center">
                    <a href=""""),_display_(/*10.31*/routes/*10.37*/.Application.BecomeDriverGet()),format.raw/*10.67*/("""" class="btn btn-block btn-outline btn-outline-lg outline-light">Strart Here</a>
                </div>
            </div>
                <!-- /.container -->
        </div>
    </section>
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
                                    <img src=""""),_display_(/*50.48*/routes/*50.54*/.Assets.at("placeholders/img7.jpg")),format.raw/*50.89*/("""" alt="">
                                    <div class="caption">
                                        <h3>Ahmed</h3>

                                        <p><a href="#" class="btn btn-primary" role="button">Button</a> </p>
                                    </div>
                                </div>
                            </div>
                            <div class="col-sm-6 col-md-4">
                                <div class="thumbnail">
                                    <img src=""""),_display_(/*60.48*/routes/*60.54*/.Assets.at("placeholders/img7.jpg")),format.raw/*60.89*/("""" alt="">
                                    <div class="caption">
                                        <h3>Mohamed</h3>

                                        <p><a href="#" class="btn btn-primary" role="button">Button</a> </p>
                                    </div>
                                </div>
                            </div>
                            <div class="col-sm-6 col-md-4">
                                <div class="thumbnail">
                                    <img src=""""),_display_(/*70.48*/routes/*70.54*/.Assets.at("placeholders/img7.jpg")),format.raw/*70.89*/("""" alt="">
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
                                    <img src=""""),_display_(/*82.48*/routes/*82.54*/.Assets.at("placeholders/img7.jpg")),format.raw/*82.89*/("""" alt="">
                                    <div class="caption">
                                        <h3>Ahmed</h3>

                                        <p><a href="#" class="btn btn-primary" role="button">Button</a> </p>
                                    </div>
                                </div>
                            </div>
                            <div class="col-sm-6 col-md-4">
                                <div class="thumbnail">
                                    <img src=""""),_display_(/*92.48*/routes/*92.54*/.Assets.at("placeholders/img7.jpg")),format.raw/*92.89*/("""" alt="">
                                    <div class="caption">
                                        <h3>Mohamed</h3>

                                        <p><a href="#" class="btn btn-primary" role="button">Button</a> </p>
                                    </div>
                                </div>
                            </div>
                            <div class="col-sm-6 col-md-4">
                                <div class="thumbnail">
                                    <img src=""""),_display_(/*102.48*/routes/*102.54*/.Assets.at("placeholders/img7.jpg")),format.raw/*102.89*/("""" alt="">
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

""")))}),format.raw/*118.2*/("""
"""))
      }
    }
  }

  def render(title:String,description:String,keywords:String): play.twirl.api.HtmlFormat.Appendable = apply(title,description,keywords)

  def f:((String,String,String) => play.twirl.api.HtmlFormat.Appendable) = (title,description,keywords) => apply(title,description,keywords)

  def ref: this.type = this

}


}

/**/
object memberAreaIndex extends memberAreaIndex_Scope0.memberAreaIndex
              /*
                  -- GENERATED --
                  DATE: Tue May 31 23:59:58 EET 2016
                  SOURCE: C:/Users/ahmedengu/Documents/IdeaProjects/Gara/app/views/memberAreaIndex.scala.html
                  HASH: 5254081e4f97316aa166fc40406e6f8bef7df650
                  MATRIX: 779->1|926->53|956->58|1002->96|1041->98|1073->104|1627->631|1642->637|1693->667|3931->2878|3946->2884|4002->2919|4552->3442|4567->3448|4623->3483|5175->4008|5190->4014|5246->4049|5872->4648|5887->4654|5943->4689|6493->5212|6508->5218|6564->5253|7117->5778|7133->5784|7190->5819|7769->6367
                  LINES: 27->1|32->1|34->3|34->3|34->3|35->4|41->10|41->10|41->10|81->50|81->50|81->50|91->60|91->60|91->60|101->70|101->70|101->70|113->82|113->82|113->82|123->92|123->92|123->92|133->102|133->102|133->102|149->118
                  -- GENERATED --
              */
          