/**
 * This class is generated by jOOQ
 */
package apdihp.tables.records;


import apdihp.tables.Driver;

import java.sql.Date;

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
import org.jooq.Record6;
import org.jooq.Row6;
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
@Table(name = "Driver", schema = "Gara")
public class DriverRecord extends UpdatableRecordImpl<DriverRecord> implements Record6<Integer, Integer, String, String, String, Date> {

    private static final long serialVersionUID = 561678768;

    /**
     * Setter for <code>Gara.Driver.ID</code>.
     */
    public void setId(Integer value) {
        set(0, value);
    }

    /**
     * Getter for <code>Gara.Driver.ID</code>.
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID", unique = true, nullable = false, precision = 10)
    @NotNull
    public Integer getId() {
        return (Integer) get(0);
    }

    /**
     * Setter for <code>Gara.Driver.memberID</code>.
     */
    public void setMemberid(Integer value) {
        set(1, value);
    }

    /**
     * Getter for <code>Gara.Driver.memberID</code>.
     */
    @Column(name = "memberID", nullable = false, precision = 10)
    @NotNull
    public Integer getMemberid() {
        return (Integer) get(1);
    }

    /**
     * Setter for <code>Gara.Driver.licenseNumber</code>.
     */
    public void setLicensenumber(String value) {
        set(2, value);
    }

    /**
     * Getter for <code>Gara.Driver.licenseNumber</code>.
     */
    @Column(name = "licenseNumber", nullable = false, length = 65535)
    @NotNull
    @Size(max = 65535)
    public String getLicensenumber() {
        return (String) get(2);
    }

    /**
     * Setter for <code>Gara.Driver.licensePic</code>.
     */
    public void setLicensepic(String value) {
        set(3, value);
    }

    /**
     * Getter for <code>Gara.Driver.licensePic</code>.
     */
    @Column(name = "licensePic", nullable = false, length = 65535)
    @NotNull
    @Size(max = 65535)
    public String getLicensepic() {
        return (String) get(3);
    }

    /**
     * Setter for <code>Gara.Driver.identyCardPic</code>.
     */
    public void setIdentycardpic(String value) {
        set(4, value);
    }

    /**
     * Getter for <code>Gara.Driver.identyCardPic</code>.
     */
    @Column(name = "identyCardPic", nullable = false, length = 65535)
    @NotNull
    @Size(max = 65535)
    public String getIdentycardpic() {
        return (String) get(4);
    }

    /**
     * Setter for <code>Gara.Driver.licenseExpireDate</code>.
     */
    public void setLicenseexpiredate(Date value) {
        set(5, value);
    }

    /**
     * Getter for <code>Gara.Driver.licenseExpireDate</code>.
     */
    @Column(name = "licenseExpireDate", nullable = false)
    @NotNull
    public Date getLicenseexpiredate() {
        return (Date) get(5);
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
    // Record6 type implementation
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Row6<Integer, Integer, String, String, String, Date> fieldsRow() {
        return (Row6) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row6<Integer, Integer, String, String, String, Date> valuesRow() {
        return (Row6) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field1() {
        return Driver.DRIVER.ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field2() {
        return Driver.DRIVER.MEMBERID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field3() {
        return Driver.DRIVER.LICENSENUMBER;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field4() {
        return Driver.DRIVER.LICENSEPIC;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field5() {
        return Driver.DRIVER.IDENTYCARDPIC;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Date> field6() {
        return Driver.DRIVER.LICENSEEXPIREDATE;
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
    public Integer value2() {
        return getMemberid();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value3() {
        return getLicensenumber();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value4() {
        return getLicensepic();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value5() {
        return getIdentycardpic();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Date value6() {
        return getLicenseexpiredate();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public DriverRecord value1(Integer value) {
        setId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public DriverRecord value2(Integer value) {
        setMemberid(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public DriverRecord value3(String value) {
        setLicensenumber(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public DriverRecord value4(String value) {
        setLicensepic(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public DriverRecord value5(String value) {
        setIdentycardpic(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public DriverRecord value6(Date value) {
        setLicenseexpiredate(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public DriverRecord values(Integer value1, Integer value2, String value3, String value4, String value5, Date value6) {
        value1(value1);
        value2(value2);
        value3(value3);
        value4(value4);
        value5(value5);
        value6(value6);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached DriverRecord
     */
    public DriverRecord() {
        super(Driver.DRIVER);
    }

    /**
     * Create a detached, initialised DriverRecord
     */
    public DriverRecord(Integer id, Integer memberid, String licensenumber, String licensepic, String identycardpic, Date licenseexpiredate) {
        super(Driver.DRIVER);

        set(0, id);
        set(1, memberid);
        set(2, licensenumber);
        set(3, licensepic);
        set(4, identycardpic);
        set(5, licenseexpiredate);
    }
}
