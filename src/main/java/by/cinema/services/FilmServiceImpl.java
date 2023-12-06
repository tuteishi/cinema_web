package by.cinema.services;

import by.cinema.entities.Film;
import by.cinema.repositories.FilmRepository;
import by.cinema.repositories.FilmRepositoryImpl;

import java.util.List;
import java.util.UUID;

public class FilmServiceImpl implements FilmService {
    private static FilmService filmService;
    private final FilmRepository filmRepository = FilmRepositoryImpl.getInstance();

    private FilmServiceImpl() {
    }

    @Override
    public List<Film> readFilms() {
        return filmRepository.readFilms();
    }

    @Override
    public Film creatFilm(Film film) {
        return filmRepository.createFilm(film);
    }

    @Override
    public void deleteFilm(UUID id) {
        filmRepository.deleteFilm(id);
    }

    @Override
    public void updateFilm(UUID id, Film film) {
        filmRepository.updateFilm(id, film);
    }


    public static FilmService getInstanceFilm() {
        if (filmService == null) {
            filmService = new FilmServiceImpl();
        }
        return filmService;
    }
}
