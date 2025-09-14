package app.domain.services;

import app.domain.model.Order;
import app.domain.model.OrderProcedure;
import app.domain.model.OrderMedication;
import app.domain.model.OrderDiagnosticTest;
import app.domain.model.Patient;
import app.domain.model.User;
import app.domain.model.emuns.Role;
import app.domain.ports.OrderProcedurePort;
import app.domain.ports.OrderMedicationPort;
import app.domain.ports.OrderDiagnosticTestPort;
import app.domain.ports.UserPort;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SearchOrder {

    private final UserPort userPort;
    private final OrderProcedurePort orderProcedurePort;
    private final OrderMedicationPort orderMedicationPort;
    private final OrderDiagnosticTestPort orderDiagnosticTestPort;

    @Autowired
    public SearchOrder(UserPort userPort,
                       OrderProcedurePort orderProcedurePort,
                       OrderMedicationPort orderMedicationPort,
                       OrderDiagnosticTestPort orderDiagnosticTestPort) {
        this.userPort = userPort;
        this.orderProcedurePort = orderProcedurePort;
        this.orderMedicationPort = orderMedicationPort;
        this.orderDiagnosticTestPort = orderDiagnosticTestPort;
    }

    private void validateUser(User user) throws Exception {
        if (user == null || !user.getRole().equals(Role.NURSES)) {
            throw new Exception("Solo el personal de enfermería puede consultar órdenes");
        }
    }

    
    public List<OrderProcedure> searchProcedures(User user, Long patientId) throws Exception {
        validateUser(user);
        return orderProcedurePort.findByPatientId(patientId);
    }

    
    public List<OrderMedication> searchMedications(User user, Long patientId) throws Exception {
        validateUser(user);
        return orderMedicationPort.findByPatientId(patientId);
    }

    
    public List<OrderDiagnosticTest> searchDiagnostics(User user, Long patientId) throws Exception {
        validateUser(user);
        return orderDiagnosticTestPort.findByPatientId(patientId);
    }

    
    public List<Order> searchAllOrders(User user, Long patientId) throws Exception {
        validateUser(user);

        List<Order> allOrders = new java.util.ArrayList<>();
        allOrders.addAll(orderProcedurePort.findByPatientId(patientId));
        allOrders.addAll(orderMedicationPort.findByPatientId(patientId));
        allOrders.addAll(orderDiagnosticTestPort.findByPatientId(patientId));

        return allOrders;
    }
}
