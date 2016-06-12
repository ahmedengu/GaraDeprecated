package controllers;

import models.RESTHelper;
import models.garaDB.tables.pojos.*;
import play.data.Form;
import play.data.FormFactory;
import play.data.validation.ValidationError;
import play.mvc.Controller;
import play.mvc.Result;
import play.twirl.api.Html;
import views.html.index;
import views.html.onePageForms;

import javax.inject.Inject;
import java.sql.SQLException;
import java.util.List;
import java.util.Map;

public class Application extends Controller {

    @Inject
    RESTHelper restHelper;
    @Inject
    RESTRouter restRouter;
    @Inject
    FormFactory formFactory;

    public Result siteContent(String siteContent) {

        try {
            List where = restHelper.getWhere("SiteContent", "link", siteContent);
            Sitecontent sitecontent = (Sitecontent) where.get(0);
            return ok(views.html.main.render(sitecontent.getTitle(), sitecontent.getDescription(), sitecontent.getKeywords(), new Html(sitecontent.getBody())));
        } catch (Exception e) {
            e.printStackTrace();
        }

        return notFound();
    }

    public Result memberActivation(String member, String code) {
        if (restRouter.memberActivation(member, code).status() == 200) {
            flash("alertMessage", "done successfully!");
            flash("alertMessageStrong", "Email Activation");
        } else {
            flash("alertMessage", "something went wrong!");
            flash("alertMessageType", "alert-danger");
            flash("alertMessageStrong", "Email Activation");
        }
        return redirect(routes.Application.index());
    }

    public Result orderPost() {
        return play.mvc.Results.TODO;
    }

    public Result dispatchPost() {
        return play.mvc.Results.TODO;
    }

    public Result addCarPost() {
        Form<Car> form = formFactory.form(Car.class).bindFromRequest();
        if (form.hasErrors()) {
            return ok(views.html.addCar.render("add a car", "add a car", "add a car", form));
        } else {

            if (restRouter.create("Car").status() == 201) {
                flash("alertMessage", "done successfully!");
                flash("alertMessageStrong", "Add a car");

                return redirect(routes.Application.memberArea());
            } else {
                return ok(views.html.addCar.render("add a car", "add a car", "add a car", formFactory.form(Car.class)));
            }


        }
    }

    public Result addCarGet() {
        return ok(views.html.addCar.render("add a car", "add a car", "add a car", formFactory.form(Car.class)));
    }

    public Result memberSettingsPost() {
        return play.mvc.Results.TODO;
    }

    public Result memberSettingsGet() {
        return play.mvc.Results.TODO;
    }


    public Result index() throws SQLException {
//        flash("alertMessage","helllllo");
//        flash("alertMessageType","alert-warning");
//        flash("alertMessageStrong","helllllo");
        return ok(index.render("Gara", "Carpooling platform for universities ", "Carpooling ,platform, for universities ,Gara"));
    }

    public Result loginGet() throws SQLException {

        if (restHelper.getByID("accesstoken", session("Accesstokenid")).size() != 0) {
            return redirect(routes.Application.memberArea());
        }
        return ok(views.html.login.render("Login", "Login", "Login", formFactory.form(Member.class)));

    }

