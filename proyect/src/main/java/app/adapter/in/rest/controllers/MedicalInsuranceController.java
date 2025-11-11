package src.main.java.app.adapter.in.rest.controllers;

import app.domain.service.MedicalInsuranceService;
import app.adapter.rest.request.MedicalInsuranceRequest;
import app.adapter.rest.response.MedicalInsuranceResponse;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/medical-insurance")

public class MedicalInsuranceController {
    private final MedicalInsuranceService insuranceService;

    public MedicalInsuranceController(MedicalInsuranceService insuranceService) {
        this.insuranceService = insuranceService;
    }

    @PostMapping
    public MedicalInsuranceResponse createInsurance(@RequestBody MedicalInsuranceRequest request) {
        return insuranceService.createInsurance(request);
    }

    @GetMapping
    public List<MedicalInsuranceResponse> getAllInsurances() {
        return insuranceService.getAllInsurances();
    }
}