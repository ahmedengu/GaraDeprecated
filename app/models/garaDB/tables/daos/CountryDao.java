/**
 * This class is generated by jOOQ
 */
package models.garaDB.tables.daos;


import models.garaDB.tables.Country;
import models.garaDB.tables.records.CountryRecord;

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
public class CountryDao extends DAOImpl<CountryRecord, models.garaDB.tables.pojos.Country, Integer> {

    /**
     * Create a new CountryDao without any configuration
     */
    public CountryDao() {
        super(Country.COUNTRY, models.garaDB.tables.pojos.Country.class);
    }

    /**
     * Create a new CountryDao with an attached configuration
     */
    public CountryDao(Configuration configuration) {
        super(Country.COUNTRY, models.garaDB.tables.pojos.Country.class, configuration);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    protected Integer getId(models.garaDB.tables.pojos.Country object) {
        return object.getId();
    }

    /**
     * Fetch records that have <code>ID IN (values)</code>
     */
    public List<models.garaDB.tables.pojos.Country> fetchById(Integer... values) {
        return fetch(Country.COUNTRY.ID, values);
    }

    /**
     * Fetch a unique record that has <code>ID = value</code>
     */
    public models.garaDB.tables.pojos.Country fetchOneById(Integer value) {
        return fetchOne(Country.COUNTRY.ID, value);
    }

    /**
     * Fetch records that have <code>name IN (values)</code>
     */
    public List<models.garaDB.tables.pojos.Country> fetchByName(String... values) {
        return fetch(Country.COUNTRY.NAME, values);
    }

    /**
     * Fetch records that have <code>pic IN (values)</code>
     */
    public List<models.garaDB.tables.pojos.Country> fetchByPic(String... values) {
        return fetch(Country.COUNTRY.PIC, values);
    }

    /**
     * Fetch records that have <code>longitude IN (values)</code>
     */
    public List<models.garaDB.tables.pojos.Country> fetchByLongitude(Double... values) {
        return fetch(Country.COUNTRY.LONGITUDE, values);
    }

    /**
     * Fetch records that have <code>latitude IN (values)</code>
     */
    public List<models.garaDB.tables.pojos.Country> fetchByLatitude(Double... values) {
        return fetch(Country.COUNTRY.LATITUDE, values);
    }
}
