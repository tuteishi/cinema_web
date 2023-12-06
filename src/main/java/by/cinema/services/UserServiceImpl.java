package by.cinema.services;

import by.cinema.entities.User;
import by.cinema.entities.UserRole;
import by.cinema.repositories.UserRepository;
import by.cinema.repositories.UserRepositoryImpl;

import javax.servlet.http.HttpServletRequest;
import java.util.List;
import java.util.UUID;

public class UserServiceImpl implements UserService {
    private static UserService userService;
    private final UserRepository userRepository = UserRepositoryImpl.getInstance();

    private UserServiceImpl() {
    }

    @Override
    public List<User> readUsers() {
        return userRepository.readUsers();
    }

    @Override
    public void createUser(User user) {
        userRepository.createUser(user);
    }

    @Override
    public void deleteUser(UUID id) {
        userRepository.deleteUser(id);
    }

    @Override
    public void updateUser(UUID id, User user) {
        userRepository.updateUser(id, user);
    }

    @Override
    public boolean verificationLogin(User user) {
        return userRepository.findLogin(user);
    }

    @Override
    public boolean verificationPassword(User user) {
        return userRepository.findPassword(user);
    }

    @Override
    public boolean verificationLogPass(User user) {
        if (verificationLogin(user)) {
            return verificationPassword(user);
        } else return false;
    }

    @Override
    public UserRole getRole(String login) {
        return userRepository.getRole(login);
    }

    public static UserService getInstance() {
        if (userService == null) {
            userService = new UserServiceImpl();
        }
        return userService;
    }
}
