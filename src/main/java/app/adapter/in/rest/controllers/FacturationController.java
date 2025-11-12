package main.java.app.adapter.in.rest.controllers;

import app.domain.service.FacturationService;
import app.adapter.rest.response.FacturationResponse;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/facturation")

public class FacturationController {
    private final FacturationService facturationService;

    public FacturationController(FacturationService facturationService) {
        this.facturationService = facturationService;
    }

    // Genera facturacion de un paciente específico
    @GetMapping("/patient/{patientId}")
    public FacturationResponse generateFacturation(@PathVariable Long patientId) {
        return facturationService.generateFacturation(patientId);
    }

    // Lista todas las facturaciones registradas
    @GetMapping
    public List<FacturationResponse> getAllFacturations() {
        return facturationService.getAllFacturations();
    }
}
