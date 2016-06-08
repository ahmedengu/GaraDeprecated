/**
 * This class is generated by jOOQ
 */
package models.garaDB.tables.records;


import models.garaDB.tables.Country;

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
import org.jooq.Record5;
import org.jooq.Row5;
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
@Table(name = "Country", schema = "Gara")
public class CountryRecord extends UpdatableRecordImpl<CountryRecord> implements Record5<Integer, String, String, Double, Double> {

    private static final long serialVersionUID = -832629729;

    /**
     * Setter for <code>Gara.Country.ID</code>.
     */
    public void setId(Integer value) {
        set(0, value);
    }

    /**
     * Getter for <code>Gara.Country.ID</code>.
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID", unique = true, nullable = false, precision = 10)
    public Integer getId() {
        return (Integer) get(0);
    }

    /**
     * Setter for <code>Gara.Country.name</code>.
     */
    public void setName(String value) {
        set(1, value);
    }

    /**
     * Getter for <code>Gara.Country.name</code>.
     */
    @Column(name = "name", nullable = false, length = 80)
    @NotNull
    @Size(max = 80)
    public String getName() {
        return (String) get(1);
    }

    /**
     * Setter for <code>Gara.Country.pic</code>.
     */
    public void setPic(String value) {
        set(2, value);
    }

    /**
     * Getter for <code>Gara.Country.pic</code>.
     */
    @Column(name = "pic", length = 65535)
    @Size(max = 65535)
    public String getPic() {
        return (String) get(2);
    }

    /**
     * Setter for <code>Gara.Country.longitude</code>.
     */
    public void setLongitude(Double value) {
        set(3, value);
    }

    /**
     * Getter for <code>Gara.Country.longitude</code>.
     */
    @Column(name = "longitude", precision = 22)
    public Double getLongitude() {
        return (Double) get(3);
    }

    /**
     * Setter for <code>Gara.Country.latitude</code>.
     */
    public void setLatitude(Double value) {
        set(4, value);
    }

    /**
     * Getter for <code>Gara.Country.latitude</code>.
     */
    @Column(name = "latitude", precision = 22)
    public Double getLatitude() {
        return (Double) get(4);
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
    // Record5 type implementation
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Row5<Integer, String, String, Double, Double> fieldsRow() {
        return (Row5) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row5<Integer, String, String, Double, Double> valuesRow() {
        return (Row5) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field1() {
        return Country.COUNTRY.ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field2() {
        return Country.COUNTRY.NAME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field3() {
        return Country.COUNTRY.PIC;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Double> field4() {
        return Country.COUNTRY.LONGITUDE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Double> field5() {
        return Country.COUNTRY.LATITUDE;
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
    public String value2() {
        return getName();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value3() {
        return getPic();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Double value4() {
        return getLongitude();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Double value5() {
        return getLatitude();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public CountryRecord value1(Integer value) {
        setId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public CountryRecord value2(String value) {
        setName(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public CountryRecord value3(String value) {
        setPic(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public CountryRecord value4(Double value) {
        setLongitude(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public CountryRecord value5(Double value) {
        setLatitude(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public CountryRecord values(Integer value1, String value2, String value3, Double value4, Double value5) {
        value1(value1);
        value2(value2);
        value3(value3);
        value4(value4);
        value5(value5);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached CountryRecord
     */
    public CountryRecord() {
        super(Country.COUNTRY);
    }

    /**
     * Create a detached, initialised CountryRecord
     */
    public CountryRecord(Integer id, String name, String pic, Double longitude, Double latitude) {
        super(Country.COUNTRY);

        set(0, id);
        set(1, name);
        set(2, pic);
        set(3, longitude);
        set(4, latitude);
    }
}