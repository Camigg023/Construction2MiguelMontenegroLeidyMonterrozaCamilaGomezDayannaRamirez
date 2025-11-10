package src.main.java.app.adapter.in.validators;

import org.springframework.stereotype.Component;
import app.application.exceptions.InputsException;

@Component
public class VitalSignsValidator extends SimpleValidator {

    public int idValidator(String value) throws Exception {
        return integerValidator("ID de signos vitales", value);
    }

    public double temperatureValidator(String value) throws Exception {
        double temp = doubleValidator("temperatura corporal", value);
        if (temp < 30 || temp > 45)
            throw new InputsException("La temperatura corporal debe estar entre 30°C y 45°C");
        return temp;
    }

    public int heartRateValidator(String value) throws Exception {
        int rate = integerValidator("frecuencia cardíaca", value);
        if (rate < 30 || rate > 200)
            throw new InputsException("La frecuencia cardíaca debe estar entre 30 y 200 lpm");
        return rate;
    }

    public int respiratoryRateValidator(String value) throws Exception {
        int rate = integerValidator("frecuencia respiratoria", value);
        if (rate < 5 || rate > 60)
            throw new InputsException("La frecuencia respiratoria debe estar entre 5 y 60 rpm");
        return rate;
    }

    public int systolicValidator(String value) throws Exception {
        int sys = integerValidator("presión sistólica", value);
        if (sys < 50 || sys > 250)
            throw new InputsException("La presión sistólica debe estar entre 50 y 250 mmHg");
        return sys;
    }

    public int diastolicValidator(String value) throws Exception {
        int dia = integerValidator("presión diastólica", value);
        if (dia < 30 || dia > 150)
            throw new InputsException("La presión diastólica debe estar entre 30 y 150 mmHg");
        return dia;
    }

    public int oxygenValidator(String value) throws Exception {
        int ox = integerValidator("saturación de oxígeno", value);
        if (ox < 50 || ox > 100)
            throw new InputsException("La saturación de oxígeno debe estar entre 50% y 100%");
        return ox;
    }

    public double weightValidator(String value) throws Exception {
        double w = doubleValidator("peso", value);
        if (w <= 0 || w > 500)
            throw new InputsException("El peso debe estar entre 1 y 500 kg");
        return w;
    }

    public double heightValidator(String value) throws Exception {
        double h = doubleValidator("altura", value);
        if (h <= 0 || h > 3)
            throw new InputsException("La altura debe estar entre 0.3 y 3 metros");
        return h;
    }

    public String notesValidator(String value) throws Exception {
        return stringValidator("notas", value);
    }
}
