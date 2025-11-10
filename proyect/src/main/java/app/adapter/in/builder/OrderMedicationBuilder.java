package src.main.java.app.adapter.in.builder;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import src.main.java.app.adapter.in.validators.OrderMedicationValidator;
import src.main.java.app.domain.model.OrderMedication;
import src.main.java.app.domain.model.Medication;
import src.main.java.app.domain.model.User;
import src.main.java.app.domain.model.Patient;

import java.util.Date;

@Component
public class OrderMedicationBuilder {

    @Autowired
    private OrderMedicationValidator validator;

    public OrderMedication build(String orderIdStr, String itemStr, String quantityStr, String dose, String duration, String dateStr, Medication medicationEntity, User doctorEntity, Patient patientEntity)

     throws Exception {

        int orderId = validator.orderIdValidator(orderIdStr);
        int item = validator.itemValidator(itemStr);
        int quantity = validator.quantityValidator(quantityStr);
        String doseV = validator.doseValidator(dose);
        String durationV = validator.durationValidator(duration);
        java.util.Date utilDate = validator.dateValidator(dateStr);

        java.sql.Date sqlDate = new java.sql.Date(utilDate.getTime());

        Medication medication = validator.medicationValidator(medicationEntity);
        User doctor = validator.doctorValidator(doctorEntity);
        Patient patient = validator.patientValidator(patientEntity);

        OrderMedication orderMedication = new OrderMedication(
                orderId,
                item,
                medication,
                doseV,
                durationV,
                quantity,
                doctor,
                patient,
                sqlDate
        );

        // NOTA: la entidad calcula su cost internamente en el constructor/settters .

        return orderMedication;
    }
}
