package src.main.java.app.adapter.rest.response;


import app.domain.model.Medication;
import app.domain.model.Patient;
import app.domain.model.User;
import lombok.Builder;
import lombok.Data;

import java.sql.Date;

@Data
@Builder

public class OrderMedicationResponse {
    private int orderId;
    private int item;
    private Medication medication;
    private String dose;
    private String duration;
    private int quantity;
    private double unitCost;
    private double totalCost;
    private User doctor;
    private Patient patient;
    private Date date;
}
