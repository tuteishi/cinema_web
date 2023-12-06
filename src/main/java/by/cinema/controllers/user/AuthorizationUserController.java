package by.cinema.controllers.user;

import by.cinema.services.UserService;
import by.cinema.utils.Constants;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

import static by.cinema.services.UserServiceImpl.getInstance;

@WebServlet(urlPatterns = "/users/authorization")
public class AuthorizationUserController extends HttpServlet {
    private final UserService userService = getInstance();
    private static final String MENU_PAGE = "/pages/menu.jsp";

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        HttpSession session = req.getSession();
        session.setAttribute("userRole", userService.getRole(req.getParameter(Constants.LOGIN_PARAM)));
        req.getRequestDispatcher(MENU_PAGE).forward(req, resp);
    }
}
