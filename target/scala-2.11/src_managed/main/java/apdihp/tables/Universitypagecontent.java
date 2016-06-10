/**
 * This class is generated by jOOQ
 */
package apdihp.tables;


import apdihp.Gara;
import apdihp.Keys;
import apdihp.tables.records.UniversitypagecontentRecord;

import java.sql.Timestamp;
import java.util.Arrays;
import java.util.List;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.ForeignKey;
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
public class Universitypagecontent extends TableImpl<UniversitypagecontentRecord> {

    private static final long serialVersionUID = 1143386362;

    /**
     * The reference instance of <code>Gara.UniversityPageContent</code>
     */
    public static final Universitypagecontent UNIVERSITYPAGECONTENT = new Universitypagecontent();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<UniversitypagecontentRecord> getRecordType() {
        return UniversitypagecontentRecord.class;
    }

    /**
     * The column <code>Gara.UniversityPageContent.ID</code>.
     */
    public final TableField<UniversitypagecontentRecord, Integer> ID = createField("ID", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

    /**
     * The column <code>Gara.UniversityPageContent.TIMESTAMP</code>.
     */
    public final TableField<UniversitypagecontentRecord, Timestamp> TIMESTAMP = createField("TIMESTAMP", org.jooq.impl.SQLDataType.TIMESTAMP.nullable(false).defaultValue(org.jooq.impl.DSL.field("CURRENT_TIMESTAMP", org.jooq.impl.SQLDataType.TIMESTAMP)), this, "");

    /**
     * The column <code>Gara.UniversityPageContent.title</code>.
     */
    public final TableField<UniversitypagecontentRecord, String> TITLE = createField("title", org.jooq.impl.SQLDataType.CLOB, this, "");

    /**
     * The column <code>Gara.UniversityPageContent.body</code>.
     */
    public final TableField<UniversitypagecontentRecord, String> BODY = createField("body", org.jooq.impl.SQLDataType.CLOB, this, "");

    /**
     * The column <code>Gara.UniversityPageContent.link</code>.
     */
    public final TableField<UniversitypagecontentRecord, String> LINK = createField("link", org.jooq.impl.SQLDataType.CLOB, this, "");

    /**
     * The column <code>Gara.UniversityPageContent.description</code>.
     */
    public final TableField<UniversitypagecontentRecord, String> DESCRIPTION = createField("description", org.jooq.impl.SQLDataType.CLOB, this, "");

    /**
     * The column <code>Gara.UniversityPageContent.keywords</code>.
     */
    public final TableField<UniversitypagecontentRecord, String> KEYWORDS = createField("keywords", org.jooq.impl.SQLDataType.CLOB, this, "");

    /**
     * The column <code>Gara.UniversityPageContent.pic</code>.
     */
    public final TableField<UniversitypagecontentRecord, String> PIC = createField("pic", org.jooq.impl.SQLDataType.CLOB, this, "");

    /**
     * The column <code>Gara.UniversityPageContent.universityID</code>.
     */
    public final TableField<UniversitypagecontentRecord, Integer> UNIVERSITYID = createField("universityID", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

    /**
     * Create a <code>Gara.UniversityPageContent</code> table reference
     */
    public Universitypagecontent() {
        this("UniversityPageContent", null);
    }

    /**
     * Create an aliased <code>Gara.UniversityPageContent</code> table reference
     */
    public Universitypagecontent(String alias) {
        this(alias, UNIVERSITYPAGECONTENT);
    }

    private Universitypagecontent(String alias, Table<UniversitypagecontentRecord> aliased) {
        this(alias, aliased, null);
    }

    private Universitypagecontent(String alias, Table<UniversitypagecontentRecord> aliased, Field<?>[] parameters) {
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
    public Identity<UniversitypagecontentRecord, Integer> getIdentity() {
        return Keys.IDENTITY_UNIVERSITYPAGECONTENT;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UniqueKey<UniversitypagecontentRecord> getPrimaryKey() {
        return Keys.KEY_UNIVERSITYPAGECONTENT_PRIMARY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<UniversitypagecontentRecord>> getKeys() {
        return Arrays.<UniqueKey<UniversitypagecontentRecord>>asList(Keys.KEY_UNIVERSITYPAGECONTENT_PRIMARY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<ForeignKey<UniversitypagecontentRecord, ?>> getReferences() {
        return Arrays.<ForeignKey<UniversitypagecontentRecord, ?>>asList(Keys.FKUNIVERSITY451983);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Universitypagecontent as(String alias) {
        return new Universitypagecontent(alias, this);
    }

    /**
     * Rename this table
     */
    public Universitypagecontent rename(String name) {
        return new Universitypagecontent(name, null);
    }
}
