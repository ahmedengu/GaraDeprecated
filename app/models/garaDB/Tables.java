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
import models.garaDB.tables.Databasechangelog;
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

import javax.annotation.Generated;


/**
 * Convenience access to all tables in gara
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.8.0"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Tables {

    /**
     * The table <code>gara.AccessToken</code>.
     */
    public static final Accesstoken ACCESSTOKEN = models.garaDB.tables.Accesstoken.ACCESSTOKEN;

    /**
     * The table <code>gara.Car</code>.
     */
    public static final Car CAR = models.garaDB.tables.Car.CAR;

    /**
     * The table <code>gara.CarManufacture</code>.
     */
    public static final Carmanufacture CARMANUFACTURE = models.garaDB.tables.Carmanufacture.CARMANUFACTURE;

    /**
     * The table <code>gara.CarModel</code>.
     */
    public static final Carmodel CARMODEL = models.garaDB.tables.Carmodel.CARMODEL;

    /**
     * The table <code>gara.City</code>.
     */
    public static final City CITY = models.garaDB.tables.City.CITY;

    /**
     * The table <code>gara.College</code>.
     */
    public static final College COLLEGE = models.garaDB.tables.College.COLLEGE;

    /**
     * The table <code>gara.Country</code>.
     */
    public static final Country COUNTRY = models.garaDB.tables.Country.COUNTRY;

    /**
     * The table <code>gara.DATABASECHANGELOG</code>.
     */
    public static final Databasechangelog DATABASECHANGELOG = models.garaDB.tables.Databasechangelog.DATABASECHANGELOG;

    /**
     * The table <code>gara.DATABASECHANGELOGLOCK</code>.
     */
    public static final Databasechangeloglock DATABASECHANGELOGLOCK = models.garaDB.tables.Databasechangeloglock.DATABASECHANGELOGLOCK;

    /**
     * The table <code>gara.Driver</code>.
     */
    public static final Driver DRIVER = models.garaDB.tables.Driver.DRIVER;

    /**
     * The table <code>gara.Member</code>.
     */
    public static final Member MEMBER = models.garaDB.tables.Member.MEMBER;

    /**
     * The table <code>gara.MemberCard</code>.
     */
    public static final Membercard MEMBERCARD = models.garaDB.tables.Membercard.MEMBERCARD;

    /**
     * The table <code>gara.MemberGroup</code>.
     */
    public static final Membergroup MEMBERGROUP = models.garaDB.tables.Membergroup.MEMBERGROUP;

    /**
     * The table <code>gara.MemberMessage</code>.
     */
    public static final Membermessage MEMBERMESSAGE = models.garaDB.tables.Membermessage.MEMBERMESSAGE;

    /**
     * The table <code>gara.MemberSavedAddress</code>.
     */
    public static final Membersavedaddress MEMBERSAVEDADDRESS = models.garaDB.tables.Membersavedaddress.MEMBERSAVEDADDRESS;

    /**
     * The table <code>gara.Review</code>.
     */
    public static final Review REVIEW = models.garaDB.tables.Review.REVIEW;

    /**
     * The table <code>gara.Ride</code>.
     */
    public static final Ride RIDE = models.garaDB.tables.Ride.RIDE;

    /**
     * The table <code>gara.SiteContent</code>.
     */
    public static final Sitecontent SITECONTENT = models.garaDB.tables.Sitecontent.SITECONTENT;

    /**
     * The table <code>gara.SiteContentGroup</code>.
     */
    public static final Sitecontentgroup SITECONTENTGROUP = models.garaDB.tables.Sitecontentgroup.SITECONTENTGROUP;

    /**
     * The table <code>gara.SiteOption</code>.
     */
    public static final Siteoption SITEOPTION = models.garaDB.tables.Siteoption.SITEOPTION;

    /**
     * The table <code>gara.University</code>.
     */
    public static final University UNIVERSITY = models.garaDB.tables.University.UNIVERSITY;

    /**
     * The table <code>gara.UniversityPageContent</code>.
     */
    public static final Universitypagecontent UNIVERSITYPAGECONTENT = models.garaDB.tables.Universitypagecontent.UNIVERSITYPAGECONTENT;
}
