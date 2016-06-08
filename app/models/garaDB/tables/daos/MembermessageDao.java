/**
 * This class is generated by jOOQ
 */
package models.garaDB.tables.daos;


import models.garaDB.tables.Membermessage;
import models.garaDB.tables.records.MembermessageRecord;

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
public class MembermessageDao extends DAOImpl<MembermessageRecord, models.garaDB.tables.pojos.Membermessage, Integer> {

    /**
     * Create a new MembermessageDao without any configuration
     */
    public MembermessageDao() {
        super(Membermessage.MEMBERMESSAGE, models.garaDB.tables.pojos.Membermessage.class);
    }

    /**
     * Create a new MembermessageDao with an attached configuration
     */
    public MembermessageDao(Configuration configuration) {
        super(Membermessage.MEMBERMESSAGE, models.garaDB.tables.pojos.Membermessage.class, configuration);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    protected Integer getId(models.garaDB.tables.pojos.Membermessage object) {
        return object.getId();
    }

    /**
     * Fetch records that have <code>ID IN (values)</code>
     */
    public List<models.garaDB.tables.pojos.Membermessage> fetchById(Integer... values) {
        return fetch(Membermessage.MEMBERMESSAGE.ID, values);
    }

    /**
     * Fetch a unique record that has <code>ID = value</code>
     */
    public models.garaDB.tables.pojos.Membermessage fetchOneById(Integer value) {
        return fetchOne(Membermessage.MEMBERMESSAGE.ID, value);
    }

    /**
     * Fetch records that have <code>TIMESTAMP IN (values)</code>
     */
    public List<models.garaDB.tables.pojos.Membermessage> fetchByTimestamp(Timestamp... values) {
        return fetch(Membermessage.MEMBERMESSAGE.TIMESTAMP, values);
    }

    /**
     * Fetch records that have <code>from IN (values)</code>
     */
    public List<models.garaDB.tables.pojos.Membermessage> fetchByFrom(Integer... values) {
        return fetch(Membermessage.MEMBERMESSAGE.FROM, values);
    }

    /**
     * Fetch records that have <code>to IN (values)</code>
     */
    public List<models.garaDB.tables.pojos.Membermessage> fetchByTo(Integer... values) {
        return fetch(Membermessage.MEMBERMESSAGE.TO, values);
    }

    /**
     * Fetch records that have <code>message IN (values)</code>
     */
    public List<models.garaDB.tables.pojos.Membermessage> fetchByMessage(String... values) {
        return fetch(Membermessage.MEMBERMESSAGE.MESSAGE, values);
    }
}