package com.example.springboot;

import jdk.nashorn.internal.ir.debug.PrintVisitor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class FilmService {

    @Autowired
    ActorService actorService;

    public String greeting(){
        return "This is my service"+filmtest();
    }

    public List<Film> filmtest()   {
        List<Film> films = new ArrayList<>();
        films.add(new Film().withFilmTitle("New Film Title").withActors(actorService.getActors()));
        films.add(new Film().withFilmTitle("New Film Title 2").withPosterurl("https://miro.medium.com/max/700/1*mk1-6aYaf_Bes1E3Imhc0A.jpeg").withActors(actorService.getActors()));
        return films;
    }

}
