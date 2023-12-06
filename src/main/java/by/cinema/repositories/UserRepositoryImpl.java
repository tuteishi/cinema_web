package by.cinema.repositories;

import by.cinema.entities.User;
import by.cinema.entities.UserRole;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.UUID;

public class UserRepositoryImpl implements UserRepository {
    private static UserRepository userRepository;
    private final List<User> users = new ArrayList<>(Arrays.asList(addAdminToList()));

    private UserRepositoryImpl() {
    }

    @Override
    public User addAdminToList() {
        User admin = User.builder()
                .id(UUID.randomUUID())
                .firstname("Viktor")
                .surname("Byba")
                .age(40)
                .login("admin")
                .password("1234")
                .userRole(UserRole.ADMIN).build();
        return admin;
    }

    @Override
    public List<User> readUsers() {
        return users;
    }

    @Override
    public User createUser(User user) {
        user.setId(UUID.randomUUID());
        users.add(user);
        return user;
    }

    @Override
    public void deleteUser(UUID id) {
        User deteletedUser = users.stream().
                filter(user -> user.getId().equals(id))
                .findAny()
                .orElseThrow(() -> new RuntimeException("No user Id"));
        users.remove(deteletedUser);
    }

    @Override
    public void updateUser(UUID id, User updateUser) {
        User updatedUser = users.stream().
                filter(user -> user.getId().equals(id))
                .findAny()
                .orElseThrow(() -> new RuntimeException("No user Id"));
        users.set(users.indexOf(updatedUser), updateUser);
    }

    @Override
    public boolean findLogin(User user) {
        return users.stream()
                .map(User::getLogin)
                .anyMatch(x -> x.equals(user.getLogin()));
    }

    @Override
    public boolean findPassword(User user) {
        return users.stream()
                .map(User::getPassword)
                .anyMatch(x -> x.equals(user.getPassword()));
    }

    @Override
    public UserRole getRole(String login) {
        return users.stream()
                .filter(user -> user.getLogin().equals(login))
                .map(User::getUserRole)
                .findAny()
                .orElse(UserRole.USER);
    }

    public static UserRepository getInstance() {
        if (userRepository == null) {
            userRepository = new UserRepositoryImpl();
        }
        return userRepository;
    }
}
