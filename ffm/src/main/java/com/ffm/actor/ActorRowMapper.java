package com.ffm.actor;

import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;
import com.ffm.FFMCalculation;

public class ActorRowMapper implements RowMapper<Actor> {
    @Override
    public Actor mapRow(ResultSet rs, int rowNum) throws SQLException {
        Actor actor = new Actor();

        actor.setId(rs.getInt("id"));
        actor.withFirstname(rs.getString("firstname"));
        actor.withLastname(rs.getString("lastname"));
        actor.withWage(rs.getInt("currentwage"));
        actor.withRating(rs.getInt("rating"));
        actor.getFullname();

        return actor;
    }
}
