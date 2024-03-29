/**
 * This class is generated by jOOQ
 */
package models.garaDB;


import models.garaDB.tables.Accesstoken;
import models.garaDB.tables.Car;
import models.garaDB.tables.Carmanufacture;
import models.garaDB.tables.Carmodel;
import models.garaDB.tables.City;
import models.garaDB.tables.College;
import models.garaDB.tables.Country;
import models.garaDB.tables.Databasechangeloglock;
import models.garaDB.tables.Driver;
import models.garaDB.tables.Member;
import models.garaDB.tables.Membercard;
import models.garaDB.tables.Membergroup;
import models.garaDB.tables.Membermessage;
import models.garaDB.tables.Membersavedaddress;
import models.garaDB.tables.Review;
import models.garaDB.tables.Ride;
import models.garaDB.tables.Sitecontent;
import models.garaDB.tables.Sitecontentgroup;
import models.garaDB.tables.Siteoption;
import models.garaDB.tables.University;
import models.garaDB.tables.Universitypagecontent;
import models.garaDB.tables.records.AccesstokenRecord;
import models.garaDB.tables.records.CarRecord;
import models.garaDB.tables.records.CarmanufactureRecord;
import models.garaDB.tables.records.CarmodelRecord;
import models.garaDB.tables.records.CityRecord;
import models.garaDB.tables.records.CollegeRecord;
import models.garaDB.tables.records.CountryRecord;
import models.garaDB.tables.records.DatabasechangeloglockRecord;
import models.garaDB.tables.records.DriverRecord;
import models.garaDB.tables.records.MemberRecord;
import models.garaDB.tables.records.MembercardRecord;
import models.garaDB.tables.records.MembergroupRecord;
import models.garaDB.tables.records.MembermessageRecord;
import models.garaDB.tables.records.MembersavedaddressRecord;
import models.garaDB.tables.records.ReviewRecord;
import models.garaDB.tables.records.RideRecord;
import models.garaDB.tables.records.SitecontentRecord;
import models.garaDB.tables.records.SitecontentgroupRecord;
import models.garaDB.tables.records.SiteoptionRecord;
import models.garaDB.tables.records.UniversityRecord;
import models.garaDB.tables.records.UniversitypagecontentRecord;

import javax.annotation.Generated;

import org.jooq.ForeignKey;
import org.jooq.Identity;
import org.jooq.UniqueKey;
import org.jooq.impl.AbstractKeys;


