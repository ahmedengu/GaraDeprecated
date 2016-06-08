/**
 * This class is generated by jOOQ
 */
package apdihp.tables.records;


import apdihp.tables.University;

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
import org.jooq.Record15;
import org.jooq.Row15;
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
@Table(name = "University", schema = "Gara")
public class UniversityRecord extends UpdatableRecordImpl<UniversityRecord> implements Record15<Integer, String, Integer, Double, Double, String, String, String, String, String, String, String, String, String, String> {

    private static final long serialVersionUID = 1753737599;

    /**
     * Setter for <code>Gara.University.ID</code>.
     */
    public void setId(Integer value) {
        set(0, value);
    }

    /**
     * Getter for <code>Gara.University.ID</code>.
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID", unique = true, nullable = false, precision = 10)
    @NotNull
    public Integer getId() {
        return (Integer) get(0);
    }

    /**
     * Setter for <code>Gara.University.name</code>.
     */
    public void setName(String value) {
        set(1, value);
    }

    /**
     * Getter for <code>Gara.University.name</code>.
     */
    @Column(name = "name", nullable = false, length = 65535)
    @NotNull
    @Size(max = 65535)
    public String getName() {
        return (String) get(1);
    }

    /**
     * Setter for <code>Gara.University.cityID</code>.
     */
    public void setCityid(Integer value) {
        set(2, value);
    }

    /**
     * Getter for <code>Gara.University.cityID</code>.
     */
    @Column(name = "cityID", nullable = false, precision = 10)
    @NotNull
    public Integer getCityid() {
        return (Integer) get(2);
    }

    /**
     * Setter for <code>Gara.University.longitude</code>.
     */
    public void setLongitude(Double value) {
        set(3, value);
    }

    /**
     * Getter for <code>Gara.University.longitude</code>.
     */
    @Column(name = "longitude", precision = 22)
    public Double getLongitude() {
        return (Double) get(3);
    }

    /**
     * Setter for <code>Gara.University.latitude</code>.
     */
    public void setLatitude(Double value) {
        set(4, value);
    }

    /**
     * Getter for <code>Gara.University.latitude</code>.
     */
    @Column(name = "latitude", precision = 22)
    public Double getLatitude() {
        return (Double) get(4);
    }

    /**
     * Setter for <code>Gara.University.pic</code>.
     */
    public void setPic(String value) {
        set(5, value);
    }

    /**
     * Getter for <code>Gara.University.pic</code>.
     */
    @Column(name = "pic", length = 65535)
    @Size(max = 65535)
    public String getPic() {
        return (String) get(5);
    }

    /**
     * Setter for <code>Gara.University.url</code>.
     */
    public void setUrl(String value) {
        set(6, value);
    }

    /**
     * Getter for <code>Gara.University.url</code>.
     */
    @Column(name = "url", nullable = false, length = 65535)
    @NotNull
    @Size(max = 65535)
    public String getUrl() {
        return (String) get(6);
    }

    /**
     * Setter for <code>Gara.University.emailFormat</code>.
     */
    public void setEmailformat(String value) {
        set(7, value);
    }

    /**
     * Getter for <code>Gara.University.emailFormat</code>.
     */
    @Column(name = "emailFormat", nullable = false, length = 65535)
    @NotNull
    @Size(max = 65535)
    public String getEmailformat() {
        return (String) get(7);
    }

    /**
     * Setter for <code>Gara.University.pageName</code>.
     */
    public void setPagename(String value) {
        set(8, value);
    }

    /**
     * Getter for <code>Gara.University.pageName</code>.
     */
    @Column(name = "pageName", length = 65535)
    @Size(max = 65535)
    public String getPagename() {
        return (String) get(8);
    }

    /**
     * Setter for <code>Gara.University.pageContent</code>.
     */
    public void setPagecontent(String value) {
        set(9, value);
    }

    /**
     * Getter for <code>Gara.University.pageContent</code>.
     */
    @Column(name = "pageContent", length = 65535)
    @Size(max = 65535)
    public String getPagecontent() {
        return (String) get(9);
    }

    /**
     * Setter for <code>Gara.University.pageDescription</code>.
     */
    public void setPagedescription(String value) {
        set(10, value);
    }

    /**
     * Getter for <code>Gara.University.pageDescription</code>.
     */
    @Column(name = "pageDescription", length = 65535)
    @Size(max = 65535)
    public String getPagedescription() {
        return (String) get(10);
    }

    /**
     * Setter for <code>Gara.University.pageKeywords</code>.
     */
    public void setPagekeywords(String value) {
        set(11, value);
    }

    /**
     * Getter for <code>Gara.University.pageKeywords</code>.
     */
    @Column(name = "pageKeywords", length = 65535)
    @Size(max = 65535)
    public String getPagekeywords() {
        return (String) get(11);
    }

    /**
     * Setter for <code>Gara.University.pageSubdomain</code>.
     */
    public void setPagesubdomain(String value) {
        set(12, value);
    }

    /**
     * Getter for <code>Gara.University.pageSubdomain</code>.
     */
    @Column(name = "pageSubdomain", length = 65535)
    @Size(max = 65535)
    public String getPagesubdomain() {
        return (String) get(12);
    }

