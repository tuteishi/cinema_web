package by.cinema.controllers.user;

import by.cinema.services.UserService;
import by.cinema.utils.Constants;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.UUID;

import static by.cinema.services.UserServiceImpl.getInstance;

@WebServlet(urlPatterns = "/users/delete")
public class DeleteUserController extends HttpServlet {
    private final UserService userService = getInstance();
    private static final String DELETE_PAGE = "/pages/users/userDelete.jsp";

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.getRequestDispatcher(DELETE_PAGE).forward(req,resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        userService.deleteUser(UUID.fromString(req.getParameter(Constants.ID_PARAM)));
        req.getRequestDispatcher("/users/read").forward(req, resp);
    }
}
