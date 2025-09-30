package app.domain.model;

import java.sql.Date;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class OrderDiagnosticTest{
    
    @Id 
    private int diagnosticId;
    private int quantity;
    private Boolean requiresSpecialist; 
    private int specialistcode;
    private int item;
    private User doctor;
    private Patient patient;
    private Date date;
    private double cost;

    public OrderDiagnosticTest() {
    }

    public int getDiagnosticId() {
        return diagnosticId;
    }

    public void setDiagnosticId(int diagnosticId) {
        this.diagnosticId = diagnosticId;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public Boolean getRequiresSpecialist() {
        return requiresSpecialist;
    }

    public void setRequiresSpecialist(Boolean requiresSpecialist) {
        this.requiresSpecialist = requiresSpecialist;
    }

    public int getSpecialistcode() {
        return specialistcode;
    }

    public void setSpecialistcode(int specialistcode) {
        this.specialistcode = specialistcode;
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
