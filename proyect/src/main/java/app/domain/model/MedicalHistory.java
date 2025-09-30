package app.domain.model;

import java.util.Date; 

public class MedicalHistory {
    
    private int id;
    private String chiefComplaint;
    private String symptoms;
    private String diagnosis;
    private User doctor;
    private Date date;
    
     public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    

    public String getChiefComplaint() {
        return chiefComplaint;
    }

    public void setChiefComplaint(String chiefComplaint) {
        this.chiefComplaint = chiefComplaint;
    }

    public String getSymptoms() {
        return symptoms;
    }

    public void setSymptoms(String symptoms) {
        this.symptoms = symptoms;
    }

    public String getDiagnosis() {
        return diagnosis;
    }

    public void setDiagnosis(String diagnosis) {
        this.diagnosis = diagnosis;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public User getDoctor() {
        return doctor;
    }

    public void setDoctor(User doctor) {
        this.doctor = doctor;
    }

    
}
