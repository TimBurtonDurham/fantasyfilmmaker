package com.ffm.film;

import com.ffm.actor.ActorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import javax.annotation.PostConstruct;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

// Used to be known as a DOM....
@Repository public class FilmRepository {

    @Autowired
    ActorService actorService;

    // test  data
    Map<Integer, Film> films = new HashMap<>();

    /*
     for test data only... remove if you have a databse
     PostConstruct is called when Sprint Boot starts up and the FilmRepository is created for the first time
     */
    @PostConstruct private void init() {

        Film film1 = new Film().withFilmTitle("Film Title 1");
        film1.setId(1);
        films.put(1, film1);
        Film film2 = new Film().withFilmTitle("New Film Title 2").withPosterurl("https://miro.medium.com/max/700/1*mk1-6aYaf_Bes1E3Imhc0A.jpeg").withActors(actorService.getActors());
        film2.setId(2);
        films.put(2, film2);
    }

    public List<Film> getFilms() {
        // select * from films
        return new ArrayList<>(films.values());
    }

    public Film getFilmById(Integer id) {
        // select * from films where id=id
        return films.get(id);
    }

    public void saveFilm(Film film) {

        Integer newId = films.size();
        film.setId(newId);
        films.put(newId, film);
    }

}