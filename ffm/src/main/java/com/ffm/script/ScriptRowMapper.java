package com.ffm.script;

import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public class ScriptRowMapper implements RowMapper<Script> {
    @Override
    public Script mapRow(ResultSet rs, int rowNum) throws SQLException {
        Script script = new Script();

        script.setId(rs.getInt("id"));
        script.withScriptitle(rs.getString("title"));
        script.withScripttagline(rs.getString("tagline"));
        script.withScriptfulltext(rs.getString("maindescription"));
        script.withStatus(rs.getInt("status"));
        script.withStatusname(rs.getString("statusname"));

        return script;
    }
}
