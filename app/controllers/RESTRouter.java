package controllers;

import models.RESTHelper;
import models.garaDB.tables.pojos.Accesstoken;
import models.garaDB.tables.pojos.Member;
import play.data.Form;
import play.data.FormFactory;
import play.data.validation.ValidationError;
import play.libs.Json;
import play.mvc.Controller;
import play.mvc.Result;

import javax.inject.Inject;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

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
            case "login":
                return login();
            case "dispatch":
                return dispatch();
        }

        return badRequest("{\"error\":\"bad request\"}");
    }

    private Result dispatch() {
        Form form = formFactory.form().bindFromRequest();
        String distLatitude = form.data().get("distLatitude").toString();
        String distLongitude = form.data().get("distLongitude").toString();
        String latitude = form.data().get("latitude").toString();
        String longitude = form.data().get("longitude").toString();
        String memberID = form.data().get("id").toString();
        List<Map<String, Object>> dispatch = null;
        try {
            dispatch = restHelper.dispatch(memberID, distLongitude, distLatitude, longitude, latitude);
        } catch (Exception e) {
            return badRequest("{\"error\":\"bad request\"}");
        }

        return ok(Json.toJson(dispatch));
    }

    private Result login() {

        Form form = formFactory.form().bindFromRequest();
        String password = form.data().get("password").toString();
        String username = form.data().get("username").toString();
        try {
            Accesstoken accesstokenRecord = restHelper.login(username, password);
            if (accesstokenRecord.getValue() == null) {
                return badRequest("{\"error\":\"username or password not correct\"}");
            }

            session("username", username);
            session("Accesstoken", accesstokenRecord.getValue());
            session("Accesstokenid", String.valueOf(accesstokenRecord.getId()));
            session("lastused", accesstokenRecord.getLastused().toString());

            List<Object> list = new ArrayList();
            list.add(accesstokenRecord);
            list.add(restHelper.getWhere("member","username",username));
            return created(Json.toJson(list));

        } catch (Exception e) {
            return badRequest("{\"error\":\"username or password not correct\"}");
        }
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
