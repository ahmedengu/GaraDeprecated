package models;

import models.garaDB.Tables;
import models.garaDB.tables.pojos.*;
import models.garaDB.tables.records.*;
import org.jooq.*;
import org.jooq.impl.DSL;
import play.data.Form;

import java.sql.SQLException;
import java.sql.Timestamp;
import java.util.*;

import static play.mvc.Controller.request;

public class RESTHelper {
    public Accesstoken login(String username,String password) throws SQLException {
        Member member= null;
        try {
            member = getDslContext().selectFrom(Tables.MEMBER).where(Tables.MEMBER.USERNAME.equal(username)).and(Tables.MEMBER.PASSWORD.equal(password)).fetchOne().into(Member.class);
        } catch (Exception e) {
            return null;
        }
        if(member==null) return null;
        String axtok= UUID.randomUUID().toString().replace("-","");

        AccesstokenRecord accesstoken=  getDslContext().newRecord(Tables.ACCESSTOKEN);
        accesstoken.setIp(request().remoteAddress());
        accesstoken.setBrowser(Arrays.toString(request().headers().get("User-Agent")) );

        accesstoken.setValue(axtok );
        accesstoken.setLastused(new Timestamp((new Date()).getTime()));
        accesstoken.setTimestamp(accesstoken.getLastused());
        accesstoken.setMemberid(member.getId());
        accesstoken.store();

        return accesstoken.into(Accesstoken.class);

    }

    public List getAll(String tableName) throws SQLException {
            Table table = getTableByName(tableName);
            Class tableClass = getClassByName(tableName);
        Field[] selectFields = getSelectFieldsByName(tableName);
            return getAll(table,selectFields, tableClass);
    }
    public List getAll(String tableName,int i) throws SQLException {
       if(i==0){
           Table table = getTableByName(tableName);
           Class tableClass = getClassByName(tableName);
           Field[] selectFields = getSelectFieldsByName(tableName);
           return getAll(table,selectFields, tableClass);
       }else{
           Table table = getTableByName(tableName);
           Field[] selectFields = getSelectFieldsByName(tableName);
           return getAll(table,selectFields);
       }
    }

    public List getAll(Table table,Field[] selectFields, Class tableClass) throws SQLException {
        return getDslContext().select(selectFields).from(table).fetch().into(tableClass);
    }
    public List getAll(Table table,Field[] selectFields) throws SQLException {
        return getDslContext().select(selectFields).from(table).fetch();
    }

    public List getByID(String tableName, String id) throws SQLException {
        Table table = getTableByName(tableName);
        Class tableClass = getClassByName(tableName);
        UpdatableRecord record = getRecordByName(tableName);
        Field[] selectFields = getSelectFieldsByName(tableName);

        return getByID(table,selectFields, tableClass, record, id);
    }

    public List getByID(Table table,Field[] selectFields, Class tableClass, UpdatableRecord record, String id) throws SQLException {
        return getDslContext().select(selectFields).from(table).where("id = ?", id).fetch().into(tableClass);
    }

    public List getWhere(String tableName, String where, String id) throws SQLException {
        Table table = getTableByName(tableName);
        Class tableClass = getClassByName(tableName);
        UpdatableRecord record = getRecordByName(tableName);
        Field[] selectFields = getSelectFieldsByName(tableName);

        return getWhere(table,selectFields, tableClass, record,where, id);
    }

    public List getWhere(Table table,Field[] selectFields, Class tableClass, UpdatableRecord record, String where, String id) throws SQLException {
        return getDslContext().select(selectFields).from(table).where(table.field(where).equal(id)).fetch().into(tableClass);
    }

    public List deleteByID(String tableName, String id) throws SQLException {
        Table table = getTableByName(tableName);
        Class tableClass = getClassByName(tableName);
        UpdatableRecord record = getRecordByName(tableName);
        Field[] selectFields = getSelectFieldsByName(tableName);

        return deleteByID(table, selectFields,tableClass, record, id);
    }

    public List deleteByID(Table table,Field[] selectFields, Class tableClass, UpdatableRecord record, String id) throws SQLException {
        List list = new ArrayList<>();
        int deletedRecord = getDslContext().delete(table).where("id = ?", id).execute();
        list.add(deletedRecord);
        return list;
    }

    public List create(String tableName, Object form) throws SQLException {
        Table table = getTableByName(tableName);
        Class tableClass = getClassByName(tableName);
        Field[] selectFields = getSelectFieldsByName(tableName);


        return create(table,selectFields, tableClass, form);
    }

    public List create(Table table,Field[] selectFields, Class tableClass, Object form) throws SQLException {
        UpdatableRecord record = (UpdatableRecord) getDslContext().newRecord(table);
//        Form<Member> memberForm = (Form<Member>) form;
//        Member member = memberForm.get();
        record.from(((Form) form).get());
        record.set(table.field("ID"),null);
        record.store();

        List list = new ArrayList<>();
        list.add(record.into(tableClass));
        return list;
    }

