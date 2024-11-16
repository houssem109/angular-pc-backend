package com.houssem.users.service;

import com.houssem.users.entities.Role;
import com.houssem.users.entities.User;

public interface UserService {
	User saveUser(User user);
	User findUserByUsername (String username);
	Role addRole(Role role);
	User addRoleToUser(String username, String rolename);
}
