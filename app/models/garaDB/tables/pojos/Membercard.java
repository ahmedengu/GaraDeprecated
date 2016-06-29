/**
 * This class is generated by jOOQ
 */
package models.garaDB.tables.pojos;


import java.io.Serializable;
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
@Table(name = "MemberCard", schema = "gara")
public class Membercard implements Serializable {

    private static final long serialVersionUID = 862255030;

    private Integer   id;
    private Integer   memberid;
    private String    type;
    private String    number;
    private String    expiredate;
    private String    secrit;
    private Timestamp timestamp;

    public Membercard() {}

    public Membercard(Membercard value) {
        this.id = value.id;
        this.memberid = value.memberid;
        this.type = value.type;
        this.number = value.number;
        this.expiredate = value.expiredate;
        this.secrit = value.secrit;
        this.timestamp = value.timestamp;
    }

    public Membercard(
        Integer   id,
        Integer   memberid,
        String    type,
        String    number,
        String    expiredate,
        String    secrit,
        Timestamp timestamp
    ) {
        this.id = id;
        this.memberid = memberid;
        this.type = type;
        this.number = number;
        this.expiredate = expiredate;
        this.secrit = secrit;
        this.timestamp = timestamp;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID", unique = true, nullable = false, precision = 10)
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

    @Column(name = "type", nullable = false, length = 65535)
    @NotNull
    @Size(max = 65535)
    public String getType() {
        return this.type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Column(name = "number", nullable = false, length = 65535)
    @NotNull
    @Size(max = 65535)
    public String getNumber() {
        return this.number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    @Column(name = "expireDate", nullable = false, length = 65535)
    @NotNull
    @Size(max = 65535)
    public String getExpiredate() {
        return this.expiredate;
    }

    public void setExpiredate(String expiredate) {
        this.expiredate = expiredate;
    }

    @Column(name = "secrit", nullable = false, length = 65535)
    @NotNull
    @Size(max = 65535)
    public String getSecrit() {
        return this.secrit;
    }

    public void setSecrit(String secrit) {
        this.secrit = secrit;
    }

    @Column(name = "TIMESTAMP", nullable = false)
    public Timestamp getTimestamp() {
        return this.timestamp;
    }

    public void setTimestamp(Timestamp timestamp) {
        this.timestamp = timestamp;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("Membercard (");

        sb.append(id);
        sb.append(", ").append(memberid);
        sb.append(", ").append(type);
        sb.append(", ").append(number);
        sb.append(", ").append(expiredate);
        sb.append(", ").append(secrit);
        sb.append(", ").append(timestamp);

        sb.append(")");
        return sb.toString();
    }
}
