/**
 * This class is generated by jOOQ
 */
package models.garaDB.tables.daos;


import models.garaDB.tables.Carmanufacture;
import models.garaDB.tables.records.CarmanufactureRecord;

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
public class CarmanufactureDao extends DAOImpl<CarmanufactureRecord, models.garaDB.tables.pojos.Carmanufacture, Integer> {

    /**
     * Create a new CarmanufactureDao without any configuration
     */
    public CarmanufactureDao() {
        super(Carmanufacture.CARMANUFACTURE, models.garaDB.tables.pojos.Carmanufacture.class);
    }

    /**
     * Create a new CarmanufactureDao with an attached configuration
     */
    public CarmanufactureDao(Configuration configuration) {
        super(Carmanufacture.CARMANUFACTURE, models.garaDB.tables.pojos.Carmanufacture.class, configuration);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    protected Integer getId(models.garaDB.tables.pojos.Carmanufacture object) {
        return object.getId();
    }

    /**
     * Fetch records that have <code>ID IN (values)</code>
     */
    public List<models.garaDB.tables.pojos.Carmanufacture> fetchById(Integer... values) {
        return fetch(Carmanufacture.CARMANUFACTURE.ID, values);
    }

    /**
     * Fetch a unique record that has <code>ID = value</code>
     */
    public models.garaDB.tables.pojos.Carmanufacture fetchOneById(Integer value) {
        return fetchOne(Carmanufacture.CARMANUFACTURE.ID, value);
    }

    /**
     * Fetch records that have <code>name IN (values)</code>
     */
    public List<models.garaDB.tables.pojos.Carmanufacture> fetchByName(String... values) {
        return fetch(Carmanufacture.CARMANUFACTURE.NAME, values);
    }

    /**
     * Fetch records that have <code>countryID IN (values)</code>
     */
    public List<models.garaDB.tables.pojos.Carmanufacture> fetchByCountryid(Integer... values) {
        return fetch(Carmanufacture.CARMANUFACTURE.COUNTRYID, values);
    }

    /**
     * Fetch records that have <code>pic IN (values)</code>
     */
    public List<models.garaDB.tables.pojos.Carmanufacture> fetchByPic(String... values) {
        return fetch(Carmanufacture.CARMANUFACTURE.PIC, values);
    }
}
