package src.main.java.app.domain.services.InformationSupport;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import app.application.exceptions.BusinessException;
import src.main.java.app.domain.model.Medication;
import src.main.java.app.domain.ports.MedicationPort;

@Service
public class MedicationService {

    @Autowired
    private MedicationPort medicationPort;

    public void registerMedication(Medication medication) throws BusinessException {

        if (medication == null) {
            throw new BusinessException("El medicamento no puede ser nulo.");
        }

        if (medication.getName() == null || medication.getName().isEmpty()) {
            throw new BusinessException("El medicamento debe tener un nombre válido.");
        }

        if (medication.getUnitCost() <= 0) {
            throw new BusinessException("El costo unitario debe ser mayor que cero.");
        }

        if (medication.getPresentation() == null || medication.getPresentation().isEmpty()) {
            throw new BusinessException("Debe especificarse la presentación del medicamento.");
        }

        medication.setAvailable(true);
        medicationPort.save(medication);
    }


    public void updateMedication(Medication medication) throws BusinessException {

        if (medication == null || medication.getMedicationId() <= 0) {
            throw new BusinessException("Debe proporcionar un medicamento válido con un ID correcto.");
        }

        Medication existingMed = medicationPort.findById(medication.getMedicationId());
        if (existingMed == null) {
            throw new BusinessException("No se encontró el medicamento con el ID especificado.");
        }

        medicationPort.update(medication);
    }


    public Medication getMedicationById(int id) throws BusinessException {
        if (id <= 0) {
            throw new BusinessException("El ID del medicamento debe ser mayor que cero.");
        }

        Medication med = medicationPort.findById(id);
        if (med == null) {
            throw new BusinessException("No existe un medicamento con el ID especificado.");
        }

        return med;
    }


    public List<Medication> listAllMedications() {
        return medicationPort.findAll();
    }
}
