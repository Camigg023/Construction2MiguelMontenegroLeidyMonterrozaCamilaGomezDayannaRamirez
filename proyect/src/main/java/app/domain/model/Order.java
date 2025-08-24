package app.domain.model;


public class Order {
    
    private String dosage;
    private int orderNumber;
    private int medicationId;
    private Double cost; 
    private User doctor;
    private Patient patient;

    public Order(String dosage, int orderNumber, int medicationId, Double cost) {
        this.dosage = dosage;
        this.orderNumber = orderNumber;
        this.medicationId = medicationId;
        this.cost = cost;
        this.doctor = doctor;
        this.patient = patient;
    }
    
    

    public String getDosage() {
        return dosage;
    }

    public void setDosage(String dosage) {
        this.dosage = dosage;
    }

    public int getOrderNumber() {
        return orderNumber;
    }

    public void setOrderNumber(int orderNumber) {
        this.orderNumber = orderNumber;
    }

    public int getMedicationId() {
        return medicationId;
    }

    public void setMedicationId(int medicationId) {
        this.medicationId = medicationId;
    }

    public Double getCost() {
        return cost;
    }

    public void setCost(Double cost) {
        this.cost = cost;
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
