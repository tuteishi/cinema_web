package by.cinema.mappers;

import by.cinema.entities.User;
import by.cinema.entities.UserRole;

import javax.servlet.http.HttpServletRequest;
import java.util.UUID;

import static by.cinema.utils.Constants.*;
import static java.lang.Integer.parseInt;

public class UserMapper {
    public User buildUser(HttpServletRequest req) {
        return User.builder()
                .firstname(req.getParameter(FIRSTNAME_PARAM))
                .surname(req.getParameter(SURNAME_PARAM))
                .age(parseInt(req.getParameter(AGE_PARAM)))
                .login((req.getParameter(LOGIN_PARAM)))
                .password((req.getParameter(PASSWORD_PARAM)))
                .userRole(UserRole.USER)
                .build();
    }

    public User buildUserAuthorization(HttpServletRequest req) {
        return User.builder()
                .login((req.getParameter(LOGIN_PARAM)))
                .password((req.getParameter(PASSWORD_PARAM)))
                .build();
    }

    public User updateUser(HttpServletRequest req) {
        return User.builder()
                .id(UUID.fromString(req.getParameter(ID_PARAM)))
                .firstname(req.getParameter(FIRSTNAME_PARAM))
                .surname(req.getParameter(SURNAME_PARAM))
                .age(parseInt(req.getParameter(AGE_PARAM)))
                .login((req.getParameter(LOGIN_PARAM)))
                .password((req.getParameter(PASSWORD_PARAM)))
                .userRole(UserRole.USER)
                .build();
    }
}
