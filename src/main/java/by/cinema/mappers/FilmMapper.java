package by.cinema.mappers;

import by.cinema.entities.Film;

import javax.servlet.http.HttpServletRequest;
import java.util.UUID;

import static by.cinema.utils.Constants.*;

public class FilmMapper {
    public Film buildFilm(HttpServletRequest req) {
        return Film.builder()
                .name(req.getParameter(NAME_PARAM))
                .showDate(req.getParameter(SHOWDATE_PARAM))
                .build();
    }

    public Film updateFilm(HttpServletRequest req) {
        return Film.builder()
                .id(UUID.fromString(req.getParameter(ID_PARAM)))
                .name(req.getParameter(NAME_PARAM))
                .showDate(req.getParameter(SHOWDATE_PARAM))
                .build();
    }
}
