package app.domain.model;


import java.sql.Date;

public class Patient {
    
    private long idPatient;
    
    
    private String fullName;
    private Date birthday;
    private String direction;
    private long telephoneNumber;
    private String email;
    private String gender; 
    private MedicalInsurance medicalInsurance;
    private EmergencyContact emergencyContact;

    public Patient () {
    }

    public long getIdPatient() {
        return idPatient;
    }

    public void setIdPatient(long idPatient) {
        this.idPatient = idPatient;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthay(Date birthay) {
        this.birthday = birthay;
    }

    public String getDirection() {
        return direction;
    }

    public void setDirection(String direction) {
        this.direction = direction;
    }

    public long getTelephoneNumber() {
        return telephoneNumber;
    }

    public void setTelephoneNumber(long telephone_number) {
        this.telephoneNumber = telephone_number;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
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

    public EmergencyContact getEmergencyContact() {
        return emergencyContact;
    }

    public void setEmergencyContact(EmergencyContact emergencyContact) {
        this.emergencyContact = emergencyContact;
    }

    
    
}
    
    
    
    
    
    



