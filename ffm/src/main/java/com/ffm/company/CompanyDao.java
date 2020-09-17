package com.ffm.company;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class CompanyDao {

  @Autowired
  JdbcTemplate jdbcTemplate;

  public List<String> getAllCompanies() {

    List<String> name = jdbcTemplate.queryForList("select * from company", String.class);
    return name;

  }

}
