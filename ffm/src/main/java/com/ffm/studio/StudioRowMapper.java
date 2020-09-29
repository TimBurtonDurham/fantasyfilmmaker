package com.ffm.studio;

import com.ffm.studio.Studio;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public class StudioRowMapper implements RowMapper<Studio> {
    @Override
    public Studio mapRow(ResultSet rs, int rowNum) throws SQLException {
        Studio studio = new Studio();

        studio.setId(rs.getInt("id"));
        studio.withRating(rs.getInt("rating"));
        studio.withCostperday(rs.getInt("studiocost"));
        studio.withRating(rs.getInt("rating"));

        return studio;
    }
}
