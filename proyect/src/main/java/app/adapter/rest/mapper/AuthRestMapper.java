package main.java.app.adapter.rest.mapper;

import app.domain.model.User;
import app.adapter.in.request.AuthRequest;

public class AuthRestMapper {
    public static User toUser(AuthRequest request) {
        User user = new User();
        user.setUserName(request.getUserName());
        user.setPassword(request.getPassword());
        return user;
    }
}
