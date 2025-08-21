
public class Procedure {
    private String Frequency; 
    private int orderNumber; 
    private int ProcedureId; 
    private int quantity; 
    private int specialistcode; 
    private int item; 
    private Boolean requiresSpecialist; 

    public Procedure(String Frequency, int orderNumber, int ProcedureId, int quantity, int specialistcode, int item, Boolean requiresSpecialist) {
        this.Frequency = Frequency;
        this.orderNumber = orderNumber;
        this.ProcedureId = ProcedureId;
        this.quantity = quantity;
        this.specialistcode = specialistcode;
        this.item = item;
        this.requiresSpecialist = requiresSpecialist;
    }

    public String getFrequency() {
        return Frequency;
    }

    public void setFrequency(String Frequency) {
        this.Frequency = Frequency;
    }

    public int getOrderNumber() {
        return orderNumber;
    }

    public void setOrderNumber(int orderNumber) {
        this.orderNumber = orderNumber;
    }

    public int getProcedureId() {
        return ProcedureId;
    }

    public void setProcedureId(int ProcedureId) {
        this.ProcedureId = ProcedureId;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
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

    public Boolean getRequiresSpecialist() {
        return requiresSpecialist;
    }

    public void setRequiresSpecialist(Boolean requiresSpecialist) {
        this.requiresSpecialist = requiresSpecialist;
    }
}
