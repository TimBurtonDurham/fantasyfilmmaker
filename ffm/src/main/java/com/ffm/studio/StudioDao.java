package com.ffm.studio;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class StudioDao {

  @Autowired
  JdbcTemplate jdbcTemplate;

  public List<String> getAllStudios() {
    return jdbcTemplate.queryForList("select s.*,  (SELECT SUM(r.RATING_VALUE)  FROM STUDIO_RATING r WHERE s.id=r.STUDIO_ID)  as rating from studio s  WHERE s.DELETED=0", String.class);

  }

  public Studio getStudio(Integer studioId) {
    return jdbcTemplate.queryForObject("select s.*,  (SELECT SUM(r.RATING_VALUE)  FROM STUDIO_RATING r WHERE s.id=r.STUDIO_ID)  as rating from studio s  WHERE s.DELETED=0 AND id="+studioId, new StudioRowMapper());
  }

  public void saveStudio(Studio studio) {
    jdbcTemplate.execute("INSERT INTO STUDIO values.......");

  }
}
