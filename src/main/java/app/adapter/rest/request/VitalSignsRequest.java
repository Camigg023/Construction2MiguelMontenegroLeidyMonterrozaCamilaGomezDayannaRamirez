package src.main.java.app.adapter.rest.request;

import lombok.Data;
import java.util.Date;

@Data

public class VitalSignsRequest {
    private int id;
    private double bodyTemperature;
    private int heartRate;
    private int respiratoryRate;
    private int systolicPressure;
    private int diastolicPressure;
    private int oxygenSaturation;
    private double weight;
    private double height;
    private double bmi;
    private Date recordedDate;
    private String notes;
}

