package src.main.java.app.domain.model;

import java.util.List;

public class Inventory {

    private int id;
    private String name;
    private List<Medication> medications;
    private List<Procedure> procedures;
    private List<DiagnosticTest> diagnosticTests;
    private String status;

    public Inventory() {
    }

    public Inventory(int id, String name, List<Medication> medications,
                     List<Procedure> procedures, List<DiagnosticTest> diagnosticTests, String status) {
        this.id = id;
        this.name = name;
        this.medications = medications;
        this.procedures = procedures;
        this.diagnosticTests = diagnosticTests;
        this.status = status;
    }

    // Getters y Setters
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Medication> getMedications() {
        return medications;
    }

    public void setMedications(List<Medication> medications) {
        this.medications = medications;
    }

    public List<Procedure> getProcedures() {
        return procedures;
    }

    public void setProcedures(List<Procedure> procedures) {
        this.procedures = procedures;
    }

    public List<DiagnosticTest> getDiagnosticTests() {
        return diagnosticTests;
    }

    public void setDiagnosticTests(List<DiagnosticTest> diagnosticTests) {
        this.diagnosticTests = diagnosticTests;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}

