/**
 * This class is generated by jOOQ
 */
package models.garaDB.tables.daos;


import models.garaDB.tables.Carmodel;
import models.garaDB.tables.records.CarmodelRecord;

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
public class CarmodelDao extends DAOImpl<CarmodelRecord, models.garaDB.tables.pojos.Carmodel, Integer> {

    /**
     * Create a new CarmodelDao without any configuration
     */
    public CarmodelDao() {
        super(Carmodel.CARMODEL, models.garaDB.tables.pojos.Carmodel.class);
    }

    /**
     * Create a new CarmodelDao with an attached configuration
     */
    public CarmodelDao(Configuration configuration) {
        super(Carmodel.CARMODEL, models.garaDB.tables.pojos.Carmodel.class, configuration);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    protected Integer getId(models.garaDB.tables.pojos.Carmodel object) {
        return object.getId();
    }

    /**
     * Fetch records that have <code>ID IN (values)</code>
     */
    public List<models.garaDB.tables.pojos.Carmodel> fetchById(Integer... values) {
        return fetch(Carmodel.CARMODEL.ID, values);
    }

    /**
     * Fetch a unique record that has <code>ID = value</code>
     */
    public models.garaDB.tables.pojos.Carmodel fetchOneById(Integer value) {
        return fetchOne(Carmodel.CARMODEL.ID, value);
    }

    /**
     * Fetch records that have <code>name IN (values)</code>
     */
    public List<models.garaDB.tables.pojos.Carmodel> fetchByName(String... values) {
        return fetch(Carmodel.CARMODEL.NAME, values);
    }

    /**
     * Fetch records that have <code>numberOfSeats IN (values)</code>
     */
    public List<models.garaDB.tables.pojos.Carmodel> fetchByNumberofseats(Integer... values) {
        return fetch(Carmodel.CARMODEL.NUMBEROFSEATS, values);
    }

    /**
     * Fetch records that have <code>carManufactureID IN (values)</code>
     */
    public List<models.garaDB.tables.pojos.Carmodel> fetchByCarmanufactureid(Integer... values) {
        return fetch(Carmodel.CARMODEL.CARMANUFACTUREID, values);
    }

    /**
     * Fetch records that have <code>pic IN (values)</code>
     */
    public List<models.garaDB.tables.pojos.Carmodel> fetchByPic(String... values) {
        return fetch(Carmodel.CARMODEL.PIC, values);
    }

    /**
     * Fetch records that have <code>gasConsumption IN (values)</code>
     */
    public List<models.garaDB.tables.pojos.Carmodel> fetchByGasconsumption(Integer... values) {
        return fetch(Carmodel.CARMODEL.GASCONSUMPTION, values);
    }
}
