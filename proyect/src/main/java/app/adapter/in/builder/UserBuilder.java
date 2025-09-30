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
            String idStr,
            String name,
            String email,
            String address,
            String userName,
            String password,
            String phoneStr,
            String birthDayStr
    ) throws Exception {

        // Validaciones
        long id = validator.idValidator(idStr);
        String validatedName = validator.nameValidator(name);
        String validatedEmail = validator.emailValidator(email);
        String validatedAddress = validator.addressValidator(address);
        String validatedUserName = validator.userNameValidator(userName);
        String validatedPassword = validator.passwordValidator(password);
        int phone = validator.phoneValidator(phoneStr);
        Date birthDay = validator.birthDayValidator(birthDayStr);

        // Construcción del objeto Doctor (User)
        User doctor = new User();
        doctor.setIdentification(id);
        doctor.setName(validatedName);
        doctor.setEmail(validatedEmail);
        doctor.setAddress(validatedAddress);
        doctor.setUserName(validatedUserName);
        doctor.setPassword(validatedPassword);
        doctor.setPhone(phone);
        doctor.setBirthDay(birthDay);
        doctor.setRole(app.domain.model.emuns.Role.DOCTORS);

        return doctor;
    }
}
