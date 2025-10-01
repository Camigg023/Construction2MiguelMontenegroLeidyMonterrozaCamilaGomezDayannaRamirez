package app.adapter.in.rest.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import app.adapter.in.builder.UserBuilder;
import app.adapter.in.rest.request.UserRequest;
import app.application.exceptions.BusinessException;
import app.application.exceptions.InputsException;
import app.application.usecases.HumanResource;
import app.domain.model.User;
import app.domain.model.emuns.Role;

@RestController
public class AdminController {

    @Autowired
    private UserBuilder userBuilder;

    @Autowired
    private HumanResource humanResource;

    @PostMapping("/HumanResource")
    public ResponseEntity<?> createHumanResource(@RequestBody UserRequest request) {
        return createUserWithRole(request, Role.HUMANRESOURCE);
    }

    @PostMapping("/AdministrativeStaff")
    public ResponseEntity<?> createAdministrativeStaff(@RequestBody UserRequest request) {
        return createUserWithRole(request, Role.ADMINISTRATIVESTAFF);
    }

    @PostMapping("/InformationSupport")
    public ResponseEntity<?> createInformationSupport(@RequestBody UserRequest request) {
        return createUserWithRole(request, Role.INFORMATIONSOPPORT);
    }

    @PostMapping("/Nurses")
    public ResponseEntity<?> createNurse(@RequestBody UserRequest request) {
        return createUserWithRole(request, Role.NURSES);
    }

    @PostMapping("/Doctors")
    public ResponseEntity<?> createDoctor(@RequestBody UserRequest request) {
        return createUserWithRole(request, Role.DOCTORS);
    }

    
    private ResponseEntity<?> createUserWithRole(UserRequest request, Role role) {
        try {
            User user = userBuilder.build(
               request.getIdentification(),
                request.getName(),
                request.getEmail(),
                request.getAddress(),
                request.getUserName(),
                request.getPassword(),
                request.getPhone(),
                request.getBirthDay().toString()
            );
            // asignar rol
            user.setRole(role);

            humanResource.createEmplo(user);

            return ResponseEntity.status(HttpStatus.CREATED).body(user);

        } catch (InputsException ie) {
            return ResponseEntity
                    .status(HttpStatus.BAD_REQUEST)
                    .body(ie.getMessage());

        } catch (BusinessException be) {
            return ResponseEntity
                    .status(HttpStatus.CONFLICT)
                    .body(be.getMessage());

        } catch (Exception e) {
            return ResponseEntity
                    .status(HttpStatus.INTERNAL_SERVER_ERROR)
                    .body(e.getMessage());
        }
    }
}

