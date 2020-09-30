package com.ffm.actor;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Map;

@Repository
public class ActorDao {

  @Autowired
  JdbcTemplate jdbcTemplate;

  public List<String> getAllActors() {
    return jdbcTemplate.queryForList("select * from actor", String.class);

  }

  public Actor getActor(Integer actorId) {
    return jdbcTemplate.queryForObject("select * from actor where id="+actorId, new ActorRowMapper());
  }

  public List<Actor> getActorsForFilm(Integer filmId) {

    return jdbcTemplate.query(String.format(
        "SELECT a. *, (SELECT SUM(r.RATING_VALUE) " +
            "FROM ACTOR_RATING r " +
            "WHERE r.GENRE_ID=f.GENRE_ID " +
            "AND a.id=r.ACTOR_ID) as rating " +
            "FROM film_actor fa " +
            "LEFT JOIN actor a on fa.ACTOR_ID=a.id " +
            "LEFT JOIN film f on f.id=fa.FILM_ID " +
            "WHERE fa.FILM_ID = %s AND a.DELETED=0;",
        filmId), new ActorRowMapper());
  }

  public Integer getActorRatingByGenre(Integer genreId, Integer actorId) {

    return jdbcTemplate.queryForObject(String.format("SELECT SUM(r.RATING_VALUE) as total_value FROM ACTOR_RATING r LEFT JOIN ACTOR a on a.id=r.ACTOR_ID AND r.GENRE_ID=%s WHERE a.id = %s;", genreId, actorId), Integer.class);

  }
  public void saveActor(Actor actor) {
    jdbcTemplate.execute("INSERT INTO ACTOR values.......");

  }
}
