package com.amigoscode.springbootwithjwt.repo;

import com.amigoscode.springbootwithjwt.domain.Role;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RoleRepo extends JpaRepository<Role, Long> {
    Role findByName(String name);
}

