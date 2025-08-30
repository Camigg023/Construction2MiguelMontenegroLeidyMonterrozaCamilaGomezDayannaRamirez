
package app.domain.ports;

import app.domain.model.OrderMedication;

public interface MedicationPort {
     public OrderMedication findByMedicationId (OrderMedication medication) throws Exception;
        public void save (OrderMedication medication) throws Exception;
}
