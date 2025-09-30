package app.infrastructure.persistence.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import app.infrastructure.persistence.entities.UserEntity;

@Repository
public interface UserRepository extends JpaRepository<UserEntity, Long> {

    // Busca por el ID (identification)
    UserEntity findByIdentification(long identification);

    // Busca por username
    UserEntity findByUserName(String userName);

    // Busca por email
    UserEntity findByEmail(String email);
}

