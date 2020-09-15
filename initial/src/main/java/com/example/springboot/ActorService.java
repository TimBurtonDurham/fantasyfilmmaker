package com.example.springboot;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ActorService {
    private List<Actor> test()    {
        List<Actor> actors = new ArrayList<>();
        actors.add(new Actor().withFirstname("Dave").withRating(6).withLastname("Hampton").withWage(1000000));
        actors.add(new Actor().withFirstname("Tim").withRating(600).withLastname("Durham").withWage(1000000));
        actors.add(new Actor().withFirstname("Bob").withRating(65).withLastname("Hampton").withWage(1000000));
        return actors;
    }

}
