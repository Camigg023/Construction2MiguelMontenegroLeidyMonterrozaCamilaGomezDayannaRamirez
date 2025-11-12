package src.main.java.app.infrastructure.persistence.mapper;

import src.main.java.app.domain.model.OrderDiagnosticTest;
import src.main.java.app.infrastructure.persistence.entities.OrderDiagnosticEntity;

public class OrderDiagnosticMapper {

    public static OrderDiagnosticEntity toEntity(OrderDiagnosticTest diagnostic) {
        if (diagnostic == null) {
            return null;
        }
        OrderDiagnosticEntity entity = new OrderDiagnosticEntity();

        entity.setDiagnosticId(diagnostic.getDiagnosticId());
        entity.setQuantity(diagnostic.getQuantity());
        entity.setRequiresSpecialist(diagnostic.getRequiresSpecialist());
        entity.setSpecialistcode(diagnostic.getSpecialistcode());
        entity.setItem(diagnostic.getItem());
        entity.setDoctor(diagnostic.getDoctor());
        entity.setPatient(diagnostic.getPatient());
        entity.setDate(diagnostic.getDate());
        entity.setCost(diagnostic.getCost());

        return entity;
    }

    public static OrderDiagnosticTest toDomain(OrderDiagnosticEntity entity) {
        if (entity == null) {
            return null;
        }
        OrderDiagnosticTest diagnostic = new OrderDiagnosticTest();

        diagnostic.setDiagnosticId(entity.getDiagnosticId());
        diagnostic.setQuantity(entity.getQuantity());
        diagnostic.setRequiresSpecialist(entity.getRequiresSpecialist());
        diagnostic.setSpecialistcode(entity.getSpecialistcode());
        diagnostic.setItem(entity.getItem());
        diagnostic.setDoctor(entity.getDoctor());
        diagnostic.setPatient(entity.getPatient());
        diagnostic.setDate(entity.getDate());
        diagnostic.setCost(entity.getCost());

        return diagnostic;
    }
}

