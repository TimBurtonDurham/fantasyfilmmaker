package com.example.springboot;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ActorService {
    public String greeting(){
        return "This is my service"+filmtest();
    }
    private List<Actor> test()    {
        List<Actor> actors = new ArrayList<>();
        actors.add(new Actor().withFirstname("Dave").withRating(6).withLastname("Hampton").withWage(1000000));
        actors.add(new Actor().withFirstname("Tim").withRating(600).withLastname("Durham").withWage(1000000));
        actors.add(new Actor().withFirstname("Bob").withRating(65).withLastname("Hampton").withWage(1000000));
        return actors;
    }

    private List<Film> filmtest()   {
        List<Film> films = new ArrayList<>();
        films.add(new Film().withFilmTitle("New Film Title").withActors(test()));
        return films;
    }

    private Integer getWages()  {
        List<Actor> actors = test();
        Integer count=0;
        for (Actor actor : actors)  {
            count+=actor.getWage();
        }
        return count;
    }
}
