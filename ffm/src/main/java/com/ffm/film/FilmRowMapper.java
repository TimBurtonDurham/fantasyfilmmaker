package com.ffm.film;

import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public class FilmRowMapper implements RowMapper<Film> {
    @Override
    public Film mapRow(ResultSet rs, int rowNum) throws SQLException {
        Film film = new Film();

        film.setId(rs.getInt("id"));
        film.withFilmTitle(rs.getString("title"));
        film.withFilmTagline(rs.getString("tagline"));
//        film.withScript(rs.getInt("script_id"));
        film.withPosterurl(rs.getString("poster_url"));
        return film;
    }
}
