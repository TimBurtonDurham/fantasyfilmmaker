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
  public Integer getActorRatingByGenre(Integer genre_id, Integer actor_id) {

// RETURN JUST THE ACTOR_RATING VALUE FOR THIS ACTOR
// SQL SELECT SUM(r.RATING_VALUE) as total_value FROM ACTOR_RATING r LEFT JOIN ACTOR a on a.id=1 AND r.GENRE_ID=1 WHERE a.id = 1;
    return 20;
  }

}
