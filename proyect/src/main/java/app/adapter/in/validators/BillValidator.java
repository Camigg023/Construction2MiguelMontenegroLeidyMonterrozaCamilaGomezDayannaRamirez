package app.adapter.in.validators;

import org.springframework.stereotype.Component;
import java.text.SimpleDateFormat;
import java.util.Date;

@Component
public class BillValidator extends SimpleValidator {

    public long patientIdValidator(String value) throws Exception {
        return longValidator("id del paciente", value);
    }

    public long doctorIdValidator(String value) throws Exception {
        return longValidator("id del doctor", value);
    }

    public double amountValidator(String value) throws Exception {
        return doubleValidator("monto de la factura", value);
    }

    public Date dateValidator(String value) throws Exception {
        stringValidator("fecha de la factura", value);
        try {
            SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd");
            formatter.setLenient(false);
            return formatter.parse(value);
        } catch (Exception e) {
            throw new Exception("La fecha de la factura debe tener formato yyyy-MM-dd");
        }
    }

    public boolean medicationValidator(Boolean value) throws Exception {
        if (value == null) {
            throw new Exception("El campo 'medication' no puede ser nulo");
        }
        return value;
    }

    public String medicineValidator(String value, Boolean medication) throws Exception {
        if (medication && (value == null || value.trim().isEmpty())) {
            throw new Exception("Debe especificar el medicamento si 'medication' es verdadero");
        }
        return value != null ? value.trim() : null;
    }

    public String medicalInsuranceValidator(String value) throws Exception {
        return stringValidator("seguro médico", value);
    }
}

