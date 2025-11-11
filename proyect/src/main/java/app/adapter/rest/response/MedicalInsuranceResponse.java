package src.main.java.app.adapter.rest.response;

import app.domain.model.Patient;
import lombok.Builder;
import lombok.Data;

import java.sql.Date;

@Data
@Builder

public class MedicalInsuranceResponse {
    private String policyNumber;
    private String company;
    private Date validity;
    private Boolean status;
    private Patient patient;
}
