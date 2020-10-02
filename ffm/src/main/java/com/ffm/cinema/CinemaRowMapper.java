package com.ffm.cinema;

import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public class CinemaRowMapper implements RowMapper<Cinema> {
    @Override
    public Cinema mapRow(ResultSet rs, int rowNum) throws SQLException {
        Cinema cinema = new Cinema();

        cinema.setId(rs.getInt("id"));
        cinema.withCinemaname(rs.getString("cinemaname"));
        cinema.withMinaudience(rs.getInt("id"));
        cinema.withMaxaudience(rs.getInt("id"));
        cinema.withMindays(rs.getInt("id"));
        cinema.withMaxdays(rs.getInt("id"));

        return cinema;
    }
}
