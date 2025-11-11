package src.main.java.app.adapter.rest.response;


import app.domain.model.EmergencyContact;
import app.domain.model.MedicalInsurance;
import lombok.Builder;
import lombok.Data;

import java.sql.Date;

@Data
@Builder

public class PatientResponse {
    private Long idPatient;
    private String fullName;
    private Date birthday;
    private String direction;
    private Long telephoneNumber;
    private String email;
    private String gender;
    private MedicalInsurance medicalInsurance;
    private EmergencyContact emergencyContact;
}
