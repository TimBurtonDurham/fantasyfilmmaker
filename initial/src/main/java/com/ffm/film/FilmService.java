package com.ffm.film;

import com.ffm.actor.ActorRepository;
import com.ffm.film.Film;
import com.ffm.actor.ActorService;
import com.ffm.director.DirectorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service public class FilmService {

    @Autowired ActorService actorService;

    @Autowired DirectorService directorService;

    @Autowired
    FilmRepository filmRepository;

    public String greeting() {

        return "This is my service" + getFilms();
    }

    public List<Film> getFilms() {

//        List<Film> films = new ArrayList<>();
//        films.add(new Film().withFilmTitle("New Film Title").withActors(actorService.getActors()));
//        films.add(new Film().withFilmTitle("New Film Title 2").withPosterurl("https://miro.medium.com/max/700/1*mk1-6aYaf_Bes1E3Imhc0A.jpeg").withActors(actorService.getActors())
//            .withDirector(directorService.getDirectors()));
//        return films;
        return filmRepository.getFilms();
    }

    public Film getFilmById(Integer id) {
        return filmRepository.getFilmById(id);
    }
}
