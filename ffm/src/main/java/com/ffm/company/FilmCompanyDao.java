package com.ffm.company;

import com.ffm.actor.Actor;
import com.ffm.actor.ActorRowMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;
import java.util.List;

@Repository
public class FilmCompanyDao {

  @Autowired
  JdbcTemplate jdbcTemplate;

  public List<FilmCompany> getAllCompanys() {
    return jdbcTemplate.query(String.format(
            "SELECT c. * " +
                    "FROM COMPANY c " +
                    "WHERE c.DELETED=0;"), new FilmCompanyRowMapper());
  }

  public FilmCompany getFilmCompany(Integer filmcompanyId) {
    return jdbcTemplate.queryForObject(String.format(
            "SELECT c.  " +
                    "FROM COMPANY c " +
                    "WHERE c.DELETED=0 AND c.id="+filmcompanyId+";"), new FilmCompanyRowMapper());
  }
}
