import app.domain.model.emuns.Role;
import java.sql.Date; 
public class User {
    private String name;
    private String email;
    private String address; 
    private String userName;
    private String password; 
    private int identification;
    private int phone;
    private Date BirthDay;
    private Role Role; 

    public User(String name, String email, String address, String userName, String password, int identification, int phone, Date BirthDay, Role Role) {
        this.name = name;
        this.email = email;
        this.address = address;
        this.userName = userName;
        this.password = password;
        this.identification = identification;
        this.phone = phone;
        this.BirthDay = BirthDay;
        this.Role = Role;
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

    public int getIdentification() {
        return identification;
    }

    public void setIdentification(int identification) {
        this.identification = identification;
    }

    public int getPhone() {
        return phone;
    }

    public void setPhone(int phone) {
        this.phone = phone;
    }

    public Date getBirthDay() {
        return BirthDay;
    }

    public void setBirthDay(Date BirthDay) {
        this.BirthDay = BirthDay;
    }

    public Role getRole() {
        return Role;
    }

    public void setRole(Role Role) {
        this.Role = Role;
    }
}