/**
 * This class is generated by jOOQ
 */
package models.garaDB.tables;


import models.garaDB.Gara;
import models.garaDB.Keys;
import models.garaDB.tables.records.CountryRecord;

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
public class Country extends TableImpl<CountryRecord> {

    private static final long serialVersionUID = 1693215973;

    /**
     * The reference instance of <code>Gara.Country</code>
     */
    public static final Country COUNTRY = new Country();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<CountryRecord> getRecordType() {
        return CountryRecord.class;
    }

    /**
     * The column <code>Gara.Country.ID</code>.
     */
    public final TableField<CountryRecord, Integer> ID = createField("ID", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

    /**
     * The column <code>Gara.Country.name</code>.
     */
    public final TableField<CountryRecord, String> NAME = createField("name", org.jooq.impl.SQLDataType.VARCHAR.length(80).nullable(false), this, "");

    /**
     * The column <code>Gara.Country.pic</code>.
     */
    public final TableField<CountryRecord, String> PIC = createField("pic", org.jooq.impl.SQLDataType.CLOB, this, "");

    /**
     * The column <code>Gara.Country.longitude</code>.
     */
    public final TableField<CountryRecord, Double> LONGITUDE = createField("longitude", org.jooq.impl.SQLDataType.DOUBLE, this, "");

    /**
     * The column <code>Gara.Country.latitude</code>.
     */
    public final TableField<CountryRecord, Double> LATITUDE = createField("latitude", org.jooq.impl.SQLDataType.DOUBLE, this, "");

    /**
     * Create a <code>Gara.Country</code> table reference
     */
    public Country() {
        this("Country", null);
    }

    /**
     * Create an aliased <code>Gara.Country</code> table reference
     */
    public Country(String alias) {
        this(alias, COUNTRY);
    }

    private Country(String alias, Table<CountryRecord> aliased) {
        this(alias, aliased, null);
    }

    private Country(String alias, Table<CountryRecord> aliased, Field<?>[] parameters) {
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
    public Identity<CountryRecord, Integer> getIdentity() {
        return Keys.IDENTITY_COUNTRY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UniqueKey<CountryRecord> getPrimaryKey() {
        return Keys.KEY_COUNTRY_PRIMARY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<CountryRecord>> getKeys() {
        return Arrays.<UniqueKey<CountryRecord>>asList(Keys.KEY_COUNTRY_PRIMARY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Country as(String alias) {
        return new Country(alias, this);
    }

    /**
     * Rename this table
     */
    public Country rename(String name) {
        return new Country(name, null);
    }
}
