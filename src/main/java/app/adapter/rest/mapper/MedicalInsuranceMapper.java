package src.main.java.app.adapter.rest.mapper;

import app.adapter.in.rest.request.MedicalInsuranceRequest;
import app.adapter.in.rest.response.MedicalInsuranceResponse;
import app.domain.model.MedicalInsurance;
import lombok.experimental.UtilityClass;

@UtilityClass

public class MedicalInsuranceMapper {
    public MedicalInsurance toDomain(MedicalInsuranceRequest request) {
        MedicalInsurance insurance = new MedicalInsurance();
        insurance.setPolicyNumber(request.getPolicyNumber());
        insurance.setCompany(request.getCompany());
        insurance.setValidity(request.getValidity());
        insurance.setStatus(request.getStatus());
        insurance.setPatient(request.getPatient());
        return insurance;
    }

    public MedicalInsuranceResponse toResponse(MedicalInsurance insurance) {
        return MedicalInsuranceResponse.builder()
                .policyNumber(insurance.getPolicyNumber())
                .company(insurance.getCompany())
                .validity(insurance.getValidity())
                .status(insurance.getStatus())
                .patient(insurance.getPatient())
                .build();
    }
}