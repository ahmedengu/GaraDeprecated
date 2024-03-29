/**
 * This class is generated by jOOQ
 */
package models.garaDB.tables;


import models.garaDB.Gara;
import models.garaDB.Keys;
import models.garaDB.tables.records.ReviewRecord;

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
public class Review extends TableImpl<ReviewRecord> {

    private static final long serialVersionUID = 1838978060;

    /**
     * The reference instance of <code>gara.Review</code>
     */
    public static final Review REVIEW = new Review();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<ReviewRecord> getRecordType() {
        return ReviewRecord.class;
    }

    /**
     * The column <code>gara.Review.ID</code>.
     */
    public final TableField<ReviewRecord, Integer> ID = createField("ID", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

    /**
     * The column <code>gara.Review.reviewerMemberID</code>.
     */
    public final TableField<ReviewRecord, Integer> REVIEWERMEMBERID = createField("reviewerMemberID", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

    /**
     * The column <code>gara.Review.reviewedMemberID</code>.
     */
    public final TableField<ReviewRecord, Integer> REVIEWEDMEMBERID = createField("reviewedMemberID", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

    /**
     * The column <code>gara.Review.rating</code>.
     */
    public final TableField<ReviewRecord, Integer> RATING = createField("rating", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

    /**
     * The column <code>gara.Review.comment</code>.
     */
    public final TableField<ReviewRecord, String> COMMENT = createField("comment", org.jooq.impl.SQLDataType.CLOB, this, "");

    /**
     * The column <code>gara.Review.TIMESTAMP</code>.
     */
    public final TableField<ReviewRecord, Timestamp> TIMESTAMP = createField("TIMESTAMP", org.jooq.impl.SQLDataType.TIMESTAMP.nullable(false).defaultValue(org.jooq.impl.DSL.field("CURRENT_TIMESTAMP", org.jooq.impl.SQLDataType.TIMESTAMP)), this, "");

    /**
     * Create a <code>gara.Review</code> table reference
     */
    public Review() {
        this("Review", null);
    }

    /**
     * Create an aliased <code>gara.Review</code> table reference
     */
    public Review(String alias) {
        this(alias, REVIEW);
    }

    private Review(String alias, Table<ReviewRecord> aliased) {
        this(alias, aliased, null);
    }

    private Review(String alias, Table<ReviewRecord> aliased, Field<?>[] parameters) {
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
    public Identity<ReviewRecord, Integer> getIdentity() {
        return Keys.IDENTITY_REVIEW;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UniqueKey<ReviewRecord> getPrimaryKey() {
        return Keys.KEY_REVIEW_PRIMARY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<ReviewRecord>> getKeys() {
        return Arrays.<UniqueKey<ReviewRecord>>asList(Keys.KEY_REVIEW_PRIMARY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<ForeignKey<ReviewRecord, ?>> getReferences() {
        return Arrays.<ForeignKey<ReviewRecord, ?>>asList(Keys.FKREVIEW627031, Keys.FKREVIEW185272);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Review as(String alias) {
        return new Review(alias, this);
    }

    /**
     * Rename this table
     */
    public Review rename(String name) {
        return new Review(name, null);
    }
}
