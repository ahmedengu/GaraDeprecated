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
@Table(name = "SiteOption", schema = "Gara")
public class Siteoption implements Serializable {

    private static final long serialVersionUID = 118450176;

    private Integer id;
    private String  name;
    private String  value;

    public Siteoption() {}

    public Siteoption(Siteoption value) {
        this.id = value.id;
        this.name = value.name;
        this.value = value.value;
    }

    public Siteoption(
        Integer id,
        String  name,
        String  value
    ) {
        this.id = id;
        this.name = name;
        this.value = value;
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

    @Column(name = "name", nullable = false, length = 65535)
    @NotNull
    @Size(max = 65535)
    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Column(name = "value", nullable = false, length = 65535)
    @NotNull
    @Size(max = 65535)
    public String getValue() {
        return this.value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("Siteoption (");

        sb.append(id);
        sb.append(", ").append(name);
        sb.append(", ").append(value);

        sb.append(")");
        return sb.toString();
    }
}
