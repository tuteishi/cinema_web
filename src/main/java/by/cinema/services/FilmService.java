package by.cinema.services;

import by.cinema.entities.Film;

import java.util.List;
import java.util.UUID;

public interface FilmService {
    List<Film> readFilms();

    Film creatFilm(Film film);

    void deleteFilm(UUID id);

    void updateFilm(UUID id, Film film);
}
