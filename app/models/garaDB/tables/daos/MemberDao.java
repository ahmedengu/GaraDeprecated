/**
 * This class is generated by jOOQ
 */
package models.garaDB.tables.daos;


import models.garaDB.tables.Member;
import models.garaDB.tables.records.MemberRecord;

import java.sql.Timestamp;
import java.util.List;

import javax.annotation.Generated;

import org.jooq.Configuration;
import org.jooq.impl.DAOImpl;


/**
 * This class is generated by jOOQ.
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.8.0"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class MemberDao extends DAOImpl<MemberRecord, models.garaDB.tables.pojos.Member, Integer> {

    /**
     * Create a new MemberDao without any configuration
     */
    public MemberDao() {
        super(Member.MEMBER, models.garaDB.tables.pojos.Member.class);
    }

    /**
     * Create a new MemberDao with an attached configuration
     */
    public MemberDao(Configuration configuration) {
        super(Member.MEMBER, models.garaDB.tables.pojos.Member.class, configuration);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    protected Integer getId(models.garaDB.tables.pojos.Member object) {
        return object.getId();
    }

    /**
     * Fetch records that have <code>ID IN (values)</code>
     */
    public List<models.garaDB.tables.pojos.Member> fetchById(Integer... values) {
        return fetch(Member.MEMBER.ID, values);
    }

    /**
     * Fetch a unique record that has <code>ID = value</code>
     */
    public models.garaDB.tables.pojos.Member fetchOneById(Integer value) {
        return fetchOne(Member.MEMBER.ID, value);
    }

    /**
     * Fetch records that have <code>TIMESTAMP IN (values)</code>
     */
    public List<models.garaDB.tables.pojos.Member> fetchByTimestamp(Timestamp... values) {
        return fetch(Member.MEMBER.TIMESTAMP, values);
    }

    /**
     * Fetch records that have <code>name IN (values)</code>
     */
    public List<models.garaDB.tables.pojos.Member> fetchByName(String... values) {
        return fetch(Member.MEMBER.NAME, values);
    }

    /**
     * Fetch records that have <code>username IN (values)</code>
     */
    public List<models.garaDB.tables.pojos.Member> fetchByUsername(String... values) {
        return fetch(Member.MEMBER.USERNAME, values);
    }

    /**
     * Fetch records that have <code>studentEmail IN (values)</code>
     */
    public List<models.garaDB.tables.pojos.Member> fetchByStudentemail(String... values) {
        return fetch(Member.MEMBER.STUDENTEMAIL, values);
    }

    /**
     * Fetch records that have <code>phoneNumber IN (values)</code>
     */
    public List<models.garaDB.tables.pojos.Member> fetchByPhonenumber(String... values) {
        return fetch(Member.MEMBER.PHONENUMBER, values);
    }

    /**
     * Fetch records that have <code>birthDate IN (values)</code>
     */
    public List<models.garaDB.tables.pojos.Member> fetchByBirthdate(Timestamp... values) {
        return fetch(Member.MEMBER.BIRTHDATE, values);
    }

    /**
     * Fetch records that have <code>activited IN (values)</code>
     */
    public List<models.garaDB.tables.pojos.Member> fetchByActivited(Integer... values) {
        return fetch(Member.MEMBER.ACTIVITED, values);
    }

    /**
     * Fetch records that have <code>gender IN (values)</code>
     */
    public List<models.garaDB.tables.pojos.Member> fetchByGender(String... values) {
        return fetch(Member.MEMBER.GENDER, values);
    }

    /**
     * Fetch records that have <code>password IN (values)</code>
     */
    public List<models.garaDB.tables.pojos.Member> fetchByPassword(String... values) {
        return fetch(Member.MEMBER.PASSWORD, values);
    }

    /**
     * Fetch records that have <code>collegeID IN (values)</code>
     */
    public List<models.garaDB.tables.pojos.Member> fetchByCollegeid(Integer... values) {
        return fetch(Member.MEMBER.COLLEGEID, values);
    }

    /**
     * Fetch records that have <code>pic IN (values)</code>
     */
    public List<models.garaDB.tables.pojos.Member> fetchByPic(String... values) {
        return fetch(Member.MEMBER.PIC, values);
    }

    /**
     * Fetch records that have <code>bloodType IN (values)</code>
     */
    public List<models.garaDB.tables.pojos.Member> fetchByBloodtype(String... values) {
        return fetch(Member.MEMBER.BLOODTYPE, values);
    }

    /**
     * Fetch records that have <code>emergencyNumber IN (values)</code>
     */
    public List<models.garaDB.tables.pojos.Member> fetchByEmergencynumber(String... values) {
        return fetch(Member.MEMBER.EMERGENCYNUMBER, values);
    }

    /**
     * Fetch records that have <code>balance IN (values)</code>
     */
    public List<models.garaDB.tables.pojos.Member> fetchByBalance(Integer... values) {
        return fetch(Member.MEMBER.BALANCE, values);
    }

    /**
     * Fetch records that have <code>studentEmailActivationCode IN (values)</code>
     */
    public List<models.garaDB.tables.pojos.Member> fetchByStudentemailactivationcode(String... values) {
        return fetch(Member.MEMBER.STUDENTEMAILACTIVATIONCODE, values);
    }

    /**
     * Fetch records that have <code>rideID IN (values)</code>
     */
    public List<models.garaDB.tables.pojos.Member> fetchByRideid(Integer... values) {
        return fetch(Member.MEMBER.RIDEID, values);
    }

    /**
     * Fetch records that have <code>memberGroupID IN (values)</code>
     */
    public List<models.garaDB.tables.pojos.Member> fetchByMembergroupid(Integer... values) {
        return fetch(Member.MEMBER.MEMBERGROUPID, values);
    }

    /**
     * Fetch records that have <code>longitude IN (values)</code>
     */
    public List<models.garaDB.tables.pojos.Member> fetchByLongitude(Double... values) {
        return fetch(Member.MEMBER.LONGITUDE, values);
    }

    /**
     * Fetch records that have <code>latitude IN (values)</code>
     */
    public List<models.garaDB.tables.pojos.Member> fetchByLatitude(Double... values) {
        return fetch(Member.MEMBER.LATITUDE, values);
    }

    /**
     * Fetch records that have <code>pin IN (values)</code>
     */
    public List<models.garaDB.tables.pojos.Member> fetchByPin(String... values) {
        return fetch(Member.MEMBER.PIN, values);
    }

    /**
     * Fetch records that have <code>universityID IN (values)</code>
     */
    public List<models.garaDB.tables.pojos.Member> fetchByUniversityid(Integer... values) {
        return fetch(Member.MEMBER.UNIVERSITYID, values);
    }
}
