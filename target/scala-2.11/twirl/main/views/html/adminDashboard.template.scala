
package views.html

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object adminDashboard_Scope0 {
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

class adminDashboard extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template3[String,List[String],List[String],play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(title: String, tableNames: List[String], tableData: List[String]):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.68*/("""

"""),_display_(/*3.2*/adminMain(title)/*3.18*/ {_display_(Seq[Any](format.raw/*3.20*/("""
    """),format.raw/*4.5*/("""<script src="http://malsup.github.com/jquery.form.js"></script>
    <script>

            function tableRefresh() """),format.raw/*7.37*/("""{"""),format.raw/*7.38*/("""
                """),format.raw/*8.17*/("""$("#dim_wrapper").animate("""),format.raw/*8.43*/("""{"""),format.raw/*8.44*/("""
                    """),format.raw/*9.21*/("""'opacity':0.3
                """),format.raw/*10.17*/("""}"""),format.raw/*10.18*/(""");

                x = "/api/v1/"""),_display_(/*12.31*/title),format.raw/*12.36*/("""";
                $.getJSON(x, function (json) """),format.raw/*13.46*/("""{"""),format.raw/*13.47*/("""
                    """),format.raw/*14.21*/("""$("table tbody").empty();
                    var tr;
                    for (var i = 0; i < json.length; i++) """),format.raw/*16.59*/("""{"""),format.raw/*16.60*/("""
                        """),format.raw/*17.25*/("""tr = $('<tr/>');
                        tmp = "";
                        """),_display_(/*19.26*/for(tData <- tableData) yield /*19.49*/ {_display_(Seq[Any](format.raw/*19.51*/("""
                        """),format.raw/*20.25*/("""tr.append("<td>" + json[i]."""),_display_(/*20.53*/tData/*20.58*/.toLowerCase),format.raw/*20.70*/(""" """),format.raw/*20.71*/("""+ "</td>");
                        tmp += json[i]."""),_display_(/*21.41*/tData/*21.46*/.toLowerCase),format.raw/*21.58*/(""" """),format.raw/*21.59*/("""+ ",";
                        """)))}),format.raw/*22.26*/("""

                        """),format.raw/*24.25*/("""tmp = tmp.substring(0, tmp.length - 1);
                        tr.append('<td>  <button type="button" class="btn btn-default" data-target="#modalnew" data-toggle="modal" onclick="editOnclic(\'' + tmp + '\')">edit</button> </td>');

                        var theid = json[i]."""),_display_(/*27.46*/tableData/*27.55*/.get(0).toLowerCase()),format.raw/*27.76*/(""";
                        tr.append('<td> <button type="button" class="btn btn-default" onclick="deleteOnclic(' + theid + ')">delete</button> </td>');

                        $('table').append(tr);
                    """),format.raw/*31.21*/("""}"""),format.raw/*31.22*/("""

                """),format.raw/*33.17*/("""}"""),format.raw/*33.18*/(""");


                $("#dim_wrapper").animate("""),format.raw/*36.43*/("""{"""),format.raw/*36.44*/("""
                    """),format.raw/*37.21*/("""'opacity':1.0
            """),format.raw/*38.13*/("""}"""),format.raw/*38.14*/(""");
            """),format.raw/*39.13*/("""}"""),format.raw/*39.14*/("""

            """),format.raw/*41.13*/("""tableRefresh();


            $('#theform').ajaxForm("""),format.raw/*44.36*/("""{"""),format.raw/*44.37*/("""
                """),format.raw/*45.17*/("""beforeSubmit : function()"""),format.raw/*45.42*/("""{"""),format.raw/*45.43*/("""
                    """),format.raw/*46.21*/("""$("#dim_wrapper").animate("""),format.raw/*46.47*/("""{"""),format.raw/*46.48*/("""
                        """),format.raw/*47.25*/("""'opacity':0.3
                    """),format.raw/*48.21*/("""}"""),format.raw/*48.22*/(""");
                """),format.raw/*49.17*/("""}"""),format.raw/*49.18*/(""",
                success : function()"""),format.raw/*50.37*/("""{"""),format.raw/*50.38*/("""
                    """),format.raw/*51.21*/("""tableRefresh();
                    $('#modalnew').modal('hide');

                """),format.raw/*54.17*/("""}"""),format.raw/*54.18*/("""
            """),format.raw/*55.13*/("""}"""),format.raw/*55.14*/(""");


            function deleteOnclic(id) """),format.raw/*58.39*/("""{"""),format.raw/*58.40*/("""
                """),format.raw/*59.17*/("""$.ajax("""),format.raw/*59.24*/("""{"""),format.raw/*59.25*/("""
                    """),format.raw/*60.21*/("""url: '/api/v1/"""),_display_(/*60.36*/title),format.raw/*60.41*/("""/' + id,
                    type: 'DELETE',
                    beforeSend : function()"""),format.raw/*62.44*/("""{"""),format.raw/*62.45*/("""
                        """),format.raw/*63.25*/("""$("#dim_wrapper").animate("""),format.raw/*63.51*/("""{"""),format.raw/*63.52*/("""
                            """),format.raw/*64.29*/("""'opacity':0.3
                        """),format.raw/*65.25*/("""}"""),format.raw/*65.26*/(""");
                    """),format.raw/*66.21*/("""}"""),format.raw/*66.22*/(""",
                    success : function()"""),format.raw/*67.41*/("""{"""),format.raw/*67.42*/("""
                        """),format.raw/*68.25*/("""tableRefresh();
                    """),format.raw/*69.21*/("""}"""),format.raw/*69.22*/("""
                """),format.raw/*70.17*/("""}"""),format.raw/*70.18*/(""");
            """),format.raw/*71.13*/("""}"""),format.raw/*71.14*/("""

            """),format.raw/*73.13*/("""function editOnclic(id) """),format.raw/*73.37*/("""{"""),format.raw/*73.38*/("""
"""),format.raw/*74.1*/("""//                alert(id);
                var arr = (id + '').split(',');
                document.getElementById('modaltitle').innerHTML = "update """),_display_(/*76.76*/title),format.raw/*76.81*/(""" """),format.raw/*76.82*/("""#" + arr[0];
                document.getElementById('theform').action = "/api/v1/"""),_display_(/*77.71*/title),format.raw/*77.76*/("""/" + arr[0];
                all = document.getElementsByClassName('form-control');
                for (i = 0; i < all.length; i++) """),format.raw/*79.50*/("""{"""),format.raw/*79.51*/("""
                    """),format.raw/*80.21*/("""all[i].value = arr[i + 1];
                """),format.raw/*81.17*/("""}"""),format.raw/*81.18*/("""
            """),format.raw/*82.13*/("""}"""),format.raw/*82.14*/("""

            """),format.raw/*84.13*/("""function newOnclic() """),format.raw/*84.34*/("""{"""),format.raw/*84.35*/("""
                """),format.raw/*85.17*/("""document.getElementById('modaltitle').innerHTML = "new """),_display_(/*85.73*/title),format.raw/*85.78*/("""";
                document.getElementById('theform').action = "/api/v1/"""),_display_(/*86.71*/title),format.raw/*86.76*/("""";
                all = document.getElementsByClassName('form-control');
                for (i = 0; i < all.length; i++) """),format.raw/*88.50*/("""{"""),format.raw/*88.51*/("""
                    """),format.raw/*89.21*/("""all[i].value = "";
                """),format.raw/*90.17*/("""}"""),format.raw/*90.18*/("""
            """),format.raw/*91.13*/("""}"""),format.raw/*91.14*/("""
    """),format.raw/*92.5*/("""</script>


    <div class="row">
        <div class="col-sm-3 col-md-2 sidebar">
            <ul class="nav nav-sidebar">
            """),_display_(/*98.14*/for(tableName <- tableNames) yield /*98.42*/ {_display_(Seq[Any](format.raw/*98.44*/("""
                """),format.raw/*99.17*/("""<li>
                    <a href="/admin/"""),_display_(/*100.38*/tableName),format.raw/*100.47*/("""">"""),_display_(/*100.50*/tableName),format.raw/*100.59*/("""</a>
                </li>
            """)))}),format.raw/*102.14*/("""
            """),format.raw/*103.13*/("""</ul>

        </div>
        <div class="col-sm-9 col-sm-offset-3 col-md-10 col-md-offset-2 main">
            <div class="modal fade pg-show-modal" id="modalnew" tabindex="-1" role="dialog" aria-hidden="true">
                <div class="modal-dialog">
                    <div class="modal-content">
                        <div class="modal-header">
                            <button type="button" class="close" data-dismiss="modal" aria-hidden="true">&times;</button>
                            <h4 class="modal-title" id="modaltitle">new</h4>
                        </div>
                        <div class="modal-body">
                            <form role="form" method="post" id="theform" action="/api/v1/"""),_display_(/*115.91*/title),format.raw/*115.96*/("""" >
                                """),_display_(/*116.34*/for(tData <- tableData.subList(1, tableData.size())) yield /*116.86*/ {_display_(Seq[Any](format.raw/*116.88*/("""
                                    """),format.raw/*117.37*/("""<div class="form-group">
                                        <label class="control-label" for="exampleInput"""),_display_(/*118.88*/tData),format.raw/*118.93*/("""">"""),_display_(/*118.96*/tData),format.raw/*118.101*/("""</label>
                                        <input type="text" class="form-control" id="exampleInput"""),_display_(/*119.98*/tData),format.raw/*119.103*/("""" placeholder="Enter """),_display_(/*119.125*/tData),format.raw/*119.130*/("""" name=""""),_display_(/*119.139*/tData),format.raw/*119.144*/("""">
                                    </div>
                                """)))}),format.raw/*121.34*/("""


                                """),format.raw/*124.33*/("""<button type="submit" class="btn">Submit</button>
                                <button type="button" class="btn btn-default" data-dismiss="modal">Close</button>

                            </form>
                            <p><br></p>
                        </div>

                    </div>
                </div>
            </div>

            <h2 class="sub-header">"""),_display_(/*135.37*/title),format.raw/*135.42*/("""
                """),format.raw/*136.17*/("""- <button type="button" class="btn btn-default" data-target="#modalnew" data-toggle="modal" onclick="newOnclic()">
                    New</button>
            </h2>

            <div class="table-responsive">
                <table class="table table-striped">
                    <thead>
                        <tr>
                            """),_display_(/*144.30*/for(tData <- tableData) yield /*144.53*/ {_display_(Seq[Any](format.raw/*144.55*/("""
                                """),format.raw/*145.33*/("""<th>"""),_display_(/*145.38*/tData),format.raw/*145.43*/("""</th>
                            """)))}),format.raw/*146.30*/("""
                            """),format.raw/*147.29*/("""<th>edit</th>
                            <th>delete</th>
                        </tr>
                    </thead>
                    <tbody>
                    </tbody>
                </table>
            </div>
        </div>
    </div>


""")))}),format.raw/*159.2*/("""
"""))
      }
    }
  }

  def render(title:String,tableNames:List[String],tableData:List[String]): play.twirl.api.HtmlFormat.Appendable = apply(title,tableNames,tableData)

  def f:((String,List[String],List[String]) => play.twirl.api.HtmlFormat.Appendable) = (title,tableNames,tableData) => apply(title,tableNames,tableData)

  def ref: this.type = this

}


}

