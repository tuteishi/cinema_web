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

@WebServlet(urlPatterns = "/users/update")
public class UpdateUserController extends HttpServlet {
    private final UserService userService = getInstance();
    private final UserMapper userMapper = new UserMapper();
    private static final String UPDATE_PAGE = "/pages/users/userUpdate.jsp";

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.getRequestDispatcher(UPDATE_PAGE).forward(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        User user = userMapper.updateUser(req);
        userService.updateUser(user.getId(), user);
        req.getRequestDispatcher("/users/read").forward(req, resp);
    }
}
