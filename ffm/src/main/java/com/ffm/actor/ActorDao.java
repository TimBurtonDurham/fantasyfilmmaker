package com.ffm.actor;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class ActorDao {

  @Autowired
  JdbcTemplate jdbcTemplate;

  public List<String> getAllActors() {

    List<String> name = jdbcTemplate.queryForList("select * from actor", String.class);
    return name;

  }

  public Actor getActor(Integer actorId) {

    return jdbcTemplate.queryForObject("select * from actor where id="+actorId, new ActorRowMapper());

  }
  public Integer getActorRatingByGenre(Integer genreId, Integer actorId) {

    Integer integer = jdbcTemplate
        .queryForObject(String.format("SELECT SUM(r.RATING_VALUE) as total_value FROM ACTOR_RATING r LEFT JOIN ACTOR a on a.id=r.actor_id AND r.GENRE_ID=%s WHERE a.id = %s;", genreId, actorId), Integer.class);
    return integer;

  }

}
