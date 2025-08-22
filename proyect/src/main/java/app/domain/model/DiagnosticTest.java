package app.domain.model;


public class DiagnosticTest extends Procedure {
   
    private int diagnosticId; 

    public DiagnosticTest(String Frequency, int orderNumber, int ProcedureId, int quantity, int specialistcode, int item, Boolean requiresSpecialist) {
        super(Frequency, orderNumber, ProcedureId, quantity, specialistcode, item, requiresSpecialist);
    }

    public int getDiagnosticId() {
        return diagnosticId;
    }

    public void setDiagnosticId(int diagnosticId) {
        this.diagnosticId = diagnosticId;
    }
}
