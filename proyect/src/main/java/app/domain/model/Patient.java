package app.domain.model;


import java.sql.Date;
public class Patient {
    private long id_patient;
    private String fullName;
    private Date birthay;
    private String direction;
    private long telephoneNumber;
    private String email;
    private String gender; 
    private MedicalInsurance medicalInsurance;
    private EmergencyContact emergencyContact;

    public Patient(long id_patient, String fullName, Date birthay, String direction, long telephone_number, String email, String gender, MedicalInsurance medicalInsurance, EmergencyContact emergencyContact) {
        this.id_patient = id_patient;
        this.fullName = fullName;
        this.birthay = birthay;
        this.direction = direction;
        this.telephoneNumber = telephone_number;
        this.email = email;
        this.gender = gender;
        this.medicalInsurance = medicalInsurance;
        this.emergencyContact = emergencyContact;
    }

    public long getId_patient() {
        return id_patient;
    }

    public void setId_patient(long id_patient) {
        this.id_patient = id_patient;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public Date getBirthay() {
        return birthay;
    }

    public void setBirthay(Date birthay) {
        this.birthay = birthay;
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

    public Long getMedicalId() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
    
    
    
    
    
}


