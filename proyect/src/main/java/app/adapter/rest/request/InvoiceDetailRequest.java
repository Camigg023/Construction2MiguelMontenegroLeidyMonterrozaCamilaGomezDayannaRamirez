package src.main.java.app.adapter.rest.request;

import app.domain.model.*;
import lombok.Data;

import javax.validation.constraints.*;
import java.util.Date;
import java.util.List;

@Data

public class InvoiceDetailRequest {
    @NotNull(message = "La fecha es obligatoria")
    private Date date;

    @NotNull(message = "El costo total es obligatorio")
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


    private String internalNotes;
    private boolean urgentFlag;
}