/**
 * A class modelling foreign key relationships between tables of the <code>gara</code> 
 * schema
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.8.0"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Keys {

    // -------------------------------------------------------------------------
    // IDENTITY definitions
    // -------------------------------------------------------------------------

    public static final Identity<AccesstokenRecord, Integer> IDENTITY_ACCESSTOKEN = Identities0.IDENTITY_ACCESSTOKEN;
    public static final Identity<CarRecord, Integer> IDENTITY_CAR = Identities0.IDENTITY_CAR;
    public static final Identity<CarmanufactureRecord, Integer> IDENTITY_CARMANUFACTURE = Identities0.IDENTITY_CARMANUFACTURE;
    public static final Identity<CarmodelRecord, Integer> IDENTITY_CARMODEL = Identities0.IDENTITY_CARMODEL;
    public static final Identity<CityRecord, Integer> IDENTITY_CITY = Identities0.IDENTITY_CITY;
    public static final Identity<CollegeRecord, Integer> IDENTITY_COLLEGE = Identities0.IDENTITY_COLLEGE;
    public static final Identity<CountryRecord, Integer> IDENTITY_COUNTRY = Identities0.IDENTITY_COUNTRY;
    public static final Identity<DriverRecord, Integer> IDENTITY_DRIVER = Identities0.IDENTITY_DRIVER;
    public static final Identity<MemberRecord, Integer> IDENTITY_MEMBER = Identities0.IDENTITY_MEMBER;
    public static final Identity<MembercardRecord, Integer> IDENTITY_MEMBERCARD = Identities0.IDENTITY_MEMBERCARD;
    public static final Identity<MembergroupRecord, Integer> IDENTITY_MEMBERGROUP = Identities0.IDENTITY_MEMBERGROUP;
    public static final Identity<MembermessageRecord, Integer> IDENTITY_MEMBERMESSAGE = Identities0.IDENTITY_MEMBERMESSAGE;
    public static final Identity<MembersavedaddressRecord, Integer> IDENTITY_MEMBERSAVEDADDRESS = Identities0.IDENTITY_MEMBERSAVEDADDRESS;
    public static final Identity<ReviewRecord, Integer> IDENTITY_REVIEW = Identities0.IDENTITY_REVIEW;
    public static final Identity<RideRecord, Integer> IDENTITY_RIDE = Identities0.IDENTITY_RIDE;
    public static final Identity<SitecontentRecord, Integer> IDENTITY_SITECONTENT = Identities0.IDENTITY_SITECONTENT;
    public static final Identity<SitecontentgroupRecord, Integer> IDENTITY_SITECONTENTGROUP = Identities0.IDENTITY_SITECONTENTGROUP;
    public static final Identity<SiteoptionRecord, Integer> IDENTITY_SITEOPTION = Identities0.IDENTITY_SITEOPTION;
    public static final Identity<UniversityRecord, Integer> IDENTITY_UNIVERSITY = Identities0.IDENTITY_UNIVERSITY;
    public static final Identity<UniversitypagecontentRecord, Integer> IDENTITY_UNIVERSITYPAGECONTENT = Identities0.IDENTITY_UNIVERSITYPAGECONTENT;

    // -------------------------------------------------------------------------
    // UNIQUE and PRIMARY KEY definitions
    // -------------------------------------------------------------------------

    public static final UniqueKey<AccesstokenRecord> KEY_ACCESSTOKEN_PRIMARY = UniqueKeys0.KEY_ACCESSTOKEN_PRIMARY;
    public static final UniqueKey<CarRecord> KEY_CAR_PRIMARY = UniqueKeys0.KEY_CAR_PRIMARY;
    public static final UniqueKey<CarmanufactureRecord> KEY_CARMANUFACTURE_PRIMARY = UniqueKeys0.KEY_CARMANUFACTURE_PRIMARY;
    public static final UniqueKey<CarmodelRecord> KEY_CARMODEL_PRIMARY = UniqueKeys0.KEY_CARMODEL_PRIMARY;
    public static final UniqueKey<CityRecord> KEY_CITY_PRIMARY = UniqueKeys0.KEY_CITY_PRIMARY;
    public static final UniqueKey<CollegeRecord> KEY_COLLEGE_PRIMARY = UniqueKeys0.KEY_COLLEGE_PRIMARY;
    public static final UniqueKey<CountryRecord> KEY_COUNTRY_PRIMARY = UniqueKeys0.KEY_COUNTRY_PRIMARY;
    public static final UniqueKey<DatabasechangeloglockRecord> KEY_DATABASECHANGELOGLOCK_PRIMARY = UniqueKeys0.KEY_DATABASECHANGELOGLOCK_PRIMARY;
    public static final UniqueKey<DriverRecord> KEY_DRIVER_PRIMARY = UniqueKeys0.KEY_DRIVER_PRIMARY;
    public static final UniqueKey<MemberRecord> KEY_MEMBER_PRIMARY = UniqueKeys0.KEY_MEMBER_PRIMARY;
    public static final UniqueKey<MembercardRecord> KEY_MEMBERCARD_PRIMARY = UniqueKeys0.KEY_MEMBERCARD_PRIMARY;
    public static final UniqueKey<MembergroupRecord> KEY_MEMBERGROUP_PRIMARY = UniqueKeys0.KEY_MEMBERGROUP_PRIMARY;
    public static final UniqueKey<MembermessageRecord> KEY_MEMBERMESSAGE_PRIMARY = UniqueKeys0.KEY_MEMBERMESSAGE_PRIMARY;
    public static final UniqueKey<MembersavedaddressRecord> KEY_MEMBERSAVEDADDRESS_PRIMARY = UniqueKeys0.KEY_MEMBERSAVEDADDRESS_PRIMARY;
    public static final UniqueKey<ReviewRecord> KEY_REVIEW_PRIMARY = UniqueKeys0.KEY_REVIEW_PRIMARY;
    public static final UniqueKey<RideRecord> KEY_RIDE_PRIMARY = UniqueKeys0.KEY_RIDE_PRIMARY;
    public static final UniqueKey<SitecontentRecord> KEY_SITECONTENT_PRIMARY = UniqueKeys0.KEY_SITECONTENT_PRIMARY;
    public static final UniqueKey<SitecontentgroupRecord> KEY_SITECONTENTGROUP_PRIMARY = UniqueKeys0.KEY_SITECONTENTGROUP_PRIMARY;
    public static final UniqueKey<SiteoptionRecord> KEY_SITEOPTION_PRIMARY = UniqueKeys0.KEY_SITEOPTION_PRIMARY;
    public static final UniqueKey<UniversityRecord> KEY_UNIVERSITY_PRIMARY = UniqueKeys0.KEY_UNIVERSITY_PRIMARY;
    public static final UniqueKey<UniversitypagecontentRecord> KEY_UNIVERSITYPAGECONTENT_PRIMARY = UniqueKeys0.KEY_UNIVERSITYPAGECONTENT_PRIMARY;

    // -------------------------------------------------------------------------
    // FOREIGN KEY definitions
    // -------------------------------------------------------------------------

    public static final ForeignKey<AccesstokenRecord, MemberRecord> FKACCESSTOKE162691 = ForeignKeys0.FKACCESSTOKE162691;
    public static final ForeignKey<CarRecord, DriverRecord> FKCAR115659 = ForeignKeys0.FKCAR115659;
    public static final ForeignKey<CarRecord, CarmodelRecord> FKCAR838891 = ForeignKeys0.FKCAR838891;
    public static final ForeignKey<CarmanufactureRecord, CountryRecord> FKCARMANUFAC421407 = ForeignKeys0.FKCARMANUFAC421407;
    public static final ForeignKey<CarmodelRecord, CarmanufactureRecord> FKCARMODEL191241 = ForeignKeys0.FKCARMODEL191241;
    public static final ForeignKey<CityRecord, CountryRecord> FKCITY728752 = ForeignKeys0.FKCITY728752;
    public static final ForeignKey<CollegeRecord, UniversityRecord> FKCOLLEGE525618 = ForeignKeys0.FKCOLLEGE525618;
    public static final ForeignKey<DriverRecord, MemberRecord> FKDRIVER32250 = ForeignKeys0.FKDRIVER32250;
    public static final ForeignKey<MemberRecord, CollegeRecord> FKMEMBER175873 = ForeignKeys0.FKMEMBER175873;
    public static final ForeignKey<MemberRecord, MembergroupRecord> FKMEMBER861549 = ForeignKeys0.FKMEMBER861549;
    public static final ForeignKey<MemberRecord, UniversityRecord> FKMEMBER491900 = ForeignKeys0.FKMEMBER491900;
    public static final ForeignKey<MembercardRecord, MemberRecord> FKMEMBERCARD555539 = ForeignKeys0.FKMEMBERCARD555539;
    public static final ForeignKey<MembermessageRecord, MemberRecord> FKMEMBERMESS962617 = ForeignKeys0.FKMEMBERMESS962617;
    public static final ForeignKey<MembermessageRecord, MemberRecord> FKMEMBERMESS110700 = ForeignKeys0.FKMEMBERMESS110700;
    public static final ForeignKey<MembersavedaddressRecord, MemberRecord> FKMEMBERSAVE41459 = ForeignKeys0.FKMEMBERSAVE41459;
    public static final ForeignKey<ReviewRecord, MemberRecord> FKREVIEW627031 = ForeignKeys0.FKREVIEW627031;
    public static final ForeignKey<ReviewRecord, MemberRecord> FKREVIEW185272 = ForeignKeys0.FKREVIEW185272;
    public static final ForeignKey<RideRecord, CarRecord> FKRIDE47095 = ForeignKeys0.FKRIDE47095;
    public static final ForeignKey<RideRecord, MemberRecord> FKRIDE175896 = ForeignKeys0.FKRIDE175896;
    public static final ForeignKey<UniversityRecord, CityRecord> FKUNIVERSITY759378 = ForeignKeys0.FKUNIVERSITY759378;
    public static final ForeignKey<UniversitypagecontentRecord, UniversityRecord> FKUNIVERSITY451983 = ForeignKeys0.FKUNIVERSITY451983;

    // -------------------------------------------------------------------------
    // [#1459] distribute members to avoid static initialisers > 64kb
    // -------------------------------------------------------------------------

    private static class Identities0 extends AbstractKeys {
        public static Identity<AccesstokenRecord, Integer> IDENTITY_ACCESSTOKEN = createIdentity(Accesstoken.ACCESSTOKEN, Accesstoken.ACCESSTOKEN.ID);
        public static Identity<CarRecord, Integer> IDENTITY_CAR = createIdentity(Car.CAR, Car.CAR.ID);
        public static Identity<CarmanufactureRecord, Integer> IDENTITY_CARMANUFACTURE = createIdentity(Carmanufacture.CARMANUFACTURE, Carmanufacture.CARMANUFACTURE.ID);
        public static Identity<CarmodelRecord, Integer> IDENTITY_CARMODEL = createIdentity(Carmodel.CARMODEL, Carmodel.CARMODEL.ID);
        public static Identity<CityRecord, Integer> IDENTITY_CITY = createIdentity(City.CITY, City.CITY.ID);
        public static Identity<CollegeRecord, Integer> IDENTITY_COLLEGE = createIdentity(College.COLLEGE, College.COLLEGE.ID);
        public static Identity<CountryRecord, Integer> IDENTITY_COUNTRY = createIdentity(Country.COUNTRY, Country.COUNTRY.ID);
        public static Identity<DriverRecord, Integer> IDENTITY_DRIVER = createIdentity(Driver.DRIVER, Driver.DRIVER.ID);
        public static Identity<MemberRecord, Integer> IDENTITY_MEMBER = createIdentity(Member.MEMBER, Member.MEMBER.ID);
        public static Identity<MembercardRecord, Integer> IDENTITY_MEMBERCARD = createIdentity(Membercard.MEMBERCARD, Membercard.MEMBERCARD.ID);
        public static Identity<MembergroupRecord, Integer> IDENTITY_MEMBERGROUP = createIdentity(Membergroup.MEMBERGROUP, Membergroup.MEMBERGROUP.ID);
        public static Identity<MembermessageRecord, Integer> IDENTITY_MEMBERMESSAGE = createIdentity(Membermessage.MEMBERMESSAGE, Membermessage.MEMBERMESSAGE.ID);
        public static Identity<MembersavedaddressRecord, Integer> IDENTITY_MEMBERSAVEDADDRESS = createIdentity(Membersavedaddress.MEMBERSAVEDADDRESS, Membersavedaddress.MEMBERSAVEDADDRESS.ID);
        public static Identity<ReviewRecord, Integer> IDENTITY_REVIEW = createIdentity(Review.REVIEW, Review.REVIEW.ID);
        public static Identity<RideRecord, Integer> IDENTITY_RIDE = createIdentity(Ride.RIDE, Ride.RIDE.ID);
        public static Identity<SitecontentRecord, Integer> IDENTITY_SITECONTENT = createIdentity(Sitecontent.SITECONTENT, Sitecontent.SITECONTENT.ID);
        public static Identity<SitecontentgroupRecord, Integer> IDENTITY_SITECONTENTGROUP = createIdentity(Sitecontentgroup.SITECONTENTGROUP, Sitecontentgroup.SITECONTENTGROUP.ID);
        public static Identity<SiteoptionRecord, Integer> IDENTITY_SITEOPTION = createIdentity(Siteoption.SITEOPTION, Siteoption.SITEOPTION.ID);
        public static Identity<UniversityRecord, Integer> IDENTITY_UNIVERSITY = createIdentity(University.UNIVERSITY, University.UNIVERSITY.ID);
        public static Identity<UniversitypagecontentRecord, Integer> IDENTITY_UNIVERSITYPAGECONTENT = createIdentity(Universitypagecontent.UNIVERSITYPAGECONTENT, Universitypagecontent.UNIVERSITYPAGECONTENT.ID);
    }

    private static class UniqueKeys0 extends AbstractKeys {
        public static final UniqueKey<AccesstokenRecord> KEY_ACCESSTOKEN_PRIMARY = createUniqueKey(Accesstoken.ACCESSTOKEN, "KEY_AccessToken_PRIMARY", Accesstoken.ACCESSTOKEN.ID);
        public static final UniqueKey<CarRecord> KEY_CAR_PRIMARY = createUniqueKey(Car.CAR, "KEY_Car_PRIMARY", Car.CAR.ID);
        public static final UniqueKey<CarmanufactureRecord> KEY_CARMANUFACTURE_PRIMARY = createUniqueKey(Carmanufacture.CARMANUFACTURE, "KEY_CarManufacture_PRIMARY", Carmanufacture.CARMANUFACTURE.ID);
        public static final UniqueKey<CarmodelRecord> KEY_CARMODEL_PRIMARY = createUniqueKey(Carmodel.CARMODEL, "KEY_CarModel_PRIMARY", Carmodel.CARMODEL.ID);
        public static final UniqueKey<CityRecord> KEY_CITY_PRIMARY = createUniqueKey(City.CITY, "KEY_City_PRIMARY", City.CITY.ID);
        public static final UniqueKey<CollegeRecord> KEY_COLLEGE_PRIMARY = createUniqueKey(College.COLLEGE, "KEY_College_PRIMARY", College.COLLEGE.ID);
        public static final UniqueKey<CountryRecord> KEY_COUNTRY_PRIMARY = createUniqueKey(Country.COUNTRY, "KEY_Country_PRIMARY", Country.COUNTRY.ID);
        public static final UniqueKey<DatabasechangeloglockRecord> KEY_DATABASECHANGELOGLOCK_PRIMARY = createUniqueKey(Databasechangeloglock.DATABASECHANGELOGLOCK, "KEY_DATABASECHANGELOGLOCK_PRIMARY", Databasechangeloglock.DATABASECHANGELOGLOCK.ID);
        public static final UniqueKey<DriverRecord> KEY_DRIVER_PRIMARY = createUniqueKey(Driver.DRIVER, "KEY_Driver_PRIMARY", Driver.DRIVER.ID);
        public static final UniqueKey<MemberRecord> KEY_MEMBER_PRIMARY = createUniqueKey(Member.MEMBER, "KEY_Member_PRIMARY", Member.MEMBER.ID);
        public static final UniqueKey<MembercardRecord> KEY_MEMBERCARD_PRIMARY = createUniqueKey(Membercard.MEMBERCARD, "KEY_MemberCard_PRIMARY", Membercard.MEMBERCARD.ID);
        public static final UniqueKey<MembergroupRecord> KEY_MEMBERGROUP_PRIMARY = createUniqueKey(Membergroup.MEMBERGROUP, "KEY_MemberGroup_PRIMARY", Membergroup.MEMBERGROUP.ID);
        public static final UniqueKey<MembermessageRecord> KEY_MEMBERMESSAGE_PRIMARY = createUniqueKey(Membermessage.MEMBERMESSAGE, "KEY_MemberMessage_PRIMARY", Membermessage.MEMBERMESSAGE.ID);
        public static final UniqueKey<MembersavedaddressRecord> KEY_MEMBERSAVEDADDRESS_PRIMARY = createUniqueKey(Membersavedaddress.MEMBERSAVEDADDRESS, "KEY_MemberSavedAddress_PRIMARY", Membersavedaddress.MEMBERSAVEDADDRESS.ID);
        public static final UniqueKey<ReviewRecord> KEY_REVIEW_PRIMARY = createUniqueKey(Review.REVIEW, "KEY_Review_PRIMARY", Review.REVIEW.ID);
        public static final UniqueKey<RideRecord> KEY_RIDE_PRIMARY = createUniqueKey(Ride.RIDE, "KEY_Ride_PRIMARY", Ride.RIDE.ID);
        public static final UniqueKey<SitecontentRecord> KEY_SITECONTENT_PRIMARY = createUniqueKey(Sitecontent.SITECONTENT, "KEY_SiteContent_PRIMARY", Sitecontent.SITECONTENT.ID);
        public static final UniqueKey<SitecontentgroupRecord> KEY_SITECONTENTGROUP_PRIMARY = createUniqueKey(Sitecontentgroup.SITECONTENTGROUP, "KEY_SiteContentGroup_PRIMARY", Sitecontentgroup.SITECONTENTGROUP.ID);
        public static final UniqueKey<SiteoptionRecord> KEY_SITEOPTION_PRIMARY = createUniqueKey(Siteoption.SITEOPTION, "KEY_SiteOption_PRIMARY", Siteoption.SITEOPTION.ID);
        public static final UniqueKey<UniversityRecord> KEY_UNIVERSITY_PRIMARY = createUniqueKey(University.UNIVERSITY, "KEY_University_PRIMARY", University.UNIVERSITY.ID);
        public static final UniqueKey<UniversitypagecontentRecord> KEY_UNIVERSITYPAGECONTENT_PRIMARY = createUniqueKey(Universitypagecontent.UNIVERSITYPAGECONTENT, "KEY_UniversityPageContent_PRIMARY", Universitypagecontent.UNIVERSITYPAGECONTENT.ID);
    }

    private static class ForeignKeys0 extends AbstractKeys {
        public static final ForeignKey<AccesstokenRecord, MemberRecord> FKACCESSTOKE162691 = createForeignKey(models.garaDB.Keys.KEY_MEMBER_PRIMARY, Accesstoken.ACCESSTOKEN, "FKAccessToke162691", Accesstoken.ACCESSTOKEN.MEMBERID);
        public static final ForeignKey<CarRecord, DriverRecord> FKCAR115659 = createForeignKey(models.garaDB.Keys.KEY_DRIVER_PRIMARY, Car.CAR, "FKCar115659", Car.CAR.DRIVERID);
        public static final ForeignKey<CarRecord, CarmodelRecord> FKCAR838891 = createForeignKey(models.garaDB.Keys.KEY_CARMODEL_PRIMARY, Car.CAR, "FKCar838891", Car.CAR.CARMODELID);
        public static final ForeignKey<CarmanufactureRecord, CountryRecord> FKCARMANUFAC421407 = createForeignKey(models.garaDB.Keys.KEY_COUNTRY_PRIMARY, Carmanufacture.CARMANUFACTURE, "FKCarManufac421407", Carmanufacture.CARMANUFACTURE.COUNTRYID);
        public static final ForeignKey<CarmodelRecord, CarmanufactureRecord> FKCARMODEL191241 = createForeignKey(models.garaDB.Keys.KEY_CARMANUFACTURE_PRIMARY, Carmodel.CARMODEL, "FKCarModel191241", Carmodel.CARMODEL.CARMANUFACTUREID);
        public static final ForeignKey<CityRecord, CountryRecord> FKCITY728752 = createForeignKey(models.garaDB.Keys.KEY_COUNTRY_PRIMARY, City.CITY, "FKCity728752", City.CITY.COUNTRYID);
        public static final ForeignKey<CollegeRecord, UniversityRecord> FKCOLLEGE525618 = createForeignKey(models.garaDB.Keys.KEY_UNIVERSITY_PRIMARY, College.COLLEGE, "FKCollege525618", College.COLLEGE.UNIVERSITYID);
        public static final ForeignKey<DriverRecord, MemberRecord> FKDRIVER32250 = createForeignKey(models.garaDB.Keys.KEY_MEMBER_PRIMARY, Driver.DRIVER, "FKDriver32250", Driver.DRIVER.MEMBERID);
        public static final ForeignKey<MemberRecord, CollegeRecord> FKMEMBER175873 = createForeignKey(models.garaDB.Keys.KEY_COLLEGE_PRIMARY, Member.MEMBER, "FKMember175873", Member.MEMBER.COLLEGEID);
        public static final ForeignKey<MemberRecord, MembergroupRecord> FKMEMBER861549 = createForeignKey(models.garaDB.Keys.KEY_MEMBERGROUP_PRIMARY, Member.MEMBER, "FKMember861549", Member.MEMBER.MEMBERGROUPID);
        public static final ForeignKey<MemberRecord, UniversityRecord> FKMEMBER491900 = createForeignKey(models.garaDB.Keys.KEY_UNIVERSITY_PRIMARY, Member.MEMBER, "FKMember491900", Member.MEMBER.UNIVERSITYID);
        public static final ForeignKey<MembercardRecord, MemberRecord> FKMEMBERCARD555539 = createForeignKey(models.garaDB.Keys.KEY_MEMBER_PRIMARY, Membercard.MEMBERCARD, "FKMemberCard555539", Membercard.MEMBERCARD.MEMBERID);
        public static final ForeignKey<MembermessageRecord, MemberRecord> FKMEMBERMESS962617 = createForeignKey(models.garaDB.Keys.KEY_MEMBER_PRIMARY, Membermessage.MEMBERMESSAGE, "FKMemberMess962617", Membermessage.MEMBERMESSAGE.FROM);
        public static final ForeignKey<MembermessageRecord, MemberRecord> FKMEMBERMESS110700 = createForeignKey(models.garaDB.Keys.KEY_MEMBER_PRIMARY, Membermessage.MEMBERMESSAGE, "FKMemberMess110700", Membermessage.MEMBERMESSAGE.TO);
        public static final ForeignKey<MembersavedaddressRecord, MemberRecord> FKMEMBERSAVE41459 = createForeignKey(models.garaDB.Keys.KEY_MEMBER_PRIMARY, Membersavedaddress.MEMBERSAVEDADDRESS, "FKMemberSave41459", Membersavedaddress.MEMBERSAVEDADDRESS.MEMBERID);
        public static final ForeignKey<ReviewRecord, MemberRecord> FKREVIEW627031 = createForeignKey(models.garaDB.Keys.KEY_MEMBER_PRIMARY, Review.REVIEW, "FKReview627031", Review.REVIEW.REVIEWERMEMBERID);
        public static final ForeignKey<ReviewRecord, MemberRecord> FKREVIEW185272 = createForeignKey(models.garaDB.Keys.KEY_MEMBER_PRIMARY, Review.REVIEW, "FKReview185272", Review.REVIEW.REVIEWEDMEMBERID);
        public static final ForeignKey<RideRecord, CarRecord> FKRIDE47095 = createForeignKey(models.garaDB.Keys.KEY_CAR_PRIMARY, Ride.RIDE, "FKRide47095", Ride.RIDE.CARID);
        public static final ForeignKey<RideRecord, MemberRecord> FKRIDE175896 = createForeignKey(models.garaDB.Keys.KEY_MEMBER_PRIMARY, Ride.RIDE, "FKRide175896", Ride.RIDE.MEMBERID);
        public static final ForeignKey<UniversityRecord, CityRecord> FKUNIVERSITY759378 = createForeignKey(models.garaDB.Keys.KEY_CITY_PRIMARY, University.UNIVERSITY, "FKUniversity759378", University.UNIVERSITY.CITYID);
        public static final ForeignKey<UniversitypagecontentRecord, UniversityRecord> FKUNIVERSITY451983 = createForeignKey(models.garaDB.Keys.KEY_UNIVERSITY_PRIMARY, Universitypagecontent.UNIVERSITYPAGECONTENT, "FKUniversity451983", Universitypagecontent.UNIVERSITYPAGECONTENT.UNIVERSITYID);
    }
}
