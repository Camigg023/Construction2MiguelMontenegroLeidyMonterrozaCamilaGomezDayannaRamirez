package src.main.java.app.domain.services.Nurses;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import app.application.exceptions.BusinessException;
import src.main.java.app.domain.model.VitalSigns;
import src.main.java.app.domain.ports.VitalSingsPort;

@Service
public class VitalSignsService {

    @Autowired
    private VitalSingsPort vitalSignsPort;

    // ✅ 1. Registrar signos vitales asociados a una visita
    public void registerVitalSigns(VitalSigns vitalSigns, String visitId) throws BusinessException {
        if (vitalSigns == null) {
            throw new BusinessException("Los signos vitales no pueden ser nulos.");
        }

        if (visitId == null || visitId.isBlank()) {
            throw new BusinessException("El ID de la visita es obligatorio para registrar los signos vitales.");
        }

        // Validaciones clínicas básicas
        if (vitalSigns.getBodyTemperature() < 30 || vitalSigns.getBodyTemperature() > 45) {
            throw new BusinessException("La temperatura corporal registrada es inválida.");
        }

        if (vitalSigns.getHeartRate() <= 0 || vitalSigns.getHeartRate() > 250) {
            throw new BusinessException("La frecuencia cardíaca registrada es inválida.");
        }

        if (vitalSigns.getOxygenSaturation() < 50 || vitalSigns.getOxygenSaturation() > 100) {
            throw new BusinessException("La saturación de oxígeno debe estar entre 50% y 100%.");
        }

        // Guardar los signos vitales a través del puerto
        vitalSignsPort.save(vitalSigns, visitId);
    }

    // ✅ 2. Obtener todos los signos vitales históricos de un paciente
    public List<VitalSigns> getVitalSignsByPatient(String patientId) throws BusinessException {
        if (patientId == null || patientId.isBlank()) {
            throw new BusinessException("El ID del paciente es obligatorio.");
        }

        List<VitalSigns> records = vitalSignsPort.findByPatientId(patientId);
        if (records == null || records.isEmpty()) {
            throw new BusinessException("No se encontraron registros de signos vitales para el paciente con ID: " + patientId);
        }

        return records;
    }

    // ✅ 3. Obtener los últimos signos vitales registrados del paciente
    public VitalSigns getLastVitalSigns(String patientId) throws BusinessException {
        if (patientId == null || patientId.isBlank()) {
            throw new BusinessException("El ID del paciente es obligatorio.");
        }

        VitalSigns lastRecord = vitalSignsPort.findLastByPatientId(patientId);
        if (lastRecord == null) {
            throw new BusinessException("No hay registros recientes de signos vitales para el paciente con ID: " + patientId);
        }

        return lastRecord;
    }
}
