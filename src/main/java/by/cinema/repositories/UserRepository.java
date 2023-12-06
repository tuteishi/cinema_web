package by.cinema.repositories;

import by.cinema.entities.User;
import by.cinema.entities.UserRole;

import java.util.List;
import java.util.UUID;

public interface UserRepository {
    List<User> readUsers();

    User createUser(User user);

    void deleteUser(UUID id);

    void updateUser(UUID idUserRepository, User user);

    User addAdminToList();

    boolean findLogin(User user);

    boolean findPassword(User user);

    UserRole getRole(String login);
}
