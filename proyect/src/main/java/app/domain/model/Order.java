package app.domain.model;


public class Order {
    private String dosage;
    private int orderNumber;
    private int medicationId;
    private Double cost; 

    public Order(String dosage, int orderNumber, int medicationId, Double cost) {
        this.dosage = dosage;
        this.orderNumber = orderNumber;
        this.medicationId = medicationId;
        this.cost = cost;
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
}
