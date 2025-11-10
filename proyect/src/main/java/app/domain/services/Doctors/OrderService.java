package src.main.java.app.domain.services.Doctors;

import src.main.java.app.domain.model.*;
import src.main.java.app.domain.ports.OrderPort;
import java.util.List;


public class OrderService {

    private final OrderPort orderPort;

    public OrderService(OrderPort orderPort) {
        this.orderPort = orderPort;
    }

    // ---- MÉDICO ----
    public Order createOrder(Order order) throws Exception {
        if (order == null) throw new IllegalArgumentException("La orden no puede ser nula.");
        if (order.getDoctor() == null || order.getPatient() == null)
            throw new IllegalArgumentException("Debe asignarse un médico y un paciente a la orden.");
        if (order.getType() == null || order.getType().isBlank())
            throw new IllegalArgumentException("Debe especificar el tipo de orden (Medicamento, Procedimiento o Diagnóstico).");

        return orderPort.createOrder(order);
    }

    public boolean addMedicationToOrder(int orderId, OrderMedication medication) throws Exception {
        if (medication == null)
            throw new IllegalArgumentException("El medicamento no puede ser nulo.");
        if (medication.getMedication() == null)
            throw new IllegalArgumentException("Debe asociarse un medicamento válido.");
        if (medication.getDose() == null || medication.getDose().isBlank())
            throw new IllegalArgumentException("Debe especificarse la dosis.");
        if (medication.getDuration() == null || medication.getDuration().isBlank())
            throw new IllegalArgumentException("Debe especificarse la duración del tratamiento.");

        return orderPort.addMedicationToOrder(orderId, medication);
    }

    public boolean addProcedureToOrder(int orderId, OrderProcedure procedure) throws Exception {
        if (procedure == null)
            throw new IllegalArgumentException("El procedimiento no puede ser nulo.");
        if (procedure.getProcedure() == null)
            throw new IllegalArgumentException("Debe asociarse un procedimiento válido.");
        if (procedure.getQuantity() <= 0)
            throw new IllegalArgumentException("La cantidad del procedimiento debe ser mayor que cero.");
        if (procedure.getUnitCost() <= 0)
            throw new IllegalArgumentException("El costo unitario del procedimiento debe ser mayor que cero.");

        return orderPort.addProcedureToOrder(orderId, procedure);
    }

    public boolean addDiagnosticTestToOrder(int orderId, OrderDiagnosticTest diagnosticTest) throws Exception {
        if (diagnosticTest == null)
            throw new IllegalArgumentException("La ayuda diagnóstica no puede ser nula.");
        if (diagnosticTest.getDiagnosticTest() == null)
            throw new IllegalArgumentException("Debe asociarse una prueba diagnóstica válida.");
        if (diagnosticTest.getQuantity() <= 0)
            throw new IllegalArgumentException("La cantidad de pruebas debe ser mayor que cero.");
        if (diagnosticTest.isRequiresSpecialist() && diagnosticTest.getSpecialistCode() == null)
            throw new IllegalArgumentException("Debe especificarse el código del especialista si la prueba lo requiere.");

        return orderPort.addDiagnosticTestToOrder(orderId, diagnosticTest);
    }

    public void updateOrderDiagnosis(int orderId, String diagnostic) throws Exception {
        if (diagnostic == null || diagnostic.isBlank())
            throw new IllegalArgumentException("El diagnóstico no puede estar vacío.");
        orderPort.updateOrderDiagnosis(orderId, diagnostic);
    }

    public void updateOrderStatus(int orderId, String status) throws Exception {
        if (status == null || status.isBlank())
            throw new IllegalArgumentException("El estado de la orden no puede estar vacío.");
        orderPort.updateOrderStatus(orderId, status);
    }

    // ---- ENFERMERÍA ----
    public void registerNurseObservation(int orderId, String nurseId, String note) throws Exception {
        if (nurseId == null || nurseId.isBlank())
            throw new IllegalArgumentException("Debe especificar el ID de la enfermera.");
        if (note == null || note.isBlank())
            throw new IllegalArgumentException("La observación no puede estar vacía.");
        orderPort.registerNurseObservation(orderId, nurseId, note);
    }

    public void applyMedication(int orderId, int medicationItem, String nurseId) throws Exception {
        if (nurseId == null || nurseId.isBlank())
            throw new IllegalArgumentException("Debe especificar la enfermera que aplica el medicamento.");
        orderPort.applyMedication(orderId, medicationItem, nurseId);
    }

    public void completeOrder(int orderId, String nurseId) throws Exception {
        if (nurseId == null || nurseId.isBlank())
            throw new IllegalArgumentException("Debe registrarse la enfermera que completa la orden.");
        orderPort.completeOrder(orderId, nurseId);
    }

    // ---- ADMINISTRATIVO ----
    public List<Order> getOrdersForBilling() throws Exception {
        return orderPort.getOrdersForBilling();
    }

    public void deleteOrder(int orderId) throws Exception {
        orderPort.deleteOrder(orderId);
    }

    // ---- CONSULTAS ----
    public Order getOrderById(int orderId) throws Exception {
        return orderPort.getOrderById(orderId);
    }

    public List<Order> getOrdersByPatient(String patientId) throws Exception {
        return orderPort.getOrdersByPatient(patientId);
    }

    public List<Order> getOrdersByDoctor(String doctorId) throws Exception {
        return orderPort.getOrdersByDoctor(doctorId);
    }

    public List<Order> getOrdersByType(String type) throws Exception {
        return orderPort.getOrdersByType(type);
    }

    public List<Order> getOrdersByStatus(String status) throws Exception {
        return orderPort.getOrdersByStatus(status);
    }

    public List<Order> getOrdersByDateRange(String startDate, String endDate) throws Exception {
        return orderPort.getOrdersByDateRange(startDate, endDate);
    }

    public List<Order> getAllOrders() throws Exception {
        return orderPort.getAllOrders();
    }
}



