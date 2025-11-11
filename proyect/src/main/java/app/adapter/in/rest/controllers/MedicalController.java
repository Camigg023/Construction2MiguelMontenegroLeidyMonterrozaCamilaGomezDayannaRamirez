package main.java.app.adapter.in.rest.controllers;

import app.domain.service.MedicalService;
import app.adapter.rest.request.MedicalRequest;
import app.adapter.rest.response.MedicalResponse;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/medical")

public class MedicalController {
    private final MedicalService medicalService;

    public MedicalController(MedicalService medicalService) {
        this.medicalService = medicalService;
    }

    @PostMapping
    public MedicalResponse createMedical(@RequestBody MedicalRequest request) {
        return medicalService.createMedical(request);
    }

    @GetMapping
    public List<MedicalResponse> getAllMedicals() {
        return medicalService.getAllMedicals();
    }
}
