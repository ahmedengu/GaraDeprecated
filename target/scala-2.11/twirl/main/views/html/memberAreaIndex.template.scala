
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
                        <h1> </h1>
                        <h2>
                            <br>
                            <br>
                            <br>
                            <br>
                        </h2>

                        <a href=""""),_display_(/*17.35*/routes/*17.41*/.Application.addCarGet()),format.raw/*17.65*/("""" class="btn btn-block btn-outline btn-outline-lg outline-light">add your car</a>
                    </div>
                </div>
                    <!-- /.container -->
            </div>
        """)))}/*22.10*/else/*22.14*/{_display_(Seq[Any](format.raw/*22.15*/("""
            """),format.raw/*23.13*/("""<div class="overlay overlay-green">
                <div class="container text-center" data-animation-1 data-animation-trigger-1="load" data-animation-type-1="pulse">
                    <h1 class="pad90" data-animation-1 data-animation-trigger-1="hover" data-animation-type-1="flash">Want to make some money</h1>
                    <h2>Become a driver</h2>
                    <div class="col-md-6 col-md-offset-3 text-center">
                        <a href=""""),_display_(/*28.35*/routes/*28.41*/.Application.BecomeDriverGet()),format.raw/*28.71*/("""" class="btn btn-block btn-outline btn-outline-lg outline-light">Strart Here</a>
                    </div>
                </div>
                    <!-- /.container -->
            </div>
        """)))}),format.raw/*33.10*/("""
    """),format.raw/*34.5*/("""</section>

    <section id="content-3-8" class="content-block content-3-7">
        <div class="container">
            <div class="col-sm-12" data-animation-1 data-animation-trigger-1="hover" data-animation-type-1="pulse">
                <div class="underlined-title">
                    <h1>Choose your distention </h1>
                    <hr>
                </div>
            </div>
        </div>
    </section>

    <div class="map min-height-500px" id="mapholder" ></div>


    <script>
            var map,lat,lng,distLng,distLat;
            var markersArray = [];

            getLocation();


            function getLocation() """),format.raw/*57.36*/("""{"""),format.raw/*57.37*/("""
                """),format.raw/*58.17*/("""if (navigator.geolocation) """),format.raw/*58.44*/("""{"""),format.raw/*58.45*/("""
                    """),format.raw/*59.21*/("""navigator.geolocation.getCurrentPosition(showPosition, showError);
                """),format.raw/*60.17*/("""}"""),format.raw/*60.18*/("""
            """),format.raw/*61.13*/("""}"""),format.raw/*61.14*/("""

            """),format.raw/*63.13*/("""function showPosition(position) """),format.raw/*63.45*/("""{"""),format.raw/*63.46*/("""
                """),format.raw/*64.17*/("""lat = position.coords.latitude;
                lng = position.coords.longitude;
                latlon = new google.maps.LatLng(lat, lng)
                mapholder = document.getElementById('mapholder')
                mapholder.style.height = '250px';

                var myOptions = """),format.raw/*70.33*/("""{"""),format.raw/*70.34*/("""
                    """),format.raw/*71.21*/("""center:latlon,zoom:14
                """),format.raw/*72.17*/("""}"""),format.raw/*72.18*/("""

                 """),format.raw/*74.18*/("""map = new google.maps.Map(document.getElementById("mapholder"), myOptions);
                var marker = new google.maps.Marker("""),format.raw/*75.53*/("""{"""),format.raw/*75.54*/("""position:latlon,map:map,title:"You are here!",icon:"http://maps.google.com/mapfiles/ms/icons/green-dot.png""""),format.raw/*75.161*/("""}"""),format.raw/*75.162*/(""");

                google.maps.event.addListener(map, "click", function(event)
                """),format.raw/*78.17*/("""{"""),format.raw/*78.18*/("""
                    """),format.raw/*79.21*/("""// place a marker
                    placeMarker(event.latLng);

                    // display the lat/lng in your form's lat/lng fields
                    document.getElementById("latFld").value = event.latLng.lat();
                    document.getElementById("lngFld").value = event.latLng.lng();
                """),format.raw/*85.17*/("""}"""),format.raw/*85.18*/(""");

            """),format.raw/*87.13*/("""}"""),format.raw/*87.14*/("""

            """),format.raw/*89.13*/("""function placeMarker(location) """),format.raw/*89.44*/("""{"""),format.raw/*89.45*/("""
                """),format.raw/*90.17*/("""// first remove all markers if there are any
                deleteOverlays();
                distLat = location.lat();
                distLng = location.lng();

                var marker = new google.maps.Marker("""),format.raw/*95.53*/("""{"""),format.raw/*95.54*/("""
                    """),format.raw/*96.21*/("""position: location,
                    map: map
                """),format.raw/*98.17*/("""}"""),format.raw/*98.18*/(""");

                // add marker in markers array
                markersArray.push(marker);

                //map.setCenter(location);
            """),format.raw/*104.13*/("""}"""),format.raw/*104.14*/("""
            """),format.raw/*105.13*/("""function deleteOverlays() """),format.raw/*105.39*/("""{"""),format.raw/*105.40*/("""
                """),format.raw/*106.17*/("""if (markersArray) """),format.raw/*106.35*/("""{"""),format.raw/*106.36*/("""
                    """),format.raw/*107.21*/("""for (i in markersArray) """),format.raw/*107.45*/("""{"""),format.raw/*107.46*/("""
                        """),format.raw/*108.25*/("""markersArray[i].setMap(null);
                    """),format.raw/*109.21*/("""}"""),format.raw/*109.22*/("""
                    """),format.raw/*110.21*/("""markersArray.length = 0;
                """),format.raw/*111.17*/("""}"""),format.raw/*111.18*/("""
            """),format.raw/*112.13*/("""}"""),format.raw/*112.14*/("""
            """),format.raw/*113.13*/("""function showError(error) """),format.raw/*113.39*/("""{"""),format.raw/*113.40*/("""
                """),format.raw/*114.17*/("""switch(error.code) """),format.raw/*114.36*/("""{"""),format.raw/*114.37*/("""
                    case error.PERMISSION_DENIED:
                        x.innerHTML = "User denied the request for Geolocation."
                        break;
                    case error.POSITION_UNAVAILABLE:
                        x.innerHTML = "Location information is unavailable."
                        break;
                    case error.TIMEOUT:
                        x.innerHTML = "The request to get user location timed out."
                        break;
                    case error.UNKNOWN_ERROR:
                        x.innerHTML = "An unknown error occurred."
                        break;
                """),format.raw/*127.17*/("""}"""),format.raw/*127.18*/("""
            """),format.raw/*128.13*/("""}"""),format.raw/*128.14*/("""
        """),format.raw/*129.9*/("""function dispatch() """),format.raw/*129.29*/("""{"""),format.raw/*129.30*/("""
            """),format.raw/*130.13*/("""window.location = """"),_display_(/*130.33*/routes/*130.39*/.Application.dispatchGet()),format.raw/*130.65*/(""""+"?srcLat=" + lat + "&srclng=" + lng +"&distLat=" + distLat + "&distLng=" + distLng;
        """),format.raw/*131.9*/("""}"""),format.raw/*131.10*/("""
    """),format.raw/*132.5*/("""</script>





    <section id="content-3-7" class="content-block content-3-7">
        <div class="container">
            <div class="col-sm-12">
                <div class="underlined-title">
                    <hr>
                    <button type="button" class="btn white bg-marina bg-transparent-hover black-hover btn-block" data-animation-1 data-animation-trigger-1="click" data-animation-type-1="shake" onclick="dispatch()">Get your Ride!</button>
                </div>
            </div>
        </div>
    </section>



