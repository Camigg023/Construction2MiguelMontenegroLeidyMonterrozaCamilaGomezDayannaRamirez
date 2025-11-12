package src.main.java.app.domain.ports;

import java.util.List;
import src.main.java.app.domain.model.Medication;

public interface MedicationPort {

    Medication save(Medication medication);
    Medication update(Medication medication);
    Medication findById(int id);
    List<Medication> findAll();
}
