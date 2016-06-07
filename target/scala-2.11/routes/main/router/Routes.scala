
// @GENERATOR:play-routes-compiler
// @SOURCE:C:/Users/ahmedengu/Documents/IdeaProjects/Gara/conf/routes
// @DATE:Tue May 31 18:14:37 EET 2016

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
  Application_1: controllers.Application,
  // @LINE:9
  Assets_0: controllers.Assets,
  // @LINE:10
  RESTRouter_2: controllers.RESTRouter,
  // @LINE:17
  AdminCRUD_3: controllers.AdminCRUD,
  val prefix: String
) extends GeneratedRouter {

   @javax.inject.Inject()
   def this(errorHandler: play.api.http.HttpErrorHandler,
    // @LINE:6
    Application_1: controllers.Application,
    // @LINE:9
    Assets_0: controllers.Assets,
    // @LINE:10
    RESTRouter_2: controllers.RESTRouter,
    // @LINE:17
    AdminCRUD_3: controllers.AdminCRUD
  ) = this(errorHandler, Application_1, Assets_0, RESTRouter_2, AdminCRUD_3, "/")

  import ReverseRouteContext.empty

  def withPrefix(prefix: String): Routes = {
    router.RoutesPrefix.setPrefix(prefix)
    new Routes(errorHandler, Application_1, Assets_0, RESTRouter_2, AdminCRUD_3, prefix)
  }

  private[this] val defaultPrefix: String = {
    if (this.prefix.endsWith("/")) "" else "/"
  }

  def documentation = List(
    ("""GET""", this.prefix, """controllers.Application.index"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """assets/""" + "$" + """file<.+>""", """controllers.Assets.at(path:String = "/public", file:String)"""),
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
    Application_1.index,
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

  // @LINE:9
  private[this] lazy val controllers_Assets_at1_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("assets/"), DynamicPart("file", """.+""",false)))
  )
  private[this] lazy val controllers_Assets_at1_invoker = createInvoker(
    Assets_0.at(fakeValue[String], fakeValue[String]),
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

  // @LINE:10
  private[this] lazy val controllers_RESTRouter_index2_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("api/v1/"), DynamicPart("table", """[^/]+""",true)))
  )
  private[this] lazy val controllers_RESTRouter_index2_invoker = createInvoker(
    RESTRouter_2.index(fakeValue[String], fakeValue[String], fakeValue[String]),
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

  // @LINE:11
  private[this] lazy val controllers_RESTRouter_index3_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("api/v1/"), DynamicPart("table", """[^/]+""",true), StaticPart("/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_RESTRouter_index3_invoker = createInvoker(
    RESTRouter_2.index(fakeValue[String], fakeValue[String], fakeValue[String]),
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

  // @LINE:12
  private[this] lazy val controllers_RESTRouter_index4_route = Route("DELETE",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("api/v1/"), DynamicPart("table", """[^/]+""",true), StaticPart("/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_RESTRouter_index4_invoker = createInvoker(
    RESTRouter_2.index(fakeValue[String], fakeValue[String], fakeValue[String]),
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

  // @LINE:13
  private[this] lazy val controllers_RESTRouter_index5_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("api/v1/"), DynamicPart("table", """[^/]+""",true)))
  )
  private[this] lazy val controllers_RESTRouter_index5_invoker = createInvoker(
    RESTRouter_2.index(fakeValue[String], fakeValue[String], fakeValue[String]),
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

  // @LINE:14
  private[this] lazy val controllers_RESTRouter_index6_route = Route("PUT",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("api/v1/"), DynamicPart("table", """[^/]+""",true), StaticPart("/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_RESTRouter_index6_invoker = createInvoker(
    RESTRouter_2.index(fakeValue[String], fakeValue[String], fakeValue[String]),
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

  // @LINE:15
  private[this] lazy val controllers_RESTRouter_index7_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("api/v1/"), DynamicPart("table", """[^/]+""",true), StaticPart("/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_RESTRouter_index7_invoker = createInvoker(
    RESTRouter_2.index(fakeValue[String], fakeValue[String], fakeValue[String]),
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

  // @LINE:17
  private[this] lazy val controllers_AdminCRUD_index8_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("admin")))
  )
  private[this] lazy val controllers_AdminCRUD_index8_invoker = createInvoker(
    AdminCRUD_3.index(),
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

  // @LINE:18
  private[this] lazy val controllers_AdminCRUD_crudRouter9_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("admin/"), DynamicPart("table", """[^/]+""",true)))
  )
  private[this] lazy val controllers_AdminCRUD_crudRouter9_invoker = createInvoker(
    AdminCRUD_3.crudRouter(fakeValue[String]),
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

  // @LINE:20
  private[this] lazy val controllers_Application_registerGet10_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("register")))
  )
  private[this] lazy val controllers_Application_registerGet10_invoker = createInvoker(
    Application_1.registerGet(),
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

  // @LINE:21
  private[this] lazy val controllers_Application_registerPost11_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("register")))
  )
  private[this] lazy val controllers_Application_registerPost11_invoker = createInvoker(
    Application_1.registerPost(),
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

  // @LINE:22
  private[this] lazy val controllers_Application_loginGet12_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("login")))
  )
  private[this] lazy val controllers_Application_loginGet12_invoker = createInvoker(
    Application_1.loginGet(),
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

  // @LINE:23
  private[this] lazy val controllers_Application_loginPost13_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("login")))
  )
  private[this] lazy val controllers_Application_loginPost13_invoker = createInvoker(
    Application_1.loginPost(),
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

  // @LINE:24
  private[this] lazy val controllers_Application_newUniversityGet14_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("newUniversity")))
  )
  private[this] lazy val controllers_Application_newUniversityGet14_invoker = createInvoker(
    Application_1.newUniversityGet(),
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

  // @LINE:25
  private[this] lazy val controllers_Application_newUniversityPost15_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("newUniversity")))
  )
  private[this] lazy val controllers_Application_newUniversityPost15_invoker = createInvoker(
    Application_1.newUniversityPost(),
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

  // @LINE:27
  private[this] lazy val controllers_Application_memberArea16_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("member")))
  )
  private[this] lazy val controllers_Application_memberArea16_invoker = createInvoker(
    Application_1.memberArea(),
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

  // @LINE:28
  private[this] lazy val controllers_Application_BecomeDriverGet17_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("member/becomeDriver")))
  )
  private[this] lazy val controllers_Application_BecomeDriverGet17_invoker = createInvoker(
    Application_1.BecomeDriverGet(),
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

  // @LINE:29
  private[this] lazy val controllers_Application_BecomeDriverPost18_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("member/becomeDriver")))
  )
  private[this] lazy val controllers_Application_BecomeDriverPost18_invoker = createInvoker(
    Application_1.BecomeDriverPost(),
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

  // @LINE:30
  private[this] lazy val controllers_Application_memberSettingsGet19_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("member/settings")))
  )
  private[this] lazy val controllers_Application_memberSettingsGet19_invoker = createInvoker(
    Application_1.memberSettingsGet(),
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

  // @LINE:31
  private[this] lazy val controllers_Application_memberSettingsPost20_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("member/settings")))
  )
  private[this] lazy val controllers_Application_memberSettingsPost20_invoker = createInvoker(
    Application_1.memberSettingsPost(),
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

  // @LINE:32
  private[this] lazy val controllers_Application_addCarGet21_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("member/addCar")))
  )
  private[this] lazy val controllers_Application_addCarGet21_invoker = createInvoker(
    Application_1.addCarGet(),
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

  // @LINE:33
  private[this] lazy val controllers_Application_addCarPost22_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("member/addCar")))
  )
  private[this] lazy val controllers_Application_addCarPost22_invoker = createInvoker(
    Application_1.addCarPost(),
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

  // @LINE:35
  private[this] lazy val controllers_Application_dispatchPost23_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("member/dispatch")))
  )
  private[this] lazy val controllers_Application_dispatchPost23_invoker = createInvoker(
    Application_1.dispatchPost(),
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

  // @LINE:37
  private[this] lazy val controllers_Application_orderPost24_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("member/order")))
  )
  private[this] lazy val controllers_Application_orderPost24_invoker = createInvoker(
    Application_1.orderPost(),
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

  // @LINE:39
  private[this] lazy val controllers_Application_logout25_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("logout")))
  )
  private[this] lazy val controllers_Application_logout25_invoker = createInvoker(
    Application_1.logout(),
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


  def routes: PartialFunction[RequestHeader, Handler] = {
  
    // @LINE:6
    case controllers_Application_index0_route(params) =>
      call { 
        controllers_Application_index0_invoker.call(Application_1.index)
      }
  
    // @LINE:9
    case controllers_Assets_at1_route(params) =>
      call(Param[String]("path", Right("/public")), params.fromPath[String]("file", None)) { (path, file) =>
        controllers_Assets_at1_invoker.call(Assets_0.at(path, file))
      }
  
    // @LINE:10
    case controllers_RESTRouter_index2_route(params) =>
      call(Param[String]("target", Right("list")), params.fromPath[String]("table", None), Param[String]("id", Right("oeuoe"))) { (target, table, id) =>
        controllers_RESTRouter_index2_invoker.call(RESTRouter_2.index(target, table, id))
      }
  
    // @LINE:11
    case controllers_RESTRouter_index3_route(params) =>
      call(Param[String]("target", Right("getByID")), params.fromPath[String]("table", None), params.fromPath[String]("id", None)) { (target, table, id) =>
        controllers_RESTRouter_index3_invoker.call(RESTRouter_2.index(target, table, id))
      }
  
    // @LINE:12
    case controllers_RESTRouter_index4_route(params) =>
      call(Param[String]("target", Right("deleteByID")), params.fromPath[String]("table", None), params.fromPath[String]("id", None)) { (target, table, id) =>
        controllers_RESTRouter_index4_invoker.call(RESTRouter_2.index(target, table, id))
      }
  
    // @LINE:13
    case controllers_RESTRouter_index5_route(params) =>
      call(Param[String]("target", Right("create")), params.fromPath[String]("table", None), Param[String]("id", Right("eouou"))) { (target, table, id) =>
        controllers_RESTRouter_index5_invoker.call(RESTRouter_2.index(target, table, id))
      }
  
    // @LINE:14
    case controllers_RESTRouter_index6_route(params) =>
      call(Param[String]("target", Right("updateByID")), params.fromPath[String]("table", None), params.fromPath[String]("id", None)) { (target, table, id) =>
        controllers_RESTRouter_index6_invoker.call(RESTRouter_2.index(target, table, id))
      }
  
    // @LINE:15
    case controllers_RESTRouter_index7_route(params) =>
      call(Param[String]("target", Right("updateByID")), params.fromPath[String]("table", None), params.fromPath[String]("id", None)) { (target, table, id) =>
        controllers_RESTRouter_index7_invoker.call(RESTRouter_2.index(target, table, id))
      }
  
    // @LINE:17
    case controllers_AdminCRUD_index8_route(params) =>
      call { 
        controllers_AdminCRUD_index8_invoker.call(AdminCRUD_3.index())
      }
  
    // @LINE:18
    case controllers_AdminCRUD_crudRouter9_route(params) =>
      call(params.fromPath[String]("table", None)) { (table) =>
        controllers_AdminCRUD_crudRouter9_invoker.call(AdminCRUD_3.crudRouter(table))
      }
  
    // @LINE:20
    case controllers_Application_registerGet10_route(params) =>
      call { 
        controllers_Application_registerGet10_invoker.call(Application_1.registerGet())
      }
  
    // @LINE:21
    case controllers_Application_registerPost11_route(params) =>
      call { 
        controllers_Application_registerPost11_invoker.call(Application_1.registerPost())
      }
  
    // @LINE:22
    case controllers_Application_loginGet12_route(params) =>
      call { 
        controllers_Application_loginGet12_invoker.call(Application_1.loginGet())
      }
  
    // @LINE:23
    case controllers_Application_loginPost13_route(params) =>
      call { 
        controllers_Application_loginPost13_invoker.call(Application_1.loginPost())
      }
  
    // @LINE:24
    case controllers_Application_newUniversityGet14_route(params) =>
      call { 
        controllers_Application_newUniversityGet14_invoker.call(Application_1.newUniversityGet())
      }
  
    // @LINE:25
    case controllers_Application_newUniversityPost15_route(params) =>
      call { 
        controllers_Application_newUniversityPost15_invoker.call(Application_1.newUniversityPost())
      }
  
    // @LINE:27
    case controllers_Application_memberArea16_route(params) =>
      call { 
        controllers_Application_memberArea16_invoker.call(Application_1.memberArea())
      }
  
    // @LINE:28
    case controllers_Application_BecomeDriverGet17_route(params) =>
      call { 
        controllers_Application_BecomeDriverGet17_invoker.call(Application_1.BecomeDriverGet())
      }
  
    // @LINE:29
    case controllers_Application_BecomeDriverPost18_route(params) =>
      call { 
        controllers_Application_BecomeDriverPost18_invoker.call(Application_1.BecomeDriverPost())
      }
  
    // @LINE:30
    case controllers_Application_memberSettingsGet19_route(params) =>
      call { 
        controllers_Application_memberSettingsGet19_invoker.call(Application_1.memberSettingsGet())
      }
  
    // @LINE:31
    case controllers_Application_memberSettingsPost20_route(params) =>
      call { 
        controllers_Application_memberSettingsPost20_invoker.call(Application_1.memberSettingsPost())
      }
  
    // @LINE:32
    case controllers_Application_addCarGet21_route(params) =>
      call { 
        controllers_Application_addCarGet21_invoker.call(Application_1.addCarGet())
      }
  
    // @LINE:33
    case controllers_Application_addCarPost22_route(params) =>
      call { 
        controllers_Application_addCarPost22_invoker.call(Application_1.addCarPost())
      }
  
    // @LINE:35
    case controllers_Application_dispatchPost23_route(params) =>
      call { 
        controllers_Application_dispatchPost23_invoker.call(Application_1.dispatchPost())
      }
  
    // @LINE:37
    case controllers_Application_orderPost24_route(params) =>
      call { 
        controllers_Application_orderPost24_invoker.call(Application_1.orderPost())
      }
  
    // @LINE:39
    case controllers_Application_logout25_route(params) =>
      call { 
        controllers_Application_logout25_invoker.call(Application_1.logout())
      }
  }
}
