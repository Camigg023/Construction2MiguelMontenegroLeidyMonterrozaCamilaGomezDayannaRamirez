package src.main.java.app.adapter.in.builder;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import java.sql.Date;

import src.main.java.app.domain.model.User;
import src.main.java.app.domain.model.emuns.Role;
import src.main.java.app.adapter.in.validators.UserValidator;

@Component
public class UserBuilder {

    @Autowired
    private UserValidator validator;

    public User build(Long identification, String name, String email, String address, String userName, String password, Long phone, String birthday, Role role)
      throws Exception {

        Long validatedIdentification = validator.identificationValidator(identification);
        String validatedName = validator.nameValidator(name);
        String validatedEmail = validator.emailValidator(email);
        String validatedAddress = validator.addressValidator(address);
        String validatedUserName = validator.userNameValidator(userName);
        String  validatedPassword = validator.passwordValidator(password);
        Long validatedPhone = validator.phoneValidator(phone);
        Date validatedBirthDay = validator.birthDayValidator(birthday);

        User user = new User();

        user.setIdentification(validatedIdentification);
        user.setName(validatedName);
        user.setEmail(validatedEmail);
        user.setAddress(validatedAddress);
        user.setUserName(validatedUserName);
        user.setPassword(validatedPassword);
        user.setPhone(validatedPhone);
        user.setBirthDay(validatedBirthDay);
        user.setRole(role);

        return user;
    }
}