    public List updateByID(String tableName, Object form,String id) throws SQLException {
        Table table = getTableByName(tableName);
        Class tableClass = getClassByName(tableName);
        Field[] selectFields = getSelectFieldsByName(tableName);

        return updateByID(table,selectFields ,tableClass, form,id);
    }

    public List updateByID(Table table,Field[] selectFields, Class tableClass, Object form,String id) throws SQLException {
        UpdatableRecord record = (UpdatableRecord) getDslContext().newRecord(table);
        record.from(((Form) form).get());
        record.set(table.field("ID"),id);
        record.update();

        List list = new ArrayList<>();
        list.add(record.into(tableClass));
        return list;
    }

    private DSLContext getDslContext() {
        return DSL.using(new PlayConnectionProvider().acquire(), SQLDialect.MYSQL);
    }

    public static Table getTableByName(String table) {
        switch (table.toUpperCase()) {
            case "ACCESSTOKEN":
                return Tables.ACCESSTOKEN;
            case "CAR":
                return Tables.CAR;
            case "CARMANUFACTURE":
                return Tables.CARMANUFACTURE;
            case "CARMODEL":
                return Tables.CARMODEL;
            case "CITY":
                return Tables.CITY;
            case "COLLEGE":
                return Tables.COLLEGE;
            case "COUNTRY":
                return Tables.COUNTRY;
            case "DRIVER":
                return Tables.DRIVER;
            case "MEMBER":
                return Tables.MEMBER;
            case "MEMBERCARD":
                return Tables.MEMBERCARD;
            case "MEMBERGROUP":
                return Tables.MEMBERGROUP;
            case "MEMBERSAVEDADDRESS":
                return Tables.MEMBERSAVEDADDRESS;
            case "REVIEW":
                return Tables.REVIEW;
            case "RIDE":
                return Tables.RIDE;
            case "SITECONTENT":
                return Tables.SITECONTENT;
            case "SITECONTENTGROUP":
                return Tables.SITECONTENTGROUP;
            case "SITEOPTION":
                return Tables.SITEOPTION;
            case "UNIVERSITY":
                return Tables.UNIVERSITY;
            case "UNIVERSITYPAGECONTENT":
                return Tables.UNIVERSITYPAGECONTENT;
        }
        return null;
    }

