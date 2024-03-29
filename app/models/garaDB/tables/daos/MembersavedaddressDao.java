/**
 * This class is generated by jOOQ
 */
package models.garaDB.tables.daos;


import models.garaDB.tables.Membersavedaddress;
import models.garaDB.tables.records.MembersavedaddressRecord;

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
public class MembersavedaddressDao extends DAOImpl<MembersavedaddressRecord, models.garaDB.tables.pojos.Membersavedaddress, Integer> {

    /**
     * Create a new MembersavedaddressDao without any configuration
     */
    public MembersavedaddressDao() {
        super(Membersavedaddress.MEMBERSAVEDADDRESS, models.garaDB.tables.pojos.Membersavedaddress.class);
    }

    /**
     * Create a new MembersavedaddressDao with an attached configuration
     */
    public MembersavedaddressDao(Configuration configuration) {
        super(Membersavedaddress.MEMBERSAVEDADDRESS, models.garaDB.tables.pojos.Membersavedaddress.class, configuration);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    protected Integer getId(models.garaDB.tables.pojos.Membersavedaddress object) {
        return object.getId();
    }

    /**
     * Fetch records that have <code>ID IN (values)</code>
     */
    public List<models.garaDB.tables.pojos.Membersavedaddress> fetchById(Integer... values) {
        return fetch(Membersavedaddress.MEMBERSAVEDADDRESS.ID, values);
    }

    /**
     * Fetch a unique record that has <code>ID = value</code>
     */
    public models.garaDB.tables.pojos.Membersavedaddress fetchOneById(Integer value) {
        return fetchOne(Membersavedaddress.MEMBERSAVEDADDRESS.ID, value);
    }

    /**
     * Fetch records that have <code>memberID IN (values)</code>
     */
    public List<models.garaDB.tables.pojos.Membersavedaddress> fetchByMemberid(Integer... values) {
        return fetch(Membersavedaddress.MEMBERSAVEDADDRESS.MEMBERID, values);
    }

    /**
     * Fetch records that have <code>name IN (values)</code>
     */
    public List<models.garaDB.tables.pojos.Membersavedaddress> fetchByName(String... values) {
        return fetch(Membersavedaddress.MEMBERSAVEDADDRESS.NAME, values);
    }

    /**
     * Fetch records that have <code>address IN (values)</code>
     */
    public List<models.garaDB.tables.pojos.Membersavedaddress> fetchByAddress(String... values) {
        return fetch(Membersavedaddress.MEMBERSAVEDADDRESS.ADDRESS, values);
    }

    /**
     * Fetch records that have <code>latitude IN (values)</code>
     */
    public List<models.garaDB.tables.pojos.Membersavedaddress> fetchByLatitude(Double... values) {
        return fetch(Membersavedaddress.MEMBERSAVEDADDRESS.LATITUDE, values);
    }

    /**
     * Fetch records that have <code>longitude IN (values)</code>
     */
    public List<models.garaDB.tables.pojos.Membersavedaddress> fetchByLongitude(Double... values) {
        return fetch(Membersavedaddress.MEMBERSAVEDADDRESS.LONGITUDE, values);
    }

    /**
     * Fetch records that have <code>TIMESTAMP IN (values)</code>
     */
    public List<models.garaDB.tables.pojos.Membersavedaddress> fetchByTimestamp(Timestamp... values) {
        return fetch(Membersavedaddress.MEMBERSAVEDADDRESS.TIMESTAMP, values);
    }
}
