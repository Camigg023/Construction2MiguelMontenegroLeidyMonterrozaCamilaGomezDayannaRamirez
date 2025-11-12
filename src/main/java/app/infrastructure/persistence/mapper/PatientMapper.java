package src.main.java.app.infrastructure.persistence.mapper;

import src.main.java.app.domain.model.Patient;
import src.main.java.app.domain.model.MedicalInsurance;
import src.main.java.app.domain.model.EmergencyContact;
import src.main.java.app.infrastructure.persistence.entities.PatientEntity;

public class PatientMapper {

    public static PatientEntity toEntity(Patient patient) {
        if (patient == null) return null;

        PatientEntity entity = new PatientEntity();

        entity.setIdPatient(patient.getIdPatient());
        entity.setFullName(patient.getFullName());
        entity.setBirthday(patient.getBirthday());
        entity.setDirection(patient.getDirection());
        entity.setTelephoneNumber(patient.getTelephoneNumber());
        entity.setEmail(patient.getEmail());
        entity.setGender(patient.getGender());

        
        entity.setMedicalInsurance(patient.getMedicalInsurance());
        entity.setEmergencyContact(patient.getEmergencyContact());

        return entity;
    }

    public static Patient toDomain(PatientEntity entity) {
        if (entity == null) return null;

        Patient patient = new Patient();

        patient.setIdPatient(entity.getIdPatient());
        patient.setFullName(entity.getFullName());
        patient.setBirthay(entity.getBirthday());
        patient.setDirection(entity.getDirection());
        patient.setTelephoneNumber(entity.gettelephoneNumber());
        patient.setEmail(entity.getEmail());
        patient.setGender(entity.getGender());

        
        patient.setMedicalInsurance(entity.getMedicalInsurance());
        patient.setEmergencyContact(entity.getEmergencyContact());

        return patient;
    }
}

