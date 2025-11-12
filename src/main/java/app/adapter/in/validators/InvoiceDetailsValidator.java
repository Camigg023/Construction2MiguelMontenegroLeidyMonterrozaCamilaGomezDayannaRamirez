package src.main.java.app.adapter.in.validators;

import org.springframework.stereotype.Component;
import java.text.SimpleDateFormat;
import java.sql.Date;

@Component
public class InvoiceDetailsValidator extends SimpleValidator {

    public long idValidator(String value) throws Exception {
        return longValidator("ID del detalle de factura", value);
    }

    public double costValidator(String value) throws Exception {
        return doubleValidator("costo del detalle de factura", value);
    }

    public double copayValidator(String value) throws Exception {
        return doubleValidator("copago del paciente", value);
    }

    public double insuranceCoveredValidator(String value) throws Exception {
        return doubleValidator("monto cubierto por el seguro", value);
    }

    public String descriptionValidator(String value) throws Exception {
        // Campo opcional
        if (value == null || value.trim().isEmpty()) {
            return null;
        }
        return stringValidator("descripción del detalle", value);
    }

    public Date dateValidator(String value) throws Exception {
        stringValidator("fecha del detalle", value);
        try {
            SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd");
            java.util.Date parsed = formatter.parse(value);
            return new Date(parsed.getTime());
        } catch (Exception e) {
            throw new Exception("La fecha debe tener formato yyyy-MM-dd");
        }
    }
}

