package app.adapter.in.client.internal;

import java.util.Scanner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import app.adapter.in.builder.UserBuilder;
import app.domain.model.User;

@Controller
public class HumanResourceClient {

    private static final String MENU = "Opciones:\n1. Crear empleado\n2. Actualizar empleado\n3. Salir";
    private static Scanner reader = new Scanner(System.in);

    @Autowired
    private app.application.usecases.HumanResourceUseCase humanResourceUseCase;
    @Autowired
    private UserBuilder userBuilder;

    public void session() {
        boolean session = true;
        while (session) {
            session = menu();
        }
    }

    private boolean menu() {
        try {
            System.out.println(MENU);
            String option = reader.nextLine();
            switch(option) {
                case "1": {
                    User user = readInfoFromUser();
                    humanResourceUseCase.createEmplo(user);
                    return true;
                }
                case "2": {
                    System.out.println("Ingrese el ID del empleado a actualizar:");
                    String identification = reader.nextLine();
                    User updatedUser = readInfoFromUser(); 
                    updatedUser.setIdentification(Long.parseLong(identification)); 
                    humanResourceUseCase.updateEmplo(updatedUser);
                    return true;
                }
                case "3": {
                    System.out.println("Cerrando sesión...");
                    return false;
                }
                default:
                    System.out.println("Opción inválida");
                    return true;
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
            return true;
        }
    }

    private User readInfoFromUser() throws Exception {
        System.out.println("Ingrese id:");
        long identification = Long.parseLong(reader.nextLine());

        System.out.println("Ingrese nombre:");
        String name = reader.nextLine();
        System.out.println("Ingrese email:");
        String email = reader.nextLine();
        System.out.println("Ingrese dirección:");
        String address = reader.nextLine();
        System.out.println("Ingrese usuario:");
        String userName = reader.nextLine();
        System.out.println("Ingrese contraseña:");
        String password = reader.nextLine();
        System.out.println("Ingrese teléfono:");
        long phone = Long.parseLong(reader.nextLine());
        System.out.println("Ingrese fecha de nacimiento (yyyy-MM-dd):");
        String birthDay = reader.nextLine();

        return userBuilder.build(identification, name, email, address, userName, password, phone, birthDay);
    }
}





