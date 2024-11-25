package com.kavindu.loginregister_oauth.Repositories;

import com.kavindu.loginregister_oauth.entities.UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<UserEntity, Long> {
    UserEntity findByEmail(String email);
}
