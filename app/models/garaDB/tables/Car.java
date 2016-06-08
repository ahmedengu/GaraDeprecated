/**
 * This class is generated by jOOQ
 */
package models.garaDB.tables;


import models.garaDB.Gara;
import models.garaDB.Keys;
import models.garaDB.tables.records.CarRecord;

import java.sql.Date;
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
public class Car extends TableImpl<CarRecord> {

    private static final long serialVersionUID = -413193705;

    /**
     * The reference instance of <code>Gara.Car</code>
     */
    public static final Car CAR = new Car();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<CarRecord> getRecordType() {
        return CarRecord.class;
    }

    /**
     * The column <code>Gara.Car.ID</code>.
     */
    public final TableField<CarRecord, Integer> ID = createField("ID", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

    /**
     * The column <code>Gara.Car.driverID</code>.
     */
    public final TableField<CarRecord, Integer> DRIVERID = createField("driverID", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

    /**
     * The column <code>Gara.Car.plateNumber</code>.
     */
    public final TableField<CarRecord, String> PLATENUMBER = createField("plateNumber", org.jooq.impl.SQLDataType.CLOB.nullable(false), this, "");

    /**
     * The column <code>Gara.Car.platePic</code>.
     */
    public final TableField<CarRecord, String> PLATEPIC = createField("platePic", org.jooq.impl.SQLDataType.CLOB, this, "");

    /**
     * The column <code>Gara.Car.carModelID</code>.
     */
    public final TableField<CarRecord, Integer> CARMODELID = createField("carModelID", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

    /**
     * The column <code>Gara.Car.frontPic</code>.
     */
    public final TableField<CarRecord, String> FRONTPIC = createField("frontPic", org.jooq.impl.SQLDataType.CLOB, this, "");

    /**
     * The column <code>Gara.Car.backPic</code>.
     */
    public final TableField<CarRecord, String> BACKPIC = createField("backPic", org.jooq.impl.SQLDataType.CLOB, this, "");

    /**
     * The column <code>Gara.Car.sidePic</code>.
     */
    public final TableField<CarRecord, String> SIDEPIC = createField("sidePic", org.jooq.impl.SQLDataType.CLOB, this, "");

    /**
     * The column <code>Gara.Car.insidePic</code>.
     */
    public final TableField<CarRecord, String> INSIDEPIC = createField("insidePic", org.jooq.impl.SQLDataType.CLOB, this, "");

    /**
     * The column <code>Gara.Car.licenseNumber</code>.
     */
    public final TableField<CarRecord, String> LICENSENUMBER = createField("licenseNumber", org.jooq.impl.SQLDataType.CLOB.nullable(false), this, "");

    /**
     * The column <code>Gara.Car.licensePic</code>.
     */
    public final TableField<CarRecord, String> LICENSEPIC = createField("licensePic", org.jooq.impl.SQLDataType.CLOB, this, "");

    /**
     * The column <code>Gara.Car.licenseExpireDate</code>.
     */
    public final TableField<CarRecord, Date> LICENSEEXPIREDATE = createField("licenseExpireDate", org.jooq.impl.SQLDataType.DATE.nullable(false), this, "");

    /**
     * The column <code>Gara.Car.DistLongitude</code>.
     */
    public final TableField<CarRecord, Double> DISTLONGITUDE = createField("DistLongitude", org.jooq.impl.SQLDataType.DOUBLE, this, "");

    /**
     * The column <code>Gara.Car.DistLatitude</code>.
     */
    public final TableField<CarRecord, Double> DISTLATITUDE = createField("DistLatitude", org.jooq.impl.SQLDataType.DOUBLE, this, "");

    /**
     * The column <code>Gara.Car.availableSeats</code>.
     */
    public final TableField<CarRecord, Integer> AVAILABLESEATS = createField("availableSeats", org.jooq.impl.SQLDataType.INTEGER, this, "");

    /**
     * The column <code>Gara.Car.state</code>.
     */
    public final TableField<CarRecord, Boolean> STATE = createField("state", org.jooq.impl.SQLDataType.BIT.defaultValue(org.jooq.impl.DSL.field("b'0'", org.jooq.impl.SQLDataType.BIT)), this, "");

    /**
     * Create a <code>Gara.Car</code> table reference
     */
    public Car() {
        this("Car", null);
    }

    /**
     * Create an aliased <code>Gara.Car</code> table reference
     */
    public Car(String alias) {
        this(alias, CAR);
    }

    private Car(String alias, Table<CarRecord> aliased) {
        this(alias, aliased, null);
    }

    private Car(String alias, Table<CarRecord> aliased, Field<?>[] parameters) {
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
    public Identity<CarRecord, Integer> getIdentity() {
        return Keys.IDENTITY_CAR;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UniqueKey<CarRecord> getPrimaryKey() {
        return Keys.KEY_CAR_PRIMARY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<CarRecord>> getKeys() {
        return Arrays.<UniqueKey<CarRecord>>asList(Keys.KEY_CAR_PRIMARY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<ForeignKey<CarRecord, ?>> getReferences() {
        return Arrays.<ForeignKey<CarRecord, ?>>asList(Keys.FKCAR115659, Keys.FKCAR838891);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Car as(String alias) {
        return new Car(alias, this);
    }

    /**
     * Rename this table
     */
    public Car rename(String name) {
        return new Car(name, null);
    }
}