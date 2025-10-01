package app.adapter.in.rest.request;
 
import app.domain.model.emuns.Role;

import java.sql.Date;
 
public class UserRequest {
 
    private long identification;

    private String name;

    private String email;

    private String address; 

    private String userName;

    private String password; 

    private long phone;

    private Date birthDay;

    private Role role;
 
    public long getIdentification() {

        return identification;

    }
 
    public void setIdentification(long identification) {

        this.identification = identification;

    }
 
    public String getName() {

        return name;

    }
 
    public void setName(String name) {

        this.name = name;

    }
 
    public String getEmail() {

        return email;

    }
 
    public void setEmail(String email) {

        this.email = email;

    }
 
    public String getAddress() {

        return address;

    }
 
    public void setAddress(String address) {

        this.address = address;

    }
 
    public String getUserName() {

        return userName;

    }
 
    public void setUserName(String userName) {

        this.userName = userName;

    }
 
    public String getPassword() {

        return password;

    }
 
    public void setPassword(String password) {

        this.password = password;

    }
 
    public long getPhone() {

        return phone;

    }
 
    public void setPhone(long phone) {

        this.phone = phone;

    }
 
    public Date getBirthDay() {

        return birthDay;

    }
 
    public void setBirthDay(Date birthDay) {

        this.birthDay = birthDay;

    }
 
    public Role getRole() {

        return role;

    }
 
    public void setRole(Role role) {

        this.role = role;

    }

}
 