package com.ffm.film;

import com.ffm.actor.Actor;
import com.ffm.actor.ActorRowMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class FilmDao {

  @Autowired
  JdbcTemplate jdbcTemplate;

  public List<Film> getAllFilms() {
    return jdbcTemplate.query(String.format(
            "SELECT f. * " +
                    "FROM FILM f " +
                    "WHERE f.DELETED=0;"), new FilmRowMapper());
  }
  public Film getFilm(Integer filmId) {
    return jdbcTemplate.queryForObject(String.format(
            "SELECT f. * " +
                    "FROM FILM f " +
                    "WHERE a.DELETED=0 AND a.id="+filmId+";"), new FilmRowMapper());
  }
}
