/**
 * This class is generated by jOOQ
 */
package models.garaDB.tables.records;


import models.garaDB.tables.Car;

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
import org.jooq.Record16;
import org.jooq.Row16;
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
@Table(name = "Car", schema = "Gara")
public class CarRecord extends UpdatableRecordImpl<CarRecord> implements Record16<Integer, Integer, String, String, Integer, String, String, String, String, String, String, Date, Double, Double, Integer, Boolean> {

    private static final long serialVersionUID = 153918298;

    /**
     * Setter for <code>Gara.Car.ID</code>.
     */
    public void setId(Integer value) {
        set(0, value);
    }

    /**
     * Getter for <code>Gara.Car.ID</code>.
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID", unique = true, nullable = false, precision = 10)
    public Integer getId() {
        return (Integer) get(0);
    }

    /**
     * Setter for <code>Gara.Car.driverID</code>.
     */
    public void setDriverid(Integer value) {
        set(1, value);
    }

    /**
     * Getter for <code>Gara.Car.driverID</code>.
     */
    @Column(name = "driverID", nullable = false, precision = 10)
    @NotNull
    public Integer getDriverid() {
        return (Integer) get(1);
    }

    /**
     * Setter for <code>Gara.Car.plateNumber</code>.
     */
    public void setPlatenumber(String value) {
        set(2, value);
    }

    /**
     * Getter for <code>Gara.Car.plateNumber</code>.
     */
    @Column(name = "plateNumber", nullable = false, length = 65535)
    @NotNull
    @Size(max = 65535)
    public String getPlatenumber() {
        return (String) get(2);
    }

    /**
     * Setter for <code>Gara.Car.platePic</code>.
     */
    public void setPlatepic(String value) {
        set(3, value);
    }

    /**
     * Getter for <code>Gara.Car.platePic</code>.
     */
    @Column(name = "platePic", length = 65535)
    @Size(max = 65535)
    public String getPlatepic() {
        return (String) get(3);
    }

    /**
     * Setter for <code>Gara.Car.carModelID</code>.
     */
    public void setCarmodelid(Integer value) {
        set(4, value);
    }

    /**
     * Getter for <code>Gara.Car.carModelID</code>.
     */
    @Column(name = "carModelID", nullable = false, precision = 10)
    @NotNull
    public Integer getCarmodelid() {
        return (Integer) get(4);
    }

    /**
     * Setter for <code>Gara.Car.frontPic</code>.
     */
    public void setFrontpic(String value) {
        set(5, value);
    }

    /**
     * Getter for <code>Gara.Car.frontPic</code>.
     */
    @Column(name = "frontPic", length = 65535)
    @Size(max = 65535)
    public String getFrontpic() {
        return (String) get(5);
    }

    /**
     * Setter for <code>Gara.Car.backPic</code>.
     */
    public void setBackpic(String value) {
        set(6, value);
    }

    /**
     * Getter for <code>Gara.Car.backPic</code>.
     */
    @Column(name = "backPic", length = 65535)
    @Size(max = 65535)
    public String getBackpic() {
        return (String) get(6);
    }

    /**
     * Setter for <code>Gara.Car.sidePic</code>.
     */
    public void setSidepic(String value) {
        set(7, value);
    }

    /**
     * Getter for <code>Gara.Car.sidePic</code>.
     */
    @Column(name = "sidePic", length = 65535)
    @Size(max = 65535)
    public String getSidepic() {
        return (String) get(7);
    }

    /**
     * Setter for <code>Gara.Car.insidePic</code>.
     */
    public void setInsidepic(String value) {
        set(8, value);
    }

    /**
     * Getter for <code>Gara.Car.insidePic</code>.
     */
    @Column(name = "insidePic", length = 65535)
    @Size(max = 65535)
    public String getInsidepic() {
        return (String) get(8);
    }

    /**
     * Setter for <code>Gara.Car.licenseNumber</code>.
     */
    public void setLicensenumber(String value) {
        set(9, value);
    }

    /**
     * Getter for <code>Gara.Car.licenseNumber</code>.
     */
    @Column(name = "licenseNumber", nullable = false, length = 65535)
    @NotNull
    @Size(max = 65535)
    public String getLicensenumber() {
        return (String) get(9);
    }

    /**
     * Setter for <code>Gara.Car.licensePic</code>.
     */
    public void setLicensepic(String value) {
        set(10, value);
    }

    /**
     * Getter for <code>Gara.Car.licensePic</code>.
     */
    @Column(name = "licensePic", length = 65535)
    @Size(max = 65535)
    public String getLicensepic() {
        return (String) get(10);
    }

    /**
     * Setter for <code>Gara.Car.licenseExpireDate</code>.
     */
    public void setLicenseexpiredate(Date value) {
        set(11, value);
    }

    /**
     * Getter for <code>Gara.Car.licenseExpireDate</code>.
     */
    @Column(name = "licenseExpireDate", nullable = false)
    @NotNull
    public Date getLicenseexpiredate() {
        return (Date) get(11);
    }

    /**
     * Setter for <code>Gara.Car.DistLongitude</code>.
     */
    public void setDistlongitude(Double value) {
        set(12, value);
    }

