/**
 * This class is generated by jOOQ
 */
package models.garaDB.tables.pojos;


import models.RESTHelper;
import org.springframework.format.annotation.DateTimeFormat;
import play.data.format.Formats;
import play.data.validation.ValidationError;

import java.io.Serializable;
import java.sql.SQLException;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;

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
@Table(name = "Member", schema = "gara")
public class Member implements Serializable {

    private static final long serialVersionUID = 77658246;

    private Integer   id;
    private Timestamp timestamp;
    private String    name;
    private String    username;
    private String    studentemail;
    private String    phonenumber;
    private Timestamp birthdate;
    private Integer   activited;
    private String    gender;
    private String    password;
    private Integer   collegeid;
    private String    pic;
    private String    bloodtype;
    private String    emergencynumber;
    private Integer   balance;
    private String    studentemailactivationcode;
    private Integer   membergroupid;
    private Double    longitude;
    private Double    latitude;
    private String    pin;
    private Integer   universityid;
    private String    preferences;

    public Member() {}

    public Member(Member value) {
        this.id = value.id;
        this.timestamp = value.timestamp;
        this.name = value.name;
        this.username = value.username;
        this.studentemail = value.studentemail;
        this.phonenumber = value.phonenumber;
        this.birthdate = value.birthdate;
        this.activited = value.activited;
        this.gender = value.gender;
        this.password = value.password;
        this.collegeid = value.collegeid;
        this.pic = value.pic;
        this.bloodtype = value.bloodtype;
        this.emergencynumber = value.emergencynumber;
        this.balance = value.balance;
        this.studentemailactivationcode = value.studentemailactivationcode;
        this.membergroupid = value.membergroupid;
        this.longitude = value.longitude;
        this.latitude = value.latitude;
        this.pin = value.pin;
        this.universityid = value.universityid;
        this.preferences = value.preferences;
    }

