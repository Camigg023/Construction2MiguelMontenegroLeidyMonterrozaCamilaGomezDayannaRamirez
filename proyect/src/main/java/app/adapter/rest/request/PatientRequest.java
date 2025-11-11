package src.main.java.app.adapter.rest.request;

import app.domain.model.EmergencyContact;
import app.domain.model.MedicalInsurance;
import lombok.Data;

import java.sql.Date;

@Data

public class PatientRequest {
    private String fullName;
    private Date birthday;
    private String direction;
    private Long telephoneNumber;
    private String email;
    private String gender;
    private MedicalInsurance medicalInsurance;
    private EmergencyContact emergencyContact;


    private boolean activeFlag;
    private String internalNotes;
}
