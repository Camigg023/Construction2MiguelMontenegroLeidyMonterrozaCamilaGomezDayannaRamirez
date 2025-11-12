package src.main.java.app.domain.services.Nurses;

import src.main.java.app.domain.model.Visit;
import src.main.java.app.domain.ports.VisitPort;
import java.util.Date;
import java.util.List;

/**
 * Servicio de aplicación para manejar la lógica de negocio relacionada con las visitas médicas.
 *
 * Sigue el patrón de Clean Architecture:
 * - Este servicio orquesta la lógica entre el dominio y los puertos.
 * - No accede directamente a la base de datos.
 * - Depende de la interfaz VisitPort (inyección de dependencia).
 */
public class VisitService {

    private final VisitPort visitPort;

    /**
     * Constructor del servicio.
     * Recibe el puerto del dominio que manejará la persistencia de las visitas.
     */
    public VisitService(VisitPort visitPort) {
        this.visitPort = visitPort;
    }

    /**
     * Registra una nueva visita médica en el sistema.
     *
     * @param visit Objeto Visit con los datos de la visita.
     * @throws Exception si la visita es nula o no puede registrarse.
     */
    public void registerVisit(Visit visit) throws Exception {
        if (visit == null) {
            throw new IllegalArgumentException("La visita no puede ser nula.");
        }

        // Validaciones básicas
        if (visit.getPatient() == null) {
            throw new IllegalArgumentException("La visita debe tener un paciente asignado.");
        }

        if (visit.getDoctor() == null) {
            throw new IllegalArgumentException("La visita debe tener un médico asignado.");
        }

        if (visit.getVisitDate() == null) {
            visit.setVisitDate(new Date()); // Fecha actual por defecto
        }

        // Guardar la visita
        visitPort.save(visit);
    }

    /**
     * Obtiene todas las visitas asociadas a un paciente.
     *
     * @param patientId ID del paciente.
     * @return Lista de visitas del paciente.
     * @throws Exception si ocurre un error en la consulta.
     */
    public List<Visit> getVisitsByPatient(String patientId) throws Exception {
        if (patientId == null || patientId.isEmpty()) {
            throw new IllegalArgumentException("El ID del paciente no puede estar vacío.");
        }

        // El puerto espera un Long (según la interfaz)
        Long id = Long.parseLong(patientId);
        return visitPort.findByPatientId(id);
    }

    /**
     * Obtiene todas las visitas registradas en una fecha específica.
     *
     * @param date Fecha a consultar.
     * @return Lista de visitas de esa fecha.
     * @throws Exception si ocurre un error en la consulta.
     */
    public List<Visit> getVisitsByDate(Date date) throws Exception {
        if (date == null) {
            throw new IllegalArgumentException("La fecha no puede ser nula.");
        }

        return visitPort.findByDate(date);
    }
}

