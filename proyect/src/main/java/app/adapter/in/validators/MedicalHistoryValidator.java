package src.main.java.app.adapter.in.validators;

import java.util.Date;
import java.util.List;

import org.springframework.stereotype.Component;

import src.main.java.app.domain.model.OrderMedication;
import src.main.java.app.domain.model.OrderProcedure;
import src.main.java.app.domain.model.OrderDiagnosticTest;

@Component
public class MedicalHistoryValidator {

    public String chiefComplaintValidator(String chiefComplaint) throws Exception {
        if (chiefComplaint == null || chiefComplaint.trim().isEmpty()) {
            throw new Exception("Chief complaint cannot be empty.");
        }
        return chiefComplaint.trim();
    }

    public String symptomsValidator(String symptoms) throws Exception {
        if (symptoms == null || symptoms.trim().isEmpty()) {
            throw new Exception("Symptoms cannot be empty.");
        }
        return symptoms.trim();
    }

    public String diagnosisValidator(String diagnosis) throws Exception {
        if (diagnosis == null || diagnosis.trim().isEmpty()) {
            throw new Exception("Diagnosis cannot be empty.");
        }
        return diagnosis.trim();
    }

    public String observationsValidator(String observations) {
        return (observations != null) ? observations.trim() : "";
    }

    public Date dateValidator(Date date) throws Exception {
        if (date == null) {
            throw new Exception("Date cannot be null.");
        }
        if (date.after(new Date())) {
            throw new Exception("Date cannot be in the future.");
        }
        return date;
    }

    public List<OrderMedication> medicationsValidator(List<OrderMedication> medications) {
        return medications; // Se valida a nivel de capa de dominio si es necesario
    }

    public List<OrderProcedure> proceduresValidator(List<OrderProcedure> procedures) {
        return procedures;
    }

    public List<OrderDiagnosticTest> diagnosticsValidator(List<OrderDiagnosticTest> diagnostics) {
        return diagnostics;
    }
}
