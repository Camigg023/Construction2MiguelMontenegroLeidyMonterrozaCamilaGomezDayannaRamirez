package main.java.app.adapter.in.rest.controllers;

import app.domain.service.AdministrativeService;
import app.adapter.rest.request.UserRequest;
import app.adapter.rest.response.UserResponse;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/admin")

public class AdministrativeController {
    private final AdministrativeService administrativeService;

    public AdministrativeController(AdministrativeService administrativeService) {
        this.administrativeService = administrativeService;
    }

    @PostMapping("/users")
    public UserResponse createUser(@RequestBody UserRequest request) {
        return administrativeService.createUser(request);
    }

    @GetMapping("/users")
    public List<UserResponse> getAllUsers() {
        return administrativeService.getAllUsers();
    }

    @PutMapping("/users/{id}")
    public UserResponse updateUser(@PathVariable Long id, @RequestBody UserRequest request) {
        return administrativeService.updateUser(id, request);
    }

    @DeleteMapping("/users/{id}")
    public void deleteUser(@PathVariable Long id) {
        administrativeService.deleteUser(id);
    }
}