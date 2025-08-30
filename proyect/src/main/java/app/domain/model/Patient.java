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

    /**
     * @return the id_patient
     */
    public long getId_patient() {
        return id_patient;
    }

    /**
     * @param id_patient the id_patient to set
     */
    public void setId_patient(long id_patient) {
        this.id_patient = id_patient;
    }

    /**
     * @return the fullName
     */
    public String getFullName() {
        return fullName;
    }

    /**
     * @param fullName the fullName to set
     */
    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    /**
     * @return the birthay
     */
    public Date getBirthay() {
        return birthay;
    }

    /**
     * @param birthay the birthay to set
     */
    public void setBirthay(Date birthay) {
        this.birthay = birthay;
    }

    /**
     * @return the direction
     */
    public String getDirection() {
        return direction;
    }

    /**
     * @param direction the direction to set
     */
    public void setDirection(String direction) {
        this.direction = direction;
    }

    /**
     * @return the telephone_number
     */
    public long getTelephoneNumber() {
        return telephoneNumber;
    }

    /**
     * @param telephone_number the telephone_number to set
     */
    public void setTelephoneNumber(long telephone_number) {
        this.telephoneNumber = telephone_number;
    }

    /**
     * @return the email
     */
    public String getEmail() {
        return email;
    }

    /**
     * @param email the email to set
     */
    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * @return the gender
     */
    public String getGender() {
        return gender;
    }

    /**
     * @param gender the gender to set
     */
    public void setGender(String gender) {
        this.gender = gender;
    }

    /**
     * @return the medicalInsurance
     */
    public MedicalInsurance getMedicalInsurance() {
        return medicalInsurance;
    }

    /**
     * @param medicalInsurance the medicalInsurance to set
     */
    public void setMedicalInsurance(MedicalInsurance medicalInsurance) {
        this.medicalInsurance = medicalInsurance;
    }

    /**
     * @return the emergencyContact
     */
    public EmergencyContact getEmergencyContact() {
        return emergencyContact;
    }

    /**
     * @param emergencyContact the emergencyContact to set
     */
    public void setEmergencyContact(EmergencyContact emergencyContact) {
        this.emergencyContact = emergencyContact;
    }
    
    
    
    
    
    
}


