/**
 * This class is generated by jOOQ
 */
package models.garaDB.tables.records;


import models.garaDB.tables.Sitecontent;

import java.sql.Timestamp;

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
import org.jooq.Record8;
import org.jooq.Row8;
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
@Table(name = "SiteContent", schema = "Gara")
public class SitecontentRecord extends UpdatableRecordImpl<SitecontentRecord> implements Record8<Integer, Timestamp, String, String, String, String, String, String> {

    private static final long serialVersionUID = -2055819592;

    /**
     * Setter for <code>Gara.SiteContent.ID</code>.
     */
    public void setId(Integer value) {
        set(0, value);
    }

    /**
     * Getter for <code>Gara.SiteContent.ID</code>.
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID", unique = true, precision = 10)
    public Integer getId() {
        return (Integer) get(0);
    }

    /**
     * Setter for <code>Gara.SiteContent.TIMESTAMP</code>.
     */
    public void setTimestamp(Timestamp value) {
        set(1, value);
    }

    /**
     * Getter for <code>Gara.SiteContent.TIMESTAMP</code>.
     */
    @Column(name = "TIMESTAMP", nullable = false)
    public Timestamp getTimestamp() {
        return (Timestamp) get(1);
    }

    /**
     * Setter for <code>Gara.SiteContent.title</code>.
     */
    public void setTitle(String value) {
        set(2, value);
    }

    /**
     * Getter for <code>Gara.SiteContent.title</code>.
     */
    @Column(name = "title", length = 65535)
    @Size(max = 65535)
    public String getTitle() {
        return (String) get(2);
    }

    /**
     * Setter for <code>Gara.SiteContent.body</code>.
     */
    public void setBody(String value) {
        set(3, value);
    }

    /**
     * Getter for <code>Gara.SiteContent.body</code>.
     */
    @Column(name = "body", length = 65535)
    @Size(max = 65535)
    public String getBody() {
        return (String) get(3);
    }

    /**
     * Setter for <code>Gara.SiteContent.link</code>.
     */
    public void setLink(String value) {
        set(4, value);
    }

    /**
     * Getter for <code>Gara.SiteContent.link</code>.
     */
    @Column(name = "link", length = 65535)
    @Size(max = 65535)
    public String getLink() {
        return (String) get(4);
    }

    /**
     * Setter for <code>Gara.SiteContent.description</code>.
     */
    public void setDescription(String value) {
        set(5, value);
    }

    /**
     * Getter for <code>Gara.SiteContent.description</code>.
     */
    @Column(name = "description", length = 65535)
    @Size(max = 65535)
    public String getDescription() {
        return (String) get(5);
    }

    /**
     * Setter for <code>Gara.SiteContent.keywords</code>.
     */
    public void setKeywords(String value) {
        set(6, value);
    }

    /**
     * Getter for <code>Gara.SiteContent.keywords</code>.
     */
    @Column(name = "keywords", length = 65535)
    @Size(max = 65535)
    public String getKeywords() {
        return (String) get(6);
    }

    /**
     * Setter for <code>Gara.SiteContent.pic</code>.
     */
    public void setPic(String value) {
        set(7, value);
    }

    /**
     * Getter for <code>Gara.SiteContent.pic</code>.
     */
    @Column(name = "pic", length = 65535)
    @Size(max = 65535)
    public String getPic() {
        return (String) get(7);
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
    // Record8 type implementation
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Row8<Integer, Timestamp, String, String, String, String, String, String> fieldsRow() {
        return (Row8) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row8<Integer, Timestamp, String, String, String, String, String, String> valuesRow() {
        return (Row8) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field1() {
        return Sitecontent.SITECONTENT.ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Timestamp> field2() {
        return Sitecontent.SITECONTENT.TIMESTAMP;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field3() {
        return Sitecontent.SITECONTENT.TITLE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field4() {
        return Sitecontent.SITECONTENT.BODY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field5() {
        return Sitecontent.SITECONTENT.LINK;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field6() {
        return Sitecontent.SITECONTENT.DESCRIPTION;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field7() {
        return Sitecontent.SITECONTENT.KEYWORDS;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field8() {
        return Sitecontent.SITECONTENT.PIC;
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
    public Timestamp value2() {
        return getTimestamp();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value3() {
        return getTitle();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value4() {
        return getBody();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value5() {
        return getLink();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value6() {
        return getDescription();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value7() {
        return getKeywords();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value8() {
        return getPic();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public SitecontentRecord value1(Integer value) {
        setId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public SitecontentRecord value2(Timestamp value) {
        setTimestamp(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public SitecontentRecord value3(String value) {
        setTitle(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public SitecontentRecord value4(String value) {
        setBody(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public SitecontentRecord value5(String value) {
        setLink(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public SitecontentRecord value6(String value) {
        setDescription(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public SitecontentRecord value7(String value) {
        setKeywords(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public SitecontentRecord value8(String value) {
        setPic(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public SitecontentRecord values(Integer value1, Timestamp value2, String value3, String value4, String value5, String value6, String value7, String value8) {
        value1(value1);
        value2(value2);
        value3(value3);
        value4(value4);
        value5(value5);
        value6(value6);
        value7(value7);
        value8(value8);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached SitecontentRecord
     */
    public SitecontentRecord() {
        super(Sitecontent.SITECONTENT);
    }

    /**
     * Create a detached, initialised SitecontentRecord
     */
    public SitecontentRecord(Integer id, Timestamp timestamp, String title, String body, String link, String description, String keywords, String pic) {
        super(Sitecontent.SITECONTENT);

        set(0, id);
        set(1, timestamp);
        set(2, title);
        set(3, body);
        set(4, link);
        set(5, description);
        set(6, keywords);
        set(7, pic);
    }
}
