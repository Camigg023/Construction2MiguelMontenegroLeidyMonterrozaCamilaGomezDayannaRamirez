package src.main.java.app.adapter.in.rest.controllers;

import app.domain.service.VisitService;
import app.adapter.rest.request.VisitRequest;
import app.adapter.rest.response.VisitResponse;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/visits")

public class VisitController {
    private final VisitService visitService;

    public VisitController(VisitService visitService) {
        this.visitService = visitService;
    }

    @PostMapping
    public VisitResponse createVisit(@RequestBody VisitRequest request) {
        return visitService.createVisit(request);
    }

    @GetMapping
    public List<VisitResponse> getAllVisits() {
        return visitService.getAllVisits();
    }
}
