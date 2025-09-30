package app.domain.services;

import app.domain.model.OrderProcedure;
import app.domain.model.OrderMedication;
import app.domain.model.OrderDiagnosticTest;
import app.domain.model.User;
import app.domain.model.Patient;
import app.domain.model.emuns.Role;
import app.domain.ports.OrderProcedurePort;
import app.domain.ports.OrderMedicationPort;
import app.domain.ports.OrderDiagnosticTestPort;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CreateOrder {

    private final OrderProcedurePort orderProcedurePort;
    private final OrderMedicationPort orderMedicationPort;
    private final OrderDiagnosticTestPort orderDiagnosticTestPort;

    @Autowired
    public CreateOrder(OrderProcedurePort orderProcedurePort,
                       OrderMedicationPort orderMedicationPort,
                       OrderDiagnosticTestPort orderDiagnosticTestPort) {
        this.orderProcedurePort = orderProcedurePort;
        this.orderMedicationPort = orderMedicationPort;
        this.orderDiagnosticTestPort = orderDiagnosticTestPort;
    }

    
    private void validateProcedure(OrderProcedure orderProcedure) throws Exception {
        User doctor = orderProcedure.getDoctor();
        Patient patient = orderProcedure.getPatient();

        if (doctor == null || !doctor.getRole().equals(Role.DOCTORS)) {
            throw new Exception("Las órdenes solo pueden ser creadas por médicos válidos");
        }

        if (patient == null) {
            throw new Exception("La orden debe estar asociada a un paciente existente");
        }
    }

    
    private void validateMedication(OrderMedication orderMedication) throws Exception {
        User doctor = orderMedication.getDoctor();  
        Patient patient = orderMedication.getPatient();

        if (doctor == null || !doctor.getRole().equals(Role.DOCTORS)) {
            throw new Exception("Las órdenes solo pueden ser creadas por médicos válidos");
        }

        if (patient == null) {
            throw new Exception("La orden debe estar asociada a un paciente existente");
        }
    }

    
    private void validateDiagnostic(OrderDiagnosticTest orderDiagnosticTest) throws Exception {
        Patient patient = orderDiagnosticTest.getPatient();  // ✅ corregido

        if (patient == null) {
            throw new Exception("La orden debe estar asociada a un paciente existente");
        }

        
        if (Boolean.TRUE.equals(orderDiagnosticTest.getRequiresSpecialist())
                && orderDiagnosticTest.getSpecialistcode() <= 0) {
            throw new Exception("Si la prueba requiere especialista, el código de especialista debe ser válido");
        }
    }

   
    public void createProcedure(OrderProcedure orderProcedure) throws Exception {
        validateProcedure(orderProcedure);
        orderProcedurePort.save(orderProcedure);
    }

    public void createOrderMedication(OrderMedication orderMedication) throws Exception {
        validateMedication(orderMedication);
        orderMedicationPort.save(orderMedication);
    }

    public void createOrderDiagnosticTest(OrderDiagnosticTest orderDiagnosticTest) throws Exception {
        validateDiagnostic(orderDiagnosticTest);
        orderDiagnosticTestPort.save(orderDiagnosticTest);
    }
}

