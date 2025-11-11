package src.main.java.app.adapter.rest.response;

import app.domain.model.Procedure;
import app.domain.model.Patient;
import app.domain.model.User;
import lombok.Builder;
import lombok.Data;

import java.sql.Date;

@Data
@Builder

public class OrderProcedureResponse {
    private int orderId;
    private int item;
    private Procedure procedure;
    private int quantity;
    private String frequency;
    private double unitCost;
    private double totalCost;
    private int specialistCode;
    private User doctor;
    private Patient patient;
    private Date date;
}
