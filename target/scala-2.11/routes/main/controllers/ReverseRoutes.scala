
// @GENERATOR:play-routes-compiler
// @SOURCE:C:/Users/ahmedengu/Documents/IdeaProjects/Gara/conf/routes
// @DATE:Tue May 31 18:14:37 EET 2016

import play.api.mvc.{ QueryStringBindable, PathBindable, Call, JavascriptLiteral }
import play.core.routing.{ HandlerDef, ReverseRouteContext, queryString, dynamicString }


import _root_.controllers.Assets.Asset
import _root_.play.libs.F

// @LINE:6
package controllers {

  // @LINE:10
  class ReverseRESTRouter(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:10
    def index(target:String, table:String, id:String): Call = {
    
      (target: @unchecked, table: @unchecked, id: @unchecked) match {
      
        // @LINE:10
        case (target, table, id) if target == "list" && id == "oeuoe" =>
          implicit val _rrc = new ReverseRouteContext(Map(("target", "list"), ("id", "oeuoe")))
          Call("GET", _prefix + { _defaultPrefix } + "api/v1/" + implicitly[PathBindable[String]].unbind("table", dynamicString(table)))
      
        // @LINE:11
        case (target, table, id) if target == "getByID" =>
          implicit val _rrc = new ReverseRouteContext(Map(("target", "getByID")))
          Call("GET", _prefix + { _defaultPrefix } + "api/v1/" + implicitly[PathBindable[String]].unbind("table", dynamicString(table)) + "/" + implicitly[PathBindable[String]].unbind("id", dynamicString(id)))
      
        // @LINE:12
        case (target, table, id) if target == "deleteByID" =>
          implicit val _rrc = new ReverseRouteContext(Map(("target", "deleteByID")))
          Call("DELETE", _prefix + { _defaultPrefix } + "api/v1/" + implicitly[PathBindable[String]].unbind("table", dynamicString(table)) + "/" + implicitly[PathBindable[String]].unbind("id", dynamicString(id)))
      
        // @LINE:13
        case (target, table, id) if target == "create" && id == "eouou" =>
          implicit val _rrc = new ReverseRouteContext(Map(("target", "create"), ("id", "eouou")))
          Call("POST", _prefix + { _defaultPrefix } + "api/v1/" + implicitly[PathBindable[String]].unbind("table", dynamicString(table)))
      
        // @LINE:14
        case (target, table, id) if target == "updateByID" =>
          implicit val _rrc = new ReverseRouteContext(Map(("target", "updateByID")))
          Call("PUT", _prefix + { _defaultPrefix } + "api/v1/" + implicitly[PathBindable[String]].unbind("table", dynamicString(table)) + "/" + implicitly[PathBindable[String]].unbind("id", dynamicString(id)))
      
      }
    
    }
  
  }

  // @LINE:9
  class ReverseAssets(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:9
    def at(file:String): Call = {
      implicit val _rrc = new ReverseRouteContext(Map(("path", "/public")))
      Call("GET", _prefix + { _defaultPrefix } + "assets/" + implicitly[PathBindable[String]].unbind("file", file))
    }
  
  }

  // @LINE:17
  class ReverseAdminCRUD(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:18
    def crudRouter(table:String): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "admin/" + implicitly[PathBindable[String]].unbind("table", dynamicString(table)))
    }
  
    // @LINE:17
    def index(): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "admin")
    }
  
  }

  // @LINE:6
  class ReverseApplication(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:25
    def newUniversityPost(): Call = {
      import ReverseRouteContext.empty
      Call("POST", _prefix + { _defaultPrefix } + "newUniversity")
    }
  
    // @LINE:24
    def newUniversityGet(): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "newUniversity")
    }
  
    // @LINE:31
    def memberSettingsPost(): Call = {
      import ReverseRouteContext.empty
      Call("POST", _prefix + { _defaultPrefix } + "member/settings")
    }
  
    // @LINE:22
    def loginGet(): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "login")
    }
  
    // @LINE:21
    def registerPost(): Call = {
      import ReverseRouteContext.empty
      Call("POST", _prefix + { _defaultPrefix } + "register")
    }
  
    // @LINE:27
    def memberArea(): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "member")
    }
  
    // @LINE:35
    def dispatchPost(): Call = {
      import ReverseRouteContext.empty
      Call("POST", _prefix + { _defaultPrefix } + "member/dispatch")
    }
  
    // @LINE:37
    def orderPost(): Call = {
      import ReverseRouteContext.empty
      Call("POST", _prefix + { _defaultPrefix } + "member/order")
    }
  
    // @LINE:30
    def memberSettingsGet(): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "member/settings")
    }
  
    // @LINE:29
    def BecomeDriverPost(): Call = {
      import ReverseRouteContext.empty
      Call("POST", _prefix + { _defaultPrefix } + "member/becomeDriver")
    }
  
    // @LINE:39
    def logout(): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "logout")
    }
  
    // @LINE:33
    def addCarPost(): Call = {
      import ReverseRouteContext.empty
      Call("POST", _prefix + { _defaultPrefix } + "member/addCar")
    }
  
    // @LINE:20
    def registerGet(): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "register")
    }
  
    // @LINE:23
    def loginPost(): Call = {
      import ReverseRouteContext.empty
      Call("POST", _prefix + { _defaultPrefix } + "login")
    }
  
    // @LINE:28
    def BecomeDriverGet(): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "member/becomeDriver")
    }
  
    // @LINE:32
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


}
