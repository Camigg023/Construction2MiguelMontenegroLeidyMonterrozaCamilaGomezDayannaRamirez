package src.main.java.app.adapter.rest.mapper;

import app.adapter.in.rest.request.OrderDiagnosticTestRequest;
import app.adapter.in.rest.response.OrderDiagnosticTestResponse;
import app.domain.model.OrderDiagnosticTest;
import lombok.experimental.UtilityClass;

@UtilityClass

public class OrderDiagnosticTestMapper {
    public OrderDiagnosticTest toDomain(OrderDiagnosticTestRequest request) {
        OrderDiagnosticTest order = new OrderDiagnosticTest();
        order.setPatient(request.getPatient());
        order.setDoctor(request.getDoctor());
        order.setVisit(request.getVisit());
        order.setDiagnosticTest(request.getDiagnosticTest());
        order.setQuantity(request.getQuantity());
        order.setRequiresSpecialist(request.isRequiresSpecialist());
        order.setSpecialistCode(request.getSpecialistCode());
        order.setCost(request.getCost());
        order.setCopay(request.getCopay());
        order.setInsuranceCoverage(request.getInsuranceCoverage());
        order.setStatus(request.getStatus());
        order.setResultNotes(request.getResultNotes());
        order.setCreationDate(request.getCreationDate());
        order.setResultDate(request.getResultDate());
        return order;
    }

    public OrderDiagnosticTestResponse toResponse(OrderDiagnosticTest order) {
        return OrderDiagnosticTestResponse.builder()
                .orderId(order.getOrderId())
                .itemId(order.getItemId())
                .diagnosticTest(order.getDiagnosticTest())
                .quantity(order.getQuantity())
                .requiresSpecialist(order.isRequiresSpecialist())
                .specialistCode(order.getSpecialistCode())
                .cost(order.getCost())
                .copay(order.getCopay())
                .insuranceCoverage(order.getInsuranceCoverage())
                .status(order.getStatus())
                .resultNotes(order.getResultNotes())
                .creationDate(order.getCreationDate())
                .resultDate(order.getResultDate())
                .doctor(order.getDoctor())
                .patient(order.getPatient())
                .visit(order.getVisit())
                .build();
    }
}
