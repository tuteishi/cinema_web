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

@WebServlet(urlPatterns = "/films/create")

public class CreateFilmController extends HttpServlet {
    private final FilmMapper filmMapper = new FilmMapper();
    private final FilmService filmService = getInstanceFilm();
    private String film;

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        Film film = filmMapper.buildFilm(req);
        filmService.creatFilm(film);
        req.getRequestDispatcher("/films/read").forward(req,resp);
    }
}