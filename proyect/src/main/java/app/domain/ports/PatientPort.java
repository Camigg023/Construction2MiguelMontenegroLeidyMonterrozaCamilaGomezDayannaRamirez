package src.main.java.app.domain.ports;

import src.main.java.app.domain.model.Patient;
import java.util.List;

/**
 * Puerto de persistencia para la entidad Patient.
 * Define las operaciones que deben implementar los adaptadores de salida
 * (por ejemplo, repositorios o fuentes de datos externas).
 */
public interface PatientPort {

    /**
     * Guarda un nuevo paciente en el sistema.
     */
    void save(Patient patient) throws Exception;

    /**
     * Actualiza los datos de un paciente existente.
     */
    Patient update(Patient patient) throws Exception;

    /**
     * Elimina un paciente por su identificación.
     */
    void delete(Patient patient) throws Exception;

    /**
     * Busca un paciente por su ID único.
     */
    Patient findByIdentification(Patient patient) throws Exception;

    /**
     * Retorna la lista completa de pacientes registrados.
     */
    List<Patient> findAll() throws Exception;


}
