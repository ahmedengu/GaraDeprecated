/**
 * This class is generated by jOOQ
 */
package models.garaDB.tables.daos;


import models.garaDB.tables.Car;
import models.garaDB.tables.records.CarRecord;

import java.sql.Date;
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
public class CarDao extends DAOImpl<CarRecord, models.garaDB.tables.pojos.Car, Integer> {

    /**
     * Create a new CarDao without any configuration
     */
    public CarDao() {
        super(Car.CAR, models.garaDB.tables.pojos.Car.class);
    }

    /**
     * Create a new CarDao with an attached configuration
     */
    public CarDao(Configuration configuration) {
        super(Car.CAR, models.garaDB.tables.pojos.Car.class, configuration);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    protected Integer getId(models.garaDB.tables.pojos.Car object) {
        return object.getId();
    }

    /**
     * Fetch records that have <code>ID IN (values)</code>
     */
    public List<models.garaDB.tables.pojos.Car> fetchById(Integer... values) {
        return fetch(Car.CAR.ID, values);
    }

    /**
     * Fetch a unique record that has <code>ID = value</code>
     */
    public models.garaDB.tables.pojos.Car fetchOneById(Integer value) {
        return fetchOne(Car.CAR.ID, value);
    }

    /**
     * Fetch records that have <code>driverID IN (values)</code>
     */
    public List<models.garaDB.tables.pojos.Car> fetchByDriverid(Integer... values) {
        return fetch(Car.CAR.DRIVERID, values);
    }

    /**
     * Fetch records that have <code>plateNumber IN (values)</code>
     */
    public List<models.garaDB.tables.pojos.Car> fetchByPlatenumber(String... values) {
        return fetch(Car.CAR.PLATENUMBER, values);
    }

    /**
     * Fetch records that have <code>platePic IN (values)</code>
     */
    public List<models.garaDB.tables.pojos.Car> fetchByPlatepic(String... values) {
        return fetch(Car.CAR.PLATEPIC, values);
    }

    /**
     * Fetch records that have <code>carModelID IN (values)</code>
     */
    public List<models.garaDB.tables.pojos.Car> fetchByCarmodelid(Integer... values) {
        return fetch(Car.CAR.CARMODELID, values);
    }

    /**
     * Fetch records that have <code>frontPic IN (values)</code>
     */
    public List<models.garaDB.tables.pojos.Car> fetchByFrontpic(String... values) {
        return fetch(Car.CAR.FRONTPIC, values);
    }

    /**
     * Fetch records that have <code>backPic IN (values)</code>
     */
    public List<models.garaDB.tables.pojos.Car> fetchByBackpic(String... values) {
        return fetch(Car.CAR.BACKPIC, values);
    }

    /**
     * Fetch records that have <code>sidePic IN (values)</code>
     */
    public List<models.garaDB.tables.pojos.Car> fetchBySidepic(String... values) {
        return fetch(Car.CAR.SIDEPIC, values);
    }

    /**
     * Fetch records that have <code>insidePic IN (values)</code>
     */
    public List<models.garaDB.tables.pojos.Car> fetchByInsidepic(String... values) {
        return fetch(Car.CAR.INSIDEPIC, values);
    }

    /**
     * Fetch records that have <code>licenseNumber IN (values)</code>
     */
    public List<models.garaDB.tables.pojos.Car> fetchByLicensenumber(String... values) {
        return fetch(Car.CAR.LICENSENUMBER, values);
    }

    /**
     * Fetch records that have <code>licensePic IN (values)</code>
     */
    public List<models.garaDB.tables.pojos.Car> fetchByLicensepic(String... values) {
        return fetch(Car.CAR.LICENSEPIC, values);
    }

    /**
     * Fetch records that have <code>licenseExpireDate IN (values)</code>
     */
    public List<models.garaDB.tables.pojos.Car> fetchByLicenseexpiredate(Date... values) {
        return fetch(Car.CAR.LICENSEEXPIREDATE, values);
    }

    /**
     * Fetch records that have <code>DistLongitude IN (values)</code>
     */
    public List<models.garaDB.tables.pojos.Car> fetchByDistlongitude(Double... values) {
        return fetch(Car.CAR.DISTLONGITUDE, values);
    }

    /**
     * Fetch records that have <code>DistLatitude IN (values)</code>
     */
    public List<models.garaDB.tables.pojos.Car> fetchByDistlatitude(Double... values) {
        return fetch(Car.CAR.DISTLATITUDE, values);
    }

    /**
     * Fetch records that have <code>availableSeats IN (values)</code>
     */
    public List<models.garaDB.tables.pojos.Car> fetchByAvailableseats(Integer... values) {
        return fetch(Car.CAR.AVAILABLESEATS, values);
    }

    /**
     * Fetch records that have <code>state IN (values)</code>
     */
    public List<models.garaDB.tables.pojos.Car> fetchByState(Integer... values) {
        return fetch(Car.CAR.STATE, values);
    }

    /**
     * Fetch records that have <code>TIMESTAMP IN (values)</code>
     */
    public List<models.garaDB.tables.pojos.Car> fetchByTimestamp(Timestamp... values) {
        return fetch(Car.CAR.TIMESTAMP, values);
    }
}
