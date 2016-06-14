/**
 * This class is generated by jOOQ
 */
package models.garaDB.tables.pojos;


import java.io.Serializable;

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
@Table(name = "MemberGroup", schema = "Gara")
public class Membergroup implements Serializable {

    private static final long serialVersionUID = -2071470511;

    private Integer id;
    private String  name;
    private String  description;
    private String  permissions;

    public Membergroup() {}

    public Membergroup(Membergroup value) {
        this.id = value.id;
        this.name = value.name;
        this.description = value.description;
        this.permissions = value.permissions;
    }

    public Membergroup(
        Integer id,
        String  name,
        String  description,
        String  permissions
    ) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.permissions = permissions;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID", unique = true, precision = 10)
    public Integer getId() {
        return this.id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    @Column(name = "name", nullable = false, length = 65535)
    @NotNull
    @Size(max = 65535)
    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Column(name = "description", length = 65535)
    @Size(max = 65535)
    public String getDescription() {
        return this.description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Column(name = "permissions", length = 65535)
    @Size(max = 65535)
    public String getPermissions() {
        return this.permissions;
    }

    public void setPermissions(String permissions) {
        this.permissions = permissions;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("Membergroup (");

        sb.append(id);
        sb.append(", ").append(name);
        sb.append(", ").append(description);
        sb.append(", ").append(permissions);

        sb.append(")");
        return sb.toString();
    }
}
