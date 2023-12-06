package by.cinema.repositories;

import by.cinema.entities.Film;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.UUID;

public class FilmRepositoryImpl implements FilmRepository {
    private static FilmRepository filmRepository;
    private final List<Film> films = new ArrayList<>(Arrays.asList(addFilmToList()));

    private FilmRepositoryImpl() {
    }

    @Override
    public Film addFilmToList() {
        Film film = Film.builder()
                .id(UUID.randomUUID())
                .name("Terminator")
                .showDate("10.12.2003")
                .build();
        return film;
    }

    @Override
    public List<Film> readFilms() {
        return films;
    }

    @Override
    public Film createFilm(Film film) {
        film.setId(UUID.randomUUID());
        films.add(film);
        return film;
    }

    @Override
    public void deleteFilm(UUID id) {
        Film deteletedFilm = films.stream().
                filter(film -> film.getId().equals(id))
                .findAny()
                .orElseThrow(() -> new RuntimeException("No film Id"));
        films.remove(deteletedFilm);
    }

    @Override
    public void updateFilm(UUID id, Film updateFilm) {
        Film updatedFilm = films.stream().
                filter(film -> film.getId().equals(id))
                .findAny()
                .orElseThrow(() -> new RuntimeException("No film Id"));
        films.set(films.indexOf(updatedFilm), updateFilm);
    }

    public static FilmRepository getInstance() {
        if (filmRepository == null) {
            filmRepository = new FilmRepositoryImpl();
        }
        return filmRepository;
    }

}
