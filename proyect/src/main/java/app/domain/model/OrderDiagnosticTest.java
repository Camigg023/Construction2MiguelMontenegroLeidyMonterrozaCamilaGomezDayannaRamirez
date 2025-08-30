package app.domain.model;


public class OrderDiagnosticTest extends Order {
   
    private int diagnosticId;
    private int quantity;
    private Boolean requiresSpecialist; 
    private int specialistcode;
    private int item;

    public OrderDiagnosticTest(int diagnosticId, int quantity, Boolean requiresSpecialist, int specialistcode, int item, long orderNumber, User doctor, Patient patient) {
        super(orderNumber, doctor, patient);
        this.diagnosticId = diagnosticId;
        this.quantity = quantity;
        this.requiresSpecialist = requiresSpecialist;
        this.specialistcode = specialistcode;
        this.item = item;
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
    
    

    
}