    public Result loginPost() throws SQLException {

        Form form = formFactory.form().bindFromRequest();
        String password = form.data().get("password").toString();
        String username = form.data().get("username").toString();
        try {
            Accesstoken accesstokenRecord = restHelper.login(username, password);
            if (accesstokenRecord.getValue() == null) {
                form.reject(new ValidationError("username", "username or password not correct"));
                return badRequest(views.html.login.render("login", "login", "login", form));
            }
            session("username", username);
            session("Accesstoken", accesstokenRecord.getValue());
            session("Accesstokenid", String.valueOf(accesstokenRecord.getId()));
            session("lastused", accesstokenRecord.getLastused().toString());
            return redirect(routes.Application.memberArea());

        } catch (Exception e) {
            form.reject(new ValidationError("username", "username or password not correct"));
            return badRequest(views.html.login.render("login", "login", "login", form));
        }


//        Form<Member> loginForm = formFactory.form(Member.class).bindFromRequest();
//        if (loginForm.hasErrors()) {
//            return badRequest(views.html.login.render("login", "login", "login", loginForm));
//        } else {
//            String password = loginForm.get().getPassword();
//            String username = loginForm.get().getUsername();
//            try {
//                Accesstoken accesstokenRecord = restHelper.login(username, password);
//                if (accesstokenRecord.getValue() == null) {
//                    loginForm.reject(new ValidationError("username", "username or password not correct"));
//                    return badRequest(views.html.login.render("login", "login", "login", loginForm));
//                }
//                session("username", username);
//                session("Accesstoken", accesstokenRecord.getValue());
//                session("Accesstokenid", String.valueOf(accesstokenRecord.getId()));
//                session("lastused", accesstokenRecord.getLastused().toString());
//                return redirect(routes.Application.memberArea());
//
//            } catch (Exception e) {
//                loginForm.reject(new ValidationError("username", "username or password not correct"));
//                return badRequest(views.html.login.render("login", "login", "login", loginForm));
//            }
//        }

    }

    public Result registerGet() throws SQLException {
        if (restHelper.getByID("accesstoken", session("Accesstokenid")).size() != 0) {
            return redirect(routes.Application.memberArea());
        }
        return ok(views.html.register.render("register", "register", "register", formFactory.form(Member.class)));
    }

    public Result registerPost() throws SQLException {

        Form<Member> form = formFactory.form(Member.class).bindFromRequest();
        if (form.hasErrors()) {
            return badRequest(views.html.register.render("register", "register", "register", form));
        } else {
            session().clear();
            if (restRouter.create("MEMBER").status() == 201) {
                return redirect(routes.Application.loginGet());
            } else {
                return registerGet();
            }
        }

    }

    public Result newUniversityGet() throws SQLException {
        return ok(views.html.addNewUniversity.render("Add New University", "Add New University", "Add New University", formFactory.form(University.class)));

    }

    public Result newUniversityPost() throws SQLException {

        Form<University> form = formFactory.form(University.class).bindFromRequest();
        if (form.hasErrors()) {
            return badRequest(views.html.addNewUniversity.render("University", "University", "University", form));
        } else {
            if (restRouter.create("University").status() == 201) {
                return redirect(routes.Application.index());
            } else {
                return newUniversityGet();
            }
        }


    }

    public Result memberArea() throws SQLException {
        Boolean isDriver = false;
        try {
            List byID = restHelper.getByID("accesstoken", session("Accesstokenid"));
            if (byID.size() == 0) {
                session().clear();
                Form form = formFactory.form().bindFromRequest();
                form.reject(new ValidationError("username", "you should login first "));
                return unauthorized(views.html.login.render("login", "login", "login", form));
            }
            Accesstoken o = (Accesstoken) byID.get(0);

            List<Driver> where = restHelper.getWhere("driver", "memberID", String.valueOf(o.getMemberid()));
            if (where.size() > 0)
                isDriver = true;
        } catch (Exception e) {
            e.printStackTrace();
        }
        String username = session("username");
        return ok(views.html.memberAreaIndex.render(username, username, username, isDriver));
    }

    public Result logout() throws SQLException {
        if (session("Accesstokenid") != null)
            restHelper.deleteByID("accesstoken", session("Accesstokenid"));
        session().clear();
        return redirect(routes.Application.index());
    }

    public Result BecomeDriverPost() {
        Form<Driver> form = formFactory.form(Driver.class).bindFromRequest();
        if (form.hasErrors()) {
            return badRequest(views.html.becomeDriver.render("Become a driver", "Become a driver", "Become a driver", form));
        } else {

            if (restRouter.create("Driver").status() == 201) {
                flash("alertMessage", "done successfully!");
                flash("alertMessageStrong", "Becoming a member");

                return redirect(routes.Application.memberArea());
            } else {
                return ok(views.html.becomeDriver.render("Become a driver", "Become a driver", "Become a driver", formFactory.form(Driver.class)));
            }
        }
    }

    public Result BecomeDriverGet() {
        return ok(views.html.becomeDriver.render("Become a driver", "Become a driver", "Become a driver", formFactory.form(Driver.class)));

    }

}