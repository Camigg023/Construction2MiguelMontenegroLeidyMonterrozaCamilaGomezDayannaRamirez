package src.main.java.app.domain.ports;

import java.util.List;
import src.main.java.app.domain.model.VitalSigns;

public interface VitalSingsPort {

    VitalSigns save(VitalSigns vitalSigns, String visitId);
    List<VitalSigns> findByPatientId(String patientId);
    VitalSigns findLastByPatientId(String patientId);
}
