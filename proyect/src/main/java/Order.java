
public class Order {
    private String dosage;
    private Int orderNumber;
    private Int medicationId;
    private Double cost; 

    public Order(String dosage, Int orderNumber, Int medicationId, Double cost) {
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

    public Int getOrderNumber() {
        return orderNumber;
    }

    public void setOrderNumber(Int orderNumber) {
        this.orderNumber = orderNumber;
    }

    public Int getMedicationId() {
        return medicationId;
    }

    public void setMedicationId(Int medicationId) {
        this.medicationId = medicationId;
    }

    public Double getCost() {
        return cost;
    }

    public void setCost(Double cost) {
        this.cost = cost;
    }
}
