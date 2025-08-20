
public class DiagnosticTest extends Procedure {
   
    private Int diagnosticId; 

    public DiagnosticTest(Int diagnosticId, String Frequency, Int orderNumber, Int quantity, Int specialistcode, Int item, Boolean requiresSpecialist) {
        super(Frequency, orderNumber, quantity, specialistcode, item, requiresSpecialist);
        this.diagnosticId = diagnosticId;
    }

    public Int getDiagnosticId() {
        return diagnosticId;
    }

    public void setDiagnosticId(Int diagnosticId) {
        this.diagnosticId = diagnosticId;
    }

  
}
