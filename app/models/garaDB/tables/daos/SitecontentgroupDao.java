/**
 * This class is generated by jOOQ
 */
package models.garaDB.tables.daos;


import models.garaDB.tables.Sitecontentgroup;
import models.garaDB.tables.records.SitecontentgroupRecord;

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
public class SitecontentgroupDao extends DAOImpl<SitecontentgroupRecord, models.garaDB.tables.pojos.Sitecontentgroup, Integer> {

    /**
     * Create a new SitecontentgroupDao without any configuration
     */
    public SitecontentgroupDao() {
        super(Sitecontentgroup.SITECONTENTGROUP, models.garaDB.tables.pojos.Sitecontentgroup.class);
    }

    /**
     * Create a new SitecontentgroupDao with an attached configuration
     */
    public SitecontentgroupDao(Configuration configuration) {
        super(Sitecontentgroup.SITECONTENTGROUP, models.garaDB.tables.pojos.Sitecontentgroup.class, configuration);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    protected Integer getId(models.garaDB.tables.pojos.Sitecontentgroup object) {
        return object.getId();
    }

    /**
     * Fetch records that have <code>ID IN (values)</code>
     */
    public List<models.garaDB.tables.pojos.Sitecontentgroup> fetchById(Integer... values) {
        return fetch(Sitecontentgroup.SITECONTENTGROUP.ID, values);
    }

    /**
     * Fetch a unique record that has <code>ID = value</code>
     */
    public models.garaDB.tables.pojos.Sitecontentgroup fetchOneById(Integer value) {
        return fetchOne(Sitecontentgroup.SITECONTENTGROUP.ID, value);
    }

    /**
     * Fetch records that have <code>name IN (values)</code>
     */
    public List<models.garaDB.tables.pojos.Sitecontentgroup> fetchByName(String... values) {
        return fetch(Sitecontentgroup.SITECONTENTGROUP.NAME, values);
    }
}
