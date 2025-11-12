package src.main.java.app.adapter.rest.mapper;

import app.domain.model.User;
import app.adapter.in.rest.request.UserRequest;
import app.adapter.in.rest.response.UserResponse;

public class UserMapper {
    public static User toUser(UserRequest request) {
        User user = new User();
        user.setIdentification(request.getIdentification());
        user.setName(request.getName());
        user.setEmail(request.getEmail());
        user.setAddress(request.getAddress());
        user.setUserName(request.getUserName());
        user.setPassword(request.getPassword());
        user.setPhone(request.getPhone());
        user.setBirthDay(request.getBirthDay());
        user.setRole(request.getRole());
        return user;
    }

    public static UserResponse toUserResponse(User user) {
        UserResponse response = new UserResponse();
        response.setIdentification(user.getIdentification());
        response.setName(user.getName());
        response.setEmail(user.getEmail());
        response.setAddress(user.getAddress());
        response.setUserName(user.getUserName());
        response.setPhone(user.getPhone());
        response.setBirthDay(user.getBirthDay());
        response.setRole(user.getRole());
        return response;
    }

}
