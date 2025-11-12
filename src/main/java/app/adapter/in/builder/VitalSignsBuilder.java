package src.main.java.app.adapter.in.builder;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import src.main.java.app.domain.model.VitalSigns;
import src.main.java.app.adapter.in.validators.VitalSignsValidator;

@Component
public class VitalSignsBuilder {

    @Autowired
    private VitalSignsValidator validator;

    public VitalSigns build(String idStr, String temperatureStr, String heartRateStr, String respiratoryRateStr, String systolicStr, String diastolicStr, String oxygenStr, String weightStr, String heightStr, String notes)
     throws Exception {
        int id = validator.idValidator(idStr);
        double temperature = validator.temperatureValidator(temperatureStr);
        int heartRate = validator.heartRateValidator(heartRateStr);
        int respiratoryRate = validator.respiratoryRateValidator(respiratoryRateStr);
        int systolic = validator.systolicValidator(systolicStr);
        int diastolic = validator.diastolicValidator(diastolicStr);
        int oxygen = validator.oxygenValidator(oxygenStr);
        double weight = validator.weightValidator(weightStr);
        double height = validator.heightValidator(heightStr);
        String validatedNotes = validator.notesValidator(notes);


        VitalSigns vitalSigns = new VitalSigns();

        vitalSigns.setId(id);
        vitalSigns.setBodyTemperature(temperature);
        vitalSigns.setHeartRate(heartRate);
        vitalSigns.setRespiratoryRate(respiratoryRate);
        vitalSigns.setSystolicPressure(systolic);
        vitalSigns.setDiastolicPressure(diastolic);
        vitalSigns.setOxygenSaturation(oxygen);
        vitalSigns.setWeight(weight);
        vitalSigns.setHeight(height);
        vitalSigns.setNotes(validatedNotes);


        return vitalSigns;
    }
}


