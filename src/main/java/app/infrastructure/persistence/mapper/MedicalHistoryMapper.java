package src.main.java.app.infrastructure.persistence.mapper;

import src.main.java.app.domain.model.MedicalHistory;
import src.main.java.app.domain.model.User;
import src.main.java.app.infrastructure.persistence.entities.MedicalHistoryEntity;

public class MedicalHistoryMapper {

    public static MedicalHistoryEntity toEntity(MedicalHistory medicalHistory) {
        if (medicalHistory == null) {
            return null;
        }
        MedicalHistoryEntity entity = new MedicalHistoryEntity();

        
        entity.setId((long) medicalHistory.getId());
        entity.setChiefComplaint(medicalHistory.getChiefComplaint());
        entity.setSymptoms(medicalHistory.getSymptoms());
        entity.setDiagnosis(medicalHistory.getDiagnosis());
        entity.setDate(medicalHistory.getDate());

        
        entity.setDoctor(medicalHistory.getDoctor());

        return entity;
    }

    public static MedicalHistory toDomain(MedicalHistoryEntity entity) {
        if (entity == null) {
            return null;
        }
        MedicalHistory medicalHistory = new MedicalHistory();

       
        medicalHistory.setId(entity.getId().intValue());
        medicalHistory.setChiefComplaint(entity.getChiefComplaint());
        medicalHistory.setSymptoms(entity.getSymptoms());
        medicalHistory.setDiagnosis(entity.getDiagnosis());
        medicalHistory.setDate(entity.getDate());

        
        medicalHistory.setDoctor(entity.getDoctor());

        return medicalHistory;
    }
}

