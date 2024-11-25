package com.kavindu.loginregister_oauth.Repositories;

import com.kavindu.loginregister_oauth.entities.RoleEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RoleRepository extends JpaRepository<RoleEntity, Integer> {
    RoleEntity findByName(String name);
}
