package src.main.java.app.adapter.rest.request;

import app.domain.model.Procedure;
import app.domain.model.Patient;
import app.domain.model.User;
import lombok.Data;

import java.sql.Date;

@Data

public class OrderProcedureRequest {
    private Patient patient;
    private User doctor;
    private Procedure procedure;
    private int quantity;
    private String frequency;
    private double unitCost;
    private int specialistCode;
    private Date date;


    private String internalNotes;
    private boolean urgentFlag;
}
