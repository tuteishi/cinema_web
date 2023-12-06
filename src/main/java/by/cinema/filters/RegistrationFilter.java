package by.cinema.filters;

import by.cinema.mappers.UserMapper;
import by.cinema.services.UserService;

import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpFilter;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

import static by.cinema.services.UserServiceImpl.getInstance;

@WebFilter(urlPatterns = "/users/create")
public class RegistrationFilter extends HttpFilter {
    private final UserService userService = getInstance();
    private static final String ERROR_LOG_PAGE = "/pages/errors/registrationError.jsp";
    UserMapper userMapper = new UserMapper();

    @Override
    protected void doFilter(HttpServletRequest req, HttpServletResponse res, FilterChain chain) throws IOException, ServletException {
        if (userService.verificationLogin(userMapper.buildUser(req))) {
            req.getRequestDispatcher(ERROR_LOG_PAGE).forward(req, res);
        } else
            chain.doFilter(req, res);
    }
}
