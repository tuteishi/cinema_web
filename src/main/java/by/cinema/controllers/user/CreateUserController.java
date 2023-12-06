package by.cinema.controllers.user;

import by.cinema.entities.User;
import by.cinema.mappers.UserMapper;
import by.cinema.services.UserService;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

import static by.cinema.services.UserServiceImpl.getInstance;

@WebServlet(urlPatterns = "/users/create")
public class CreateUserController extends HttpServlet {
    private final UserService userService = getInstance();
    private final UserMapper userMapper = new UserMapper();
    private static final String AUTHORIZATION_PAGE = "/pages/users/userAuthorization.jsp";

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        User user = userMapper.buildUser(req);
        userService.createUser(user);
        req.getRequestDispatcher(AUTHORIZATION_PAGE).forward(req, resp);
    }
}
