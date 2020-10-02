package com.ffm.cinema;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class CinemaDao {

  @Autowired
  JdbcTemplate jdbcTemplate;

  public List<Cinema> getAllCinemas() {
    return jdbcTemplate.query(String.format(
            "SELECT c. * " +
                    "FROM cinema c " +
                    "WHERE c.DELETED=0;"), new CinemaRowMapper());
  }
  public Cinema getCinema(Integer cinemaId) {
    return jdbcTemplate.queryForObject(String.format(
            "SELECT c. * " +
                    "FROM cinema c " +
                    "WHERE c.DELETED=0 AND c.id="+cinemaId+";"), new CinemaRowMapper());
  }

}
