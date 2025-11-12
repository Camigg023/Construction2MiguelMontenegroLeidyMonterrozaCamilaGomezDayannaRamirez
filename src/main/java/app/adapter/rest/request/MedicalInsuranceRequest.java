package src.main.java.app.adapter.rest.request;

import app.domain.model.Patient;
import lombok.Data;

import java.sql.Date;

@Data

public class MedicalInsuranceRequest {
    private String policyNumber;
    private String company;
    private Date validity;
    private Boolean status;
    private Patient patient;


    private String internalNotes;
    private boolean urgentFlag;
}
