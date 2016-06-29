
// @GENERATOR:play-routes-compiler
// @SOURCE:C:/Users/ahmedengu/Documents/IdeaProjects/Gara/conf/routes
// @DATE:Sat Jun 18 04:56:41 EET 2016

import play.api.mvc.{ QueryStringBindable, PathBindable, Call, JavascriptLiteral }
import play.core.routing.{ HandlerDef, ReverseRouteContext, queryString, dynamicString }


import _root_.controllers.Assets.Asset
import _root_.play.libs.F

// @LINE:6
package controllers {

  // @LINE:8
  class ReverseAssets(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:8
    def at(file:String): Call = {
      implicit val _rrc = new ReverseRouteContext(Map(("path", "/public")))
      Call("GET", _prefix + { _defaultPrefix } + "assets/" + implicitly[PathBindable[String]].unbind("file", file))
    }
  
  }

  // @LINE:9
  class ReverseRESTRouter(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:9
    def index(target:String, table:String, id:String): Call = {
    
      (target: @unchecked, table: @unchecked, id: @unchecked) match {
      
        // @LINE:9
        case (target, table, id) if target == "login" && table == "member"   && id == "eouou" =>
          implicit val _rrc = new ReverseRouteContext(Map(("target", "login"), ("table", "member"  ), ("id", "eouou")))
          Call("POST", _prefix + { _defaultPrefix } + "api/v1/login")
      
        // @LINE:10
        case (target, table, id) if target == "dispatch" && table == "member"   && id == "eouou" =>
          implicit val _rrc = new ReverseRouteContext(Map(("target", "dispatch"), ("table", "member"  ), ("id", "eouou")))
          Call("POST", _prefix + { _defaultPrefix } + "api/v1/dispatch")
      
        // @LINE:11
        case (target, table, id) if target == "activate" =>
          implicit val _rrc = new ReverseRouteContext(Map(("target", "activate")))
          Call("GET", _prefix + { _defaultPrefix } + "api/v1/member/" + implicitly[PathBindable[String]].unbind("table", dynamicString(table)) + "/activate/" + implicitly[PathBindable[String]].unbind("id", dynamicString(id)))
      
        // @LINE:12
        case (target, table, id) if target == "whereWithCondition" =>
          implicit val _rrc = new ReverseRouteContext(Map(("target", "whereWithCondition")))
          Call("POST", _prefix + { _defaultPrefix } + "api/v1/" + implicitly[PathBindable[String]].unbind("table", dynamicString(table)) + "/where/" + implicitly[PathBindable[String]].unbind("condition", id))
      
        // @LINE:14
        case (target, table, id) if target == "list" && id == "oeuoe" =>
          implicit val _rrc = new ReverseRouteContext(Map(("target", "list"), ("id", "oeuoe")))
          Call("GET", _prefix + { _defaultPrefix } + "api/v1/" + implicitly[PathBindable[String]].unbind("table", dynamicString(table)))
      
        // @LINE:15
        case (target, table, id) if target == "getByID" =>
          implicit val _rrc = new ReverseRouteContext(Map(("target", "getByID")))
          Call("GET", _prefix + { _defaultPrefix } + "api/v1/" + implicitly[PathBindable[String]].unbind("table", dynamicString(table)) + "/" + implicitly[PathBindable[String]].unbind("id", dynamicString(id)))
      
        // @LINE:16
        case (target, table, id) if target == "deleteByID" =>
          implicit val _rrc = new ReverseRouteContext(Map(("target", "deleteByID")))
          Call("DELETE", _prefix + { _defaultPrefix } + "api/v1/" + implicitly[PathBindable[String]].unbind("table", dynamicString(table)) + "/" + implicitly[PathBindable[String]].unbind("id", dynamicString(id)))
      
        // @LINE:17
        case (target, table, id) if target == "create" && id == "eouou" =>
          implicit val _rrc = new ReverseRouteContext(Map(("target", "create"), ("id", "eouou")))
          Call("POST", _prefix + { _defaultPrefix } + "api/v1/" + implicitly[PathBindable[String]].unbind("table", dynamicString(table)))
      
        // @LINE:18
        case (target, table, id) if target == "updateByID" =>
          implicit val _rrc = new ReverseRouteContext(Map(("target", "updateByID")))
          Call("PUT", _prefix + { _defaultPrefix } + "api/v1/" + implicitly[PathBindable[String]].unbind("table", dynamicString(table)) + "/" + implicitly[PathBindable[String]].unbind("id", dynamicString(id)))
      
      }
    
    }
  
  }

  // @LINE:52
  class ReverseUniversityPage(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:53
    def home(subdomain:String): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "university/" + implicitly[PathBindable[String]].unbind("subdomain", dynamicString(subdomain)))
    }
  
    // @LINE:54
    def page(subdomain:String, page:String): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "university/" + implicitly[PathBindable[String]].unbind("subdomain", dynamicString(subdomain)) + "/" + implicitly[PathBindable[String]].unbind("page", dynamicString(page)))
    }
  
    // @LINE:52
    def index(): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "university")
    }
  
  }

  // @LINE:6
  class ReverseApplication(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:45
    def dispatchGet(): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "member/dispatch")
    }
  
    // @LINE:31
    def newUniversityPost(): Call = {
      import ReverseRouteContext.empty
      Call("POST", _prefix + { _defaultPrefix } + "newUniversity")
    }
  
    // @LINE:30
    def newUniversityGet(): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "newUniversity")
    }
  
    // @LINE:56
    def siteContent(siteContent:String): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + implicitly[PathBindable[String]].unbind("siteContent", dynamicString(siteContent)))
    }
  
    // @LINE:41
    def memberSettingsPost(): Call = {
      import ReverseRouteContext.empty
      Call("POST", _prefix + { _defaultPrefix } + "member/settings")
    }
  
    // @LINE:28
    def loginGet(): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "login")
    }
  
    // @LINE:27
    def registerPost(): Call = {
      import ReverseRouteContext.empty
      Call("POST", _prefix + { _defaultPrefix } + "register")
    }
  
    // @LINE:33
    def memberArea(): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "member")
    }
  
    // @LINE:47
    def orderPost(): Call = {
      import ReverseRouteContext.empty
      Call("POST", _prefix + { _defaultPrefix } + "member/order")
    }
  
    // @LINE:40
    def memberSettingsGet(): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "member/settings")
    }
  
    // @LINE:37
    def BecomeDriverPost(): Call = {
      import ReverseRouteContext.empty
      Call("POST", _prefix + { _defaultPrefix } + "member/becomeDriver")
    }
  
    // @LINE:49
    def logout(): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "logout")
    }
  
    // @LINE:39
    def addCarPost(): Call = {
    
      () match {
      
        // @LINE:39
        case ()  =>
          import ReverseRouteContext.empty
          Call("POST", _prefix + { _defaultPrefix } + "member/addCar")
      
      }
    
    }
  
    // @LINE:26
    def registerGet(): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "register")
    }
  
    // @LINE:29
    def loginPost(): Call = {
      import ReverseRouteContext.empty
      Call("POST", _prefix + { _defaultPrefix } + "login")
    }
  
    // @LINE:34
    def memberActivation(member:String, code:String): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "member/" + implicitly[PathBindable[String]].unbind("member", dynamicString(member)) + "/activate/" + implicitly[PathBindable[String]].unbind("code", dynamicString(code)))
    }
  
    // @LINE:36
    def BecomeDriverGet(): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "member/becomeDriver")
    }
  
    // @LINE:38
    def addCarGet(): Call = {
    
      () match {
      
        // @LINE:38
        case ()  =>
          import ReverseRouteContext.empty
          Call("GET", _prefix + { _defaultPrefix } + "member/addCar")
      
      }
    
    }
  
    // @LINE:6
    def index(): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix)
    }
  
  }

  // @LINE:21
  class ReverseAdminCRUD(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:24
    def crudRouter(table:String): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "admin/" + implicitly[PathBindable[String]].unbind("table", dynamicString(table)))
    }
  
    // @LINE:22
    def logout(): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "admin/logout")
    }
  
    // @LINE:21
    def index(): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "admin")
    }
  
    // @LINE:23
    def login(): Call = {
      import ReverseRouteContext.empty
      Call("POST", _prefix + { _defaultPrefix } + "admin")
    }
  
  }


}
