package app.domain.model;

import java.util.Date;


public class OrderProcedure extends Order{
    private long ProcedureId;
    private int quantity; 
    private String frequency;
    private Boolean requiresSpecialist; 
    private int specialistcode; 
    private int item; 

    public OrderProcedure(long ProcedureId, int quantity, String frequency, Boolean requiresSpecialist, int specialistcode, int item, long orderNumber, User doctor, Patient patient, Date date, double cost) {
        super(orderNumber, doctor, patient, date, cost);
        this.ProcedureId = ProcedureId;
        this.quantity = quantity;
        this.frequency = frequency;
        this.requiresSpecialist = requiresSpecialist;
        this.specialistcode = specialistcode;
        this.item = item;
    }

    /**
     * @return the ProcedureId
     */
    public long getProcedureId() {
        return ProcedureId;
    }

    /**
     * @param ProcedureId the ProcedureId to set
     */
    public void setProcedureId(long ProcedureId) {
        this.ProcedureId = ProcedureId;
    }

    /**
     * @return the quantity
     */
    public int getQuantity() {
        return quantity;
    }

    /**
     * @param quantity the quantity to set
     */
    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    /**
     * @return the frequency
     */
    public String getFrequency() {
        return frequency;
    }

    /**
     * @param frequency the frequency to set
     */
    public void setFrequency(String frequency) {
        this.frequency = frequency;
    }

    /**
     * @return the requiresSpecialist
     */
    public Boolean getRequiresSpecialist() {
        return requiresSpecialist;
    }

    /**
     * @param requiresSpecialist the requiresSpecialist to set
     */
    public void setRequiresSpecialist(Boolean requiresSpecialist) {
        this.requiresSpecialist = requiresSpecialist;
    }

    /**
     * @return the specialistcode
     */
    public int getSpecialistcode() {
        return specialistcode;
    }

    /**
     * @param specialistcode the specialistcode to set
     */
    public void setSpecialistcode(int specialistcode) {
        this.specialistcode = specialistcode;
    }

    /**
     * @return the item
     */
    public int getItem() {
        return item;
    }

    /**
     * @param item the item to set
     */
    public void setItem(int item) {
        this.item = item;
    }
    
    
    
    

    
}
