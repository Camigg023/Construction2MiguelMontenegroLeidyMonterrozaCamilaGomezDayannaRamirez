package src.main.java.app.adapter.in.client.internal;

import java.util.Scanner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import app.adapter.in.builder.PatientBuilder;
import app.domain.model.Patient;

@Controller
public class AdministrativeStaffClient {

    private static final String MENU = "Opciones:\n1. Registrar paciente\n2. Actualizar paciente\n3. Salir";
    private static Scanner reader = new Scanner(System.in);

    @Autowired
    private app.application.usecases.AdminPersonalUseCase staffUseCase;
    @Autowired
    private PatientBuilder patientBuilder;

    public void session() {
        boolean session = true;
        while(session) {
            session = menu();
        }
    }

    private boolean menu() {
        try {
            System.out.println(MENU);
            String option = reader.nextLine();
            switch(option) {
                case "1": {
                    Patient patient = readInfoFromUser();
                    staffUseCase.createPatient(patient);
                    return true;
                }
                case "2": {
                    Patient patient = readInfoFromUser();
                    staffUseCase.updatePat(patient);
                    return true;
                }
                case "3":
                    System.out.println("Cerrando sesión...");
                    return false;
                default:
                    System.out.println("Opción inválida");
                    return true;
            }
        } catch(Exception e) {
            System.out.println(e.getMessage());
            return true;
        }
    }

    private Patient readInfoFromUser() throws Exception {
        System.out.println("Ingrese nombre:");
        String name = reader.nextLine();
        System.out.println("Ingrese documento:");
        String document = reader.nextLine();
        System.out.println("Ingrese edad:");
        String age = reader.nextLine();
        return patientBuilder.build(name, document, age);
    }
}