/**/
object adminDashboard extends adminDashboard_Scope0.adminDashboard
              /*
                  -- GENERATED --
                  DATE: Sat May 14 23:35:51 EET 2016
                  SOURCE: C:/Users/ahmedengu/Documents/IdeaProjects/Gara/app/views/adminDashboard.scala.html
                  HASH: f6680be0e83d987263c5685893f2deaf064f5ef7
                  MATRIX: 789->1|950->67|980->72|1004->88|1043->90|1075->96|1219->213|1247->214|1292->232|1345->258|1373->259|1422->281|1481->312|1510->313|1573->349|1599->354|1676->403|1705->404|1755->426|1897->540|1926->541|1980->567|2085->645|2124->668|2164->670|2218->696|2273->724|2287->729|2320->741|2349->742|2429->795|2443->800|2476->812|2505->813|2569->846|2625->874|2933->1155|2951->1164|2993->1185|3244->1408|3273->1409|3321->1429|3350->1430|3428->1480|3457->1481|3507->1503|3562->1530|3591->1531|3635->1547|3664->1548|3708->1564|3792->1620|3821->1621|3867->1639|3920->1664|3949->1665|3999->1687|4053->1713|4082->1714|4136->1740|4199->1775|4228->1776|4276->1796|4305->1797|4372->1836|4401->1837|4451->1859|4565->1945|4594->1946|4636->1960|4665->1961|4739->2007|4768->2008|4814->2026|4849->2033|4878->2034|4928->2056|4970->2071|4996->2076|5114->2166|5143->2167|5197->2193|5251->2219|5280->2220|5338->2250|5405->2289|5434->2290|5486->2314|5515->2315|5586->2358|5615->2359|5669->2385|5734->2422|5763->2423|5809->2441|5838->2442|5882->2458|5911->2459|5955->2475|6007->2499|6036->2500|6065->2502|6246->2656|6272->2661|6301->2662|6412->2746|6438->2751|6601->2886|6630->2887|6680->2909|6752->2953|6781->2954|6823->2968|6852->2969|6896->2985|6945->3006|6974->3007|7020->3025|7103->3081|7129->3086|7230->3160|7256->3165|7409->3290|7438->3291|7488->3313|7552->3349|7581->3350|7623->3364|7652->3365|7685->3371|7854->3513|7898->3541|7938->3543|7984->3561|8055->3604|8086->3613|8117->3616|8148->3625|8222->3667|8265->3681|9027->4415|9054->4420|9120->4458|9189->4510|9230->4512|9297->4550|9438->4663|9465->4668|9496->4671|9524->4676|9659->4783|9687->4788|9738->4810|9766->4815|9804->4824|9832->4829|9945->4910|10012->4948|10430->5338|10457->5343|10504->5361|10888->5717|10928->5740|10969->5742|11032->5776|11065->5781|11092->5786|11160->5822|11219->5852|11509->6111
                  LINES: 27->1|32->1|34->3|34->3|34->3|35->4|38->7|38->7|39->8|39->8|39->8|40->9|41->10|41->10|43->12|43->12|44->13|44->13|45->14|47->16|47->16|48->17|50->19|50->19|50->19|51->20|51->20|51->20|51->20|51->20|52->21|52->21|52->21|52->21|53->22|55->24|58->27|58->27|58->27|62->31|62->31|64->33|64->33|67->36|67->36|68->37|69->38|69->38|70->39|70->39|72->41|75->44|75->44|76->45|76->45|76->45|77->46|77->46|77->46|78->47|79->48|79->48|80->49|80->49|81->50|81->50|82->51|85->54|85->54|86->55|86->55|89->58|89->58|90->59|90->59|90->59|91->60|91->60|91->60|93->62|93->62|94->63|94->63|94->63|95->64|96->65|96->65|97->66|97->66|98->67|98->67|99->68|100->69|100->69|101->70|101->70|102->71|102->71|104->73|104->73|104->73|105->74|107->76|107->76|107->76|108->77|108->77|110->79|110->79|111->80|112->81|112->81|113->82|113->82|115->84|115->84|115->84|116->85|116->85|116->85|117->86|117->86|119->88|119->88|120->89|121->90|121->90|122->91|122->91|123->92|129->98|129->98|129->98|130->99|131->100|131->100|131->100|131->100|133->102|134->103|146->115|146->115|147->116|147->116|147->116|148->117|149->118|149->118|149->118|149->118|150->119|150->119|150->119|150->119|150->119|150->119|152->121|155->124|166->135|166->135|167->136|175->144|175->144|175->144|176->145|176->145|176->145|177->146|178->147|190->159
                  -- GENERATED --
              */
          