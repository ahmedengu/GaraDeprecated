
// @GENERATOR:play-routes-compiler
// @SOURCE:C:/Users/ahmedengu/Documents/IdeaProjects/Gara/conf/routes
// @DATE:Sat Jun 11 10:15:35 EET 2016

import play.api.routing.JavaScriptReverseRoute
import play.api.mvc.{ QueryStringBindable, PathBindable, Call, JavascriptLiteral }
import play.core.routing.{ HandlerDef, ReverseRouteContext, queryString, dynamicString }


import _root_.controllers.Assets.Asset
import _root_.play.libs.F

// @LINE:6
package controllers.javascript {
  import ReverseRouteContext.empty

  // @LINE:8
  class ReverseAssets(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:8
    def at: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Assets.at",
      """
        function(file1) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "assets/" + (""" + implicitly[PathBindable[String]].javascriptUnbind + """)("file", file1)})
        }
      """
    )
  
  }

  // @LINE:9
  class ReverseRESTRouter(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:9
    def index: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.RESTRouter.index",
      """
        function(target0,table1,id2) {
        
          if (target0 == """ + implicitly[JavascriptLiteral[String]].to("login") + """ && table1 == """ + implicitly[JavascriptLiteral[String]].to("member"  ) + """ && id2 == """ + implicitly[JavascriptLiteral[String]].to("eouou") + """) {
            return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "api/v1/login"})
          }
        
          if (target0 == """ + implicitly[JavascriptLiteral[String]].to("dispatch") + """ && table1 == """ + implicitly[JavascriptLiteral[String]].to("member"  ) + """ && id2 == """ + implicitly[JavascriptLiteral[String]].to("eouou") + """) {
            return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "api/v1/dispatch"})
          }
        
          if (target0 == """ + implicitly[JavascriptLiteral[String]].to("activate") + """) {
            return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "api/v1/member/" + (""" + implicitly[PathBindable[String]].javascriptUnbind + """)("table", encodeURIComponent(table1)) + "/activate/" + (""" + implicitly[PathBindable[String]].javascriptUnbind + """)("id", encodeURIComponent(id2))})
          }
        
          if (target0 == """ + implicitly[JavascriptLiteral[String]].to("list") + """ && id2 == """ + implicitly[JavascriptLiteral[String]].to("oeuoe") + """) {
            return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "api/v1/" + (""" + implicitly[PathBindable[String]].javascriptUnbind + """)("table", encodeURIComponent(table1))})
          }
        
          if (target0 == """ + implicitly[JavascriptLiteral[String]].to("getByID") + """) {
            return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "api/v1/" + (""" + implicitly[PathBindable[String]].javascriptUnbind + """)("table", encodeURIComponent(table1)) + "/" + (""" + implicitly[PathBindable[String]].javascriptUnbind + """)("id", encodeURIComponent(id2))})
          }
        
          if (target0 == """ + implicitly[JavascriptLiteral[String]].to("deleteByID") + """) {
            return _wA({method:"DELETE", url:"""" + _prefix + { _defaultPrefix } + """" + "api/v1/" + (""" + implicitly[PathBindable[String]].javascriptUnbind + """)("table", encodeURIComponent(table1)) + "/" + (""" + implicitly[PathBindable[String]].javascriptUnbind + """)("id", encodeURIComponent(id2))})
          }
        
          if (target0 == """ + implicitly[JavascriptLiteral[String]].to("create") + """ && id2 == """ + implicitly[JavascriptLiteral[String]].to("eouou") + """) {
            return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "api/v1/" + (""" + implicitly[PathBindable[String]].javascriptUnbind + """)("table", encodeURIComponent(table1))})
          }
        
          if (target0 == """ + implicitly[JavascriptLiteral[String]].to("updateByID") + """) {
            return _wA({method:"PUT", url:"""" + _prefix + { _defaultPrefix } + """" + "api/v1/" + (""" + implicitly[PathBindable[String]].javascriptUnbind + """)("table", encodeURIComponent(table1)) + "/" + (""" + implicitly[PathBindable[String]].javascriptUnbind + """)("id", encodeURIComponent(id2))})
          }
        
          if (target0 == """ + implicitly[JavascriptLiteral[String]].to("updateByID") + """) {
            return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "api/v1/" + (""" + implicitly[PathBindable[String]].javascriptUnbind + """)("table", encodeURIComponent(table1)) + "/" + (""" + implicitly[PathBindable[String]].javascriptUnbind + """)("id", encodeURIComponent(id2))})
          }
        
        }
      """
    )
  
  }

  // @LINE:46
  class ReverseUniversityPage(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:47
    def home: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.UniversityPage.home",
      """
        function(subdomain0) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "university/" + (""" + implicitly[PathBindable[String]].javascriptUnbind + """)("subdomain", encodeURIComponent(subdomain0))})
        }
      """
    )
  
    // @LINE:48
    def page: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.UniversityPage.page",
      """
        function(subdomain0,page1) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "university/" + (""" + implicitly[PathBindable[String]].javascriptUnbind + """)("subdomain", encodeURIComponent(subdomain0)) + "/" + (""" + implicitly[PathBindable[String]].javascriptUnbind + """)("page", encodeURIComponent(page1))})
        }
      """
    )
  
    // @LINE:46
    def index: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.UniversityPage.index",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "university"})
        }
      """
    )
  
  }

  // @LINE:6
  class ReverseApplication(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:27
    def newUniversityPost: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Application.newUniversityPost",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "newUniversity"})
        }
      """
    )
  
    // @LINE:26
    def newUniversityGet: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Application.newUniversityGet",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "newUniversity"})
        }
      """
    )
  
    // @LINE:35
    def memberSettingsPost: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Application.memberSettingsPost",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "member/settings"})
        }
      """
    )
  
    // @LINE:24
    def loginGet: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Application.loginGet",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "login"})
        }
      """
    )
  
    // @LINE:23
    def registerPost: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Application.registerPost",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "register"})
        }
      """
    )
  
    // @LINE:29
    def memberArea: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Application.memberArea",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "member"})
        }
      """
    )
  
    // @LINE:39
    def dispatchPost: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Application.dispatchPost",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "member/dispatch"})
        }
      """
    )
  
    // @LINE:41
    def orderPost: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Application.orderPost",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "member/order"})
        }
      """
    )
  
    // @LINE:34
    def memberSettingsGet: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Application.memberSettingsGet",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "member/settings"})
        }
      """
    )
  
    // @LINE:33
    def BecomeDriverPost: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Application.BecomeDriverPost",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "member/becomeDriver"})
        }
      """
    )
  
    // @LINE:43
    def logout: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Application.logout",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "logout"})
        }
      """
    )
  
    // @LINE:37
    def addCarPost: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Application.addCarPost",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "member/addCar"})
        }
      """
    )
  
    // @LINE:22
    def registerGet: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Application.registerGet",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "register"})
        }
      """
    )
  
    // @LINE:25
    def loginPost: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Application.loginPost",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "login"})
        }
      """
    )
  
    // @LINE:30
    def memberActivation: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Application.memberActivation",
      """
        function(member0,code1) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "member/" + (""" + implicitly[PathBindable[String]].javascriptUnbind + """)("member", encodeURIComponent(member0)) + "/activate/" + (""" + implicitly[PathBindable[String]].javascriptUnbind + """)("code", encodeURIComponent(code1))})
        }
      """
    )
  
    // @LINE:32
    def BecomeDriverGet: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Application.BecomeDriverGet",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "member/becomeDriver"})
        }
      """
    )
  
    // @LINE:36
    def addCarGet: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Application.addCarGet",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "member/addCar"})
        }
      """
    )
  
    // @LINE:6
    def index: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Application.index",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + """"})
        }
      """
    )
  
  }

  // @LINE:19
  class ReverseAdminCRUD(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:20
    def crudRouter: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.AdminCRUD.crudRouter",
      """
        function(table0) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "admin/" + (""" + implicitly[PathBindable[String]].javascriptUnbind + """)("table", encodeURIComponent(table0))})
        }
      """
    )
  
    // @LINE:19
    def index: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.AdminCRUD.index",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "admin"})
        }
      """
    )
  
  }


}