    /**
     * Getter for <code>Gara.Car.DistLongitude</code>.
     */
    @Column(name = "DistLongitude", precision = 22)
    public Double getDistlongitude() {
        return (Double) get(12);
    }

    /**
     * Setter for <code>Gara.Car.DistLatitude</code>.
     */
    public void setDistlatitude(Double value) {
        set(13, value);
    }

    /**
     * Getter for <code>Gara.Car.DistLatitude</code>.
     */
    @Column(name = "DistLatitude", precision = 22)
    public Double getDistlatitude() {
        return (Double) get(13);
    }

    /**
     * Setter for <code>Gara.Car.availableSeats</code>.
     */
    public void setAvailableseats(Integer value) {
        set(14, value);
    }

    /**
     * Getter for <code>Gara.Car.availableSeats</code>.
     */
    @Column(name = "availableSeats", precision = 10)
    public Integer getAvailableseats() {
        return (Integer) get(14);
    }

    /**
     * Setter for <code>Gara.Car.state</code>.
     */
    public void setState(Boolean value) {
        set(15, value);
    }

    /**
     * Getter for <code>Gara.Car.state</code>.
     */
    @Column(name = "state", precision = 1)
    public Boolean getState() {
        return (Boolean) get(15);
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
    // Record16 type implementation
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Row16<Integer, Integer, String, String, Integer, String, String, String, String, String, String, Date, Double, Double, Integer, Boolean> fieldsRow() {
        return (Row16) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row16<Integer, Integer, String, String, Integer, String, String, String, String, String, String, Date, Double, Double, Integer, Boolean> valuesRow() {
        return (Row16) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field1() {
        return Car.CAR.ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field2() {
        return Car.CAR.DRIVERID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field3() {
        return Car.CAR.PLATENUMBER;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field4() {
        return Car.CAR.PLATEPIC;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field5() {
        return Car.CAR.CARMODELID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field6() {
        return Car.CAR.FRONTPIC;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field7() {
        return Car.CAR.BACKPIC;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field8() {
        return Car.CAR.SIDEPIC;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field9() {
        return Car.CAR.INSIDEPIC;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field10() {
        return Car.CAR.LICENSENUMBER;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field11() {
        return Car.CAR.LICENSEPIC;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Date> field12() {
        return Car.CAR.LICENSEEXPIREDATE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Double> field13() {
        return Car.CAR.DISTLONGITUDE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Double> field14() {
        return Car.CAR.DISTLATITUDE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field15() {
        return Car.CAR.AVAILABLESEATS;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Boolean> field16() {
        return Car.CAR.STATE;
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
        return getDriverid();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value3() {
        return getPlatenumber();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value4() {
        return getPlatepic();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value5() {
        return getCarmodelid();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value6() {
        return getFrontpic();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value7() {
        return getBackpic();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value8() {
        return getSidepic();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value9() {
        return getInsidepic();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value10() {
        return getLicensenumber();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value11() {
        return getLicensepic();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Date value12() {
        return getLicenseexpiredate();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Double value13() {
        return getDistlongitude();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Double value14() {
        return getDistlatitude();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value15() {
        return getAvailableseats();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Boolean value16() {
        return getState();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public CarRecord value1(Integer value) {
        setId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public CarRecord value2(Integer value) {
        setDriverid(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public CarRecord value3(String value) {
        setPlatenumber(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public CarRecord value4(String value) {
        setPlatepic(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public CarRecord value5(Integer value) {
        setCarmodelid(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public CarRecord value6(String value) {
        setFrontpic(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public CarRecord value7(String value) {
        setBackpic(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public CarRecord value8(String value) {
        setSidepic(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public CarRecord value9(String value) {
        setInsidepic(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public CarRecord value10(String value) {
        setLicensenumber(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public CarRecord value11(String value) {
        setLicensepic(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public CarRecord value12(Date value) {
        setLicenseexpiredate(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public CarRecord value13(Double value) {
        setDistlongitude(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public CarRecord value14(Double value) {
        setDistlatitude(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public CarRecord value15(Integer value) {
        setAvailableseats(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public CarRecord value16(Boolean value) {
        setState(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public CarRecord values(Integer value1, Integer value2, String value3, String value4, Integer value5, String value6, String value7, String value8, String value9, String value10, String value11, Date value12, Double value13, Double value14, Integer value15, Boolean value16) {
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
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached CarRecord
     */
    public CarRecord() {
        super(Car.CAR);
    }

    /**
     * Create a detached, initialised CarRecord
     */
    public CarRecord(Integer id, Integer driverid, String platenumber, String platepic, Integer carmodelid, String frontpic, String backpic, String sidepic, String insidepic, String licensenumber, String licensepic, Date licenseexpiredate, Double distlongitude, Double distlatitude, Integer availableseats, Boolean state) {
        super(Car.CAR);

        set(0, id);
        set(1, driverid);
        set(2, platenumber);
        set(3, platepic);
        set(4, carmodelid);
        set(5, frontpic);
        set(6, backpic);
        set(7, sidepic);
        set(8, insidepic);
        set(9, licensenumber);
        set(10, licensepic);
        set(11, licenseexpiredate);
        set(12, distlongitude);
        set(13, distlatitude);
        set(14, availableseats);
        set(15, state);
    }
}