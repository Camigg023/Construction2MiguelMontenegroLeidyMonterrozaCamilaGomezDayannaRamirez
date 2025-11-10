package src.main.java.app.domain.ports;

import src.main.java.app.domain.model.MedicalHistory;
import java.util.List;

/**
 * Puerto (interfaz) que define las operaciones de persistencia
 * para la entidad MedicalHistory.
 *
 * En una implementación real, esto se conecta a una base de datos NoSQL
 * como MongoDB, Firestore o Cassandra.
 */
public interface MedicalHistoryPort {

    // Crear nuevo registro
    void save(MedicalHistory medicalHistory) throws Exception;

    // Buscar por ID interno
    MedicalHistory findById(Long id) throws Exception;

    // Buscar por ID del paciente
    List<MedicalHistory> findByPatientId(Long patientId) throws Exception;

    // Actualizar una historia existente
    MedicalHistory update(MedicalHistory medicalHistory) throws Exception;

    // Eliminar (opcional, por mantenimiento o auditoría)
    void delete(Long id) throws Exception;
}
