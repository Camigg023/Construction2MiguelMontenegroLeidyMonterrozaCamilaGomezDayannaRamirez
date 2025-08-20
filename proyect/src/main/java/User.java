
public class User {
    private String name;
    private String email;
    private String address; 
    private String userName;
    private String password; 
    private Int identification;
    private Int phone;
    private date BirthDay;
    private rol Role; 

    public User(String name, String emai, String address, String userName, String password, Int identification, Int phone, date BirthDay, rol Role) {
        this.name = name;
        this.email = emai;
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

    public void setEmal(String email) {
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

    public Int getId() {
        return id;
    }

    public void setId(Int id) {
        this.id = id;
    }

    public Int getPhone() {
        return phone;
    }

    public void setPhone(Int phone) {
        this.phone = phone;
    }

    public date getDateBirth() {
        return DateBirth;
    }

    public void setDateBirth(date DateBirth) {
        this.DateBirth = DateBirth;
    }

    public rol getRole() {
        return Role;
    }

    public void setRole(rol Role) {
        this.Role = Role;
    }

    
    
}
