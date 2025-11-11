package src.main.java.app.adapter.rest.response;

import app.domain.model.OrderDiagnosticTest;
import app.domain.model.OrderMedication;
import app.domain.model.OrderProcedure;
import app.domain.model.Patient;
import app.domain.model.User;
import lombok.Builder;
import lombok.Data;

import java.util.Date;
import java.util.List;

@Data
@Builder

public class MedicalHistoryResponse {
    private int id;
    private Patient patient;
    private String chiefComplaint;
    private String symptoms;
    private String diagnosis;
    private User doctor;
    private Date date;
    private List<OrderMedication> medications;
    private List<OrderProcedure> procedures;
    private List<OrderDiagnosticTest> diagnostics;
    private String observations;
}