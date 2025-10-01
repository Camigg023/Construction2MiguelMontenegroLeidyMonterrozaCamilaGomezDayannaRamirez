package app.adapter.in.builder;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import java.sql.Date;

import app.domain.model.User;
import app.adapter.in.validators.UserValidator;

@Component
public class UserBuilder {

 @Autowired
    private UserValidator validator;

 
    public User build(
            long identification,
            String name,
            String email,
            String address,
            String userName,
            String password,
            long phone,
            String birthday
    ) throws Exception {
        
    


        // Validaciones
        long validatedIdentification = validator.identificationValidator(identification);
        String validatedName = validator.nameValidator(name);
        String validatedEmail = validator.emailValidator(email);
        String validatedAddress = validator.addressValidator(address);
        String validatedUserName = validator.userNameValidator(userName);
        String validatedPassword = validator.passwordValidator(password);
        long validatedPhone = validator.phoneValidator(phone);
        Date validatedBirthDay = validator.birthDayValidator(birthday);

        // Construcción del objeto User
        User doctor = new User();
        doctor.setIdentification(validatedIdentification);
        doctor.setName(validatedName);
        doctor.setEmail(validatedEmail);
        doctor.setAddress(validatedAddress);
        doctor.setUserName(validatedUserName);
        doctor.setPassword(validatedPassword);
        doctor.setPhone(validatedPhone);
        doctor.setBirthDay(validatedBirthDay);
        doctor.setRole(app.domain.model.emuns.Role.DOCTORS);

        return doctor;
    }
}
