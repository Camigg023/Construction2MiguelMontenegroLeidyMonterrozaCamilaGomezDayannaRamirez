package src.main.java.app.adapter.in.builder;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import src.main.java.app.adapter.in.validators.OrderValidator;
import src.main.java.app.adapter.in.validators.PatientValidator;
import src.main.java.app.adapter.in.validators.UserValidator;
import src.main.java.app.domain.model.Order;
import src.main.java.app.domain.model.OrderMedication;
import src.main.java.app.domain.model.OrderProcedure;
import src.main.java.app.domain.model.OrderDiagnosticTest;
import src.main.java.app.domain.model.Patient;
import src.main.java.app.domain.model.User;

import java.sql.Date;
import java.util.List;

@Component
public class OrderBuilder {

    @Autowired
    private OrderValidator orderValidator;
    @Autowired
    private PatientValidator patientValidator;
    @Autowired
    private UserValidator userValidator;

    public Order build(String orderId, String patientDocument, String doctorId, String date, List<OrderMedication> medications, List<OrderProcedure> procedures, List<OrderDiagnosticTest> diagnosticTests)
      throws Exception {

        Order order = new Order();

        order.setOrderId(orderValidator.idValidator(orderId));

        Patient patient = new Patient();
        patient.setIdPatient(patientValidator.documentValidator(patientDocument));
        order.setPatient(patient);

        User doctor = new User();
        doctor.setIdentification(userValidator.identificationValidator(doctor.getIdentification()));
        order.setDoctor(doctor);

        order.setDate(orderValidator.dateValidator(date));

        orderValidator.validateLists(medications, procedures, diagnosticTests);


        order.setMedications(medications);
        order.setProcedures(procedures);
        order.setDiagnosticTests(diagnosticTests);

        return order;
    }
}

