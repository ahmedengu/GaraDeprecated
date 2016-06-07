/**
 * This class is generated by jOOQ
 */
package apdihp.tables.daos;


import apdihp.tables.Membercard;
import apdihp.tables.records.MembercardRecord;

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
public class MembercardDao extends DAOImpl<MembercardRecord, apdihp.tables.pojos.Membercard, Integer> {

    /**
     * Create a new MembercardDao without any configuration
     */
    public MembercardDao() {
        super(Membercard.MEMBERCARD, apdihp.tables.pojos.Membercard.class);
    }

    /**
     * Create a new MembercardDao with an attached configuration
     */
    public MembercardDao(Configuration configuration) {
        super(Membercard.MEMBERCARD, apdihp.tables.pojos.Membercard.class, configuration);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    protected Integer getId(apdihp.tables.pojos.Membercard object) {
        return object.getId();
    }

    /**
     * Fetch records that have <code>ID IN (values)</code>
     */
    public List<apdihp.tables.pojos.Membercard> fetchById(Integer... values) {
        return fetch(Membercard.MEMBERCARD.ID, values);
    }

    /**
     * Fetch a unique record that has <code>ID = value</code>
     */
    public apdihp.tables.pojos.Membercard fetchOneById(Integer value) {
        return fetchOne(Membercard.MEMBERCARD.ID, value);
    }

    /**
     * Fetch records that have <code>memberID IN (values)</code>
     */
    public List<apdihp.tables.pojos.Membercard> fetchByMemberid(Integer... values) {
        return fetch(Membercard.MEMBERCARD.MEMBERID, values);
    }

    /**
     * Fetch records that have <code>type IN (values)</code>
     */
    public List<apdihp.tables.pojos.Membercard> fetchByType(String... values) {
        return fetch(Membercard.MEMBERCARD.TYPE, values);
    }

    /**
     * Fetch records that have <code>number IN (values)</code>
     */
    public List<apdihp.tables.pojos.Membercard> fetchByNumber(String... values) {
        return fetch(Membercard.MEMBERCARD.NUMBER, values);
    }

    /**
     * Fetch records that have <code>expireDate IN (values)</code>
     */
    public List<apdihp.tables.pojos.Membercard> fetchByExpiredate(String... values) {
        return fetch(Membercard.MEMBERCARD.EXPIREDATE, values);
    }

    /**
     * Fetch records that have <code>secrit IN (values)</code>
     */
    public List<apdihp.tables.pojos.Membercard> fetchBySecrit(String... values) {
        return fetch(Membercard.MEMBERCARD.SECRIT, values);
    }
}
