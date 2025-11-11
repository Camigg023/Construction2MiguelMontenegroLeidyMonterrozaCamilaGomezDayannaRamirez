package src.main.java.app.adapter.in.rest.controllers;

import app.domain.service.SpecialityService;
import app.adapter.rest.request.SpecialityRequest;
import app.adapter.rest.response.SpecialityResponse;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/specialities")

public class SpecialityController {
    private final SpecialityService specialityService;

    public SpecialityController(SpecialityService specialityService) {
        this.specialityService = specialityService;
    }

    @PostMapping
    public SpecialityResponse createSpeciality(@RequestBody SpecialityRequest request) {
        return specialityService.createSpeciality(request);
    }

    @GetMapping
    public List<SpecialityResponse> getAllSpecialities() {
        return specialityService.getAllSpecialities();
    }
}

