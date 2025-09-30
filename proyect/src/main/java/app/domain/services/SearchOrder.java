package app.domain.services;

import app.domain.model.OrderProcedure;
import app.domain.model.OrderMedication;
import app.domain.model.OrderDiagnosticTest;
import app.domain.model.User;
import app.domain.model.emuns.Role;
import app.domain.ports.OrderProcedurePort;
import app.domain.ports.OrderMedicationPort;
import app.domain.ports.OrderDiagnosticTestPort;
import app.domain.ports.UserPort;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.ArrayList;

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

    // Validación del usuario
    private void validateUser(User user) throws Exception {
        if (user == null) {
            throw new Exception("Usuario nulo");
        }
        if (!Role.NURSES.equals(user.getRole())) {
            throw new Exception("Solo el personal de enfermería puede consultar órdenes");
        }
    }

    // Métodos de búsqueda
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

    /**
     * Busca todas las órdenes de un paciente
     * Nota: Devuelve listas separadas, ya que las clases no heredan de Order
     */
    public SearchResult searchAllOrders(User user, Long patientId) throws Exception {
        validateUser(user);

        List<OrderProcedure> procedures = orderProcedurePort.findByPatientId(patientId);
        List<OrderMedication> medications = orderMedicationPort.findByPatientId(patientId);
        List<OrderDiagnosticTest> diagnostics = orderDiagnosticTestPort.findByPatientId(patientId);

        return new SearchResult(procedures, medications, diagnostics);
    }

    // Clase interna para agrupar los resultados
    public static class SearchResult {
        private final List<OrderProcedure> procedures;
        private final List<OrderMedication> medications;
        private final List<OrderDiagnosticTest> diagnostics;

        public SearchResult(List<OrderProcedure> procedures, List<OrderMedication> medications,
                            List<OrderDiagnosticTest> diagnostics) {
            this.procedures = procedures;
            this.medications = medications;
            this.diagnostics = diagnostics;
        }

        public List<OrderProcedure> getProcedures() {
            return procedures;
        }

        public List<OrderMedication> getMedications() {
            return medications;
        }

        public List<OrderDiagnosticTest> getDiagnostics() {
            return diagnostics;
        }
    }
}
