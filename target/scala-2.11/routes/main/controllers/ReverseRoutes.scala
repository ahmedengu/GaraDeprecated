
// @GENERATOR:play-routes-compiler
// @SOURCE:C:/Users/ahmedengu/Documents/IdeaProjects/Gara/conf/routes
// @DATE:Wed Jun 08 13:09:03 EET 2016

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
        case (target, table, id) if target == "list" && id == "oeuoe" =>
          implicit val _rrc = new ReverseRouteContext(Map(("target", "list"), ("id", "oeuoe")))
          Call("GET", _prefix + { _defaultPrefix } + "api/v1/" + implicitly[PathBindable[String]].unbind("table", dynamicString(table)))
      
        // @LINE:12
        case (target, table, id) if target == "getByID" =>
          implicit val _rrc = new ReverseRouteContext(Map(("target", "getByID")))
          Call("GET", _prefix + { _defaultPrefix } + "api/v1/" + implicitly[PathBindable[String]].unbind("table", dynamicString(table)) + "/" + implicitly[PathBindable[String]].unbind("id", dynamicString(id)))
      
        // @LINE:13
        case (target, table, id) if target == "deleteByID" =>
          implicit val _rrc = new ReverseRouteContext(Map(("target", "deleteByID")))
          Call("DELETE", _prefix + { _defaultPrefix } + "api/v1/" + implicitly[PathBindable[String]].unbind("table", dynamicString(table)) + "/" + implicitly[PathBindable[String]].unbind("id", dynamicString(id)))
      
        // @LINE:14
        case (target, table, id) if target == "create" && id == "eouou" =>
          implicit val _rrc = new ReverseRouteContext(Map(("target", "create"), ("id", "eouou")))
          Call("POST", _prefix + { _defaultPrefix } + "api/v1/" + implicitly[PathBindable[String]].unbind("table", dynamicString(table)))
      
        // @LINE:15
        case (target, table, id) if target == "updateByID" =>
          implicit val _rrc = new ReverseRouteContext(Map(("target", "updateByID")))
          Call("PUT", _prefix + { _defaultPrefix } + "api/v1/" + implicitly[PathBindable[String]].unbind("table", dynamicString(table)) + "/" + implicitly[PathBindable[String]].unbind("id", dynamicString(id)))
      
      }
    
    }
  
  }

  // @LINE:43
  class ReverseUniversityPage(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:44
    def home(subdomain:String): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "university/" + implicitly[PathBindable[String]].unbind("subdomain", dynamicString(subdomain)))
    }
  
    // @LINE:45
    def page(subdomain:String, page:String): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "university/" + implicitly[PathBindable[String]].unbind("subdomain", dynamicString(subdomain)) + "/" + implicitly[PathBindable[String]].unbind("page", dynamicString(page)))
    }
  
    // @LINE:43
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

  
    // @LINE:26
    def newUniversityPost(): Call = {
      import ReverseRouteContext.empty
      Call("POST", _prefix + { _defaultPrefix } + "newUniversity")
    }
  
    // @LINE:25
    def newUniversityGet(): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "newUniversity")
    }
  
    // @LINE:32
    def memberSettingsPost(): Call = {
      import ReverseRouteContext.empty
      Call("POST", _prefix + { _defaultPrefix } + "member/settings")
    }
  
    // @LINE:23
    def loginGet(): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "login")
    }
  
    // @LINE:22
    def registerPost(): Call = {
      import ReverseRouteContext.empty
      Call("POST", _prefix + { _defaultPrefix } + "register")
    }
  
    // @LINE:28
    def memberArea(): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "member")
    }
  
    // @LINE:36
    def dispatchPost(): Call = {
      import ReverseRouteContext.empty
      Call("POST", _prefix + { _defaultPrefix } + "member/dispatch")
    }
  
    // @LINE:38
    def orderPost(): Call = {
      import ReverseRouteContext.empty
      Call("POST", _prefix + { _defaultPrefix } + "member/order")
    }
  
    // @LINE:31
    def memberSettingsGet(): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "member/settings")
    }
  
    // @LINE:30
    def BecomeDriverPost(): Call = {
      import ReverseRouteContext.empty
      Call("POST", _prefix + { _defaultPrefix } + "member/becomeDriver")
    }
  
    // @LINE:40
    def logout(): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "logout")
    }
  
    // @LINE:34
    def addCarPost(): Call = {
      import ReverseRouteContext.empty
      Call("POST", _prefix + { _defaultPrefix } + "member/addCar")
    }
  
    // @LINE:21
    def registerGet(): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "register")
    }
  
    // @LINE:24
    def loginPost(): Call = {
      import ReverseRouteContext.empty
      Call("POST", _prefix + { _defaultPrefix } + "login")
    }
  
    // @LINE:29
    def BecomeDriverGet(): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "member/becomeDriver")
    }
  
    // @LINE:33
    def addCarGet(): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "member/addCar")
    }
  
    // @LINE:6
    def index(): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix)
    }
  
  }

  // @LINE:18
  class ReverseAdminCRUD(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:19
    def crudRouter(table:String): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "admin/" + implicitly[PathBindable[String]].unbind("table", dynamicString(table)))
    }
  
    // @LINE:18
    def index(): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "admin")
    }
  
  }


}
