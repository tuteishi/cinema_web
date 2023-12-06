package by.cinema.filters;

import by.cinema.entities.UserRole;
import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpFilter;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebFilter(urlPatterns = {"/users/read", "/films/edit"})

public class RoleControlFilter extends HttpFilter {
    private static final String ERROR_ACCESS_PAGE = "/pages/errors/accessError.jsp";

    @Override
    protected void doFilter(HttpServletRequest req, HttpServletResponse res, FilterChain chain) throws IOException, ServletException {
        UserRole userRole = (UserRole) req.getSession().getAttribute("userRole");
        if (userRole.equals(UserRole.ADMIN)) {
            chain.doFilter(req, res);
        } else {
            req.getRequestDispatcher(ERROR_ACCESS_PAGE).forward(req, res);
        }
    }
}
