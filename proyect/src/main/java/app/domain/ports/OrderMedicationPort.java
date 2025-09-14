
package app.domain.ports;

import app.domain.model.OrderMedication;
import app.domain.model.Patient;
import java.util.List;


public interface OrderMedicationPort {
    public OrderMedication FindbyOrderNumber (OrderMedication orderMedication) throws Exception;
    public OrderMedication FindbyMedicationId (OrderMedication orderMedication) throws Exception;
    public List<OrderMedication> findByPatient(Patient patient) throws Exception;
    List<OrderMedication> findByPatientId(Long patientId) throws Exception;
        public void save (OrderMedication oderMedication) throws Exception;
}
