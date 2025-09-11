package app.domain.services;

import app.domain.model.MedicalHistory;
import app.domain.ports.MedicalHistoryPort;

public class CreateMedicalHistory {
    private MedicalHistoryPort medicalHistoryPort;
   


    public void create(MedicalHistory medicalHistory) throws Exception {
        if (medicalHistoryPort.findByDate(medicalHistory) != null) {
            throw new Exception("Ya existe un registro con esa fecha");
        }

        if (medicalHistoryPort.findByMedicalId(medicalHistory) != null) {
            throw new Exception("Ya existe un registro con ese doctor");
        }

        if (medicalHistoryPort.findByDiagnosis(medicalHistory) != null) {
            throw new Exception("Ya existe un registro con ese diagnóstico");
        }
        
        medicalHistoryPort.save(medicalHistory);
        
    }
    
    
}

