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
@Table(name = "UniversityPageContent", schema = "Gara")
public class Universitypagecontent implements Serializable {

    private static final long serialVersionUID = -1857321874;

    private Integer   id;
    private Timestamp timestamp;
    private String    title;
    private String    body;
    private String    link;
    private String    description;
    private String    keywords;
    private String    pic;
    private Integer   universityid;

    public Universitypagecontent() {}

    public Universitypagecontent(Universitypagecontent value) {
        this.id = value.id;
        this.timestamp = value.timestamp;
        this.title = value.title;
        this.body = value.body;
        this.link = value.link;
        this.description = value.description;
        this.keywords = value.keywords;
        this.pic = value.pic;
        this.universityid = value.universityid;
    }

    public Universitypagecontent(
        Integer   id,
        Timestamp timestamp,
        String    title,
        String    body,
        String    link,
        String    description,
        String    keywords,
        String    pic,
        Integer   universityid
    ) {
        this.id = id;
        this.timestamp = timestamp;
        this.title = title;
        this.body = body;
        this.link = link;
        this.description = description;
        this.keywords = keywords;
        this.pic = pic;
        this.universityid = universityid;
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

    @Column(name = "TIMESTAMP", nullable = false)
    public Timestamp getTimestamp() {
        return this.timestamp;
    }

    public void setTimestamp(Timestamp timestamp) {
        this.timestamp = timestamp;
    }

    @Column(name = "title", length = 65535)
    @Size(max = 65535)
    public String getTitle() {
        return this.title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    @Column(name = "body", length = 65535)
    @Size(max = 65535)
    public String getBody() {
        return this.body;
    }

    public void setBody(String body) {
        this.body = body;
    }

    @Column(name = "link", length = 65535)
    @Size(max = 65535)
    public String getLink() {
        return this.link;
    }

    public void setLink(String link) {
        this.link = link;
    }

    @Column(name = "description", length = 65535)
    @Size(max = 65535)
    public String getDescription() {
        return this.description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Column(name = "keywords", length = 65535)
    @Size(max = 65535)
    public String getKeywords() {
        return this.keywords;
    }

    public void setKeywords(String keywords) {
        this.keywords = keywords;
    }

    @Column(name = "pic", length = 65535)
    @Size(max = 65535)
    public String getPic() {
        return this.pic;
    }

    public void setPic(String pic) {
        this.pic = pic;
    }

    @Column(name = "universityID", nullable = false, precision = 10)
    @NotNull
    public Integer getUniversityid() {
        return this.universityid;
    }

    public void setUniversityid(Integer universityid) {
        this.universityid = universityid;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("Universitypagecontent (");

        sb.append(id);
        sb.append(", ").append(timestamp);
        sb.append(", ").append(title);
        sb.append(", ").append(body);
        sb.append(", ").append(link);
        sb.append(", ").append(description);
        sb.append(", ").append(keywords);
        sb.append(", ").append(pic);
        sb.append(", ").append(universityid);

        sb.append(")");
        return sb.toString();
    }
}
