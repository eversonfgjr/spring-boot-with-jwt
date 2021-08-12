package com.amigoscode.springbootwithjwt.service;

import com.amigoscode.springbootwithjwt.domain.Role;
import com.amigoscode.springbootwithjwt.domain.User;

import java.util.List;

public interface UserService {

    User saveUser(User user);
    Role saveRole(Role role);
    void addRoleToUser(String username, String roleName);
    User getUser(String username);
    List<User> getUsers();
}
