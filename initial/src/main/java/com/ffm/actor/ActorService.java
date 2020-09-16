package com.ffm.actor;

import com.ffm.FfmEntity;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ActorService {
    public List<FfmEntity> getActors()    {
        List<FfmEntity> actors = new ArrayList<>();
        actors.add(new Actor().withFirstname("Dave").withRating(6).withLastname("Hampton").withWage(1000000).withId(Long.valueOf(1)));
        actors.add(new Actor().withFirstname("Tim").withRating(600).withLastname("Durham").withWage(1000000).withId(Long.valueOf(2)));
        actors.add(new Actor().withFirstname("Bob").withRating(65).withLastname("Hampton").withWage(1000000).withId(Long.valueOf(3)));
        return actors;
    }

}
