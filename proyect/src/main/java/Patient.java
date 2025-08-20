
public class Patient extends User{
    private Strring gender; 

    public Patient(Strring gender, String name, String email, String address, String userName, String password, Int identification, Int phone, date BirthDay,) {
        super(name,email,address, userName,password, identification, phone, BirthDay);
        this.gender = gender;
        
    }

    public Strring getGender() {
        return gender;
    }

    public void setGender(Strring gender) {
        this.gender = gender;
    }

}