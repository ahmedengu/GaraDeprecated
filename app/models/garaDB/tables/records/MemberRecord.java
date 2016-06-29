/**
 * This class is generated by jOOQ
 */
package models.garaDB.tables.records;


import models.garaDB.tables.Member;

import java.sql.Timestamp;

import javax.annotation.Generated;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record22;
import org.jooq.Row22;
import org.jooq.impl.UpdatableRecordImpl;


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
@Entity
@Table(name = "Member", schema = "gara")
public class MemberRecord extends UpdatableRecordImpl<MemberRecord> implements Record22<Integer, Timestamp, String, String, String, String, Timestamp, Integer, String, String, Integer, String, String, String, Integer, String, Integer, Double, Double, String, Integer, String> {

    private static final long serialVersionUID = 2020007189;

    /**
     * Setter for <code>gara.Member.ID</code>.
     */
    public void setId(Integer value) {
        set(0, value);
    }

    /**
     * Getter for <code>gara.Member.ID</code>.
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID", unique = true, nullable = false, precision = 10)
    public Integer getId() {
        return (Integer) get(0);
    }

    /**
     * Setter for <code>gara.Member.TIMESTAMP</code>.
     */
    public void setTimestamp(Timestamp value) {
        set(1, value);
    }

    /**
     * Getter for <code>gara.Member.TIMESTAMP</code>.
     */
    @Column(name = "TIMESTAMP", nullable = false)
    public Timestamp getTimestamp() {
        return (Timestamp) get(1);
    }

    /**
     * Setter for <code>gara.Member.name</code>.
     */
    public void setName(String value) {
        set(2, value);
    }

    /**
     * Getter for <code>gara.Member.name</code>.
     */
    @Column(name = "name", nullable = false, length = 65535)
    @NotNull
    @Size(max = 65535)
    public String getName() {
        return (String) get(2);
    }

    /**
     * Setter for <code>gara.Member.username</code>.
     */
    public void setUsername(String value) {
        set(3, value);
    }

    /**
     * Getter for <code>gara.Member.username</code>.
     */
    @Column(name = "username", nullable = false, length = 65535)
    @NotNull
    @Size(max = 65535)
    public String getUsername() {
        return (String) get(3);
    }

    /**
     * Setter for <code>gara.Member.studentEmail</code>.
     */
    public void setStudentemail(String value) {
        set(4, value);
    }

    /**
     * Getter for <code>gara.Member.studentEmail</code>.
     */
    @Column(name = "studentEmail", nullable = false, length = 65535)
    @NotNull
    @Size(max = 65535)
    public String getStudentemail() {
        return (String) get(4);
    }

    /**
     * Setter for <code>gara.Member.phoneNumber</code>.
     */
    public void setPhonenumber(String value) {
        set(5, value);
    }

    /**
     * Getter for <code>gara.Member.phoneNumber</code>.
     */
    @Column(name = "phoneNumber", length = 15)
    @Size(max = 15)
    public String getPhonenumber() {
        return (String) get(5);
    }

    /**
     * Setter for <code>gara.Member.birthDate</code>.
     */
    public void setBirthdate(Timestamp value) {
        set(6, value);
    }

    /**
     * Getter for <code>gara.Member.birthDate</code>.
     */
    @Column(name = "birthDate")
    public Timestamp getBirthdate() {
        return (Timestamp) get(6);
    }

    /**
     * Setter for <code>gara.Member.activited</code>.
     */
    public void setActivited(Integer value) {
        set(7, value);
    }

    /**
     * Getter for <code>gara.Member.activited</code>.
     */
    @Column(name = "activited", precision = 10)
    public Integer getActivited() {
        return (Integer) get(7);
    }

    /**
     * Setter for <code>gara.Member.gender</code>.
     */
    public void setGender(String value) {
        set(8, value);
    }

    /**
     * Getter for <code>gara.Member.gender</code>.
     */
    @Column(name = "gender", length = 255)
    @Size(max = 255)
    public String getGender() {
        return (String) get(8);
    }

    /**
     * Setter for <code>gara.Member.password</code>.
     */
    public void setPassword(String value) {
        set(9, value);
    }

    /**
     * Getter for <code>gara.Member.password</code>.
     */
    @Column(name = "password", nullable = false, length = 65535)
    @NotNull
    @Size(max = 65535)
    public String getPassword() {
        return (String) get(9);
    }

    /**
     * Setter for <code>gara.Member.collegeID</code>.
     */
    public void setCollegeid(Integer value) {
        set(10, value);
    }

    /**
     * Getter for <code>gara.Member.collegeID</code>.
     */
    @Column(name = "collegeID", precision = 10)
    public Integer getCollegeid() {
        return (Integer) get(10);
    }

    /**
     * Setter for <code>gara.Member.pic</code>.
     */
    public void setPic(String value) {
        set(11, value);
    }

