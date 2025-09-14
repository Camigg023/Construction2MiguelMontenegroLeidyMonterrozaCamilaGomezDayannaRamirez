package app.domain.services;

import app.domain.model.Order;
import app.domain.ports.PatientPort;
import app.domain.model.OrderProcedure;
import app.domain.model.OrderMedication;
import app.domain.model.OrderDiagnosticTest;
import app.domain.model.User;
import app.domain.model.Patient;
import app.domain.model.emuns.Role;
import app.domain.ports.OrderProcedurePort;
import app.domain.ports.OrderMedicationPort;
import app.domain.ports.OrderDiagnosticTestPort;
import app.domain.ports.UserPort;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CreateOrder {
    @Autowired
    private final UserPort userPort;
    @Autowired
    private final PatientPort patientPort;
    @Autowired
    private final OrderProcedurePort orderProcedurePort;
    @Autowired
    private final OrderMedicationPort orderMedicationPort;
    @Autowired
    private final OrderDiagnosticTestPort orderDiagnosticTestPort;
    
    
    public CreateOrder(UserPort userPort, PatientPort patientPort,
                      OrderProcedurePort orderProcedurePort,
                      OrderMedicationPort orderMedicationPort,
                      OrderDiagnosticTestPort orderDiagnosticTestPort) {
        this.userPort = userPort;
        this.patientPort = patientPort;
        this.orderProcedurePort = orderProcedurePort;
        this.orderMedicationPort = orderMedicationPort;
        this.orderDiagnosticTestPort = orderDiagnosticTestPort;
    }

    private void validateOrder(Order order) throws Exception {
        User doctor = userPort.findByDocument(order.getDoctor());
        if (doctor == null || !doctor.getRole().equals(Role.DOCTORS)) {
            throw new Exception("Las órdenes solo pueden ser creadas por médicos");
        }
        
        Patient patient = patientPort.findById(order.getPatient());
        if (patient == null) {
            throw new Exception("La orden debe estar asociada a un paciente existente");
        }
        
        order.setDoctor(doctor);
        order.setPatient(patient);
    }
    
    public void createProcedure(OrderProcedure orderProcedure) throws Exception {
        validateOrder(orderProcedure);
        orderProcedurePort.save(orderProcedure);
    }
    
    public void createOrderMedication(OrderMedication orderMedication) throws Exception {
        validateOrder(orderMedication);
        orderMedicationPort.save(orderMedication);
    }
    
    public void createOrderDiagnosticTest(OrderDiagnosticTest orderDiagnosticTest) throws Exception {
        validateOrder(orderDiagnosticTest);
        orderDiagnosticTestPort.save(orderDiagnosticTest);
    }
}