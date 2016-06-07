/**
 * This class is generated by jOOQ
 */
package apdihp.tables.pojos;


import java.io.Serializable;
import java.sql.Date;

import javax.annotation.Generated;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;


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
@Table(name = "Driver", schema = "Gara")
public class Driver implements Serializable {

    private static final long serialVersionUID = -647332062;

    private Integer id;
    private Integer memberid;
    private String  licensenumber;
    private String  licensepic;
    private String  identycardpic;
    private Date    licenseexpiredate;

    public Driver() {}

    public Driver(Driver value) {
        this.id = value.id;
        this.memberid = value.memberid;
        this.licensenumber = value.licensenumber;
        this.licensepic = value.licensepic;
        this.identycardpic = value.identycardpic;
        this.licenseexpiredate = value.licenseexpiredate;
    }

    public Driver(
        Integer id,
        Integer memberid,
        String  licensenumber,
        String  licensepic,
        String  identycardpic,
        Date    licenseexpiredate
    ) {
        this.id = id;
        this.memberid = memberid;
        this.licensenumber = licensenumber;
        this.licensepic = licensepic;
        this.identycardpic = identycardpic;
        this.licenseexpiredate = licenseexpiredate;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID", unique = true, nullable = false, precision = 10)
    @NotNull
    public Integer getId() {
        return this.id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    @Column(name = "memberID", nullable = false, precision = 10)
    @NotNull
    public Integer getMemberid() {
        return this.memberid;
    }

    public void setMemberid(Integer memberid) {
        this.memberid = memberid;
    }

    @Column(name = "licenseNumber", nullable = false, length = 65535)
    @NotNull
    @Size(max = 65535)
    public String getLicensenumber() {
        return this.licensenumber;
    }

    public void setLicensenumber(String licensenumber) {
        this.licensenumber = licensenumber;
    }

    @Column(name = "licensePic", nullable = false, length = 65535)
    @NotNull
    @Size(max = 65535)
    public String getLicensepic() {
        return this.licensepic;
    }

    public void setLicensepic(String licensepic) {
        this.licensepic = licensepic;
    }

    @Column(name = "identyCardPic", nullable = false, length = 65535)
    @NotNull
    @Size(max = 65535)
    public String getIdentycardpic() {
        return this.identycardpic;
    }

    public void setIdentycardpic(String identycardpic) {
        this.identycardpic = identycardpic;
    }

    @Column(name = "licenseExpireDate", nullable = false)
    @NotNull
    public Date getLicenseexpiredate() {
        return this.licenseexpiredate;
    }

    public void setLicenseexpiredate(Date licenseexpiredate) {
        this.licenseexpiredate = licenseexpiredate;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("Driver (");

        sb.append(id);
        sb.append(", ").append(memberid);
        sb.append(", ").append(licensenumber);
        sb.append(", ").append(licensepic);
        sb.append(", ").append(identycardpic);
        sb.append(", ").append(licenseexpiredate);

        sb.append(")");
        return sb.toString();
    }
}
