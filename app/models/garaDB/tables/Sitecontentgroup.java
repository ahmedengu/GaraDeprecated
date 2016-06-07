/**
 * This class is generated by jOOQ
 */
package models.garaDB.tables;


import models.garaDB.Gara;
import models.garaDB.Keys;
import models.garaDB.tables.records.SitecontentgroupRecord;

import java.util.Arrays;
import java.util.List;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Identity;
import org.jooq.Schema;
import org.jooq.Table;
import org.jooq.TableField;
import org.jooq.UniqueKey;
import org.jooq.impl.TableImpl;


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
public class Sitecontentgroup extends TableImpl<SitecontentgroupRecord> {

    private static final long serialVersionUID = 1277660868;

    /**
     * The reference instance of <code>Gara.SiteContentGroup</code>
     */
    public static final Sitecontentgroup SITECONTENTGROUP = new Sitecontentgroup();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<SitecontentgroupRecord> getRecordType() {
        return SitecontentgroupRecord.class;
    }

    /**
     * The column <code>Gara.SiteContentGroup.ID</code>.
     */
    public final TableField<SitecontentgroupRecord, Integer> ID = createField("ID", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

    /**
     * The column <code>Gara.SiteContentGroup.name</code>.
     */
    public final TableField<SitecontentgroupRecord, String> NAME = createField("name", org.jooq.impl.SQLDataType.CLOB.nullable(false), this, "");

    /**
     * Create a <code>Gara.SiteContentGroup</code> table reference
     */
    public Sitecontentgroup() {
        this("SiteContentGroup", null);
    }

    /**
     * Create an aliased <code>Gara.SiteContentGroup</code> table reference
     */
    public Sitecontentgroup(String alias) {
        this(alias, SITECONTENTGROUP);
    }

    private Sitecontentgroup(String alias, Table<SitecontentgroupRecord> aliased) {
        this(alias, aliased, null);
    }

    private Sitecontentgroup(String alias, Table<SitecontentgroupRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, "");
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Schema getSchema() {
        return Gara.GARA;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Identity<SitecontentgroupRecord, Integer> getIdentity() {
        return Keys.IDENTITY_SITECONTENTGROUP;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UniqueKey<SitecontentgroupRecord> getPrimaryKey() {
        return Keys.KEY_SITECONTENTGROUP_PRIMARY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<SitecontentgroupRecord>> getKeys() {
        return Arrays.<UniqueKey<SitecontentgroupRecord>>asList(Keys.KEY_SITECONTENTGROUP_PRIMARY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Sitecontentgroup as(String alias) {
        return new Sitecontentgroup(alias, this);
    }

    /**
     * Rename this table
     */
    public Sitecontentgroup rename(String name) {
        return new Sitecontentgroup(name, null);
    }
}
