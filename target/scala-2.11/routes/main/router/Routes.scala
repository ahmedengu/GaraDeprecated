
// @GENERATOR:play-routes-compiler
// @SOURCE:C:/Users/ahmedengu/Documents/IdeaProjects/Gara/conf/routes
// @DATE:Mon Jun 13 23:48:18 EET 2016

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
  // @LINE:21
  AdminCRUD_2: controllers.AdminCRUD,
  // @LINE:52
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
    // @LINE:21
    AdminCRUD_2: controllers.AdminCRUD,
    // @LINE:52
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
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """api/v1/member/""" + "$" + """table<[^/]+>/activate/""" + "$" + """id<[^/]+>""", """controllers.RESTRouter.index(target:String = "activate", table:String, id:String)"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """api/v1/""" + "$" + """table<[^/]+>/where/""" + "$" + """condition<.+>""", """controllers.RESTRouter.index(target:String = "whereWithCondition", table:String, condition:String)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """api/v1/""" + "$" + """table<[^/]+>""", """controllers.RESTRouter.index(target:String = "list", table:String, id:String = "oeuoe")"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """api/v1/""" + "$" + """table<[^/]+>/""" + "$" + """id<[^/]+>""", """controllers.RESTRouter.index(target:String = "getByID", table:String, id:String)"""),
    ("""DELETE""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """api/v1/""" + "$" + """table<[^/]+>/""" + "$" + """id<[^/]+>""", """controllers.RESTRouter.index(target:String = "deleteByID", table:String, id:String)"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """api/v1/""" + "$" + """table<[^/]+>""", """controllers.RESTRouter.index(target:String = "create", table:String, id:String = "eouou")"""),
    ("""PUT""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """api/v1/""" + "$" + """table<[^/]+>/""" + "$" + """id<[^/]+>""", """controllers.RESTRouter.index(target:String = "updateByID", table:String, id:String)"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """api/v1/""" + "$" + """table<[^/]+>/""" + "$" + """id<[^/]+>""", """controllers.RESTRouter.index(target:String = "updateByID", table:String, id:String)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """admin""", """controllers.AdminCRUD.index()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """admin/logout""", """controllers.AdminCRUD.logout()"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """admin""", """controllers.AdminCRUD.login()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """admin/""" + "$" + """table<[^/]+>""", """controllers.AdminCRUD.crudRouter(table:String)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """register""", """controllers.Application.registerGet()"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """register""", """controllers.Application.registerPost()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """login""", """controllers.Application.loginGet()"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """login""", """controllers.Application.loginPost()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """newUniversity""", """controllers.Application.newUniversityGet()"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """newUniversity""", """controllers.Application.newUniversityPost()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """member""", """controllers.Application.memberArea()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """member/""" + "$" + """member<[^/]+>/activate/""" + "$" + """code<[^/]+>""", """controllers.Application.memberActivation(member:String, code:String)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """member/becomeDriver""", """controllers.Application.BecomeDriverGet()"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """member/becomeDriver""", """controllers.Application.BecomeDriverPost()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """member/addCar""", """controllers.Application.addCarGet()"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """member/addCar""", """controllers.Application.addCarPost()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """member/settings""", """controllers.Application.memberSettingsGet()"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """member/settings""", """controllers.Application.memberSettingsPost()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """member/addCar""", """controllers.Application.addCarGet()"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """member/addCar""", """controllers.Application.addCarPost()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """member/dispatch""", """controllers.Application.dispatchGet()"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """member/order""", """controllers.Application.orderPost()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """logout""", """controllers.Application.logout()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """university""", """controllers.UniversityPage.index()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """university/""" + "$" + """subdomain<[^/]+>""", """controllers.UniversityPage.home(subdomain:String)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """university/""" + "$" + """subdomain<[^/]+>/""" + "$" + """page<[^/]+>""", """controllers.UniversityPage.page(subdomain:String, page:String)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """""" + "$" + """siteContent<[^/]+>""", """controllers.Application.siteContent(siteContent:String)"""),
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
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("api/v1/member/"), DynamicPart("table", """[^/]+""",true), StaticPart("/activate/"), DynamicPart("id", """[^/]+""",true)))
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
      this.prefix + """api/v1/member/""" + "$" + """table<[^/]+>/activate/""" + "$" + """id<[^/]+>"""
    )
  )

  // @LINE:12
  private[this] lazy val controllers_RESTRouter_index5_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("api/v1/"), DynamicPart("table", """[^/]+""",true), StaticPart("/where/"), DynamicPart("condition", """.+""",false)))
  )
  private[this] lazy val controllers_RESTRouter_index5_invoker = createInvoker(
    RESTRouter_1.index(fakeValue[String], fakeValue[String], fakeValue[String]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.RESTRouter",
      "index",
      Seq(classOf[String], classOf[String], classOf[String]),
      "POST",
      """""",
      this.prefix + """api/v1/""" + "$" + """table<[^/]+>/where/""" + "$" + """condition<.+>"""
    )
  )

  // @LINE:14
  private[this] lazy val controllers_RESTRouter_index6_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("api/v1/"), DynamicPart("table", """[^/]+""",true)))
  )
  private[this] lazy val controllers_RESTRouter_index6_invoker = createInvoker(
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

  // @LINE:15
  private[this] lazy val controllers_RESTRouter_index7_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("api/v1/"), DynamicPart("table", """[^/]+""",true), StaticPart("/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_RESTRouter_index7_invoker = createInvoker(
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

  // @LINE:16
  private[this] lazy val controllers_RESTRouter_index8_route = Route("DELETE",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("api/v1/"), DynamicPart("table", """[^/]+""",true), StaticPart("/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_RESTRouter_index8_invoker = createInvoker(
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

  // @LINE:17
  private[this] lazy val controllers_RESTRouter_index9_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("api/v1/"), DynamicPart("table", """[^/]+""",true)))
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
      this.prefix + """api/v1/""" + "$" + """table<[^/]+>"""
    )
  )

  // @LINE:18
  private[this] lazy val controllers_RESTRouter_index10_route = Route("PUT",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("api/v1/"), DynamicPart("table", """[^/]+""",true), StaticPart("/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_RESTRouter_index10_invoker = createInvoker(
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

  // @LINE:19
  private[this] lazy val controllers_RESTRouter_index11_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("api/v1/"), DynamicPart("table", """[^/]+""",true), StaticPart("/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_RESTRouter_index11_invoker = createInvoker(
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

  // @LINE:21
  private[this] lazy val controllers_AdminCRUD_index12_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("admin")))
  )
  private[this] lazy val controllers_AdminCRUD_index12_invoker = createInvoker(
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

  // @LINE:22
  private[this] lazy val controllers_AdminCRUD_logout13_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("admin/logout")))
  )
  private[this] lazy val controllers_AdminCRUD_logout13_invoker = createInvoker(
    AdminCRUD_2.logout(),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.AdminCRUD",
      "logout",
      Nil,
      "GET",
      """""",
      this.prefix + """admin/logout"""
    )
  )

  // @LINE:23
  private[this] lazy val controllers_AdminCRUD_login14_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("admin")))
  )
  private[this] lazy val controllers_AdminCRUD_login14_invoker = createInvoker(
    AdminCRUD_2.login(),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.AdminCRUD",
      "login",
      Nil,
      "POST",
      """""",
      this.prefix + """admin"""
    )
  )

  // @LINE:24
  private[this] lazy val controllers_AdminCRUD_crudRouter15_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("admin/"), DynamicPart("table", """[^/]+""",true)))
  )
  private[this] lazy val controllers_AdminCRUD_crudRouter15_invoker = createInvoker(
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

  // @LINE:26
  private[this] lazy val controllers_Application_registerGet16_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("register")))
  )
  private[this] lazy val controllers_Application_registerGet16_invoker = createInvoker(
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

  // @LINE:27
  private[this] lazy val controllers_Application_registerPost17_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("register")))
  )
  private[this] lazy val controllers_Application_registerPost17_invoker = createInvoker(
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

  // @LINE:28
  private[this] lazy val controllers_Application_loginGet18_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("login")))
  )
  private[this] lazy val controllers_Application_loginGet18_invoker = createInvoker(
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

  // @LINE:29
  private[this] lazy val controllers_Application_loginPost19_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("login")))
  )
  private[this] lazy val controllers_Application_loginPost19_invoker = createInvoker(
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

  // @LINE:30
  private[this] lazy val controllers_Application_newUniversityGet20_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("newUniversity")))
  )
  private[this] lazy val controllers_Application_newUniversityGet20_invoker = createInvoker(
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

  // @LINE:31
  private[this] lazy val controllers_Application_newUniversityPost21_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("newUniversity")))
  )
  private[this] lazy val controllers_Application_newUniversityPost21_invoker = createInvoker(
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

  // @LINE:33
  private[this] lazy val controllers_Application_memberArea22_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("member")))
  )
  private[this] lazy val controllers_Application_memberArea22_invoker = createInvoker(
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

  // @LINE:34
  private[this] lazy val controllers_Application_memberActivation23_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("member/"), DynamicPart("member", """[^/]+""",true), StaticPart("/activate/"), DynamicPart("code", """[^/]+""",true)))
  )
  private[this] lazy val controllers_Application_memberActivation23_invoker = createInvoker(
    Application_4.memberActivation(fakeValue[String], fakeValue[String]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Application",
      "memberActivation",
      Seq(classOf[String], classOf[String]),
      "GET",
      """""",
      this.prefix + """member/""" + "$" + """member<[^/]+>/activate/""" + "$" + """code<[^/]+>"""
    )
  )

  // @LINE:36
  private[this] lazy val controllers_Application_BecomeDriverGet24_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("member/becomeDriver")))
  )
  private[this] lazy val controllers_Application_BecomeDriverGet24_invoker = createInvoker(
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

  // @LINE:37
  private[this] lazy val controllers_Application_BecomeDriverPost25_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("member/becomeDriver")))
  )
  private[this] lazy val controllers_Application_BecomeDriverPost25_invoker = createInvoker(
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

  // @LINE:38
  private[this] lazy val controllers_Application_addCarGet26_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("member/addCar")))
  )
  private[this] lazy val controllers_Application_addCarGet26_invoker = createInvoker(
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

  // @LINE:39
  private[this] lazy val controllers_Application_addCarPost27_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("member/addCar")))
  )
  private[this] lazy val controllers_Application_addCarPost27_invoker = createInvoker(
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

  // @LINE:40
  private[this] lazy val controllers_Application_memberSettingsGet28_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("member/settings")))
  )
  private[this] lazy val controllers_Application_memberSettingsGet28_invoker = createInvoker(
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

  // @LINE:41
  private[this] lazy val controllers_Application_memberSettingsPost29_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("member/settings")))
  )
  private[this] lazy val controllers_Application_memberSettingsPost29_invoker = createInvoker(
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

  // @LINE:42
  private[this] lazy val controllers_Application_addCarGet30_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("member/addCar")))
  )
  private[this] lazy val controllers_Application_addCarGet30_invoker = createInvoker(
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

  // @LINE:43
  private[this] lazy val controllers_Application_addCarPost31_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("member/addCar")))
  )
  private[this] lazy val controllers_Application_addCarPost31_invoker = createInvoker(
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

  // @LINE:45
  private[this] lazy val controllers_Application_dispatchGet32_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("member/dispatch")))
  )
  private[this] lazy val controllers_Application_dispatchGet32_invoker = createInvoker(
    Application_4.dispatchGet(),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Application",
      "dispatchGet",
      Nil,
      "GET",
      """""",
      this.prefix + """member/dispatch"""
    )
  )

  // @LINE:47
  private[this] lazy val controllers_Application_orderPost33_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("member/order")))
  )
  private[this] lazy val controllers_Application_orderPost33_invoker = createInvoker(
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

  // @LINE:49
  private[this] lazy val controllers_Application_logout34_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("logout")))
  )
  private[this] lazy val controllers_Application_logout34_invoker = createInvoker(
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

  // @LINE:52
  private[this] lazy val controllers_UniversityPage_index35_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("university")))
  )
  private[this] lazy val controllers_UniversityPage_index35_invoker = createInvoker(
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

  // @LINE:53
  private[this] lazy val controllers_UniversityPage_home36_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("university/"), DynamicPart("subdomain", """[^/]+""",true)))
  )
  private[this] lazy val controllers_UniversityPage_home36_invoker = createInvoker(
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

  // @LINE:54
  private[this] lazy val controllers_UniversityPage_page37_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("university/"), DynamicPart("subdomain", """[^/]+""",true), StaticPart("/"), DynamicPart("page", """[^/]+""",true)))
  )
  private[this] lazy val controllers_UniversityPage_page37_invoker = createInvoker(
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

  // @LINE:56
  private[this] lazy val controllers_Application_siteContent38_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), DynamicPart("siteContent", """[^/]+""",true)))
  )
  private[this] lazy val controllers_Application_siteContent38_invoker = createInvoker(
    Application_4.siteContent(fakeValue[String]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Application",
      "siteContent",
      Seq(classOf[String]),
      "GET",
      """""",
      this.prefix + """""" + "$" + """siteContent<[^/]+>"""
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
      call(Param[String]("target", Right("activate")), params.fromPath[String]("table", None), params.fromPath[String]("id", None)) { (target, table, id) =>
        controllers_RESTRouter_index4_invoker.call(RESTRouter_1.index(target, table, id))
      }
  
    // @LINE:12
    case controllers_RESTRouter_index5_route(params) =>
      call(Param[String]("target", Right("whereWithCondition")), params.fromPath[String]("table", None), params.fromPath[String]("condition", None)) { (target, table, condition) =>
        controllers_RESTRouter_index5_invoker.call(RESTRouter_1.index(target, table, condition))
      }
  
    // @LINE:14
    case controllers_RESTRouter_index6_route(params) =>
      call(Param[String]("target", Right("list")), params.fromPath[String]("table", None), Param[String]("id", Right("oeuoe"))) { (target, table, id) =>
        controllers_RESTRouter_index6_invoker.call(RESTRouter_1.index(target, table, id))
      }
  
    // @LINE:15
    case controllers_RESTRouter_index7_route(params) =>
      call(Param[String]("target", Right("getByID")), params.fromPath[String]("table", None), params.fromPath[String]("id", None)) { (target, table, id) =>
        controllers_RESTRouter_index7_invoker.call(RESTRouter_1.index(target, table, id))
      }
  
    // @LINE:16
    case controllers_RESTRouter_index8_route(params) =>
      call(Param[String]("target", Right("deleteByID")), params.fromPath[String]("table", None), params.fromPath[String]("id", None)) { (target, table, id) =>
        controllers_RESTRouter_index8_invoker.call(RESTRouter_1.index(target, table, id))
      }
  
    // @LINE:17
    case controllers_RESTRouter_index9_route(params) =>
      call(Param[String]("target", Right("create")), params.fromPath[String]("table", None), Param[String]("id", Right("eouou"))) { (target, table, id) =>
        controllers_RESTRouter_index9_invoker.call(RESTRouter_1.index(target, table, id))
      }
  
    // @LINE:18
    case controllers_RESTRouter_index10_route(params) =>
      call(Param[String]("target", Right("updateByID")), params.fromPath[String]("table", None), params.fromPath[String]("id", None)) { (target, table, id) =>
        controllers_RESTRouter_index10_invoker.call(RESTRouter_1.index(target, table, id))
      }
  
    // @LINE:19
    case controllers_RESTRouter_index11_route(params) =>
      call(Param[String]("target", Right("updateByID")), params.fromPath[String]("table", None), params.fromPath[String]("id", None)) { (target, table, id) =>
        controllers_RESTRouter_index11_invoker.call(RESTRouter_1.index(target, table, id))
      }
  
    // @LINE:21
    case controllers_AdminCRUD_index12_route(params) =>
      call { 
        controllers_AdminCRUD_index12_invoker.call(AdminCRUD_2.index())
      }
  
    // @LINE:22
    case controllers_AdminCRUD_logout13_route(params) =>
      call { 
        controllers_AdminCRUD_logout13_invoker.call(AdminCRUD_2.logout())
      }
  
    // @LINE:23
    case controllers_AdminCRUD_login14_route(params) =>
      call { 
        controllers_AdminCRUD_login14_invoker.call(AdminCRUD_2.login())
      }
  
    // @LINE:24
    case controllers_AdminCRUD_crudRouter15_route(params) =>
      call(params.fromPath[String]("table", None)) { (table) =>
        controllers_AdminCRUD_crudRouter15_invoker.call(AdminCRUD_2.crudRouter(table))
      }
  
    // @LINE:26
    case controllers_Application_registerGet16_route(params) =>
      call { 
        controllers_Application_registerGet16_invoker.call(Application_4.registerGet())
      }
  
    // @LINE:27
    case controllers_Application_registerPost17_route(params) =>
      call { 
        controllers_Application_registerPost17_invoker.call(Application_4.registerPost())
      }
  
    // @LINE:28
    case controllers_Application_loginGet18_route(params) =>
      call { 
        controllers_Application_loginGet18_invoker.call(Application_4.loginGet())
      }
  
    // @LINE:29
    case controllers_Application_loginPost19_route(params) =>
      call { 
        controllers_Application_loginPost19_invoker.call(Application_4.loginPost())
      }
  
    // @LINE:30
    case controllers_Application_newUniversityGet20_route(params) =>
      call { 
        controllers_Application_newUniversityGet20_invoker.call(Application_4.newUniversityGet())
      }
  
    // @LINE:31
    case controllers_Application_newUniversityPost21_route(params) =>
      call { 
        controllers_Application_newUniversityPost21_invoker.call(Application_4.newUniversityPost())
      }
  
    // @LINE:33
    case controllers_Application_memberArea22_route(params) =>
      call { 
        controllers_Application_memberArea22_invoker.call(Application_4.memberArea())
      }
  
    // @LINE:34
    case controllers_Application_memberActivation23_route(params) =>
      call(params.fromPath[String]("member", None), params.fromPath[String]("code", None)) { (member, code) =>
        controllers_Application_memberActivation23_invoker.call(Application_4.memberActivation(member, code))
      }
  
    // @LINE:36
    case controllers_Application_BecomeDriverGet24_route(params) =>
      call { 
        controllers_Application_BecomeDriverGet24_invoker.call(Application_4.BecomeDriverGet())
      }
  
    // @LINE:37
    case controllers_Application_BecomeDriverPost25_route(params) =>
      call { 
        controllers_Application_BecomeDriverPost25_invoker.call(Application_4.BecomeDriverPost())
      }
  
    // @LINE:38
    case controllers_Application_addCarGet26_route(params) =>
      call { 
        controllers_Application_addCarGet26_invoker.call(Application_4.addCarGet())
      }
  
    // @LINE:39
    case controllers_Application_addCarPost27_route(params) =>
      call { 
        controllers_Application_addCarPost27_invoker.call(Application_4.addCarPost())
      }
  
    // @LINE:40
    case controllers_Application_memberSettingsGet28_route(params) =>
      call { 
        controllers_Application_memberSettingsGet28_invoker.call(Application_4.memberSettingsGet())
      }
  
    // @LINE:41
    case controllers_Application_memberSettingsPost29_route(params) =>
      call { 
        controllers_Application_memberSettingsPost29_invoker.call(Application_4.memberSettingsPost())
      }
  
    // @LINE:42
    case controllers_Application_addCarGet30_route(params) =>
      call { 
        controllers_Application_addCarGet30_invoker.call(Application_4.addCarGet())
      }
  
    // @LINE:43
    case controllers_Application_addCarPost31_route(params) =>
      call { 
        controllers_Application_addCarPost31_invoker.call(Application_4.addCarPost())
      }
  
    // @LINE:45
    case controllers_Application_dispatchGet32_route(params) =>
      call { 
        controllers_Application_dispatchGet32_invoker.call(Application_4.dispatchGet())
      }
  
    // @LINE:47
    case controllers_Application_orderPost33_route(params) =>
      call { 
        controllers_Application_orderPost33_invoker.call(Application_4.orderPost())
      }
  
    // @LINE:49
    case controllers_Application_logout34_route(params) =>
      call { 
        controllers_Application_logout34_invoker.call(Application_4.logout())
      }
  
    // @LINE:52
    case controllers_UniversityPage_index35_route(params) =>
      call { 
        controllers_UniversityPage_index35_invoker.call(UniversityPage_0.index())
      }
  
    // @LINE:53
    case controllers_UniversityPage_home36_route(params) =>
      call(params.fromPath[String]("subdomain", None)) { (subdomain) =>
        controllers_UniversityPage_home36_invoker.call(UniversityPage_0.home(subdomain))
      }
  
    // @LINE:54
    case controllers_UniversityPage_page37_route(params) =>
      call(params.fromPath[String]("subdomain", None), params.fromPath[String]("page", None)) { (subdomain, page) =>
        controllers_UniversityPage_page37_invoker.call(UniversityPage_0.page(subdomain, page))
      }
  
    // @LINE:56
    case controllers_Application_siteContent38_route(params) =>
      call(params.fromPath[String]("siteContent", None)) { (siteContent) =>
        controllers_Application_siteContent38_invoker.call(Application_4.siteContent(siteContent))
      }
  }
}
