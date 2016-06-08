
// @GENERATOR:play-routes-compiler
// @SOURCE:C:/Users/ahmedengu/Documents/IdeaProjects/Gara/conf/routes
// @DATE:Wed Jun 08 13:09:03 EET 2016

package router

import play.core.routing._
import play.core.routing.HandlerInvokerFactory._
import play.core.j._

import play.api.mvc._

import _root_.controllers.Assets.Asset
import _root_.play.libs.F

class Routes(
  override val errorHandler: play.api.http.HttpErrorHandler, 
  // @LINE:6
  Application_4: controllers.Application,
  // @LINE:8
  Assets_3: controllers.Assets,
  // @LINE:9
  RESTRouter_1: controllers.RESTRouter,
  // @LINE:18
  AdminCRUD_2: controllers.AdminCRUD,
  // @LINE:43
  UniversityPage_0: controllers.UniversityPage,
  val prefix: String
) extends GeneratedRouter {

   @javax.inject.Inject()
   def this(errorHandler: play.api.http.HttpErrorHandler,
    // @LINE:6
    Application_4: controllers.Application,
    // @LINE:8
    Assets_3: controllers.Assets,
    // @LINE:9
    RESTRouter_1: controllers.RESTRouter,
    // @LINE:18
    AdminCRUD_2: controllers.AdminCRUD,
    // @LINE:43
    UniversityPage_0: controllers.UniversityPage
  ) = this(errorHandler, Application_4, Assets_3, RESTRouter_1, AdminCRUD_2, UniversityPage_0, "/")

  import ReverseRouteContext.empty

  def withPrefix(prefix: String): Routes = {
    router.RoutesPrefix.setPrefix(prefix)
    new Routes(errorHandler, Application_4, Assets_3, RESTRouter_1, AdminCRUD_2, UniversityPage_0, prefix)
  }

  private[this] val defaultPrefix: String = {
    if (this.prefix.endsWith("/")) "" else "/"
  }

  def documentation = List(
    ("""GET""", this.prefix, """controllers.Application.index"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """assets/""" + "$" + """file<.+>""", """controllers.Assets.at(path:String = "/public", file:String)"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """api/v1/login""", """controllers.RESTRouter.index(target:String = "login", table:String = "member"  , id:String = "eouou")"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """api/v1/dispatch""", """controllers.RESTRouter.index(target:String = "dispatch", table:String = "member"  , id:String = "eouou")"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """api/v1/""" + "$" + """table<[^/]+>""", """controllers.RESTRouter.index(target:String = "list", table:String, id:String = "oeuoe")"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """api/v1/""" + "$" + """table<[^/]+>/""" + "$" + """id<[^/]+>""", """controllers.RESTRouter.index(target:String = "getByID", table:String, id:String)"""),
    ("""DELETE""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """api/v1/""" + "$" + """table<[^/]+>/""" + "$" + """id<[^/]+>""", """controllers.RESTRouter.index(target:String = "deleteByID", table:String, id:String)"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """api/v1/""" + "$" + """table<[^/]+>""", """controllers.RESTRouter.index(target:String = "create", table:String, id:String = "eouou")"""),
    ("""PUT""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """api/v1/""" + "$" + """table<[^/]+>/""" + "$" + """id<[^/]+>""", """controllers.RESTRouter.index(target:String = "updateByID", table:String, id:String)"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """api/v1/""" + "$" + """table<[^/]+>/""" + "$" + """id<[^/]+>""", """controllers.RESTRouter.index(target:String = "updateByID", table:String, id:String)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """admin""", """controllers.AdminCRUD.index()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """admin/""" + "$" + """table<[^/]+>""", """controllers.AdminCRUD.crudRouter(table:String)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """register""", """controllers.Application.registerGet()"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """register""", """controllers.Application.registerPost()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """login""", """controllers.Application.loginGet()"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """login""", """controllers.Application.loginPost()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """newUniversity""", """controllers.Application.newUniversityGet()"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """newUniversity""", """controllers.Application.newUniversityPost()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """member""", """controllers.Application.memberArea()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """member/becomeDriver""", """controllers.Application.BecomeDriverGet()"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """member/becomeDriver""", """controllers.Application.BecomeDriverPost()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """member/settings""", """controllers.Application.memberSettingsGet()"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """member/settings""", """controllers.Application.memberSettingsPost()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """member/addCar""", """controllers.Application.addCarGet()"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """member/addCar""", """controllers.Application.addCarPost()"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """member/dispatch""", """controllers.Application.dispatchPost()"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """member/order""", """controllers.Application.orderPost()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """logout""", """controllers.Application.logout()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """university""", """controllers.UniversityPage.index()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """university/""" + "$" + """subdomain<[^/]+>""", """controllers.UniversityPage.home(subdomain:String)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """university/""" + "$" + """subdomain<[^/]+>/""" + "$" + """page<[^/]+>""", """controllers.UniversityPage.page(subdomain:String, page:String)"""),
    Nil
  ).foldLeft(List.empty[(String,String,String)]) { (s,e) => e.asInstanceOf[Any] match {
    case r @ (_,_,_) => s :+ r.asInstanceOf[(String,String,String)]
    case l => s ++ l.asInstanceOf[List[(String,String,String)]]
  }}


  // @LINE:6
  private[this] lazy val controllers_Application_index0_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix)))
  )
  private[this] lazy val controllers_Application_index0_invoker = createInvoker(
    Application_4.index,
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Application",
      "index",
      Nil,
      "GET",
      """ Home page""",
      this.prefix + """"""
    )
  )

  // @LINE:8
  private[this] lazy val controllers_Assets_at1_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("assets/"), DynamicPart("file", """.+""",false)))
  )
  private[this] lazy val controllers_Assets_at1_invoker = createInvoker(
    Assets_3.at(fakeValue[String], fakeValue[String]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Assets",
      "at",
      Seq(classOf[String], classOf[String]),
      "GET",
      """ Map static resources from the /public folder to the /assets URL path""",
      this.prefix + """assets/""" + "$" + """file<.+>"""
    )
  )

  // @LINE:9
  private[this] lazy val controllers_RESTRouter_index2_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("api/v1/login")))
  )
  private[this] lazy val controllers_RESTRouter_index2_invoker = createInvoker(
    RESTRouter_1.index(fakeValue[String], fakeValue[String], fakeValue[String]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.RESTRouter",
      "index",
      Seq(classOf[String], classOf[String], classOf[String]),
      "POST",
      """""",
      this.prefix + """api/v1/login"""
    )
  )

  // @LINE:10
  private[this] lazy val controllers_RESTRouter_index3_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("api/v1/dispatch")))
  )
  private[this] lazy val controllers_RESTRouter_index3_invoker = createInvoker(
    RESTRouter_1.index(fakeValue[String], fakeValue[String], fakeValue[String]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.RESTRouter",
      "index",
      Seq(classOf[String], classOf[String], classOf[String]),
      "POST",
      """""",
      this.prefix + """api/v1/dispatch"""
    )
  )

  // @LINE:11
  private[this] lazy val controllers_RESTRouter_index4_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("api/v1/"), DynamicPart("table", """[^/]+""",true)))
  )
  private[this] lazy val controllers_RESTRouter_index4_invoker = createInvoker(
    RESTRouter_1.index(fakeValue[String], fakeValue[String], fakeValue[String]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.RESTRouter",
      "index",
      Seq(classOf[String], classOf[String], classOf[String]),
      "GET",
      """""",
      this.prefix + """api/v1/""" + "$" + """table<[^/]+>"""
    )
  )

  // @LINE:12
  private[this] lazy val controllers_RESTRouter_index5_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("api/v1/"), DynamicPart("table", """[^/]+""",true), StaticPart("/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_RESTRouter_index5_invoker = createInvoker(
    RESTRouter_1.index(fakeValue[String], fakeValue[String], fakeValue[String]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.RESTRouter",
      "index",
      Seq(classOf[String], classOf[String], classOf[String]),
      "GET",
      """""",
      this.prefix + """api/v1/""" + "$" + """table<[^/]+>/""" + "$" + """id<[^/]+>"""
    )
  )

  // @LINE:13
  private[this] lazy val controllers_RESTRouter_index6_route = Route("DELETE",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("api/v1/"), DynamicPart("table", """[^/]+""",true), StaticPart("/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_RESTRouter_index6_invoker = createInvoker(
    RESTRouter_1.index(fakeValue[String], fakeValue[String], fakeValue[String]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.RESTRouter",
      "index",
      Seq(classOf[String], classOf[String], classOf[String]),
      "DELETE",
      """""",
      this.prefix + """api/v1/""" + "$" + """table<[^/]+>/""" + "$" + """id<[^/]+>"""
    )
  )

  // @LINE:14
  private[this] lazy val controllers_RESTRouter_index7_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("api/v1/"), DynamicPart("table", """[^/]+""",true)))
  )
  private[this] lazy val controllers_RESTRouter_index7_invoker = createInvoker(
    RESTRouter_1.index(fakeValue[String], fakeValue[String], fakeValue[String]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.RESTRouter",
      "index",
      Seq(classOf[String], classOf[String], classOf[String]),
      "POST",
      """""",
      this.prefix + """api/v1/""" + "$" + """table<[^/]+>"""
    )
  )

  // @LINE:15
  private[this] lazy val controllers_RESTRouter_index8_route = Route("PUT",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("api/v1/"), DynamicPart("table", """[^/]+""",true), StaticPart("/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_RESTRouter_index8_invoker = createInvoker(
    RESTRouter_1.index(fakeValue[String], fakeValue[String], fakeValue[String]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.RESTRouter",
      "index",
      Seq(classOf[String], classOf[String], classOf[String]),
      "PUT",
      """""",
      this.prefix + """api/v1/""" + "$" + """table<[^/]+>/""" + "$" + """id<[^/]+>"""
    )
  )

  // @LINE:16
  private[this] lazy val controllers_RESTRouter_index9_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("api/v1/"), DynamicPart("table", """[^/]+""",true), StaticPart("/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_RESTRouter_index9_invoker = createInvoker(
    RESTRouter_1.index(fakeValue[String], fakeValue[String], fakeValue[String]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.RESTRouter",
      "index",
      Seq(classOf[String], classOf[String], classOf[String]),
      "POST",
      """""",
      this.prefix + """api/v1/""" + "$" + """table<[^/]+>/""" + "$" + """id<[^/]+>"""
    )
  )

  // @LINE:18
  private[this] lazy val controllers_AdminCRUD_index10_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("admin")))
  )
  private[this] lazy val controllers_AdminCRUD_index10_invoker = createInvoker(
    AdminCRUD_2.index(),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.AdminCRUD",
      "index",
      Nil,
      "GET",
      """""",
      this.prefix + """admin"""
    )
  )

  // @LINE:19
  private[this] lazy val controllers_AdminCRUD_crudRouter11_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("admin/"), DynamicPart("table", """[^/]+""",true)))
  )
  private[this] lazy val controllers_AdminCRUD_crudRouter11_invoker = createInvoker(
    AdminCRUD_2.crudRouter(fakeValue[String]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.AdminCRUD",
      "crudRouter",
      Seq(classOf[String]),
      "GET",
      """""",
      this.prefix + """admin/""" + "$" + """table<[^/]+>"""
    )
  )

  // @LINE:21
  private[this] lazy val controllers_Application_registerGet12_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("register")))
  )
  private[this] lazy val controllers_Application_registerGet12_invoker = createInvoker(
    Application_4.registerGet(),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Application",
      "registerGet",
      Nil,
      "GET",
      """""",
      this.prefix + """register"""
    )
  )

  // @LINE:22
  private[this] lazy val controllers_Application_registerPost13_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("register")))
  )
  private[this] lazy val controllers_Application_registerPost13_invoker = createInvoker(
    Application_4.registerPost(),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Application",
      "registerPost",
      Nil,
      "POST",
      """""",
      this.prefix + """register"""
    )
  )

  // @LINE:23
  private[this] lazy val controllers_Application_loginGet14_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("login")))
  )
  private[this] lazy val controllers_Application_loginGet14_invoker = createInvoker(
    Application_4.loginGet(),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Application",
      "loginGet",
      Nil,
      "GET",
      """""",
      this.prefix + """login"""
    )
  )

  // @LINE:24
  private[this] lazy val controllers_Application_loginPost15_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("login")))
  )
  private[this] lazy val controllers_Application_loginPost15_invoker = createInvoker(
    Application_4.loginPost(),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Application",
      "loginPost",
      Nil,
      "POST",
      """""",
      this.prefix + """login"""
    )
  )

  // @LINE:25
  private[this] lazy val controllers_Application_newUniversityGet16_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("newUniversity")))
  )
  private[this] lazy val controllers_Application_newUniversityGet16_invoker = createInvoker(
    Application_4.newUniversityGet(),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Application",
      "newUniversityGet",
      Nil,
      "GET",
      """""",
      this.prefix + """newUniversity"""
    )
  )

  // @LINE:26
  private[this] lazy val controllers_Application_newUniversityPost17_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("newUniversity")))
  )
  private[this] lazy val controllers_Application_newUniversityPost17_invoker = createInvoker(
    Application_4.newUniversityPost(),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Application",
      "newUniversityPost",
      Nil,
      "POST",
      """""",
      this.prefix + """newUniversity"""
    )
  )

  // @LINE:28
  private[this] lazy val controllers_Application_memberArea18_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("member")))
  )
  private[this] lazy val controllers_Application_memberArea18_invoker = createInvoker(
    Application_4.memberArea(),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Application",
      "memberArea",
      Nil,
      "GET",
      """""",
      this.prefix + """member"""
    )
  )

  // @LINE:29
  private[this] lazy val controllers_Application_BecomeDriverGet19_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("member/becomeDriver")))
  )
  private[this] lazy val controllers_Application_BecomeDriverGet19_invoker = createInvoker(
    Application_4.BecomeDriverGet(),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Application",
      "BecomeDriverGet",
      Nil,
      "GET",
      """""",
      this.prefix + """member/becomeDriver"""
    )
  )

  // @LINE:30
  private[this] lazy val controllers_Application_BecomeDriverPost20_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("member/becomeDriver")))
  )
  private[this] lazy val controllers_Application_BecomeDriverPost20_invoker = createInvoker(
    Application_4.BecomeDriverPost(),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Application",
      "BecomeDriverPost",
      Nil,
      "POST",
      """""",
      this.prefix + """member/becomeDriver"""
    )
  )

  // @LINE:31
  private[this] lazy val controllers_Application_memberSettingsGet21_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("member/settings")))
  )
  private[this] lazy val controllers_Application_memberSettingsGet21_invoker = createInvoker(
    Application_4.memberSettingsGet(),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Application",
      "memberSettingsGet",
      Nil,
      "GET",
      """""",
      this.prefix + """member/settings"""
    )
  )

  // @LINE:32
  private[this] lazy val controllers_Application_memberSettingsPost22_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("member/settings")))
  )
  private[this] lazy val controllers_Application_memberSettingsPost22_invoker = createInvoker(
    Application_4.memberSettingsPost(),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Application",
      "memberSettingsPost",
      Nil,
      "POST",
      """""",
      this.prefix + """member/settings"""
    )
  )

  // @LINE:33
  private[this] lazy val controllers_Application_addCarGet23_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("member/addCar")))
  )
  private[this] lazy val controllers_Application_addCarGet23_invoker = createInvoker(
    Application_4.addCarGet(),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Application",
      "addCarGet",
      Nil,
      "GET",
      """""",
      this.prefix + """member/addCar"""
    )
  )

  // @LINE:34
  private[this] lazy val controllers_Application_addCarPost24_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("member/addCar")))
  )
  private[this] lazy val controllers_Application_addCarPost24_invoker = createInvoker(
    Application_4.addCarPost(),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Application",
      "addCarPost",
      Nil,
      "POST",
      """""",
      this.prefix + """member/addCar"""
    )
  )

  // @LINE:36
  private[this] lazy val controllers_Application_dispatchPost25_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("member/dispatch")))
  )
  private[this] lazy val controllers_Application_dispatchPost25_invoker = createInvoker(
    Application_4.dispatchPost(),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Application",
      "dispatchPost",
      Nil,
      "POST",
      """""",
      this.prefix + """member/dispatch"""
    )
  )

  // @LINE:38
  private[this] lazy val controllers_Application_orderPost26_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("member/order")))
  )
  private[this] lazy val controllers_Application_orderPost26_invoker = createInvoker(
    Application_4.orderPost(),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Application",
      "orderPost",
      Nil,
      "POST",
      """""",
      this.prefix + """member/order"""
    )
  )

  // @LINE:40
  private[this] lazy val controllers_Application_logout27_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("logout")))
  )
  private[this] lazy val controllers_Application_logout27_invoker = createInvoker(
    Application_4.logout(),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Application",
      "logout",
      Nil,
      "GET",
      """""",
      this.prefix + """logout"""
    )
  )

  // @LINE:43
  private[this] lazy val controllers_UniversityPage_index28_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("university")))
  )
  private[this] lazy val controllers_UniversityPage_index28_invoker = createInvoker(
    UniversityPage_0.index(),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.UniversityPage",
      "index",
      Nil,
      "GET",
      """""",
      this.prefix + """university"""
    )
  )

  // @LINE:44
  private[this] lazy val controllers_UniversityPage_home29_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("university/"), DynamicPart("subdomain", """[^/]+""",true)))
  )
  private[this] lazy val controllers_UniversityPage_home29_invoker = createInvoker(
    UniversityPage_0.home(fakeValue[String]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.UniversityPage",
      "home",
      Seq(classOf[String]),
      "GET",
      """""",
      this.prefix + """university/""" + "$" + """subdomain<[^/]+>"""
    )
  )

  // @LINE:45
  private[this] lazy val controllers_UniversityPage_page30_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("university/"), DynamicPart("subdomain", """[^/]+""",true), StaticPart("/"), DynamicPart("page", """[^/]+""",true)))
  )
  private[this] lazy val controllers_UniversityPage_page30_invoker = createInvoker(
    UniversityPage_0.page(fakeValue[String], fakeValue[String]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.UniversityPage",
      "page",
      Seq(classOf[String], classOf[String]),
      "GET",
      """""",
      this.prefix + """university/""" + "$" + """subdomain<[^/]+>/""" + "$" + """page<[^/]+>"""
    )
  )


  def routes: PartialFunction[RequestHeader, Handler] = {
  
    // @LINE:6
    case controllers_Application_index0_route(params) =>
      call { 
        controllers_Application_index0_invoker.call(Application_4.index)
      }
  
    // @LINE:8
    case controllers_Assets_at1_route(params) =>
      call(Param[String]("path", Right("/public")), params.fromPath[String]("file", None)) { (path, file) =>
        controllers_Assets_at1_invoker.call(Assets_3.at(path, file))
      }
  
    // @LINE:9
    case controllers_RESTRouter_index2_route(params) =>
      call(Param[String]("target", Right("login")), Param[String]("table", Right("member"  )), Param[String]("id", Right("eouou"))) { (target, table, id) =>
        controllers_RESTRouter_index2_invoker.call(RESTRouter_1.index(target, table, id))
      }
  
    // @LINE:10
    case controllers_RESTRouter_index3_route(params) =>
      call(Param[String]("target", Right("dispatch")), Param[String]("table", Right("member"  )), Param[String]("id", Right("eouou"))) { (target, table, id) =>
        controllers_RESTRouter_index3_invoker.call(RESTRouter_1.index(target, table, id))
      }
  
    // @LINE:11
    case controllers_RESTRouter_index4_route(params) =>
      call(Param[String]("target", Right("list")), params.fromPath[String]("table", None), Param[String]("id", Right("oeuoe"))) { (target, table, id) =>
        controllers_RESTRouter_index4_invoker.call(RESTRouter_1.index(target, table, id))
      }
  
    // @LINE:12
    case controllers_RESTRouter_index5_route(params) =>
      call(Param[String]("target", Right("getByID")), params.fromPath[String]("table", None), params.fromPath[String]("id", None)) { (target, table, id) =>
        controllers_RESTRouter_index5_invoker.call(RESTRouter_1.index(target, table, id))
      }
  
    // @LINE:13
    case controllers_RESTRouter_index6_route(params) =>
      call(Param[String]("target", Right("deleteByID")), params.fromPath[String]("table", None), params.fromPath[String]("id", None)) { (target, table, id) =>
        controllers_RESTRouter_index6_invoker.call(RESTRouter_1.index(target, table, id))
      }
  
    // @LINE:14
    case controllers_RESTRouter_index7_route(params) =>
      call(Param[String]("target", Right("create")), params.fromPath[String]("table", None), Param[String]("id", Right("eouou"))) { (target, table, id) =>
        controllers_RESTRouter_index7_invoker.call(RESTRouter_1.index(target, table, id))
      }
  
    // @LINE:15
    case controllers_RESTRouter_index8_route(params) =>
      call(Param[String]("target", Right("updateByID")), params.fromPath[String]("table", None), params.fromPath[String]("id", None)) { (target, table, id) =>
        controllers_RESTRouter_index8_invoker.call(RESTRouter_1.index(target, table, id))
      }
  
    // @LINE:16
    case controllers_RESTRouter_index9_route(params) =>
      call(Param[String]("target", Right("updateByID")), params.fromPath[String]("table", None), params.fromPath[String]("id", None)) { (target, table, id) =>
        controllers_RESTRouter_index9_invoker.call(RESTRouter_1.index(target, table, id))
      }
  
    // @LINE:18
    case controllers_AdminCRUD_index10_route(params) =>
      call { 
        controllers_AdminCRUD_index10_invoker.call(AdminCRUD_2.index())
      }
  
    // @LINE:19
    case controllers_AdminCRUD_crudRouter11_route(params) =>
      call(params.fromPath[String]("table", None)) { (table) =>
        controllers_AdminCRUD_crudRouter11_invoker.call(AdminCRUD_2.crudRouter(table))
      }
  
    // @LINE:21
    case controllers_Application_registerGet12_route(params) =>
      call { 
        controllers_Application_registerGet12_invoker.call(Application_4.registerGet())
      }
  
    // @LINE:22
    case controllers_Application_registerPost13_route(params) =>
      call { 
        controllers_Application_registerPost13_invoker.call(Application_4.registerPost())
      }
  
    // @LINE:23
    case controllers_Application_loginGet14_route(params) =>
      call { 
        controllers_Application_loginGet14_invoker.call(Application_4.loginGet())
      }
  
    // @LINE:24
    case controllers_Application_loginPost15_route(params) =>
      call { 
        controllers_Application_loginPost15_invoker.call(Application_4.loginPost())
      }
  
    // @LINE:25
    case controllers_Application_newUniversityGet16_route(params) =>
      call { 
        controllers_Application_newUniversityGet16_invoker.call(Application_4.newUniversityGet())
      }
  
    // @LINE:26
    case controllers_Application_newUniversityPost17_route(params) =>
      call { 
        controllers_Application_newUniversityPost17_invoker.call(Application_4.newUniversityPost())
      }
  
    // @LINE:28
    case controllers_Application_memberArea18_route(params) =>
      call { 
        controllers_Application_memberArea18_invoker.call(Application_4.memberArea())
      }
  
    // @LINE:29
    case controllers_Application_BecomeDriverGet19_route(params) =>
      call { 
        controllers_Application_BecomeDriverGet19_invoker.call(Application_4.BecomeDriverGet())
      }
  
    // @LINE:30
    case controllers_Application_BecomeDriverPost20_route(params) =>
      call { 
        controllers_Application_BecomeDriverPost20_invoker.call(Application_4.BecomeDriverPost())
      }
  
    // @LINE:31
    case controllers_Application_memberSettingsGet21_route(params) =>
      call { 
        controllers_Application_memberSettingsGet21_invoker.call(Application_4.memberSettingsGet())
      }
  
    // @LINE:32
    case controllers_Application_memberSettingsPost22_route(params) =>
      call { 
        controllers_Application_memberSettingsPost22_invoker.call(Application_4.memberSettingsPost())
      }
  
    // @LINE:33
    case controllers_Application_addCarGet23_route(params) =>
      call { 
        controllers_Application_addCarGet23_invoker.call(Application_4.addCarGet())
      }
  
    // @LINE:34
    case controllers_Application_addCarPost24_route(params) =>
      call { 
        controllers_Application_addCarPost24_invoker.call(Application_4.addCarPost())
      }
  
    // @LINE:36
    case controllers_Application_dispatchPost25_route(params) =>
      call { 
        controllers_Application_dispatchPost25_invoker.call(Application_4.dispatchPost())
      }
  
    // @LINE:38
    case controllers_Application_orderPost26_route(params) =>
      call { 
        controllers_Application_orderPost26_invoker.call(Application_4.orderPost())
      }
  
    // @LINE:40
    case controllers_Application_logout27_route(params) =>
      call { 
        controllers_Application_logout27_invoker.call(Application_4.logout())
      }
  
    // @LINE:43
    case controllers_UniversityPage_index28_route(params) =>
      call { 
        controllers_UniversityPage_index28_invoker.call(UniversityPage_0.index())
      }
  
    // @LINE:44
    case controllers_UniversityPage_home29_route(params) =>
      call(params.fromPath[String]("subdomain", None)) { (subdomain) =>
        controllers_UniversityPage_home29_invoker.call(UniversityPage_0.home(subdomain))
      }
  
    // @LINE:45
    case controllers_UniversityPage_page30_route(params) =>
      call(params.fromPath[String]("subdomain", None), params.fromPath[String]("page", None)) { (subdomain, page) =>
        controllers_UniversityPage_page30_invoker.call(UniversityPage_0.page(subdomain, page))
      }
  }
}