    public static Class getClassByName(String table) {
        switch (table.toUpperCase()) {
            case "ACCESSTOKEN":
                return Accesstoken.class;
            case "CAR":
                return Car.class;
            case "CARMANUFACTURE":
                return Carmanufacture.class;
            case "CARMODEL":
                return Carmodel.class;
            case "CITY":
                return City.class;
            case "COLLEGE":
                return College.class;
            case "COUNTRY":
                return Country.class;
            case "DRIVER":
                return Driver.class;
            case "MEMBER":
                return Member.class;
            case "MEMBERCARD":
                return Membercard.class;
            case "MEMBERGROUP":
                return Membergroup.class;
            case "MEMBERSAVEDADDRESS":
                return Membersavedaddress.class;
            case "REVIEW":
                return Review.class;
            case "RIDE":
                return Ride.class;
            case "SITECONTENT":
                return Sitecontent.class;
            case "SITECONTENTGROUP":
                return Sitecontentgroup.class;
            case "SITEOPTION":
                return Siteoption.class;
            case "UNIVERSITY":
                return University.class;
            case "UNIVERSITYPAGECONTENT":
                return Universitypagecontent.class;
        }
        return null;
    }
    public static Field[] getSelectFieldsByName(String table) {
        switch (table.toUpperCase()) {
            case "ACCESSTOKEN":
                return Tables.ACCESSTOKEN.fields();
            case "CAR":
                return Tables.CAR.fields();
            case "CARMANUFACTURE":
                return Tables.CARMANUFACTURE.fields();
            case "CARMODEL":
                return Tables.CARMODEL.fields();
            case "CITY":
                return Tables.CITY.fields();
            case "COLLEGE":
                return Tables.COLLEGE.fields();
            case "COUNTRY":
                return Tables.COUNTRY.fields();
            case "DRIVER":
                return Tables.DRIVER.fields();
            case "MEMBER":
                return new Field<?>[]{Tables.MEMBER.ID,Tables.MEMBER.NAME,Tables.MEMBER.STUDENTEMAIL};
            case "MEMBERCARD":
                return Tables.MEMBERCARD.fields();
            case "MEMBERGROUP":
                return Tables.MEMBERGROUP.fields();
            case "MEMBERSAVEDADDRESS":
                return Tables.MEMBERSAVEDADDRESS.fields();
            case "REVIEW":
                return Tables.REVIEW.fields();
            case "RIDE":
                return Tables.RIDE.fields();
            case "SITECONTENT":
                return Tables.SITECONTENT.fields();
            case "SITECONTENTGROUP":
                return Tables.SITECONTENTGROUP.fields();
            case "SITEOPTION":
                return Tables.SITEOPTION.fields();
            case "UNIVERSITY":
                return Tables.UNIVERSITY.fields();
            case "UNIVERSITYPAGECONTENT":
                return Tables.UNIVERSITYPAGECONTENT.fields();
            case "DISPATCH":
                return new Field<?>[]{Tables.MEMBER.ID,Tables.MEMBER.NAME,Tables.MEMBER.USERNAME,Tables.MEMBER.PIC,Tables.MEMBER.LONGITUDE,Tables.MEMBER.LATITUDE,Tables.CAR.DISTLATITUDE,Tables.CAR.DISTLONGITUDE,Tables.CAR.CARMODELID,Tables.CAR.AVAILABLESEATS,Tables.CAR.FRONTPIC};
            case "UNIVERSITYPAGECONTENTJOIN":
                return new Field<?>[]{Tables.UNIVERSITY.NAME,Tables.UNIVERSITY.PIC,Tables.UNIVERSITYPAGECONTENT.TITLE,Tables.UNIVERSITYPAGECONTENT.TIMESTAMP,Tables.UNIVERSITYPAGECONTENT.BODY,Tables.UNIVERSITYPAGECONTENT.DESCRIPTION,Tables.UNIVERSITYPAGECONTENT.KEYWORDS};
        }
        return null;
    }
    public static UpdatableRecord getRecordByName(String table) {
        switch (table.toUpperCase()) {
            case "ACCESSTOKEN":
                return new AccesstokenRecord();
            case "CAR":
                return new CarRecord();
            case "CARMANUFACTURE":
                return new CarmanufactureRecord();
            case "CARMODEL":
                return new CarmodelRecord();
            case "CITY":
                return new CityRecord();
            case "COLLEGE":
                return new CollegeRecord();
            case "COUNTRY":
                return new CountryRecord();
            case "DRIVER":
                return new DriverRecord();
            case "MEMBER":
                return new MemberRecord();
            case "MEMBERCARD":
                return new MembercardRecord();
            case "MEMBERGROUP":
                return new MembergroupRecord();
            case "MEMBERSAVEDADDRESS":
                return new MembersavedaddressRecord();
            case "REVIEW":
                return new ReviewRecord();
            case "RIDE":
                return new RideRecord();
            case "SITECONTENT":
                return new SitecontentRecord();
            case "SITECONTENTGROUP":
                return new SitecontentgroupRecord();
            case "SITEOPTION":
                return new SiteoptionRecord();
            case "UNIVERSITY":
                return new UniversityRecord();
            case "UNIVERSITYPAGECONTENT":
                return new UniversitypagecontentRecord();
        }
        return null;
    }


    public List<Map<String, Object>> dispatch(String memberID, String distLongitude, String distLatitude, String longitude, String latitude)throws SQLException {
                return getDslContext().select(getSelectFieldsByName("dispatch")).from(Tables.CAR.join(Tables.DRIVER).on(Tables.CAR.DRIVERID.equal(Tables.DRIVER.ID)).join(Tables.MEMBER).on(Tables.MEMBER.ID.equal(Tables.DRIVER.MEMBERID))).where(
                " ( 3956 *2 * ASIN( SQRT( POWER( SIN( (\n" +
                "? - ABS( Car.DistLatitude ) ) * PI( ) /180 /2 ) , 2 ) + COS( ? * PI( ) /180 ) * COS( ABS( Car.DistLatitude ) * PI( ) /180 ) * POWER( SIN( (\n" +
                "? - Car.DistLongitude\n" +
                ") * PI( ) /180 /2 ) , 2 ) ) )\n" +
                ") < 5.0 \n" +
                "AND ( 3956 *2 * ASIN( SQRT( POWER( SIN( (\n" +
                "? - ABS( Member.latitude ) ) * PI( ) /180 /2 ) , 2 ) + COS( ? * PI( ) /180 ) * COS( ABS( Member.latitude ) * PI( ) /180 ) * POWER( SIN( (\n" +
                "? - Member.longitude\n" +
                ") * PI( ) /180 /2 ) , 2 ) ) )\n" +
                ") < 5.0 \n" +
                "AND Member.ID !=?",distLatitude,distLatitude,distLongitude,latitude,latitude,longitude,memberID).fetchMaps();
    }

    public Map<String, Object> getUniversityContentPage(String pageSubdomain, String link)throws SQLException {
        return getDslContext().select(getSelectFieldsByName("UNIVERSITYPAGECONTENTJOIN")).from(Tables.UNIVERSITY).join(Tables.UNIVERSITYPAGECONTENT).on(Tables.UNIVERSITY.ID.equal(Tables.UNIVERSITYPAGECONTENT.UNIVERSITYID)).where(Tables.UNIVERSITY.PAGESUBDOMAIN.equal(pageSubdomain)).and(Tables.UNIVERSITYPAGECONTENT.LINK.equal(link)).fetchOneMap();

    }
}