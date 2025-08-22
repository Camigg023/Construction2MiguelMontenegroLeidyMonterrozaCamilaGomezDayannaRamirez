
package app.domain.ports;

import app.domain.model.Medication;

public interface MedicationPort {
     public Medication findByMedicationId (Medication medication) throws Exception;
        public void save (Medication medication) throws Exception;
}
