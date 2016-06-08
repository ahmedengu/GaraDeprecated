/**
 * This class is generated by jOOQ
 */
package models.garaDB.tables.daos;


import models.garaDB.tables.Accesstoken;
import models.garaDB.tables.records.AccesstokenRecord;

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
public class AccesstokenDao extends DAOImpl<AccesstokenRecord, models.garaDB.tables.pojos.Accesstoken, Integer> {

    /**
     * Create a new AccesstokenDao without any configuration
     */
    public AccesstokenDao() {
        super(Accesstoken.ACCESSTOKEN, models.garaDB.tables.pojos.Accesstoken.class);
    }

    /**
     * Create a new AccesstokenDao with an attached configuration
     */
    public AccesstokenDao(Configuration configuration) {
        super(Accesstoken.ACCESSTOKEN, models.garaDB.tables.pojos.Accesstoken.class, configuration);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    protected Integer getId(models.garaDB.tables.pojos.Accesstoken object) {
        return object.getId();
    }

    /**
     * Fetch records that have <code>ID IN (values)</code>
     */
    public List<models.garaDB.tables.pojos.Accesstoken> fetchById(Integer... values) {
        return fetch(Accesstoken.ACCESSTOKEN.ID, values);
    }

    /**
     * Fetch a unique record that has <code>ID = value</code>
     */
    public models.garaDB.tables.pojos.Accesstoken fetchOneById(Integer value) {
        return fetchOne(Accesstoken.ACCESSTOKEN.ID, value);
    }

    /**
     * Fetch records that have <code>memberID IN (values)</code>
     */
    public List<models.garaDB.tables.pojos.Accesstoken> fetchByMemberid(Integer... values) {
        return fetch(Accesstoken.ACCESSTOKEN.MEMBERID, values);
    }

    /**
     * Fetch records that have <code>TIMESTAMP IN (values)</code>
     */
    public List<models.garaDB.tables.pojos.Accesstoken> fetchByTimestamp(Timestamp... values) {
        return fetch(Accesstoken.ACCESSTOKEN.TIMESTAMP, values);
    }

    /**
     * Fetch records that have <code>value IN (values)</code>
     */
    public List<models.garaDB.tables.pojos.Accesstoken> fetchByValue(String... values) {
        return fetch(Accesstoken.ACCESSTOKEN.VALUE, values);
    }

    /**
     * Fetch records that have <code>lastUsed IN (values)</code>
     */
    public List<models.garaDB.tables.pojos.Accesstoken> fetchByLastused(Timestamp... values) {
        return fetch(Accesstoken.ACCESSTOKEN.LASTUSED, values);
    }

    /**
     * Fetch records that have <code>ip IN (values)</code>
     */
    public List<models.garaDB.tables.pojos.Accesstoken> fetchByIp(String... values) {
        return fetch(Accesstoken.ACCESSTOKEN.IP, values);
    }

    /**
     * Fetch records that have <code>browser IN (values)</code>
     */
    public List<models.garaDB.tables.pojos.Accesstoken> fetchByBrowser(String... values) {
        return fetch(Accesstoken.ACCESSTOKEN.BROWSER, values);
    }
}