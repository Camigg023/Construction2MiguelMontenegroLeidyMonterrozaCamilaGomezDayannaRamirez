package src.main.java.app.adapter.rest.mapper;

import app.domain.model.VitalSigns;
import app.adapter.in.rest.request.VitalSignsRequest;
import app.adapter.in.rest.response.VitalSignsResponse;
import java.util.Date;

public class VitalSignsMapper {
    public static VitalSigns toVitalSigns(VitalSignsRequest request) {
        VitalSigns vs = new VitalSigns();
        vs.setBodyTemperature(request.getBodyTemperature());
        vs.setHeartRate(request.getHeartRate());
        vs.setRespiratoryRate(request.getRespiratoryRate());
        vs.setSystolicPressure(request.getSystolicPressure());
        vs.setDiastolicPressure(request.getDiastolicPressure());
        vs.setOxygenSaturation(request.getOxygenSaturation());
        vs.setWeight(request.getWeight());
        vs.setHeight(request.getHeight());
        vs.setNotes(request.getNotes());
        vs.setRecordedDate(new Date());
        vs.calculateBMI();
        return vs;
    }

    public static VitalSignsResponse toVitalSignsResponse(VitalSigns vs) {
        VitalSignsResponse response = new VitalSignsResponse();
        response.setId(vs.getId());
        response.setBodyTemperature(vs.getBodyTemperature());
        response.setHeartRate(vs.getHeartRate());
        response.setRespiratoryRate(vs.getRespiratoryRate());
        response.setSystolicPressure(vs.getSystolicPressure());
        response.setDiastolicPressure(vs.getDiastolicPressure());
        response.setOxygenSaturation(vs.getOxygenSaturation());
        response.setWeight(vs.getWeight());
        response.setHeight(vs.getHeight());
        response.setBmi(vs.getBmi());
        response.setRecordedDate(vs.getRecordedDate());
        response.setNotes(vs.getNotes());
        return response;
    }
}
