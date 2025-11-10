
package src.main.java.app.infrastructure.persistence.entities;

import src.main.java.app.domain.model.emuns.Role;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import java.sql.Date;

@Entity
@Table(name = "users")
public class UserEntity {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "identification", nullable = false, updatable = false)
     private long identification;
    
    @Column(name = "name", nullable = false, length = 120)
    private String name;
    
    @Column(name = "email", nullable = false, length = 150, unique = true)
    private String email;
    
    @Column(name = "address", length = 200)
    private String address; 
    
    @Column(name = "username", nullable = false, length = 60, unique = true)
    private String userName;
    
    @Column(name = "password", nullable = false, length = 255)
    private String password; 
    
    @Column(name = "phone", length = 30)
    private Long phone;
    
    @Column(name = "birth_day")
    private Date birthDay;
    
    @Column(nullable = false, length = 50)
    private String role;
    
    public UserEntity() {}

    
    public Long getIdentification() {
        return identification;
    }

    public void setIdentification(Long identification) {
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

    public Long getPhone() {
        return phone;
    }

    public void setPhone(Long phone) {
        this.phone = phone;
    }

    public Date getBirthDay() {
        return birthDay;
    }

    public void setBirthDay(Date birthDay) {
        this.birthDay = birthDay;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    
}
