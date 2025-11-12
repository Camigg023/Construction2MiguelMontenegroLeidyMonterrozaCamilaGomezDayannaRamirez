package src.main.java.app.domain.ports;

import src.main.java.app.domain.model.*;
import java.util.List;

/**
 * Puerto del dominio que define las operaciones disponibles
 * para la gestión de órdenes médicas.
 */
public interface OrderPort {

    // ---- MÉDICO ----
    Order createOrder(Order order) throws Exception;

    boolean addMedicationToOrder(int orderId, OrderMedication medication) throws Exception;
    boolean addProcedureToOrder(int orderId, OrderProcedure procedure) throws Exception;
    boolean addDiagnosticTestToOrder(int orderId, OrderDiagnosticTest diagnosticTest) throws Exception;

    void updateOrderDiagnosis(int orderId, String diagnostic) throws Exception;
    void updateOrderStatus(int orderId, String status) throws Exception;

    // ---- ENFERMERÍA ----
    void registerNurseObservation(int orderId, String nurseId, String note) throws Exception;
    void applyMedication(int orderId, int medicationItem, String nurseId) throws Exception;
    void completeOrder(int orderId, String nurseId) throws Exception;

    // ---- ADMINISTRATIVO ----
    List<Order> getOrdersForBilling() throws Exception;
    void deleteOrder(int orderId) throws Exception;

    // ---- CONSULTAS ----
    Order getOrderById(int orderId) throws Exception;
    List<Order> getOrdersByPatient(String patientId) throws Exception;
    List<Order> getOrdersByDoctor(String doctorId) throws Exception;
    List<Order> getOrdersByType(String type) throws Exception;
    List<Order> getOrdersByStatus(String status) throws Exception;
    List<Order> getOrdersByDateRange(String startDate, String endDate) throws Exception;
    List<Order> getAllOrders() throws Exception;
}





