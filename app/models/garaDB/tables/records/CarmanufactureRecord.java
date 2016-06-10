/**
 * This class is generated by jOOQ
 */
package models.garaDB.tables.records;


import models.garaDB.tables.Carmanufacture;

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
import org.jooq.Record4;
import org.jooq.Row4;
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
@Table(name = "CarManufacture", schema = "Gara")
public class CarmanufactureRecord extends UpdatableRecordImpl<CarmanufactureRecord> implements Record4<Integer, String, Integer, String> {

    private static final long serialVersionUID = -1029218493;

    /**
     * Setter for <code>Gara.CarManufacture.ID</code>.
     */
    public void setId(Integer value) {
        set(0, value);
    }

    /**
     * Getter for <code>Gara.CarManufacture.ID</code>.
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID", unique = true, nullable = false, precision = 10)
    public Integer getId() {
        return (Integer) get(0);
    }

    /**
     * Setter for <code>Gara.CarManufacture.name</code>.
     */
    public void setName(String value) {
        set(1, value);
    }

    /**
     * Getter for <code>Gara.CarManufacture.name</code>.
     */
    @Column(name = "name", nullable = false, length = 65535)
    @NotNull
    @Size(max = 65535)
    public String getName() {
        return (String) get(1);
    }

    /**
     * Setter for <code>Gara.CarManufacture.countryID</code>.
     */
    public void setCountryid(Integer value) {
        set(2, value);
    }

    /**
     * Getter for <code>Gara.CarManufacture.countryID</code>.
     */
    @Column(name = "countryID", precision = 10)
    public Integer getCountryid() {
        return (Integer) get(2);
    }

    /**
     * Setter for <code>Gara.CarManufacture.pic</code>.
     */
    public void setPic(String value) {
        set(3, value);
    }

    /**
     * Getter for <code>Gara.CarManufacture.pic</code>.
     */
    @Column(name = "pic", length = 65535)
    @Size(max = 65535)
    public String getPic() {
        return (String) get(3);
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
    // Record4 type implementation
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Row4<Integer, String, Integer, String> fieldsRow() {
        return (Row4) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row4<Integer, String, Integer, String> valuesRow() {
        return (Row4) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field1() {
        return Carmanufacture.CARMANUFACTURE.ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field2() {
        return Carmanufacture.CARMANUFACTURE.NAME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field3() {
        return Carmanufacture.CARMANUFACTURE.COUNTRYID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field4() {
        return Carmanufacture.CARMANUFACTURE.PIC;
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
    public Integer value3() {
        return getCountryid();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value4() {
        return getPic();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public CarmanufactureRecord value1(Integer value) {
        setId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public CarmanufactureRecord value2(String value) {
        setName(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public CarmanufactureRecord value3(Integer value) {
        setCountryid(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public CarmanufactureRecord value4(String value) {
        setPic(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public CarmanufactureRecord values(Integer value1, String value2, Integer value3, String value4) {
        value1(value1);
        value2(value2);
        value3(value3);
        value4(value4);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached CarmanufactureRecord
     */
    public CarmanufactureRecord() {
        super(Carmanufacture.CARMANUFACTURE);
    }

    /**
     * Create a detached, initialised CarmanufactureRecord
     */
    public CarmanufactureRecord(Integer id, String name, Integer countryid, String pic) {
        super(Carmanufacture.CARMANUFACTURE);

        set(0, id);
        set(1, name);
        set(2, countryid);
        set(3, pic);
    }
}
