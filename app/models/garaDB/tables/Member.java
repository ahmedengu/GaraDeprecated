/**
 * This class is generated by jOOQ
 */
package models.garaDB.tables;


import models.garaDB.Gara;
import models.garaDB.Keys;
import models.garaDB.tables.records.MemberRecord;

import java.sql.Timestamp;
import java.util.Arrays;
import java.util.List;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.ForeignKey;
import org.jooq.Identity;
import org.jooq.Schema;
import org.jooq.Table;
import org.jooq.TableField;
import org.jooq.UniqueKey;
import org.jooq.impl.TableImpl;


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
public class Member extends TableImpl<MemberRecord> {

    private static final long serialVersionUID = 126127041;

    /**
     * The reference instance of <code>Gara.Member</code>
     */
    public static final Member MEMBER = new Member();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<MemberRecord> getRecordType() {
        return MemberRecord.class;
    }

    /**
     * The column <code>Gara.Member.ID</code>.
     */
    public final TableField<MemberRecord, Integer> ID = createField("ID", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

    /**
     * The column <code>Gara.Member.TIMESTAMP</code>.
     */
    public final TableField<MemberRecord, Timestamp> TIMESTAMP = createField("TIMESTAMP", org.jooq.impl.SQLDataType.TIMESTAMP.nullable(false).defaultValue(org.jooq.impl.DSL.field("CURRENT_TIMESTAMP", org.jooq.impl.SQLDataType.TIMESTAMP)), this, "");

    /**
     * The column <code>Gara.Member.name</code>.
     */
    public final TableField<MemberRecord, String> NAME = createField("name", org.jooq.impl.SQLDataType.CLOB.nullable(false), this, "");

    /**
     * The column <code>Gara.Member.username</code>.
     */
    public final TableField<MemberRecord, String> USERNAME = createField("username", org.jooq.impl.SQLDataType.CLOB.nullable(false), this, "");

    /**
     * The column <code>Gara.Member.studentEmail</code>.
     */
    public final TableField<MemberRecord, String> STUDENTEMAIL = createField("studentEmail", org.jooq.impl.SQLDataType.CLOB.nullable(false), this, "");

    /**
     * The column <code>Gara.Member.phoneNumber</code>.
     */
    public final TableField<MemberRecord, String> PHONENUMBER = createField("phoneNumber", org.jooq.impl.SQLDataType.VARCHAR.length(15), this, "");

    /**
     * The column <code>Gara.Member.birthDate</code>.
     */
    public final TableField<MemberRecord, Timestamp> BIRTHDATE = createField("birthDate", org.jooq.impl.SQLDataType.TIMESTAMP, this, "");

    /**
     * The column <code>Gara.Member.activited</code>.
     */
    public final TableField<MemberRecord, Integer> ACTIVITED = createField("activited", org.jooq.impl.SQLDataType.INTEGER.defaultValue(org.jooq.impl.DSL.field("0", org.jooq.impl.SQLDataType.INTEGER)), this, "");

    /**
     * The column <code>Gara.Member.gender</code>.
     */
    public final TableField<MemberRecord, String> GENDER = createField("gender", org.jooq.impl.SQLDataType.CHAR.length(255).defaultValue(org.jooq.impl.DSL.field("M", org.jooq.impl.SQLDataType.CHAR)), this, "");

    /**
     * The column <code>Gara.Member.password</code>.
     */
    public final TableField<MemberRecord, String> PASSWORD = createField("password", org.jooq.impl.SQLDataType.CLOB.nullable(false), this, "");

    /**
     * The column <code>Gara.Member.collegeID</code>.
     */
    public final TableField<MemberRecord, Integer> COLLEGEID = createField("collegeID", org.jooq.impl.SQLDataType.INTEGER, this, "");

    /**
     * The column <code>Gara.Member.salt</code>.
     */
    public final TableField<MemberRecord, String> SALT = createField("salt", org.jooq.impl.SQLDataType.VARCHAR.length(10), this, "");

    /**
     * The column <code>Gara.Member.pic</code>.
     */
    public final TableField<MemberRecord, String> PIC = createField("pic", org.jooq.impl.SQLDataType.CLOB, this, "");

    /**
     * The column <code>Gara.Member.bloodType</code>.
     */
    public final TableField<MemberRecord, String> BLOODTYPE = createField("bloodType", org.jooq.impl.SQLDataType.VARCHAR.length(2), this, "");

    /**
     * The column <code>Gara.Member.emergencyNumber</code>.
     */
    public final TableField<MemberRecord, String> EMERGENCYNUMBER = createField("emergencyNumber", org.jooq.impl.SQLDataType.CLOB, this, "");

    /**
     * The column <code>Gara.Member.balance</code>.
     */
    public final TableField<MemberRecord, Integer> BALANCE = createField("balance", org.jooq.impl.SQLDataType.INTEGER.defaultValue(org.jooq.impl.DSL.field("0", org.jooq.impl.SQLDataType.INTEGER)), this, "");

    /**
     * The column <code>Gara.Member.studentEmailActivationCode</code>.
     */
    public final TableField<MemberRecord, String> STUDENTEMAILACTIVATIONCODE = createField("studentEmailActivationCode", org.jooq.impl.SQLDataType.VARCHAR.length(10), this, "");

    /**
     * The column <code>Gara.Member.rideID</code>.
     */
    public final TableField<MemberRecord, Integer> RIDEID = createField("rideID", org.jooq.impl.SQLDataType.INTEGER, this, "");

    /**
     * The column <code>Gara.Member.memberGroupID</code>.
     */
    public final TableField<MemberRecord, Integer> MEMBERGROUPID = createField("memberGroupID", org.jooq.impl.SQLDataType.INTEGER, this, "");

    /**
     * The column <code>Gara.Member.longitude</code>.
     */
    public final TableField<MemberRecord, Double> LONGITUDE = createField("longitude", org.jooq.impl.SQLDataType.DOUBLE, this, "");

    /**
     * The column <code>Gara.Member.latitude</code>.
     */
    public final TableField<MemberRecord, Double> LATITUDE = createField("latitude", org.jooq.impl.SQLDataType.DOUBLE, this, "");

    /**
     * The column <code>Gara.Member.pin</code>.
     */
    public final TableField<MemberRecord, String> PIN = createField("pin", org.jooq.impl.SQLDataType.CLOB, this, "");

    /**
     * The column <code>Gara.Member.universityID</code>.
     */
    public final TableField<MemberRecord, Integer> UNIVERSITYID = createField("universityID", org.jooq.impl.SQLDataType.INTEGER, this, "");

    /**
     * Create a <code>Gara.Member</code> table reference
     */
    public Member() {
        this("Member", null);
    }

    /**
     * Create an aliased <code>Gara.Member</code> table reference
     */
    public Member(String alias) {
        this(alias, MEMBER);
    }

    private Member(String alias, Table<MemberRecord> aliased) {
        this(alias, aliased, null);
    }

    private Member(String alias, Table<MemberRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, "");
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Schema getSchema() {
        return Gara.GARA;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Identity<MemberRecord, Integer> getIdentity() {
        return Keys.IDENTITY_MEMBER;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UniqueKey<MemberRecord> getPrimaryKey() {
        return Keys.KEY_MEMBER_PRIMARY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<MemberRecord>> getKeys() {
        return Arrays.<UniqueKey<MemberRecord>>asList(Keys.KEY_MEMBER_PRIMARY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<ForeignKey<MemberRecord, ?>> getReferences() {
        return Arrays.<ForeignKey<MemberRecord, ?>>asList(Keys.FKMEMBER175873, Keys.FKMEMBER419676, Keys.FKMEMBER861549, Keys.FKMEMBER491900);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Member as(String alias) {
        return new Member(alias, this);
    }

    /**
     * Rename this table
     */
    public Member rename(String name) {
        return new Member(name, null);
    }
}
