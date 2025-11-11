package src.main.java.app.adapter.rest.mapper;

import app.adapter.in.rest.request.PatientRequest;
import app.adapter.in.rest.response.PatientResponse;
import app.domain.model.Patient;
import lombok.experimental.UtilityClass;

@UtilityClass

public class PatientMapper {
    public Patient toDomain(PatientRequest request) {
        Patient patient = new Patient();
        patient.setFullName(request.getFullName());
        patient.setBirthday(request.getBirthday());
        patient.setDirection(request.getDirection());
        patient.setTelephoneNumber(request.getTelephoneNumber());
        patient.setEmail(request.getEmail());
        patient.setGender(request.getGender());
        patient.setMedicalInsurance(request.getMedicalInsurance());
        patient.setEmergencyContact(request.getEmergencyContact());
        return patient;
    }

    public PatientResponse toResponse(Patient patient) {
        return PatientResponse.builder()
                .idPatient(patient.getIdPatient())
                .fullName(patient.getFullName())
                .birthday(patient.getBirthday())
                .direction(patient.getDirection())
                .telephoneNumber(patient.getTelephoneNumber())
                .email(patient.getEmail())
                .gender(patient.getGender())
                .medicalInsurance(patient.getMedicalInsurance())
                .emergencyContact(patient.getEmergencyContact())
                .build();
    }
}
