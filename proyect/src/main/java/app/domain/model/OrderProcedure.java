package app.domain.model;

import java.util.Date;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class OrderProcedure extends Order{
    
    @Id
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

    public long getProcedureId() {
        return ProcedureId;
    }

    public void setProcedureId(long ProcedureId) {
        this.ProcedureId = ProcedureId;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public String getFrequency() {
        return frequency;
    }

    public void setFrequency(String frequency) {
        this.frequency = frequency;
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
    
    
    
    

    
}
