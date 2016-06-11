package controllers;

import models.RESTHelper;
import models.garaDB.tables.records.UniversityRecord;
import play.data.FormFactory;
import play.mvc.Controller;
import models.RESTHelper;
import models.garaDB.tables.pojos.Accesstoken;
import models.garaDB.tables.pojos.Member;
import models.garaDB.tables.pojos.Sitecontent;
import models.garaDB.tables.pojos.University;
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
import javax.inject.Inject;

/**
 * Created by ahmedengu.
 */
public class UniversityPage extends Controller {
    @Inject
    RESTHelper restHelper;
    @Inject
    RESTRouter restRouter;
    @Inject
    FormFactory formFactory;

    public  Result home(String subdomain) {
        try {
            University university = (University) restHelper.getWhere("University", "pageSubdomain", subdomain).get(0);

            return ok(views.html.subdomainMain.render(university.getPagename(),university.getPagedescription(),university.getPagekeywords(),university.getPic(),new Html(university.getPagecontent())));

        } catch (Exception e){
            return notFound();
        }

    }

    public  Result page(String subdomain, String page) {
        try {
            Map<String, Object> universityContentPage = restHelper.getUniversityContentPage(subdomain, page);

          return ok(views.html.subdomainMain.render(universityContentPage.get("title").toString(),universityContentPage.get("description").toString(),universityContentPage.get("keywords").toString(),universityContentPage.get("upic").toString(),new Html( universityContentPage.get("body").toString())));

        } catch (Exception e){
            return notFound();
        }    }


    public  Result index() {
        return redirect(routes.Application.newUniversityGet());
    }
}
