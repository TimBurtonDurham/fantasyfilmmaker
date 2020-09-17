package com.ffm.company;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;

public class CompanyDao {

	@Autowired
	JdbcTemplate jdbcTemplate;

	public void getAllCompanies() {

		jdbcTemplate.execute("select * from company");

	}

}
