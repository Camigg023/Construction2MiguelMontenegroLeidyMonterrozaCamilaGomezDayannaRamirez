package src.main.java.app.adapter.rest.mapper;


import app.adapter.in.rest.request.DiagnosticTestRequest;
import app.adapter.in.rest.response.DiagnosticTestResponse;
import app.domain.model.DiagnosticTest;
import lombok.experimental.UtilityClass;

@UtilityClass

public class DiagnosticTestResultMapper {
    public DiagnosticTest toDomain(DiagnosticTestRequest request) {
        DiagnosticTest test = new DiagnosticTest();
        test.setName(request.getName());
        test.setDescription(request.getDescription());
        test.setRequiresSpecialist(request.isRequiresSpecialist());
        test.setBaseCost(request.getBaseCost());
        test.setPreparationInstructions(request.getPreparationInstructions());
        test.setActive(request.isActive());
        return test;
    }

    public DiagnosticTestResponse toResponse(DiagnosticTest test) {
        return DiagnosticTestResponse.builder()
                .diagnosticTestId(test.getDiagnosticTestId())
                .name(test.getName())
                .description(test.getDescription())
                .requiresSpecialist(test.isRequiresSpecialist())
                .baseCost(test.getBaseCost())
                .preparationInstructions(test.getPreparationInstructions())
                .active(test.isActive())
                .build();
    }
}