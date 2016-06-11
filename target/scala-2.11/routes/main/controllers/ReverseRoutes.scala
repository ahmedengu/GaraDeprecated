
// @GENERATOR:play-routes-compiler
// @SOURCE:C:/Users/ahmedengu/Documents/IdeaProjects/Gara/conf/routes
// @DATE:Sat Jun 11 10:15:35 EET 2016

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
        case (target, table, id) if target == "list" && id == "oeuoe" =>
          implicit val _rrc = new ReverseRouteContext(Map(("target", "list"), ("id", "oeuoe")))
          Call("GET", _prefix + { _defaultPrefix } + "api/v1/" + implicitly[PathBindable[String]].unbind("table", dynamicString(table)))
      
        // @LINE:13
        case (target, table, id) if target == "getByID" =>
          implicit val _rrc = new ReverseRouteContext(Map(("target", "getByID")))
          Call("GET", _prefix + { _defaultPrefix } + "api/v1/" + implicitly[PathBindable[String]].unbind("table", dynamicString(table)) + "/" + implicitly[PathBindable[String]].unbind("id", dynamicString(id)))
      
        // @LINE:14
        case (target, table, id) if target == "deleteByID" =>
          implicit val _rrc = new ReverseRouteContext(Map(("target", "deleteByID")))
          Call("DELETE", _prefix + { _defaultPrefix } + "api/v1/" + implicitly[PathBindable[String]].unbind("table", dynamicString(table)) + "/" + implicitly[PathBindable[String]].unbind("id", dynamicString(id)))
      
        // @LINE:15
        case (target, table, id) if target == "create" && id == "eouou" =>
          implicit val _rrc = new ReverseRouteContext(Map(("target", "create"), ("id", "eouou")))
          Call("POST", _prefix + { _defaultPrefix } + "api/v1/" + implicitly[PathBindable[String]].unbind("table", dynamicString(table)))
      
        // @LINE:16
        case (target, table, id) if target == "updateByID" =>
          implicit val _rrc = new ReverseRouteContext(Map(("target", "updateByID")))
          Call("PUT", _prefix + { _defaultPrefix } + "api/v1/" + implicitly[PathBindable[String]].unbind("table", dynamicString(table)) + "/" + implicitly[PathBindable[String]].unbind("id", dynamicString(id)))
      
      }
    
    }
  
  }

  // @LINE:46
  class ReverseUniversityPage(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:47
    def home(subdomain:String): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "university/" + implicitly[PathBindable[String]].unbind("subdomain", dynamicString(subdomain)))
    }
  
    // @LINE:48
    def page(subdomain:String, page:String): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "university/" + implicitly[PathBindable[String]].unbind("subdomain", dynamicString(subdomain)) + "/" + implicitly[PathBindable[String]].unbind("page", dynamicString(page)))
    }
  
    // @LINE:46
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

  
    // @LINE:27
    def newUniversityPost(): Call = {
      import ReverseRouteContext.empty
      Call("POST", _prefix + { _defaultPrefix } + "newUniversity")
    }
  
    // @LINE:26
    def newUniversityGet(): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "newUniversity")
    }
  
    // @LINE:35
    def memberSettingsPost(): Call = {
      import ReverseRouteContext.empty
      Call("POST", _prefix + { _defaultPrefix } + "member/settings")
    }
  
    // @LINE:24
    def loginGet(): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "login")
    }
  
    // @LINE:23
    def registerPost(): Call = {
      import ReverseRouteContext.empty
      Call("POST", _prefix + { _defaultPrefix } + "register")
    }
  
    // @LINE:29
    def memberArea(): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "member")
    }
  
    // @LINE:39
    def dispatchPost(): Call = {
      import ReverseRouteContext.empty
      Call("POST", _prefix + { _defaultPrefix } + "member/dispatch")
    }
  
    // @LINE:41
    def orderPost(): Call = {
      import ReverseRouteContext.empty
      Call("POST", _prefix + { _defaultPrefix } + "member/order")
    }
  
    // @LINE:34
    def memberSettingsGet(): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "member/settings")
    }
  
    // @LINE:33
    def BecomeDriverPost(): Call = {
      import ReverseRouteContext.empty
      Call("POST", _prefix + { _defaultPrefix } + "member/becomeDriver")
    }
  
    // @LINE:43
    def logout(): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "logout")
    }
  
    // @LINE:37
    def addCarPost(): Call = {
      import ReverseRouteContext.empty
      Call("POST", _prefix + { _defaultPrefix } + "member/addCar")
    }
  
    // @LINE:22
    def registerGet(): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "register")
    }
  
    // @LINE:25
    def loginPost(): Call = {
      import ReverseRouteContext.empty
      Call("POST", _prefix + { _defaultPrefix } + "login")
    }
  
    // @LINE:30
    def memberActivation(member:String, code:String): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "member/" + implicitly[PathBindable[String]].unbind("member", dynamicString(member)) + "/activate/" + implicitly[PathBindable[String]].unbind("code", dynamicString(code)))
    }
  
    // @LINE:32
    def BecomeDriverGet(): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "member/becomeDriver")
    }
  
    // @LINE:36
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

  // @LINE:19
  class ReverseAdminCRUD(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:20
    def crudRouter(table:String): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "admin/" + implicitly[PathBindable[String]].unbind("table", dynamicString(table)))
    }
  
    // @LINE:19
    def index(): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "admin")
    }
  
  }


}
