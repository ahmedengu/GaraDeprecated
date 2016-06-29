/**
 * This class is generated by jOOQ
 */
package models.garaDB.tables;


import models.garaDB.Gara;
import models.garaDB.tables.records.DatabasechangelogRecord;

import java.sql.Timestamp;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Schema;
import org.jooq.Table;
import org.jooq.TableField;
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
public class Databasechangelog extends TableImpl<DatabasechangelogRecord> {

    private static final long serialVersionUID = 230229796;

    /**
     * The reference instance of <code>gara.DATABASECHANGELOG</code>
     */
    public static final Databasechangelog DATABASECHANGELOG = new Databasechangelog();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<DatabasechangelogRecord> getRecordType() {
        return DatabasechangelogRecord.class;
    }

    /**
     * The column <code>gara.DATABASECHANGELOG.ID</code>.
     */
    public final TableField<DatabasechangelogRecord, String> ID = createField("ID", org.jooq.impl.SQLDataType.VARCHAR.length(255).nullable(false), this, "");

    /**
     * The column <code>gara.DATABASECHANGELOG.AUTHOR</code>.
     */
    public final TableField<DatabasechangelogRecord, String> AUTHOR = createField("AUTHOR", org.jooq.impl.SQLDataType.VARCHAR.length(255).nullable(false), this, "");

    /**
     * The column <code>gara.DATABASECHANGELOG.FILENAME</code>.
     */
    public final TableField<DatabasechangelogRecord, String> FILENAME = createField("FILENAME", org.jooq.impl.SQLDataType.VARCHAR.length(255).nullable(false), this, "");

    /**
     * The column <code>gara.DATABASECHANGELOG.DATEEXECUTED</code>.
     */
    public final TableField<DatabasechangelogRecord, Timestamp> DATEEXECUTED = createField("DATEEXECUTED", org.jooq.impl.SQLDataType.TIMESTAMP.nullable(false), this, "");

    /**
     * The column <code>gara.DATABASECHANGELOG.ORDEREXECUTED</code>.
     */
    public final TableField<DatabasechangelogRecord, Integer> ORDEREXECUTED = createField("ORDEREXECUTED", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

    /**
     * The column <code>gara.DATABASECHANGELOG.EXECTYPE</code>.
     */
    public final TableField<DatabasechangelogRecord, String> EXECTYPE = createField("EXECTYPE", org.jooq.impl.SQLDataType.VARCHAR.length(10).nullable(false), this, "");

    /**
     * The column <code>gara.DATABASECHANGELOG.MD5SUM</code>.
     */
    public final TableField<DatabasechangelogRecord, String> MD5SUM = createField("MD5SUM", org.jooq.impl.SQLDataType.VARCHAR.length(35), this, "");

    /**
     * The column <code>gara.DATABASECHANGELOG.DESCRIPTION</code>.
     */
    public final TableField<DatabasechangelogRecord, String> DESCRIPTION = createField("DESCRIPTION", org.jooq.impl.SQLDataType.VARCHAR.length(255), this, "");

    /**
     * The column <code>gara.DATABASECHANGELOG.COMMENTS</code>.
     */
    public final TableField<DatabasechangelogRecord, String> COMMENTS = createField("COMMENTS", org.jooq.impl.SQLDataType.VARCHAR.length(255), this, "");

    /**
     * The column <code>gara.DATABASECHANGELOG.TAG</code>.
     */
    public final TableField<DatabasechangelogRecord, String> TAG = createField("TAG", org.jooq.impl.SQLDataType.VARCHAR.length(255), this, "");

    /**
     * The column <code>gara.DATABASECHANGELOG.LIQUIBASE</code>.
     */
    public final TableField<DatabasechangelogRecord, String> LIQUIBASE = createField("LIQUIBASE", org.jooq.impl.SQLDataType.VARCHAR.length(20), this, "");

    /**
     * Create a <code>gara.DATABASECHANGELOG</code> table reference
     */
    public Databasechangelog() {
        this("DATABASECHANGELOG", null);
    }

    /**
     * Create an aliased <code>gara.DATABASECHANGELOG</code> table reference
     */
    public Databasechangelog(String alias) {
        this(alias, DATABASECHANGELOG);
    }

    private Databasechangelog(String alias, Table<DatabasechangelogRecord> aliased) {
        this(alias, aliased, null);
    }

    private Databasechangelog(String alias, Table<DatabasechangelogRecord> aliased, Field<?>[] parameters) {
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
    public Databasechangelog as(String alias) {
        return new Databasechangelog(alias, this);
    }

    /**
     * Rename this table
     */
    public Databasechangelog rename(String name) {
        return new Databasechangelog(name, null);
    }
}
