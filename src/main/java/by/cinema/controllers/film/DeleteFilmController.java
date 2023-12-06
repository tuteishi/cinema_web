package by.cinema.controllers.film;

import by.cinema.services.FilmService;
import by.cinema.utils.Constants;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.UUID;

import static by.cinema.services.FilmServiceImpl.getInstanceFilm;

@WebServlet(urlPatterns = "/films/delete")
public class DeleteFilmController extends HttpServlet {
    private final FilmService filmService = getInstanceFilm();
    private static final String DELETE_PAGE = "/pages/films/filmDelete.jsp";

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.getRequestDispatcher(DELETE_PAGE).forward(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        filmService.deleteFilm(UUID.fromString(req.getParameter(Constants.ID_PARAM)));
        req.getRequestDispatcher("/films/read").forward(req, resp);
    }
}