package app.domain.model;


public class Order {
    
    
    private long orderNumber; 
    private User doctor;
    private Patient patient;

    public Order(long orderNumber, User doctor, Patient patient) {
        this.orderNumber = orderNumber;
        this.doctor = doctor;
        this.patient = patient;
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
     
}