    /**
     * Setter for <code>Gara.University.contactPersonEmail</code>.
     */
    public void setContactpersonemail(String value) {
        set(13, value);
    }

    /**
     * Getter for <code>Gara.University.contactPersonEmail</code>.
     */
    @Column(name = "contactPersonEmail", length = 65535)
    @Size(max = 65535)
    public String getContactpersonemail() {
        return (String) get(13);
    }

    /**
     * Setter for <code>Gara.University.contactPersonPassword</code>.
     */
    public void setContactpersonpassword(String value) {
        set(14, value);
    }

    /**
     * Getter for <code>Gara.University.contactPersonPassword</code>.
     */
    @Column(name = "contactPersonPassword", length = 65535)
    @Size(max = 65535)
    public String getContactpersonpassword() {
        return (String) get(14);
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
    // Record15 type implementation
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Row15<Integer, String, Integer, Double, Double, String, String, String, String, String, String, String, String, String, String> fieldsRow() {
        return (Row15) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row15<Integer, String, Integer, Double, Double, String, String, String, String, String, String, String, String, String, String> valuesRow() {
        return (Row15) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field1() {
        return University.UNIVERSITY.ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field2() {
        return University.UNIVERSITY.NAME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field3() {
        return University.UNIVERSITY.CITYID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Double> field4() {
        return University.UNIVERSITY.LONGITUDE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Double> field5() {
        return University.UNIVERSITY.LATITUDE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field6() {
        return University.UNIVERSITY.PIC;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field7() {
        return University.UNIVERSITY.URL;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field8() {
        return University.UNIVERSITY.EMAILFORMAT;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field9() {
        return University.UNIVERSITY.PAGENAME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field10() {
        return University.UNIVERSITY.PAGECONTENT;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field11() {
        return University.UNIVERSITY.PAGEDESCRIPTION;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field12() {
        return University.UNIVERSITY.PAGEKEYWORDS;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field13() {
        return University.UNIVERSITY.PAGESUBDOMAIN;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field14() {
        return University.UNIVERSITY.CONTACTPERSONEMAIL;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field15() {
        return University.UNIVERSITY.CONTACTPERSONPASSWORD;
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
    public String value2() {
        return getName();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value3() {
        return getCityid();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Double value4() {
        return getLongitude();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Double value5() {
        return getLatitude();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value6() {
        return getPic();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value7() {
        return getUrl();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value8() {
        return getEmailformat();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value9() {
        return getPagename();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value10() {
        return getPagecontent();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value11() {
        return getPagedescription();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value12() {
        return getPagekeywords();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value13() {
        return getPagesubdomain();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value14() {
        return getContactpersonemail();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value15() {
        return getContactpersonpassword();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UniversityRecord value1(Integer value) {
        setId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UniversityRecord value2(String value) {
        setName(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UniversityRecord value3(Integer value) {
        setCityid(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UniversityRecord value4(Double value) {
        setLongitude(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UniversityRecord value5(Double value) {
        setLatitude(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UniversityRecord value6(String value) {
        setPic(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UniversityRecord value7(String value) {
        setUrl(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UniversityRecord value8(String value) {
        setEmailformat(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UniversityRecord value9(String value) {
        setPagename(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UniversityRecord value10(String value) {
        setPagecontent(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UniversityRecord value11(String value) {
        setPagedescription(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UniversityRecord value12(String value) {
        setPagekeywords(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UniversityRecord value13(String value) {
        setPagesubdomain(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UniversityRecord value14(String value) {
        setContactpersonemail(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UniversityRecord value15(String value) {
        setContactpersonpassword(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UniversityRecord values(Integer value1, String value2, Integer value3, Double value4, Double value5, String value6, String value7, String value8, String value9, String value10, String value11, String value12, String value13, String value14, String value15) {
        value1(value1);
        value2(value2);
        value3(value3);
        value4(value4);
        value5(value5);
        value6(value6);
        value7(value7);
        value8(value8);
        value9(value9);
        value10(value10);
        value11(value11);
        value12(value12);
        value13(value13);
        value14(value14);
        value15(value15);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached UniversityRecord
     */
    public UniversityRecord() {
        super(University.UNIVERSITY);
    }

    /**
     * Create a detached, initialised UniversityRecord
     */
    public UniversityRecord(Integer id, String name, Integer cityid, Double longitude, Double latitude, String pic, String url, String emailformat, String pagename, String pagecontent, String pagedescription, String pagekeywords, String pagesubdomain, String contactpersonemail, String contactpersonpassword) {
        super(University.UNIVERSITY);

        set(0, id);
        set(1, name);
        set(2, cityid);
        set(3, longitude);
        set(4, latitude);
        set(5, pic);
        set(6, url);
        set(7, emailformat);
        set(8, pagename);
        set(9, pagecontent);
        set(10, pagedescription);
        set(11, pagekeywords);
        set(12, pagesubdomain);
        set(13, contactpersonemail);
        set(14, contactpersonpassword);
    }
}