package com.ffm.script;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class ScriptDao {

  @Autowired
  JdbcTemplate jdbcTemplate;

  public List<Script> getAllScripts() {
    return jdbcTemplate.query(String.format(
            "SELECT s.*, ss.statusname " +
                    "FROM SCRIPT s " +
                    "LEFT JOIN SCRIPT_STATUS ss on s.status=ss.id " +
                    "WHERE s.DELETED=0;"), new ScriptRowMapper());
  }
  public Script getScript(Integer scriptId) {
    return jdbcTemplate.queryForObject(String.format(
            "SELECT s.*, ss.statusname " +
                    "FROM SCRIPT s " +
                    "LEFT JOIN SCRIPT_STATUS ss on s.status=ss.id " +
                    "WHERE s.DELETED=0 AND s.id="+scriptId+";"), new ScriptRowMapper());
  }
  public void saveScript(Script script) {
    jdbcTemplate.execute("INSERT INTO DIRECTOR values.......");

  }
}
