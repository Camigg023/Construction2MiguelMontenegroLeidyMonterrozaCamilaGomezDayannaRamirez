package app.adapter.in.builder;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import java.sql.Date;

import src.main.java.app.adapter.in.validators.OrderDiagnosticTestValidator;
import src.main.java.app.domain.model.*;
import src.main.java.app.domain.model.emuns.StateOrder;

@Component
public class OrderDiagnosticTestBuilder {

    @Autowired
    private OrderDiagnosticTestValidator validator;

    public OrderDiagnosticTest build(String orderIdStr, String itemIdStr, DiagnosticTest diagnosticTest, String quantityStr, String requiresSpecialistStr, String specialistCodeStr, String costStr, String copayStr, String insuranceCoverageStr, String statusStr, String resultNotes, String creationDateStr, String resultDateStr, User doctor, Patient patient, Visit visit)
     throws Exception {

            int orderId = validator.orderNumberValidator(orderIdStr);
            int itemId = validator.itemValidator(itemIdStr);
            DiagnosticTest validatedDiagnosticTest = validator.diagnosticTestValidator(diagnosticTest);
            int quantity = validator.quantityValidator(quantityStr);
            boolean requiresSpecialist = validator.requiresSpecialistValidator(requiresSpecialistStr);
            Integer specialistCode = validator.specialistCodeValidator(specialistCodeStr, requiresSpecialist);
            double cost = validator.costValidator(costStr);
            double copay = validator.copayValidator(copayStr);
            double insuranceCoverage = validator.insuranceCoveredValidator(insuranceCoverageStr);
            String statusValue = validator.statusValidator(statusStr);

            Date creationDate = new Date(validator.dateValidator(creationDateStr).getTime());

            Date resultDate = new Date(validator.dateValidator(resultDateStr).getTime());
            User validatedDoctor = validator.doctorValidator(doctor);
            Patient validatedPatient = validator.patientValidator(patient);


            OrderDiagnosticTest order = new OrderDiagnosticTest();

            order.setOrderId((long) orderId);
            order.setItemId((long) itemId);
            order.setDiagnosticTest(validatedDiagnosticTest);
            order.setQuantity(quantity);
            order.setRequiresSpecialist(requiresSpecialist);
            order.setSpecialistCode(specialistCode);
            order.setCost(cost);
            order.setCopay(copay);
            order.setInsuranceCoverage(insuranceCoverage);
            order.setStatus(StateOrder.valueOf(statusValue.toUpperCase()));
            order.setResultNotes(resultNotes);
            order.setCreationDate(creationDate);
            order.setResultDate(resultDate);
            order.setDoctor(validatedDoctor);
            order.setPatient(validatedPatient);
            order.setVisit(visit);

            return order;
    }
}




