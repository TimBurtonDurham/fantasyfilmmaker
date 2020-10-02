package com.ffm.genre;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class GenreDao {

  @Autowired
  JdbcTemplate jdbcTemplate;

  public List<Genre> getAllGenres() {
    return jdbcTemplate.query(String.format(
            "SELECT g. * " +
                    "FROM GENRE g " +
                    "WHERE g.DELETED=0;"), new GenreRowMapper());
  }
  public Genre getGenre(Integer genreId) {
    return jdbcTemplate.queryForObject(String.format(
            "SELECT g. * " +
                    "FROM GENRE g " +
                    "WHERE g.DELETED=0 AND g.id="+genreId+";"), new GenreRowMapper());
  }
}
