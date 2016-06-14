package controllers;

import models.RESTHelper;
import models.garaDB.Gara;
import org.jooq.Field;
import org.jooq.Record;
import org.jooq.Table;
import play.data.Form;
import play.data.FormFactory;
import play.mvc.Controller;
import play.mvc.Result;
import views.html.adminDashboard;

import javax.inject.Inject;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Ahmed Kamel Taha (ahmedengu).
 * Github: https://github.com/ahmedengu
 */
public class AdminCRUD extends Controller {

    @Inject
    RESTHelper restHelper;
    @Inject
    FormFactory formFactory;

    public Result logout() {
        return redirect(routes.Application.logout());
    }

    public Result login() throws SQLException {
        Form form = formFactory.form().bindFromRequest();
        String password = form.data().get("password").toString();
        String username = form.data().get("username").toString();
        if (password.equals("aAaA1!1!") && username.equals("toor")) {
            session("admin", "admin");
            return ok(adminDashboard.render("siteoption", getTableNames(), getTableData("siteoption")));
        }
        return ok(views.html.adminLogin.render("Login"));

    }

    public Result index() throws SQLException {
        if (session().getOrDefault("admin", "").equals("")) {
            session().clear();
            return ok(views.html.adminLogin.render("Login"));
        } else
            return ok(adminDashboard.render("member", getTableNames(), getTableData("member")));
    }

    private List<String> getTableNames() {
        List<String> tablesNames = new ArrayList<>();
        List<Table<?>> o1 = Gara.GARA.getTables();
        for (int i = 0; i < o1.size(); i++) {
            tablesNames.add(o1.get(i).getName());
        }
        return tablesNames;
    }

    public Result crudRouter(String table) throws SQLException {

        if (session().getOrDefault("admin", "").equals("")) {
            session().clear();
            return ok(views.html.adminLogin.render("Login"));
        } else
            return ok(adminDashboard.render(table, getTableNames(), getTableData(table)));
    }

    private List<String> getTableData(String table) throws SQLException {
        Field[] fields = RESTHelper.getTableByName(table).fields();
        List<String> stringList = new ArrayList<>();
        for (int i = 0; i < fields.length; i++) {
            stringList.add(fields[i].getName());
        }

        return stringList;
    }


}