""")))}),format.raw/*151.2*/("""
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
                  DATE: Tue Jun 14 00:53:04 EET 2016
                  SOURCE: C:/Users/ahmedengu/Documents/IdeaProjects/Gara/app/views/memberAreaIndex.scala.html
                  HASH: d79a93288c8930dd22bfdc4f3fca07e59f50b43e
                  MATRIX: 787->1|952->71|982->76|1028->114|1067->116|1099->122|1204->201|1224->213|1262->214|1303->228|1840->738|1855->744|1900->768|2125->974|2138->978|2177->979|2219->993|2715->1462|2730->1468|2781->1498|3017->1703|3050->1709|3745->2376|3774->2377|3820->2395|3875->2422|3904->2423|3954->2445|4066->2529|4095->2530|4137->2544|4166->2545|4210->2561|4270->2593|4299->2594|4345->2612|4666->2905|4695->2906|4745->2928|4812->2967|4841->2968|4890->2989|5047->3118|5076->3119|5212->3226|5242->3227|5369->3326|5398->3327|5448->3349|5801->3674|5830->3675|5876->3693|5905->3694|5949->3710|6008->3741|6037->3742|6083->3760|6332->3981|6361->3982|6411->4004|6506->4071|6535->4072|6720->4228|6750->4229|6793->4243|6848->4269|6878->4270|6925->4288|6972->4306|7002->4307|7053->4329|7106->4353|7136->4354|7191->4380|7271->4431|7301->4432|7352->4454|7423->4496|7453->4497|7496->4511|7526->4512|7569->4526|7624->4552|7654->4553|7701->4571|7749->4590|7779->4591|8460->5243|8490->5244|8533->5258|8563->5259|8601->5269|8650->5289|8680->5290|8723->5304|8771->5324|8787->5330|8835->5356|8958->5451|8988->5452|9022->5458|9606->6011
                  LINES: 27->1|32->1|34->3|34->3|34->3|35->4|36->5|36->5|36->5|37->6|48->17|48->17|48->17|53->22|53->22|53->22|54->23|59->28|59->28|59->28|64->33|65->34|88->57|88->57|89->58|89->58|89->58|90->59|91->60|91->60|92->61|92->61|94->63|94->63|94->63|95->64|101->70|101->70|102->71|103->72|103->72|105->74|106->75|106->75|106->75|106->75|109->78|109->78|110->79|116->85|116->85|118->87|118->87|120->89|120->89|120->89|121->90|126->95|126->95|127->96|129->98|129->98|135->104|135->104|136->105|136->105|136->105|137->106|137->106|137->106|138->107|138->107|138->107|139->108|140->109|140->109|141->110|142->111|142->111|143->112|143->112|144->113|144->113|144->113|145->114|145->114|145->114|158->127|158->127|159->128|159->128|160->129|160->129|160->129|161->130|161->130|161->130|161->130|162->131|162->131|163->132|182->151
                  -- GENERATED --
              */
          