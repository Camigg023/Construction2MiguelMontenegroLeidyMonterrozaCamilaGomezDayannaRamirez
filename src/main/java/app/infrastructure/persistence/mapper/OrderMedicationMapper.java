package src.main.java.app.infrastructure.persistence.mapper;

import src.main.java.app.domain.model.OrderMedication;
import src.main.java.app.infrastructure.persistence.entities.OrderMedicationEntity;

public class OrderMedicationMapper {

    public static OrderMedicationEntity toEntity(OrderMedication medication) {
        if (medication == null) {
            return null;
        }
        OrderMedicationEntity entity = new OrderMedicationEntity();

        entity.setIdMedication(medication.getIdMedication());
        entity.setDosage(medication.getDosage());
        entity.setDuration(medication.getDuration());
        entity.setItem(medication.getItem());
        entity.setDoctor(medication.getDoctor());
        entity.setPatient(medication.getPatient());
        entity.setDate(medication.getDate());
        entity.setCost(medication.getCost());

        return entity;
    }

    public static OrderMedication toDomain(OrderMedicationEntity entity) {
        if (entity == null) {
            return null;
        }
        OrderMedication medication = new OrderMedication();

        medication.setIdMedication(entity.getIdMedication());
        medication.setDosage(entity.getDosage());
        medication.setDuration(entity.getDuration());
        medication.setItem(entity.getItem());
        medication.setDoctor(entity.getDoctor());
        medication.setPatient(entity.getPatient());
        medication.setDate(entity.getDate());
        medication.setCost(entity.getCost());

        return medication;
    }
}
