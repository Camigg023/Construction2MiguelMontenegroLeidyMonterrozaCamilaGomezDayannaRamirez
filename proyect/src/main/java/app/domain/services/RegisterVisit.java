package app.domain.services;

import app.domain.model.Patient;
import app.domain.model.User;
import app.domain.model.Visit;
import app.domain.model.emuns.Role;
import app.domain.ports.PatientPort;
import app.domain.ports.VisitPort;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RegisterVisit {

    private final VisitPort visitPort;
    private final PatientPort patientPort;

    @Autowired
    public RegisterVisit(VisitPort visitPort, PatientPort patientPort) {
        this.visitPort = visitPort;
        this.patientPort = patientPort;
    }

    private void validateAdminStaff(User user) throws Exception {
        if (user == null || !user.getRole().equals(Role.NURSES)) {
            throw new Exception("Solo las enfermeras pueden registrar visitas");
        }
    }

    public void register(User admin, Visit visit) throws Exception {
        
        validateAdminStaff(admin);

        Patient patient = patientPort.findById(visit.getPatient());
        if (patient == null) {
            throw new Exception("El paciente no existe, no se puede registrar la visita");
        }

        visit.setPatient(patient);
        visitPort.save(visit);
    }
}
