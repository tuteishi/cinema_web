package by.cinema.controllers.film;

import by.cinema.entities.Film;
import by.cinema.mappers.FilmMapper;
import by.cinema.services.FilmService;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

import static by.cinema.services.FilmServiceImpl.getInstanceFilm;

@WebServlet(urlPatterns = "/films/update")

public class UpdateFilmController extends HttpServlet {
    private final FilmService filmService = getInstanceFilm();
    private final FilmMapper filmMapper = new FilmMapper();
    private static final String UPDATE_PAGE = "/pages/films/filmUpdate.jsp";

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.getRequestDispatcher(UPDATE_PAGE).forward(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        Film film = filmMapper.updateFilm(req);
        filmService.updateFilm(film.getId(), film);
        req.getRequestDispatcher("/films/edit").forward(req, resp);
    }
}
