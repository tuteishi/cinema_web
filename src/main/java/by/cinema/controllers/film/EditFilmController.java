package by.cinema.controllers.film;

import by.cinema.entities.Film;
import by.cinema.services.FilmService;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

import static by.cinema.services.FilmServiceImpl.getInstanceFilm;

@WebServlet(urlPatterns = "/films/edit")

public class EditFilmController extends HttpServlet {
    private static final String FILM_EDIT_PAGE = "/pages/films/filmEdit.jsp";
    private final FilmService filmService = getInstanceFilm();

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        List<Film> films = filmService.readFilms();
        req.setAttribute("films", films);
        req.getRequestDispatcher(FILM_EDIT_PAGE).forward(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        doGet(req, resp);
    }
}