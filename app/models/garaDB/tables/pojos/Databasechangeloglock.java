/**
 * This class is generated by jOOQ
 */
package models.garaDB.tables.pojos;


import java.io.Serializable;
import java.sql.Timestamp;

import javax.annotation.Generated;
import javax.persistence.Column;
import javax.persistence.Entity;
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
@Table(name = "DATABASECHANGELOGLOCK", schema = "gara")
public class Databasechangeloglock implements Serializable {

    private static final long serialVersionUID = -1094999175;

    private Integer   id;
    private Boolean   locked;
    private Timestamp lockgranted;
    private String    lockedby;

    public Databasechangeloglock() {}

    public Databasechangeloglock(Databasechangeloglock value) {
        this.id = value.id;
        this.locked = value.locked;
        this.lockgranted = value.lockgranted;
        this.lockedby = value.lockedby;
    }

    public Databasechangeloglock(
        Integer   id,
        Boolean   locked,
        Timestamp lockgranted,
        String    lockedby
    ) {
        this.id = id;
        this.locked = locked;
        this.lockgranted = lockgranted;
        this.lockedby = lockedby;
    }

    @Id
    @Column(name = "ID", unique = true, nullable = false, precision = 10)
    public Integer getId() {
        return this.id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    @Column(name = "LOCKED", nullable = false, precision = 1)
    @NotNull
    public Boolean getLocked() {
        return this.locked;
    }

    public void setLocked(Boolean locked) {
        this.locked = locked;
    }

    @Column(name = "LOCKGRANTED")
    public Timestamp getLockgranted() {
        return this.lockgranted;
    }

    public void setLockgranted(Timestamp lockgranted) {
        this.lockgranted = lockgranted;
    }

    @Column(name = "LOCKEDBY", length = 255)
    @Size(max = 255)
    public String getLockedby() {
        return this.lockedby;
    }

    public void setLockedby(String lockedby) {
        this.lockedby = lockedby;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("Databasechangeloglock (");

        sb.append(id);
        sb.append(", ").append(locked);
        sb.append(", ").append(lockgranted);
        sb.append(", ").append(lockedby);

        sb.append(")");
        return sb.toString();
    }
}
