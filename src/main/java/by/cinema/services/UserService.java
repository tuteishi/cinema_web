package by.cinema.services;

import by.cinema.entities.User;
import by.cinema.entities.UserRole;

import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;
import java.util.List;
import java.util.UUID;

public interface UserService {
    List<User> readUsers();

    void createUser(User user);

    void deleteUser(UUID id);

    void updateUser(UUID id, User user);

    boolean verificationLogin(User user);

    boolean verificationPassword(User user);

    boolean verificationLogPass(User user);

    UserRole getRole(String login);
}