    public Member(
        Integer   id,
        Timestamp timestamp,
        String    name,
        String    username,
        String    studentemail,
        String    phonenumber,
        Timestamp birthdate,
        Integer   activited,
        String    gender,
        String    password,
        Integer   collegeid,
        String    pic,
        String    bloodtype,
        String    emergencynumber,
        Integer   balance,
        String    studentemailactivationcode,
        Integer   membergroupid,
        Double    longitude,
        Double    latitude,
        String    pin,
        Integer   universityid,
        String    preferences
    ) {
        this.id = id;
        this.timestamp = timestamp;
        this.name = name;
        this.username = username;
        this.studentemail = studentemail;
        this.phonenumber = phonenumber;
        this.birthdate = birthdate;
        this.activited = activited;
        this.gender = gender;
        this.password = password;
        this.collegeid = collegeid;
        this.pic = pic;
        this.bloodtype = bloodtype;
        this.emergencynumber = emergencynumber;
        this.balance = balance;
        this.studentemailactivationcode = studentemailactivationcode;
        this.membergroupid = membergroupid;
        this.longitude = longitude;
        this.latitude = latitude;
        this.pin = pin;
        this.universityid = universityid;
        this.preferences = preferences;
    }
    public List<ValidationError> validate() throws SQLException {
        List<ValidationError> errors = new ArrayList<ValidationError>();
        RESTHelper restHelper = new RESTHelper();

        if (username == null) {
            errors.add(new ValidationError("username", "username is requered"));
        } else if (!username.matches("[A-Za-z0-9_]+")) {
            errors.add(new ValidationError("username", "username should be valid"));

        } else if (restHelper.getWhere("member", "username", username).size() > 0) {
            errors.add(new ValidationError("username", "this username is used before"));


        }
        if (phonenumber == null) {
            errors.add(new ValidationError("phonenumber", "phonenumber is requered"));
        } else if (phonenumber.length() < 11) {
            errors.add(new ValidationError("phonenumber", "phonenumber should be valid"));

        } else if (restHelper.getWhere("member", "phoneNumber", phonenumber).size() > 0) {
            errors.add(new ValidationError("phonenumber", "this phonenumber is used before"));


        }

        if (password == null) {
            errors.add(new ValidationError("password", "password is requered"));
        } else if (!password.matches("^(?=.*[a-zA-Z])(?=.*[0-9])(?=.*[^a-zA-Z0-9\\\\s]).{6,}")) {
            errors.add(new ValidationError("password", "password should be valid ex  At least one character in [a-zA-Z] , At least one digit.,At least one character that's not in [a-zA-Z0-9\\s] ,  At least 6 characters."));

        }

        if (name == null) {
            errors.add(new ValidationError("name", "name is requered"));
        }

        if (studentemail == null) {
            errors.add(new ValidationError("studentemail", "student email is requered"));
        } else if (!studentemail.matches("[a-z0-9!#$%&'*+/=?^_`{|}~-]+(?:\\.[a-z0-9!#$%&'*+/=?^_`{|}~-]+)*@(?:[a-z0-9](?:[a-z0-9-]*[a-z0-9])?\\.)+[a-z0-9](?:[a-z0-9-]*[a-z0-9])?")) {
            errors.add(new ValidationError("studentemail", "student email should be valid"));

        } else if (!studentemail.contains(".edu")) {
            errors.add(new ValidationError("studentemail", "student email should be valid ex .edu"));
        } else if (restHelper.getWhere("member", "studentEmail", studentemail).size() > 0) {
            errors.add(new ValidationError("studentemail", "this student email is used before"));

        } else if (restHelper.getWhere("University", "emailFormat", studentemail.substring(studentemail.indexOf('@') + 1)).size() < 1) {
            errors.add(new ValidationError("studentemail", "no university match the enterd student email"));
        }

        return errors.isEmpty() ? null : errors;
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

    @Column(name = "TIMESTAMP", nullable = false)
    public Timestamp getTimestamp() {
        return this.timestamp;
    }

    public void setTimestamp(Timestamp timestamp) {
        this.timestamp = timestamp;
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

    @Column(name = "username", nullable = false, length = 65535)
    @NotNull
    @Size(max = 65535)
    public String getUsername() {
        return this.username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    @Column(name = "studentEmail", nullable = false, length = 65535)
    @NotNull
    @Size(max = 65535)
    public String getStudentemail() {
        return this.studentemail;
    }

    public void setStudentemail(String studentemail) {
        this.studentemail = studentemail;
    }

    @Column(name = "phoneNumber", length = 15)
    @Size(max = 15)
    public String getPhonenumber() {
        return this.phonenumber;
    }

    public void setPhonenumber(String phonenumber) {
        this.phonenumber = phonenumber;
    }

    @Column(name = "birthDate")
    @DateTimeFormat
    public Timestamp getBirthdate() {
        return this.birthdate;
    }

    public void setBirthdate(Timestamp birthdate) {
        this.birthdate = birthdate;
    }

    @Column(name = "activited", precision = 10)
    public Integer getActivited() {
        return this.activited;
    }

    public void setActivited(Integer activited) {
        this.activited = activited;
    }

    @Column(name = "gender", length = 255)
    @Size(max = 255)
    public String getGender() {
        return this.gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    @Column(name = "password", nullable = false, length = 65535)
    @NotNull
    @Size(max = 65535)
    public String getPassword() {
        return this.password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Column(name = "collegeID", precision = 10)
    public Integer getCollegeid() {
        return this.collegeid;
    }

    public void setCollegeid(Integer collegeid) {
        this.collegeid = collegeid;
    }

    @Column(name = "pic", length = 65535)
    @Size(max = 65535)
    public String getPic() {
        return this.pic;
    }

    public void setPic(String pic) {
        this.pic = pic;
    }

    @Column(name = "bloodType", length = 2)
    @Size(max = 2)
    public String getBloodtype() {
        return this.bloodtype;
    }

    public void setBloodtype(String bloodtype) {
        this.bloodtype = bloodtype;
    }

    @Column(name = "emergencyNumber", length = 65535)
    @Size(max = 65535)
    public String getEmergencynumber() {
        return this.emergencynumber;
    }

    public void setEmergencynumber(String emergencynumber) {
        this.emergencynumber = emergencynumber;
    }

    @Column(name = "balance", precision = 10)
    public Integer getBalance() {
        return this.balance;
    }

    public void setBalance(Integer balance) {
        this.balance = balance;
    }

    @Column(name = "studentEmailActivationCode", length = 10)
    @Size(max = 10)
    public String getStudentemailactivationcode() {
        return this.studentemailactivationcode;
    }

    public void setStudentemailactivationcode(String studentemailactivationcode) {
        this.studentemailactivationcode = studentemailactivationcode;
    }

    @Column(name = "memberGroupID", precision = 10)
    public Integer getMembergroupid() {
        return this.membergroupid;
    }

    public void setMembergroupid(Integer membergroupid) {
        this.membergroupid = membergroupid;
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

    @Column(name = "pin", length = 65535)
    @Size(max = 65535)
    public String getPin() {
        return this.pin;
    }

    public void setPin(String pin) {
        this.pin = pin;
    }

    @Column(name = "universityID", precision = 10)
    public Integer getUniversityid() {
        return this.universityid;
    }

    public void setUniversityid(Integer universityid) {
        this.universityid = universityid;
    }

    @Column(name = "preferences", length = 65535)
    @Size(max = 65535)
    public String getPreferences() {
        return this.preferences;
    }

    public void setPreferences(String preferences) {
        this.preferences = preferences;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("Member (");

        sb.append(id);
        sb.append(", ").append(timestamp);
        sb.append(", ").append(name);
        sb.append(", ").append(username);
        sb.append(", ").append(studentemail);
        sb.append(", ").append(phonenumber);
        sb.append(", ").append(birthdate);
        sb.append(", ").append(activited);
        sb.append(", ").append(gender);
        sb.append(", ").append(password);
        sb.append(", ").append(collegeid);
        sb.append(", ").append(pic);
        sb.append(", ").append(bloodtype);
        sb.append(", ").append(emergencynumber);
        sb.append(", ").append(balance);
        sb.append(", ").append(studentemailactivationcode);
        sb.append(", ").append(membergroupid);
        sb.append(", ").append(longitude);
        sb.append(", ").append(latitude);
        sb.append(", ").append(pin);
        sb.append(", ").append(universityid);
        sb.append(", ").append(preferences);

        sb.append(")");
        return sb.toString();
    }
}
