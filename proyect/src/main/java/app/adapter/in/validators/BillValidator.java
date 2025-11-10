package src.main.java.app.adapter.in.validators;

import org.springframework.stereotype.Component;
import java.text.SimpleDateFormat;
import java.util.Date;
import app.application.exceptions.InputsException;

@Component
public class BillValidator extends SimpleValidator {

    public Long patientIdValidator(String value) throws Exception {
        return longValidator("ID del paciente", value);
    }

    public Long doctorIdValidator(String value) throws Exception {
        return longValidator("ID del doctor", value);
    }

    public Double amountValidator(String value) throws Exception {
        return doubleValidator("monto total de la factura", value);
    }

    public Date dateValidator(String value) throws Exception {
        stringValidator("fecha de la factura", value);
        try {
            SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd");
            formatter.setLenient(false);
            return formatter.parse(value);
        } catch (Exception e) {
            throw new InputsException("La fecha de la factura debe tener el formato válido (yyyy-MM-dd).");
        }
    }

    public boolean coveredByInsuranceValidator(Boolean value) throws Exception {
        if (value == null) {
            throw new InputsException("El campo 'coveredByInsurance' no puede ser nulo.");
        }
        return value;
    }

    public String medicalInsuranceValidator(String value) throws Exception {
        return stringValidator("seguro médico", value);
    }
}


