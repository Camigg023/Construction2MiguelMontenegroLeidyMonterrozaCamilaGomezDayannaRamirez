import app.domain.model.emuns.Role;
import java.sql.Date;
public class Patient extends User{
    private String gender; 

    public Patient(String name, String email, String address, String userName, String password, int identification, int phone, Date BirthDay, Role Role) {
        super(name, email, address, userName, password, identification, phone, BirthDay, Role);
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

}