package controllers;

import models.RESTHelper;
import models.garaDB.tables.pojos.Member;
import play.data.Form;
import play.data.FormFactory;
import play.libs.Json;
import play.mvc.Controller;

import javax.inject.Inject;
import java.sql.SQLException;
import java.util.List;

public class RESTRouter extends Controller {

    @Inject
    RESTHelper restHelper;
    @Inject
    FormFactory formFactory;

    public play.mvc.Result index(String target, String table, String id) {
        switch (target) {
            case "list":
                return list(table);
            case "getByID":
                return getByID(table, id);
            case "deleteByID":
                return deleteByID(table, id);
            case "create":
                return create(table);
            case "updateByID":
                return updateByID(table, id);

        }

        return badRequest("{\"error\":\"bad request\"}");
    }

    public play.mvc.Result list(String tableName) {

        List result = null;
        try {
            result = restHelper.getAll(tableName);
            return ok(Json.toJson(result));
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return badRequest("{\"error\":\"bad request\"}");

    }

    public play.mvc.Result getByID(String tableName, String id) {

        List result = null;
        try {
            result = restHelper.getByID(tableName, id);
            return ok(Json.toJson(result));
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return badRequest("{\"error\":\"bad request\"}");

    }


    public play.mvc.Result deleteByID(String tableName, String id) {

        List result = null;
        try {
            result = restHelper.deleteByID(tableName, id);
            return ok(Json.toJson(result));
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return badRequest("{\"error\":\"bad request\"}");
    }

    public play.mvc.Result create(String tableName) {
        Class aClass = RESTHelper.getClassByName(tableName);
        Form form = formFactory.form(aClass).bindFromRequest();
        if (form.hasErrors()) {
//            Map<String, List> listMap = new HashMap<>();
//            List list = new ArrayList<>();
//            for (:form.errorsAsJson()
//                 ) {
//
//            }

            return badRequest("{\"error\":" + form.errorsAsJson() + "}");
        } else {
            try {
                List result = restHelper.create(tableName, form);
                if (result.size() > 0) {
                    return created(Json.toJson(result));
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        return badRequest("{\"error\":\"bad request\"}");
    }

    public play.mvc.Result updateByID(String tableName, String id) {

        List result = null;
        try {
            Class aClass = RESTHelper.getClassByName(tableName);
            Form form = formFactory.form(aClass).bindFromRequest();
            result = restHelper.updateByID(tableName, form, id);
            return ok(Json.toJson(result));
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return badRequest("{\"error\":\"bad request\"}");
    }
}
