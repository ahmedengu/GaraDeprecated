
package views.html

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object index_Scope0 {
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

class index extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template3[String,String,String,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(title: String, description: String, keywords: String):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.56*/("""

"""),_display_(/*3.2*/main(title, description, keywords)/*3.36*/ {_display_(Seq[Any](format.raw/*3.38*/("""

    """),format.raw/*5.5*/("""<section id="promo-1" class="content-block promo-1 min-height-600px bg-offwhite" style="" align>
        <div class="container">
            <div class="row" data-animation-1 data-animation-trigger-1="load" data-animation-type-1="bounce" data-animation-2>
                <div class="col-md-5" data-animation-1 data-animation-2 data-animation-trigger-1="hover" data-animation-type-1="bounce" align>
                    <h2 class="white">Gara</h2>
                    <p class="offwhite">Carpooling platform for universties.</p>
                    <form action="/register" method="get">
                        <div class="row">
                            <div class="col-md-6">
                                <div class="form-group">
                                    <input type="text" name="name" placeholder="Name" class="form-control">
                                </div>
                            </div>
                            <div class="col-md-6">
                                <div class="form-group">
                                    <input type="text" name="username" placeholder="Username" class="form-control">
                                </div>
                            </div>
                        </div>
                        <div class="form-group">
                            <input type="email" name="studentEmail" placeholder="Student email address" class="form-control">
                        </div>
                        <div class="form-group">
                            <input type="submit" value="register now!" placeholder="Student email address" class="btn btn-primary btn-block bg-marina">
                        </div>
                        <a href="/newUniversity" class="btn btn-primary btn-block bg-pomegranate bg-black-hover" data-animation-1 data-animation-trigger-1="hover" data-animation-type-1="bounce">
                            Add your university!</a>
                    </form>
                </div>
                    <!-- /.col -->
                <div class="col-md-6 col-md-offset-1" data-animation-1>
                    <div class="video-wrapper">
                        <iframe src="https://www.youtube.com/embed/6QbAo8niWEE?loop=1&amp;rel=0&amp;controls=0&amp;showinfo=0" frameborder="0" allowfullscreen data-animation-1 class="maxiframe visible-lg visible-md hidden-sm hidden-xs" width="560" height="315"></iframe>
                    </div>
                </div>
                    <!-- /.col -->
            </div>
                <!-- /.row -->
        </div>
    </section>
    <section id="content-3-6" class="content-block content-3-6">
        <div class="underlined-title" data-animation-1 data-animation-trigger-1="scroll" data-animation-type-1="bounce" data-animation-scroll-direction-1="down" data-animation-target-1="#content-3-6" data-animation-offset-1="150px">
            <h1 data-animation-1 data-animation-trigger-1="hover" data-animation-type-1="bounce">How it works?</h1>
            <hr>
        </div>
        <div class="container">
            <div class="row">
                    <!-- Feature Box 1 -->
                <div class="col-sm-4 col-xs-12">
                    <div class="feature-box" data-animation-1>
                        <div class="icon">
                            <span>1</span>
                        </div>
                        <h3>Choose your destination</h3>
                    </div>
                </div>
                    <!-- Feature Box 2 -->
                <div class="col-sm-4 col-xs-12">
                    <div class="feature-box">
                        <div class="icon">
                            <span>2</span>
                        </div>
                        <h3>Choose a driver</h3>
                    </div>
                </div>
                    <!-- Feature Box 3 -->
                <div class="col-sm-4 col-xs-12">
                    <div class="feature-box">
                        <div class="icon">
                            <span>3</span>
                        </div>
                        <h3>Leave a review</h3>
                    </div>
                </div>
            </div>
                <!-- Row Ends -->
        </div>
            <!-- Container Ends -->
    </section>

    <section id="content-2-2" class="content-block content-2-2 bg-black">
        <div class="underlined-title" data-animation-1 data-animation-trigger-1="hover" data-animation-type-1="jello">
            <h1 class="white">Features</h1>
            <hr>
        </div>
        <div class="container">
                <!-- Start Row -->
            <div class="row">
                <div class="col-sm-4 col-xs-12 text-center">
                    <div class="icon-outline">
                        <span class="fa fa-mobile-phone" data-animation-1 data-animation-trigger-1="hover" data-animation-type-1="tada"></span>
                    </div>
                    <h3>On the go</h3>
                </div>
                <div class="col-sm-4 col-xs-12 text-center">
                    <div class="icon-outline">
                        <span class="fa fa-car" data-animation-1 data-animation-trigger-1="hover" data-animation-type-1="tada"></span>
                    </div>
                    <h3>Get a ride</h3>
                </div>
                <div class="col-sm-4 col-xs-12 text-center">
                    <div class="icon-outline">
                        <span class="fa fa-star" data-animation-1 data-animation-trigger-1="hover" data-animation-type-1="tada"></span>
                    </div>
                    <h3>Reviews based</h3>
                </div>
            </div>
                <!--// END Row -->
        </div>
    </section>
    <section id="content-1-6" class="content-1-6 content-block">
        <div class="container">
            <div class="row text-center">
                <h2 data-animation-1 data-animation-trigger-1="hover" data-animation-type-1="bounce">
                    Partners &amp; Technologies</h2>
            </div>
                <!--end of row-->
            <div class="row client-row">
                <div class="row-wrapper">
                    <div class="col-md-3 col-sm-6 col-xs-12" style=" display:inline-block;float:none;">
                        <a href="aast.edu">
                            <img alt="client" src="https://upload.wikimedia.org/wikipedia/commons/b/b5/AASTMT.png" width="50%">
                        </a>
                    </div>
                    <div class="col-md-3 col-sm-6 col-xs-12" style=" display:inline-block;float:none;">
                        <img alt="client" src="https://upload.wikimedia.org/wikipedia/commons/thumb/d/d7/Android_robot.svg/2000px-Android_robot.svg.png" height="50%" width="50%">
                    </div>
                    <div class="col-md-3 col-sm-6 col-xs-12" style=" display:inline-block;float:none;">
                        <img alt="client" src="https://www.playframework.com/assets/images/logos/play_full_color.png">
                    </div>
                </div>
            </div>
                <!-- /.row -->
                <!-- /.row -->
        </div>
            <!-- /.container -->
    </section>

    <section class="content-block team-1 team-1-2" id="content-team">
        <div class="container">
            <div class="underlined-title" data-animation-1 data-animation-trigger-1="hover" data-animation-type-1="bounce">
                <h1><span>
                    Made with&nbsp;</span><i class="fa fa-heart fa-fw pomegranate" data-animation-1 data-animation-type-1="pulse" data-animation-trigger-1="hover"></i><span>&nbsp;by</span>&nbsp;</h1>
                <hr>
            </div>
            <div class="row">
                <div class="col-md-3 col-sm-6 team-member-wrap" data-animation-1 data-animation-trigger-1="hover" data-animation-type-1="pulse">
                    <div class="team-member">
                        <img src=""""),_display_(/*153.36*/routes/*153.42*/.Assets.at("images/team/1.jpg")),format.raw/*153.73*/("""" class="img-responsive" alt="Member Image" width="50%" height="50%">
                        <div class="team-details">
                            <h4 class="member-name">Ahmed Kamel Taha</h4>
                            <p class="position">Full Stack Developer</p>
                            <ul class="social social-dark">
                                <li>
                                    <a href="https://www.facebook.com/ahmedengu"><i class="fa fa-2x fa-facebook"></i></a>
                                </li>
                                <li>
                                    <a href="https://twitter.com/ahmedengu"><i class="fa fa-2x fa-twitter"></i></a>
                                </li>
                                <li>
                                    <a href="https://github.com/ahmedengu"><i class="fa fa-2x fa-github"></i></a>
                                </li>
                                <li>
                                    <a href="https://www.linkedin.com/in/ahmedengu"><i class="fa fa-2x fa-linkedin"></i></a>
                                </li>
                            </ul>
                                <!-- /.social -->
                        </div>
                    </div>
                </div>
                <div class="col-md-3 col-sm-6 team-member-wrap" data-animation-1 data-animation-trigger-1="hover" data-animation-type-1="pulse">
                    <div class="team-member">
                        <img src=""""),_display_(/*177.36*/routes/*177.42*/.Assets.at("images/team/2.jpg")),format.raw/*177.73*/("""" class="img-responsive" alt="Member Image">
                        <div class="team-details">
                            <h4 class="member-name">Abed EL Rahman</h4>
                            <p class="position">Developer</p>
                            <ul class="social social-dark">
                                <li>
                                    <a href="https://www.facebook.com/abedelrahman.ahmed.988"><i class="fa fa-2x fa-facebook"></i></a>
                                </li>
                            </ul>

                        </div>
                    </div>
                </div>
                <div class="col-md-3 col-sm-6 team-member-wrap" data-animation-1 data-animation-trigger-1="hover" data-animation-type-1="pulse">
                    <div class="team-member">
                        <img src=""""),_display_(/*192.36*/routes/*192.42*/.Assets.at("images/team/3.jpg")),format.raw/*192.73*/("""" class="img-responsive" alt="Member Image">
                        <div class="team-details">
                            <h4 class="member-name">Mohamed El Soussi</h4>
                            <p class="position">Developer</p>
                            <ul class="social social-dark">
                                <li>
                                    <a href="https://www.facebook.com/soussi90"><i class="fa fa-2x fa-facebook"></i></a>
                                </li>
                            </ul>
                        </div>
                    </div>
                </div>
                <div class="col-md-3 col-sm-6 team-member-wrap" data-animation-1 data-animation-trigger-1="hover" data-animation-type-1="pulse">
                    <div class="team-member">
                        <img src=""""),_display_(/*206.36*/routes/*206.42*/.Assets.at("images/team/4.jpg")),format.raw/*206.73*/("""" class="img-responsive" alt="Member Image">
                        <div class="team-details">
                            <h4 class="member-name">Mohammed Hassan</h4>
                            <p class="position">Developer</p>
                            <ul class="social social-dark">
                                <li>
                                    <a href="https://www.facebook.com/ShitMenz"><i class="fa fa-2x fa-facebook"></i></a>
                                </li>
                            </ul>
                        </div>
                    </div>
                </div>
            </div>
                <!-- /.row -->
        </div>
            <!-- /.container -->
    </section>
    <section class="content-block team-1 team-1-2" style="padding-top: 0px;">
        <div class="container">
            <div class="underlined-title" data-animation-1 data-animation-trigger-1="hover" data-animation-type-1="bounce">
                <h1>Supervised By</h1>
                <hr>
            </div>
            <div class="row text-center" style="text-align:center;">
                <div class="col-md-3 col-sm-6" data-animation-1 data-animation-trigger-1="hover" data-animation-type-1="pulse" data-pg-collapsed style="display:inline-block;     float:none;">
                    <div class="team-member">
                        <img src=""""),_display_(/*232.36*/routes/*232.42*/.Assets.at("images/team/6.png")),format.raw/*232.73*/("""" class="img-responsive" alt="Member Image" width="50%" height="50%">
                        <div class="team-details">
                            <h4 class="member-name">Dr.Walid Aly</h4>
                            <p class="position">Assistant Professor at AAST</p>
                            <ul class="social social-dark">
                                <li>
                                    <a href="https://ae.linkedin.com/in/walid-ahmed-6ab009a5"><i class="fa fa-2x fa-linkedin"></i></a>
                                </li>
                                <li>
                                    <a href="http://www.aast.edu/cv.php?ser=41775"><i class="fa fa-2x fa-external-link"></i></a>
                                </li>
                            </ul>
                                <!-- /.social -->
                        </div>
                    </div>
                </div>
                <div class="col-md-3 col-sm-6 team-member-wrap" data-animation-1 data-animation-trigger-1="hover" data-animation-type-1="pulse" data-pg-collapsed style="display:inline-block;     float:none;">
                    <div class="team-member">
                        <img src=""""),_display_(/*250.36*/routes/*250.42*/.Assets.at("images/team/5.png")),format.raw/*250.73*/("""" class="img-responsive" alt="Member Image" width="50%" height="50%">
                        <div class="team-details">
                            <h4 class="member-name">Dr.Khalid Eskaf</h4>
                            <p class="position">Assistant Professor at AAST</p>
                            <ul class="social social-dark">
                                <li>
                                    <a href="https://eg.linkedin.com/in/khalid-eskaf-285ab43b"><i class="fa fa-2x fa-linkedin"></i></a>
                                </li>
                                <li>
                                    <a href="http://www.aast.edu/cv.php?ser=20850"><i class="fa fa-2x fa-external-link"></i></a>
                                </li>
                            </ul>
                                <!-- /.social -->
                        </div>
                    </div>
                </div>
            </div>
                <!-- /.row -->
        </div>
            <!-- /.container -->
    </section>

""")))}),format.raw/*272.2*/("""
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
object index extends index_Scope0.index
              /*
                  -- GENERATED --
                  DATE: Mon Jun 13 14:23:53 EET 2016
                  SOURCE: C:/Users/ahmedengu/Documents/IdeaProjects/Gara/app/views/index.scala.html
                  HASH: 7f005bfbf86a8ed050e50be2bedb80769f2ba004
                  MATRIX: 759->1|908->55|936->58|978->92|1017->94|1049->100|9067->8090|9083->8096|9136->8127|10660->9623|10676->9629|10729->9660|11599->10502|11615->10508|11668->10539|12526->11369|12542->11375|12595->11406|13993->12776|14009->12782|14062->12813|15290->14013|15306->14019|15359->14050|16419->15079
                  LINES: 27->1|32->1|34->3|34->3|34->3|36->5|184->153|184->153|184->153|208->177|208->177|208->177|223->192|223->192|223->192|237->206|237->206|237->206|263->232|263->232|263->232|281->250|281->250|281->250|303->272
                  -- GENERATED --
              */
          