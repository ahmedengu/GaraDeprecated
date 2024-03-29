/**
 * This class is generated by jOOQ
 */
package models.garaDB.tables.daos;


import models.garaDB.tables.Siteoption;
import models.garaDB.tables.records.SiteoptionRecord;

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
public class SiteoptionDao extends DAOImpl<SiteoptionRecord, models.garaDB.tables.pojos.Siteoption, Integer> {

    /**
     * Create a new SiteoptionDao without any configuration
     */
    public SiteoptionDao() {
        super(Siteoption.SITEOPTION, models.garaDB.tables.pojos.Siteoption.class);
    }

    /**
     * Create a new SiteoptionDao with an attached configuration
     */
    public SiteoptionDao(Configuration configuration) {
        super(Siteoption.SITEOPTION, models.garaDB.tables.pojos.Siteoption.class, configuration);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    protected Integer getId(models.garaDB.tables.pojos.Siteoption object) {
        return object.getId();
    }

    /**
     * Fetch records that have <code>ID IN (values)</code>
     */
    public List<models.garaDB.tables.pojos.Siteoption> fetchById(Integer... values) {
        return fetch(Siteoption.SITEOPTION.ID, values);
    }

    /**
     * Fetch a unique record that has <code>ID = value</code>
     */
    public models.garaDB.tables.pojos.Siteoption fetchOneById(Integer value) {
        return fetchOne(Siteoption.SITEOPTION.ID, value);
    }

    /**
     * Fetch records that have <code>name IN (values)</code>
     */
    public List<models.garaDB.tables.pojos.Siteoption> fetchByName(String... values) {
        return fetch(Siteoption.SITEOPTION.NAME, values);
    }

    /**
     * Fetch records that have <code>value IN (values)</code>
     */
    public List<models.garaDB.tables.pojos.Siteoption> fetchByValue(String... values) {
        return fetch(Siteoption.SITEOPTION.VALUE, values);
    }
}
