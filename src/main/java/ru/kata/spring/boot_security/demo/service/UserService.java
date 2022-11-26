package ru.kata.spring.boot_security.demo.service;

import org.springframework.data.jpa.repository.Query;
import org.springframework.security.core.userdetails.UserDetailsService;
import ru.kata.spring.boot_security.demo.models.Role;
import ru.kata.spring.boot_security.demo.models.User;
import java.util.List;
import java.util.Set;


public interface UserService extends UserDetailsService {


    void updateUser(User user);

    List<Role> listRoles();

    User getUserById(int id);

    List<User> getAllUsers();

    @Query()
    void saveUser(User user);

    void deleteUserById(int id);
    Role getRoleById(int id);


}
