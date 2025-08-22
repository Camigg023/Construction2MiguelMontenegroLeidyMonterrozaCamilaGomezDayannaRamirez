package app.domain.model;

import app.domain.model.emuns.Role;
import java.sql.Date;
public class Patient extends User{
    private String gender; 
    private MedicalInsurance medicalInsurance; 
    public Patient(MedicalInsurance medicalInsurance, String name, String email, String address, String userName, String password, int identification, int phone, Date BirthDay, Role Role) {
        super(name, email, address, userName, password, identification, phone, BirthDay, Role);
        this.gender = gender;
        this.medicalInsurance = medicalInsurance;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public MedicalInsurance getMedicalInsurance() {
        return medicalInsurance;
    }

    public void setMedicalInsurance(MedicalInsurance medicalInsurance) {
        this.medicalInsurance = medicalInsurance;
    }

}

