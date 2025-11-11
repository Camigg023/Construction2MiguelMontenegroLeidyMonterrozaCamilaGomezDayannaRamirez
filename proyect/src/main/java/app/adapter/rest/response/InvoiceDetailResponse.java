package src.main.java.app.adapter.rest.response;

import app.domain.model.*;
import lombok.Builder;
import lombok.Data;

import java.util.Date;
import java.util.List;

@Data
@Builder

public class InvoiceDetailResponse {
    private Long invoiceId;
    private Date date;
    private Double totalCost;
    private boolean coveredByInsurance;
    private Double copay;
    private Double insuranceCoverageAmount;
    private Double patientCharge;
    private Patient patient;
    private User doctor;
    private MedicalInsurance medicalInsurance;
    private Visit visit;
    private List<OrderMedication> medications;
    private List<OrderProcedure> procedures;
    private List<OrderDiagnosticTest> diagnosticTests;
    private String item;
}