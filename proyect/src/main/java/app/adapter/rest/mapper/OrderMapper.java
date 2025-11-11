package src.main.java.app.adapter.rest.mapper;

import app.adapter.in.rest.request.OrderRequest;
import app.adapter.in.rest.response.OrderResponse;
import app.domain.model.Order;
import lombok.experimental.UtilityClass;

@UtilityClass

public class OrderMapper {
    public Order toDomain(OrderRequest request) {
        Order order = new Order();
        order.setPatient(request.getPatient());
        order.setDoctor(request.getDoctor());
        order.setDate(request.getDate());
        order.setType(request.getType());
        order.setItemNumber(request.getItemNumber());
        order.setName(request.getName());
        order.setDose(request.getDose());
        order.setTreatmentDuration(request.getTreatmentDuration());
        order.setRepetitions(request.getRepetitions());
        order.setFrequency(request.getFrequency());
        order.setRequiresSpecialist(request.isRequiresSpecialist());
        order.setSpecialistTypeId(request.getSpecialistTypeId());
        order.setCost(request.getCost());
        order.setActivePolicy(request.isActivePolicy());
        order.setInsuranceCompany(request.getInsuranceCompany());
        order.setPolicyNumber(request.getPolicyNumber());
        order.setPolicyEndDate(request.getPolicyEndDate());
        order.setCopay(request.getCopay());
        order.setTotalCost(request.getTotalCost());
        order.setDiagnostic(request.getDiagnostic());
        order.setConsultationReason(request.getConsultationReason());
        order.setSymptoms(request.getSymptoms());
        order.setNotes(request.getNotes());
        order.setStatus(request.getStatus());
        order.setQuantity(request.getQuantity());
        order.setMedications(request.getMedications());
        order.setProcedures(request.getProcedures());
        order.setDiagnosticTests(request.getDiagnosticTests());
        return order;
    }

    public OrderResponse toResponse(Order order) {
        return OrderResponse.builder()
                .orderId(order.getOrderId())
                .patient(order.getPatient())
                .doctor(order.getDoctor())
                .date(order.getDate())
                .type(order.getType())
                .itemNumber(order.getItemNumber())
                .name(order.getName())
                .dose(order.getDose())
                .treatmentDuration(order.getTreatmentDuration())
                .repetitions(order.getRepetitions())
                .frequency(order.getFrequency())
                .requiresSpecialist(order.isRequiresSpecialist())
                .specialistTypeId(order.getSpecialistTypeId())
                .cost(order.getCost())
                .activePolicy(order.isActivePolicy())
                .insuranceCompany(order.getInsuranceCompany())
                .policyNumber(order.getPolicyNumber())
                .policyEndDate(order.getPolicyEndDate())
                .copay(order.getCopay())
                .totalCost(order.getTotalCost())
                .diagnostic(order.getDiagnostic())
                .consultationReason(order.getConsultationReason())
                .symptoms(order.getSymptoms())
                .notes(order.getNotes())
                .status(order.getStatus())
                .quantity(order.getQuantity())
                .medications(order.getMedications())
                .procedures(order.getProcedures())
                .diagnosticTests(order.getDiagnosticTests())
                .build();
    }
}