    /**
     * Getter for <code>gara.Member.pic</code>.
     */
    @Column(name = "pic", length = 65535)
    @Size(max = 65535)
    public String getPic() {
        return (String) get(11);
    }

    /**
     * Setter for <code>gara.Member.bloodType</code>.
     */
    public void setBloodtype(String value) {
        set(12, value);
    }

    /**
     * Getter for <code>gara.Member.bloodType</code>.
     */
    @Column(name = "bloodType", length = 2)
    @Size(max = 2)
    public String getBloodtype() {
        return (String) get(12);
    }

    /**
     * Setter for <code>gara.Member.emergencyNumber</code>.
     */
    public void setEmergencynumber(String value) {
        set(13, value);
    }

    /**
     * Getter for <code>gara.Member.emergencyNumber</code>.
     */
    @Column(name = "emergencyNumber", length = 65535)
    @Size(max = 65535)
    public String getEmergencynumber() {
        return (String) get(13);
    }

    /**
     * Setter for <code>gara.Member.balance</code>.
     */
    public void setBalance(Integer value) {
        set(14, value);
    }

    /**
     * Getter for <code>gara.Member.balance</code>.
     */
    @Column(name = "balance", precision = 10)
    public Integer getBalance() {
        return (Integer) get(14);
    }

    /**
     * Setter for <code>gara.Member.studentEmailActivationCode</code>.
     */
    public void setStudentemailactivationcode(String value) {
        set(15, value);
    }

    /**
     * Getter for <code>gara.Member.studentEmailActivationCode</code>.
     */
    @Column(name = "studentEmailActivationCode", length = 10)
    @Size(max = 10)
    public String getStudentemailactivationcode() {
        return (String) get(15);
    }

    /**
     * Setter for <code>gara.Member.memberGroupID</code>.
     */
    public void setMembergroupid(Integer value) {
        set(16, value);
    }

    /**
     * Getter for <code>gara.Member.memberGroupID</code>.
     */
    @Column(name = "memberGroupID", precision = 10)
    public Integer getMembergroupid() {
        return (Integer) get(16);
    }

    /**
     * Setter for <code>gara.Member.longitude</code>.
     */
    public void setLongitude(Double value) {
        set(17, value);
    }

    /**
     * Getter for <code>gara.Member.longitude</code>.
     */
    @Column(name = "longitude", precision = 22)
    public Double getLongitude() {
        return (Double) get(17);
    }

    /**
     * Setter for <code>gara.Member.latitude</code>.
     */
    public void setLatitude(Double value) {
        set(18, value);
    }

    /**
     * Getter for <code>gara.Member.latitude</code>.
     */
    @Column(name = "latitude", precision = 22)
    public Double getLatitude() {
        return (Double) get(18);
    }

    /**
     * Setter for <code>gara.Member.pin</code>.
     */
    public void setPin(String value) {
        set(19, value);
    }

    /**
     * Getter for <code>gara.Member.pin</code>.
     */
    @Column(name = "pin", length = 65535)
    @Size(max = 65535)
    public String getPin() {
        return (String) get(19);
    }

    /**
     * Setter for <code>gara.Member.universityID</code>.
     */
    public void setUniversityid(Integer value) {
        set(20, value);
    }

    /**
     * Getter for <code>gara.Member.universityID</code>.
     */
    @Column(name = "universityID", precision = 10)
    public Integer getUniversityid() {
        return (Integer) get(20);
    }

    /**
     * Setter for <code>gara.Member.preferences</code>.
     */
    public void setPreferences(String value) {
        set(21, value);
    }

    /**
     * Getter for <code>gara.Member.preferences</code>.
     */
    @Column(name = "preferences", length = 65535)
    @Size(max = 65535)
    public String getPreferences() {
        return (String) get(21);
    }

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Record1<Integer> key() {
        return (Record1) super.key();
    }

