package src.main.java.app.adapter.rest.request;

import app.domain.model.Medication;
import app.domain.model.Patient;
import app.domain.model.User;
import lombok.Data;

import java.sql.Date;

@Data

public class OrderMedicationRequest {
    private Patient patient;
    private User doctor;
    private Medication medication;
    private String dose;
    private String duration;
    private int quantity;
    private double unitCost;
    private Date date;

    // Campos internos adicionales
    private String internalNotes;
    private boolean urgentFlag;
}