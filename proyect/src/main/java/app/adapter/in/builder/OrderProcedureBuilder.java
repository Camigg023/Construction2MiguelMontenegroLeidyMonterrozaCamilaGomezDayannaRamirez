package app.adapter.in.builder;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import app.domain.model.OrderProcedure;
import app.domain.model.User;
import app.domain.model.Patient;
import app.adapter.in.validators.OrderProcedureValidator;
import java.sql.Date;

@Component
public class OrderProcedureBuilder {

    @Autowired
    private OrderProcedureValidator validator;

    public OrderProcedure build(
            User doctor,
            Patient patient,
            String procedureIdStr,
            String quantityStr,
            String frequency,
            String requiresSpecialistStr,
            String specialistCodeStr,
            String itemStr,
            String dateStr,
            String costStr
    ) throws Exception {

        // Validaciones
        doctor = validator.doctorValidator(doctor);
        patient = validator.patientValidator(patient);

        long procedureId = validator.procedureIdValidator(procedureIdStr);
        int quantity = validator.quantityValidator(quantityStr);
        String validatedFrequency = validator.frequencyValidator(frequency);
        Boolean requiresSpecialist = validator.requiresSpecialistValidator(requiresSpecialistStr);
        int specialistCode = validator.specialistCodeValidator(specialistCodeStr);
        int item = validator.itemValidator(itemStr);
        Date date = validator.dateValidator(dateStr);
        double cost = validator.costValidator(costStr);

        // Construcción de la orden
        OrderProcedure order = new OrderProcedure();
        order.setProcedureId(procedureId);
        order.setDoctor(doctor);
        order.setPatient(patient);
        order.setQuantity(quantity);
        order.setFrequency(validatedFrequency);
        order.setRequiresSpecialist(requiresSpecialist);
        order.setSpecialistcode(specialistCode);
        order.setItem(item);
        order.setDate(date);
        order.setCost(cost);

        return order;
    }
}

