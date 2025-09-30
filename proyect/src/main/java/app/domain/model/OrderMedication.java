package app.domain.model;

import java.util.Date;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class OrderMedication{
    
    @Id
    private int idMedication;
    
    private String dosage;
    private String duration;  
    private int item;
    private User doctor;
    private Patient patient;
    private Date date;
    private double cost;

    public OrderMedication() {
    }

    public int getIdMedication() {
        return idMedication;
    }

    public void setIdMedication(int idMedication) {
        this.idMedication = idMedication;
    }

    public String getDosage() {
        return dosage;
    }

    public void setDosage(String dosage) {
        this.dosage = dosage;
    }

    public String getDuration() {
        return duration;
    }

    public void setDuration(String duration) {
        this.duration = duration;
    }

    public int getItem() {
        return item;
    }

    public void setItem(int item) {
        this.item = item;
    }

    public User getDoctor() {
        return doctor;
    }

    public void setDoctor(User doctor) {
        this.doctor = doctor;
    }

    public Patient getPatient() {
        return patient;
    }

    public void setPatient(Patient patient) {
        this.patient = patient;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public double getCost() {
        return cost;
    }

    public void setCost(double cost) {
        this.cost = cost;
    }
}
