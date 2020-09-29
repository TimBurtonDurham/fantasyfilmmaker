package com.ffm.director;

import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public class DirectorRowMapper implements RowMapper<Director> {
    @Override
    public Director mapRow(ResultSet rs, int rowNum) throws SQLException {
        Director director = new Director();

        director.setId(rs.getInt("id"));
        director.withFirstname(rs.getString("firstname"));
        director.withLastname(rs.getString("lastname"));
        director.withWage(rs.getInt("currentwage"));
        director.withRating(rs.getInt("rating"));

        return director;
    }
}
