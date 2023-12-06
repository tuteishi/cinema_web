package by.cinema.repositories;

import by.cinema.entities.Film;

import java.util.List;
import java.util.UUID;

public interface FilmRepository {
    List<Film> readFilms();

    Film createFilm(Film film);

    void deleteFilm(UUID id);

    void updateFilm(UUID id, Film updateFilm);

    Film addFilmToList();
}
