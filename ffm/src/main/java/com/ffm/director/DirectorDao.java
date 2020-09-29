package com.ffm.director;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class DirectorDao {

  @Autowired
  JdbcTemplate jdbcTemplate;

  public List<String> getAllDirectors() {
    return jdbcTemplate.queryForList("select * from director", String.class);

  }

  public Director getDirector(Integer directorId) {
    return jdbcTemplate.queryForObject("select * from director where id="+directorId, new DirectorRowMapper());
  }

  public Integer getDirectorRatingByGenre(Integer genreId, Integer directorId) {

    return jdbcTemplate.queryForObject(String.format("SELECT SUM(r.RATING_VALUE) as total_value FROM DIRECTOR_RATING r LEFT JOIN DIRECTOR d on d.id=r.DIRECTOR_ID AND r.GENRE_ID=%s WHERE d.id = %s;", genreId, directorId), Integer.class);

  }
  public void saveDirector(Director director) {
    jdbcTemplate.execute("INSERT INTO DIRECTOR values.......");

  }
}
