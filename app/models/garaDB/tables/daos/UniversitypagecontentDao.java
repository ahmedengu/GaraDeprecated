/**
 * This class is generated by jOOQ
 */
package models.garaDB.tables.daos;


import models.garaDB.tables.Universitypagecontent;
import models.garaDB.tables.records.UniversitypagecontentRecord;

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
public class UniversitypagecontentDao extends DAOImpl<UniversitypagecontentRecord, models.garaDB.tables.pojos.Universitypagecontent, Integer> {

    /**
     * Create a new UniversitypagecontentDao without any configuration
     */
    public UniversitypagecontentDao() {
        super(Universitypagecontent.UNIVERSITYPAGECONTENT, models.garaDB.tables.pojos.Universitypagecontent.class);
    }

    /**
     * Create a new UniversitypagecontentDao with an attached configuration
     */
    public UniversitypagecontentDao(Configuration configuration) {
        super(Universitypagecontent.UNIVERSITYPAGECONTENT, models.garaDB.tables.pojos.Universitypagecontent.class, configuration);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    protected Integer getId(models.garaDB.tables.pojos.Universitypagecontent object) {
        return object.getId();
    }

    /**
     * Fetch records that have <code>ID IN (values)</code>
     */
    public List<models.garaDB.tables.pojos.Universitypagecontent> fetchById(Integer... values) {
        return fetch(Universitypagecontent.UNIVERSITYPAGECONTENT.ID, values);
    }

    /**
     * Fetch a unique record that has <code>ID = value</code>
     */
    public models.garaDB.tables.pojos.Universitypagecontent fetchOneById(Integer value) {
        return fetchOne(Universitypagecontent.UNIVERSITYPAGECONTENT.ID, value);
    }

    /**
     * Fetch records that have <code>TIMESTAMP IN (values)</code>
     */
    public List<models.garaDB.tables.pojos.Universitypagecontent> fetchByTimestamp(Timestamp... values) {
        return fetch(Universitypagecontent.UNIVERSITYPAGECONTENT.TIMESTAMP, values);
    }

    /**
     * Fetch records that have <code>title IN (values)</code>
     */
    public List<models.garaDB.tables.pojos.Universitypagecontent> fetchByTitle(String... values) {
        return fetch(Universitypagecontent.UNIVERSITYPAGECONTENT.TITLE, values);
    }

    /**
     * Fetch records that have <code>body IN (values)</code>
     */
    public List<models.garaDB.tables.pojos.Universitypagecontent> fetchByBody(String... values) {
        return fetch(Universitypagecontent.UNIVERSITYPAGECONTENT.BODY, values);
    }

    /**
     * Fetch records that have <code>link IN (values)</code>
     */
    public List<models.garaDB.tables.pojos.Universitypagecontent> fetchByLink(String... values) {
        return fetch(Universitypagecontent.UNIVERSITYPAGECONTENT.LINK, values);
    }

    /**
     * Fetch records that have <code>description IN (values)</code>
     */
    public List<models.garaDB.tables.pojos.Universitypagecontent> fetchByDescription(String... values) {
        return fetch(Universitypagecontent.UNIVERSITYPAGECONTENT.DESCRIPTION, values);
    }

    /**
     * Fetch records that have <code>keywords IN (values)</code>
     */
    public List<models.garaDB.tables.pojos.Universitypagecontent> fetchByKeywords(String... values) {
        return fetch(Universitypagecontent.UNIVERSITYPAGECONTENT.KEYWORDS, values);
    }

    /**
     * Fetch records that have <code>pic IN (values)</code>
     */
    public List<models.garaDB.tables.pojos.Universitypagecontent> fetchByPic(String... values) {
        return fetch(Universitypagecontent.UNIVERSITYPAGECONTENT.PIC, values);
    }

    /**
     * Fetch records that have <code>universityID IN (values)</code>
     */
    public List<models.garaDB.tables.pojos.Universitypagecontent> fetchByUniversityid(Integer... values) {
        return fetch(Universitypagecontent.UNIVERSITYPAGECONTENT.UNIVERSITYID, values);
    }
}
