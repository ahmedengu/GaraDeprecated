
// @GENERATOR:play-routes-compiler
// @SOURCE:C:/Users/ahmedengu/Documents/IdeaProjects/Gara/conf/routes
// @DATE:Wed Jun 08 13:09:03 EET 2016


package router {
  object RoutesPrefix {
    private var _prefix: String = "/"
    def setPrefix(p: String): Unit = {
      _prefix = p
    }
    def prefix: String = _prefix
    val byNamePrefix: Function0[String] = { () => prefix }
  }
}
