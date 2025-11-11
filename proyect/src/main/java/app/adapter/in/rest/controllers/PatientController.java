package src.main.java.app.adapter.in.rest.controllers;

import app.domain.service.PatientService;
import app.adapter.rest.request.PatientRequest;
import app.adapter.rest.response.PatientResponse;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/patients")

public class PatientController {
    private final PatientService patientService;

    public PatientController(PatientService patientService) {
        this.patientService = patientService;
    }

    @PostMapping
    public PatientResponse createPatient(@RequestBody PatientRequest request) {
        return patientService.createPatient(request);
    }

    @GetMapping
    public List<PatientResponse> getAllPatients() {
        return patientService.getAllPatients();
    }
}

