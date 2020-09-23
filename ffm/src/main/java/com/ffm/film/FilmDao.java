package com.ffm.film;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class FilmDao {

  @Autowired
  JdbcTemplate jdbcTemplate;

  public List<String> getAllFilms() {

    List<String> name = jdbcTemplate.queryForList("select * from film WHERE deleted=0", String.class);
    return name;

  }

}
