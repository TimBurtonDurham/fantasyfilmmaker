package com.ffm.script;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class ScriptDao {

  @Autowired
  JdbcTemplate jdbcTemplate;

  public List<String> getAllScripts() {
    return jdbcTemplate.queryForList("select * from script", String.class);

  }

  public Script getScript(Integer scriptId) {
    return jdbcTemplate.queryForObject("select * from script where id="+scriptId, new ScriptRowMapper());
  }

  public void saveScript(Script script) {
    jdbcTemplate.execute("INSERT INTO DIRECTOR values.......");

  }
}
