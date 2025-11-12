package src.main.java.app.adapter.rest.response;

import app.domain.model.OrderDiagnosticTest;
import app.domain.model.OrderMedication;
import app.domain.model.OrderProcedure;
import app.domain.model.Patient;
import app.domain.model.User;
import lombok.Builder;
import lombok.Data;

import java.sql.Date;
import java.util.List;

@Data

public class OrderResponse {
    private int orderId;
    private Patient patient;
    private User doctor;
    private Date date;
    private String type;
    private int itemNumber;
    private String name;
    private String dose;
    private String treatmentDuration;
    private int repetitions;
    private String frequency;
    private boolean requiresSpecialist;
    private String specialistTypeId;
    private double cost;
    private boolean activePolicy;
    private String insuranceCompany;
    private String policyNumber;
    private Date policyEndDate;
    private double copay;
    private double totalCost;
    private String diagnostic;
    private String consultationReason;
    private String symptoms;
    private String notes;
    private String status;
    private int quantity;

    private List<OrderMedication> medications;
    private List<OrderProcedure> procedures;
    private List<OrderDiagnosticTest> diagnosticTests;
}
