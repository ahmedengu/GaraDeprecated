/**
 * This class is generated by jOOQ
 */
package apdihp.tables.records;


import apdihp.tables.College;

import javax.annotation.Generated;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record3;
import org.jooq.Row3;
import org.jooq.impl.UpdatableRecordImpl;


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
@Entity
@Table(name = "College", schema = "Gara")
public class CollegeRecord extends UpdatableRecordImpl<CollegeRecord> implements Record3<Integer, Integer, String> {

    private static final long serialVersionUID = 1802092008;

    /**
     * Setter for <code>Gara.College.ID</code>.
     */
    public void setId(Integer value) {
        set(0, value);
    }

    /**
     * Getter for <code>Gara.College.ID</code>.
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID", unique = true, nullable = false, precision = 10)
    @NotNull
    public Integer getId() {
        return (Integer) get(0);
    }

    /**
     * Setter for <code>Gara.College.universityID</code>.
     */
    public void setUniversityid(Integer value) {
        set(1, value);
    }

    /**
     * Getter for <code>Gara.College.universityID</code>.
     */
    @Column(name = "universityID", nullable = false, precision = 10)
    @NotNull
    public Integer getUniversityid() {
        return (Integer) get(1);
    }

    /**
     * Setter for <code>Gara.College.name</code>.
     */
    public void setName(String value) {
        set(2, value);
    }

    /**
     * Getter for <code>Gara.College.name</code>.
     */
    @Column(name = "name", nullable = false, length = 65535)
    @NotNull
    @Size(max = 65535)
    public String getName() {
        return (String) get(2);
    }

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Record1<Integer> key() {
        return (Record1) super.key();
    }

    // -------------------------------------------------------------------------
    // Record3 type implementation
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Row3<Integer, Integer, String> fieldsRow() {
        return (Row3) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row3<Integer, Integer, String> valuesRow() {
        return (Row3) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field1() {
        return College.COLLEGE.ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field2() {
        return College.COLLEGE.UNIVERSITYID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field3() {
        return College.COLLEGE.NAME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value1() {
        return getId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value2() {
        return getUniversityid();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value3() {
        return getName();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public CollegeRecord value1(Integer value) {
        setId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public CollegeRecord value2(Integer value) {
        setUniversityid(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public CollegeRecord value3(String value) {
        setName(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public CollegeRecord values(Integer value1, Integer value2, String value3) {
        value1(value1);
        value2(value2);
        value3(value3);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached CollegeRecord
     */
    public CollegeRecord() {
        super(College.COLLEGE);
    }

    /**
     * Create a detached, initialised CollegeRecord
     */
    public CollegeRecord(Integer id, Integer universityid, String name) {
        super(College.COLLEGE);

        set(0, id);
        set(1, universityid);
        set(2, name);
    }
}
