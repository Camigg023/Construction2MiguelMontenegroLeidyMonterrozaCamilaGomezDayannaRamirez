package app.domain.model;

import java.util.Date;


public class Order {
    
    
    private long orderNumber; 
    private User doctor;
    private Patient patient;
    private Date date;
    private double cost;

    public Order(long orderNumber, User doctor, Patient patient, Date date, double cost ) {
        this.orderNumber = orderNumber;
        this.doctor = doctor;
        this.patient = patient;
        this.date = date;
        this.cost = cost;
        
    }

    
    public long getOrderNumber() {
        return orderNumber;
    }

    
    public void setOrderNumber(long orderNumber) {
        this.orderNumber = orderNumber;
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
