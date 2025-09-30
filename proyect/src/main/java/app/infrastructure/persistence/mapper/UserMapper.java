
package app.infrastructure.persistence.mapper;

import app.domain.model.User;
import app.domain.model.emuns.Role;
import app.infrastructure.persistence.entities.UserEntity;

public class UserMapper {

    public static UserEntity toEntity(User user) {
        if (user == null) return null;

        UserEntity entity = new UserEntity();
        
        entity.setIdentification(user.getIdentification());

        entity.setName(user.getName());
        entity.setEmail(user.getEmail());
        entity.setAddress(user.getAddress());
        entity.setUserName(user.getUserName());
        entity.setPassword(user.getPassword());
        entity.setPhone(user.getPhone());
        entity.setBirthDay(user.getBirthDay());

        if (user.getRole() != null) {
            entity.setRole(user.getRole().name());
        } else {
            entity.setRole(null);
        }

        return entity;
    }

    public static User toDomain(UserEntity entity) {
        if (entity == null) return null;

        User user = new User();

        user.setIdentification(entity.getIdentification());
        user.setName(entity.getName());
        user.setEmail(entity.getEmail());
        user.setAddress(entity.getAddress());
        user.setUserName(entity.getUserName());
        user.setPassword(entity.getPassword());
        user.setPhone(entity.getPhone());
        user.setBirthDay(entity.getBirthDay());

        if (entity.getRole() != null) {
            try {
                user.setRole(Role.valueOf(entity.getRole()));
            } catch (IllegalArgumentException e) {
                
                user.setRole(null);
            }
        } else {
            user.setRole(null);
        }

        return user;
    }
}
