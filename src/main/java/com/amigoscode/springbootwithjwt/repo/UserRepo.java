package com.amigoscode.springbootwithjwt.repo;

import com.amigoscode.springbootwithjwt.domain.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepo extends JpaRepository<User, Long> {

    User findByUsername(String username);

}
