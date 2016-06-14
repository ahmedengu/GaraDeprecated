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
@Table(name = "CarManufacture", schema = "Gara")
public class Carmanufacture implements Serializable {

    private static final long serialVersionUID = 561478673;

    private Integer id;
    private String  name;
    private Integer countryid;
    private String  pic;

    public Carmanufacture() {}

    public Carmanufacture(Carmanufacture value) {
        this.id = value.id;
        this.name = value.name;
        this.countryid = value.countryid;
        this.pic = value.pic;
    }

    public Carmanufacture(
        Integer id,
        String  name,
        Integer countryid,
        String  pic
    ) {
        this.id = id;
        this.name = name;
        this.countryid = countryid;
        this.pic = pic;
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

    @Column(name = "countryID", precision = 10)
    public Integer getCountryid() {
        return this.countryid;
    }

    public void setCountryid(Integer countryid) {
        this.countryid = countryid;
    }

    @Column(name = "pic", length = 65535)
    @Size(max = 65535)
    public String getPic() {
        return this.pic;
    }

    public void setPic(String pic) {
        this.pic = pic;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("Carmanufacture (");

        sb.append(id);
        sb.append(", ").append(name);
        sb.append(", ").append(countryid);
        sb.append(", ").append(pic);

        sb.append(")");
        return sb.toString();
    }
}
