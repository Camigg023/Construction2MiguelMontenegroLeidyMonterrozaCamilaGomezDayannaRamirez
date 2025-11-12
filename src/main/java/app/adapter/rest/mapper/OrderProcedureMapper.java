package src.main.java.app.adapter.rest.mapper;

import app.adapter.in.rest.request.OrderProcedureRequest;
import app.adapter.in.rest.response.OrderProcedureResponse;
import app.domain.model.OrderProcedure;
import lombok.experimental.UtilityClass;

import java.sql.Date;

@UtilityClass

public class OrderProcedureMapper {
    public OrderProcedure toDomain(OrderProcedureRequest request) {
        return new OrderProcedure(
                0,
                0,
                request.getProcedure(),
                request.getQuantity(),
                request.getFrequency(),
                request.getUnitCost(),
                request.getSpecialistCode(),
                request.getDoctor(),
                request.getPatient(),
                (request.getDate() != null) ? request.getDate() : new Date(System.currentTimeMillis()),
                request.getUnitCost() * request.getQuantity()
        );
    }

    public OrderProcedureResponse toResponse(OrderProcedure order) {
        return OrderProcedureResponse.builder()
                .orderId(order.getOrderId())
                .item(order.getItem())
                .procedure(order.getProcedure())
                .quantity(order.getQuantity())
                .frequency(order.getFrequency())
                .unitCost(order.getUnitCost())
                .totalCost(order.getTotalCost())
                .specialistCode(order.getSpecialistCode())
                .doctor(order.getDoctor())
                .patient(order.getPatient())
                .date(order.getDate())
                .build();
    }
}
