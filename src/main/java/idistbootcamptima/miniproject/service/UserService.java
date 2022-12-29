package idistbootcamptima.miniproject.service;

import idistbootcamptima.miniproject.model.entity.Role;
import idistbootcamptima.miniproject.model.entity.User;

import java.util.List;

//define all of the methods that we need
public interface UserService {
    User saveUser(User user);
    Role saveRole(Role role);
    void addRoleToUser(String username, String roleName);
    User getUser(String username);
    List<User> getUsers(); //get all users
}
