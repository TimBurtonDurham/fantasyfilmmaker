package com.ffm.company;

import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public class FilmCompanyRowMapper implements RowMapper<FilmCompany> {
    @Override
    public FilmCompany mapRow(ResultSet rs, int rowNum) throws SQLException {
        FilmCompany filmcompany = new FilmCompany();

        filmcompany.setId(rs.getInt("id"));
        filmcompany.withFilmCompanyName(rs.getString("name"));
        filmcompany.withTwitter(rs.getString("twitter"));
        filmcompany.withInstagram(rs.getString("instagram"));
        return filmcompany;
    }
}