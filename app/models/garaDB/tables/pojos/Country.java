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
@Table(name = "Country", schema = "gara")
public class Country implements Serializable {

    private static final long serialVersionUID = -352745506;

    private Integer id;
    private String  name;
    private String  pic;
    private Double  longitude;
    private Double  latitude;
    private Integer gasprice;

    public Country() {}

    public Country(Country value) {
        this.id = value.id;
        this.name = value.name;
        this.pic = value.pic;
        this.longitude = value.longitude;
        this.latitude = value.latitude;
        this.gasprice = value.gasprice;
    }

    public Country(
        Integer id,
        String  name,
        String  pic,
        Double  longitude,
        Double  latitude,
        Integer gasprice
    ) {
        this.id = id;
        this.name = name;
        this.pic = pic;
        this.longitude = longitude;
        this.latitude = latitude;
        this.gasprice = gasprice;
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

    @Column(name = "name", nullable = false, length = 80)
    @NotNull
    @Size(max = 80)
    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Column(name = "pic", length = 65535)
    @Size(max = 65535)
    public String getPic() {
        return this.pic;
    }

    public void setPic(String pic) {
        this.pic = pic;
    }

    @Column(name = "longitude", precision = 22)
    public Double getLongitude() {
        return this.longitude;
    }

    public void setLongitude(Double longitude) {
        this.longitude = longitude;
    }

    @Column(name = "latitude", precision = 22)
    public Double getLatitude() {
        return this.latitude;
    }

    public void setLatitude(Double latitude) {
        this.latitude = latitude;
    }

    @Column(name = "gasPrice", precision = 10)
    public Integer getGasprice() {
        return this.gasprice;
    }

    public void setGasprice(Integer gasprice) {
        this.gasprice = gasprice;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("Country (");

        sb.append(id);
        sb.append(", ").append(name);
        sb.append(", ").append(pic);
        sb.append(", ").append(longitude);
        sb.append(", ").append(latitude);
        sb.append(", ").append(gasprice);

        sb.append(")");
        return sb.toString();
    }
}