    // -------------------------------------------------------------------------
    // Record22 type implementation
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Row22<Integer, Timestamp, String, String, String, String, Timestamp, Integer, String, String, Integer, String, String, String, Integer, String, Integer, Double, Double, String, Integer, String> fieldsRow() {
        return (Row22) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row22<Integer, Timestamp, String, String, String, String, Timestamp, Integer, String, String, Integer, String, String, String, Integer, String, Integer, Double, Double, String, Integer, String> valuesRow() {
        return (Row22) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field1() {
        return Member.MEMBER.ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Timestamp> field2() {
        return Member.MEMBER.TIMESTAMP;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field3() {
        return Member.MEMBER.NAME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field4() {
        return Member.MEMBER.USERNAME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field5() {
        return Member.MEMBER.STUDENTEMAIL;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field6() {
        return Member.MEMBER.PHONENUMBER;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Timestamp> field7() {
        return Member.MEMBER.BIRTHDATE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field8() {
        return Member.MEMBER.ACTIVITED;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field9() {
        return Member.MEMBER.GENDER;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field10() {
        return Member.MEMBER.PASSWORD;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field11() {
        return Member.MEMBER.COLLEGEID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field12() {
        return Member.MEMBER.PIC;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field13() {
        return Member.MEMBER.BLOODTYPE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field14() {
        return Member.MEMBER.EMERGENCYNUMBER;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field15() {
        return Member.MEMBER.BALANCE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field16() {
        return Member.MEMBER.STUDENTEMAILACTIVATIONCODE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field17() {
        return Member.MEMBER.MEMBERGROUPID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Double> field18() {
        return Member.MEMBER.LONGITUDE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Double> field19() {
        return Member.MEMBER.LATITUDE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field20() {
        return Member.MEMBER.PIN;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field21() {
        return Member.MEMBER.UNIVERSITYID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field22() {
        return Member.MEMBER.PREFERENCES;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value1() {
        return getId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp value2() {
        return getTimestamp();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value3() {
        return getName();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value4() {
        return getUsername();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value5() {
        return getStudentemail();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value6() {
        return getPhonenumber();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp value7() {
        return getBirthdate();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value8() {
        return getActivited();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value9() {
        return getGender();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value10() {
        return getPassword();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value11() {
        return getCollegeid();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value12() {
        return getPic();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value13() {
        return getBloodtype();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value14() {
        return getEmergencynumber();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value15() {
        return getBalance();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value16() {
        return getStudentemailactivationcode();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value17() {
        return getMembergroupid();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Double value18() {
        return getLongitude();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Double value19() {
        return getLatitude();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value20() {
        return getPin();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value21() {
        return getUniversityid();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value22() {
        return getPreferences();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public MemberRecord value1(Integer value) {
        setId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public MemberRecord value2(Timestamp value) {
        setTimestamp(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public MemberRecord value3(String value) {
        setName(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public MemberRecord value4(String value) {
        setUsername(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public MemberRecord value5(String value) {
        setStudentemail(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public MemberRecord value6(String value) {
        setPhonenumber(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public MemberRecord value7(Timestamp value) {
        setBirthdate(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public MemberRecord value8(Integer value) {
        setActivited(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public MemberRecord value9(String value) {
        setGender(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public MemberRecord value10(String value) {
        setPassword(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public MemberRecord value11(Integer value) {
        setCollegeid(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public MemberRecord value12(String value) {
        setPic(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public MemberRecord value13(String value) {
        setBloodtype(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public MemberRecord value14(String value) {
        setEmergencynumber(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public MemberRecord value15(Integer value) {
        setBalance(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public MemberRecord value16(String value) {
        setStudentemailactivationcode(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public MemberRecord value17(Integer value) {
        setMembergroupid(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public MemberRecord value18(Double value) {
        setLongitude(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public MemberRecord value19(Double value) {
        setLatitude(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public MemberRecord value20(String value) {
        setPin(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public MemberRecord value21(Integer value) {
        setUniversityid(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public MemberRecord value22(String value) {
        setPreferences(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public MemberRecord values(Integer value1, Timestamp value2, String value3, String value4, String value5, String value6, Timestamp value7, Integer value8, String value9, String value10, Integer value11, String value12, String value13, String value14, Integer value15, String value16, Integer value17, Double value18, Double value19, String value20, Integer value21, String value22) {
        value1(value1);
        value2(value2);
        value3(value3);
        value4(value4);
        value5(value5);
        value6(value6);
        value7(value7);
        value8(value8);
        value9(value9);
        value10(value10);
        value11(value11);
        value12(value12);
        value13(value13);
        value14(value14);
        value15(value15);
        value16(value16);
        value17(value17);
        value18(value18);
        value19(value19);
        value20(value20);
        value21(value21);
        value22(value22);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached MemberRecord
     */
    public MemberRecord() {
        super(Member.MEMBER);
    }

    /**
     * Create a detached, initialised MemberRecord
     */
    public MemberRecord(Integer id, Timestamp timestamp, String name, String username, String studentemail, String phonenumber, Timestamp birthdate, Integer activited, String gender, String password, Integer collegeid, String pic, String bloodtype, String emergencynumber, Integer balance, String studentemailactivationcode, Integer membergroupid, Double longitude, Double latitude, String pin, Integer universityid, String preferences) {
        super(Member.MEMBER);

        set(0, id);
        set(1, timestamp);
        set(2, name);
        set(3, username);
        set(4, studentemail);
        set(5, phonenumber);
        set(6, birthdate);
        set(7, activited);
        set(8, gender);
        set(9, password);
        set(10, collegeid);
        set(11, pic);
        set(12, bloodtype);
        set(13, emergencynumber);
        set(14, balance);
        set(15, studentemailactivationcode);
        set(16, membergroupid);
        set(17, longitude);
        set(18, latitude);
        set(19, pin);
        set(20, universityid);
        set(21, preferences);
    }
}
