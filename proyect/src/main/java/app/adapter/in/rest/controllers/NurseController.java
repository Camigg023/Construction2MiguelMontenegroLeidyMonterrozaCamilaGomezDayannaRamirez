package main.java.app.adapter.in.rest.controllers;

import app.domain.service.NurseService;
import app.adapter.rest.request.NurseRequest;
import app.adapter.rest.response.NurseResponse;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/nurses")

public class NurseController {
    private final NurseService nurseService;

    public NurseController(NurseService nurseService) {
        this.nurseService = nurseService;
    }

    @PostMapping
    public NurseResponse createNurse(@RequestBody NurseRequest request) {
        return nurseService.createNurse(request);
    }

    @GetMapping
    public List<NurseResponse> getAllNurses() {
        return nurseService.getAllNurses();
    }
}
