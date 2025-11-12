package src.main.java.app.adapter.rest.mapper;

import app.adapter.in.rest.request.OrderMedicationRequest;
import app.adapter.in.rest.response.OrderMedicationResponse;
import app.domain.model.OrderMedication;
import lombok.experimental.UtilityClass;

@UtilityClass

public class OrderMedicationMapper {
    public OrderMedication toDomain(OrderMedicationRequest request) {
        return new OrderMedication(
                0,
                0,
                request.getMedication(),
                request.getDose(),
                request.getDuration(),
                request.getQuantity(),
                request.getUnitCost(),
                request.getDoctor(),
                request.getPatient(),
                request.getDate(),
                request.getUnitCost() * request.getQuantity()
        );
    }

    public OrderMedicationResponse toResponse(OrderMedication order) {
        return OrderMedicationResponse.builder()
                .orderId(order.getOrderId())
                .item(order.getItem())
                .medication(order.getMedication())
                .dose(order.getDose())
                .duration(order.getDuration())
                .quantity(order.getQuantity())
                .unitCost(order.getUnitCost())
                .totalCost(order.getTotalCost())
                .doctor(order.getDoctor())
                .patient(order.getPatient())
                .date(order.getDate())
                .build();
    }
}
