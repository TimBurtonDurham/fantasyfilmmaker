package com.ffm.film;

import com.ffm.director.DirectorService;
import com.ffm.actor.ActorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class FilmService {

    @Autowired
    ActorService actorService;
    @Autowired
    DirectorService directorService;

    public String greeting(){
        return "This is my service"+getFilms();
    }

    public List<Film> getFilms()   {
        List<Film> films = new ArrayList<>();
        films.add(new Film().withFilmTitle("New Film Title").withGenre("Action").withActors(actorService.getActors()));
        films.add(new Film().withFilmTitle("New Film Title 2").withGenre("Western").withPosterurl("https://miro.medium.com/max/700/1*mk1-6aYaf_Bes1E3Imhc0A.jpeg").withActors(actorService.getActors()).withDirector(directorService.getDirectors()));
        return films;
    }

}
