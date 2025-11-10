package src.main.java.app.infrastructure.persistence.mapper;

import src.main.java.app.domain.model.MedicalInsurance;
import src.main.java.app.infrastructure.persistence.entities.MedicalInsuranceEntity;

public class MedicalnsuranceMapper {
    
    public static MedicalInsuranceEntity toEntity(MedicalInsurance insurance) {
        if (insurance == null) {
            return null;
        }
        MedicalInsuranceEntity entity = new MedicalInsuranceEntity();

        entity.setPolicyNumber(insurance.getPolicyNumber());
        entity.setCompany(insurance.getCompany());
        entity.setValidity(insurance.getValidity());
        entity.setStatus(insurance.getStatus());

        return entity;
    }

    public static MedicalInsurance toDomain(MedicalInsuranceEntity entity) {
        if (entity == null) {
            return null;
        }
        MedicalInsurance insurance = new MedicalInsurance();

        insurance.setPolicyNumber(entity.getPolicyNumber());
        insurance.setCompany(entity.getCompany());
        insurance.setValidity(entity.getValidity());
        insurance.setStatus(entity.getStatus());

        return insurance;
    }
}

