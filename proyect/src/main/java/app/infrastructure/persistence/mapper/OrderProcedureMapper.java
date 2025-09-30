package app.infrastructure.persistence.mapper;

import app.domain.model.OrderProcedure;
import app.infrastructure.persistence.entities.OrderProcedureEntity;

public class OrderProcedureMapper{
    
    public static OrderProcedureEntity toEntity(OrderProcedure order) {
        if (order == null) {
            return null;
        }
        OrderProcedureEntity entity = new OrderProcedureEntity();

        entity.setProcedureId(order.getProcedureId());
        entity.setQuantity(order.getQuantity());
        entity.setFrequency(order.getFrequency());
        entity.setRequiresSpecialist(order.getRequiresSpecialist());
        entity.setSpecialistcode(order.getSpecialistcode());
        entity.setItem(order.getItem());
        entity.setDoctor(order.getDoctor());
        entity.setPatient(order.getPatient());
        entity.setDate(order.getDate());
        entity.setCost(order.getCost());

        return entity;
    }

    public static OrderProcedure toDomain(OrderProcedureEntity entity) {
        if (entity == null) {
            return null;
        }
        OrderProcedure order = new OrderProcedure();

        order.setProcedureId(entity.getProcedureId());
        order.setQuantity(entity.getQuantity());
        order.setFrequency(entity.getFrequency());
        order.setRequiresSpecialist(entity.getRequiresSpecialist());
        order.setSpecialistcode(entity.getSpecialistcode());
        order.setItem(entity.getItem());
        order.setDoctor(entity.getDoctor());
        order.setPatient(entity.getPatient());
        order.setDate(entity.getDate());
        order.setCost(entity.getCost());

        return order;
    }
}
