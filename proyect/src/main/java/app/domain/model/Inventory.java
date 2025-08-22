package app.domain.model;

import java.util.List;

public class Inventory {
   private List medications;
   private List procedures;
   private List diagnosticTests;

    public List getMedications() {
        return medications;
    }

    public void setMedications(List medications) {
        this.medications = medications;
    }

    public List getProcedures() {
        return procedures;
    }

    public void setProcedures(List procedures) {
        this.procedures = procedures;
    }

    public List getDiagnosticTests() {
        return diagnosticTests;
    }

    public void setDiagnosticTests(List diagnosticTests) {
        this.diagnosticTests = diagnosticTests;
    }
   
}
