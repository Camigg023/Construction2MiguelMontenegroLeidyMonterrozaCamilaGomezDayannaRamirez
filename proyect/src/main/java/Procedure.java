
public class Procedure {
    private String Frequency; 
    private Int orderNumber; 
    private Int ProcedureId; 
    private Int quantity; 
    private Int specialistcode; 
    private Int item; 
    private Boolean requiresSpecialist; 

    public Procedure(String Frequency, Int orderNumber, Int ProcedureId, Int quantity, Int specialistcode, Int item, Boolean requiresSpecialist) {
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

    public Int getOrderNumber() {
        return orderNumber;
    }

    public void setOrderNumber(Int orderNumber) {
        this.orderNumber = orderNumber;
    }

    public Int getProcedureId() {
        return ProcedureId;
    }

    public void setProcedureId(Int ProcedureId) {
        this.ProcedureId = ProcedureId;
    }

    public Int getQuantity() {
        return quantity;
    }

    public void setQuantity(Int quantity) {
        this.quantity = quantity;
    }

    public Int getSpecialistcode() {
        return specialistcode;
    }

    public void setSpecialistcode(Int specialistcode) {
        this.specialistcode = specialistcode;
    }

    public Int getItem() {
        return item;
    }

    public void setItem(Int item) {
        this.item = item;
    }

    public Boolean getRequiresSpecialist() {
        return requiresSpecialist;
    }

    public void setRequiresSpecialist(Boolean requiresSpecialist) {
        this.requiresSpecialist = requiresSpecialist;
    }
}
