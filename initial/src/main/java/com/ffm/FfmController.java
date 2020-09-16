package com.ffm;

import com.ffm.actor.Actor;
import com.ffm.actor.ActorService;
import com.ffm.company.FilmCompany;
import com.ffm.company.FilmCompanyService;
import com.ffm.film.Film;
import com.ffm.film.FilmService;
import com.ffm.film.RatingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController public class FfmController {

    @Autowired FilmService filmService;

    @Autowired FilmCompanyService filmCompanyService;

    @Autowired ActorService actorService;

    @Autowired RatingService ratingService;

    @RequestMapping("/companies") public List<FilmCompany> getCompanies() {

        return filmCompanyService.getCompanies();
    }

    @RequestMapping("/actors") public List<Actor> getActors() {

        return actorService.getActors();
    }

    @GetMapping("/actor/{id}") public Actor getActor(@PathVariable Integer id) {

        return actorService.getActoById(id);
    }

    @GetMapping("/actor/rating/{id}/{genre}") public Integer getActorRating(@PathVariable Integer id, @PathVariable String genre) {

        List<Integer> genreMappingForActor = ratingService.getGenreMappingForActor(id, genre);
        if (genreMappingForActor==null) {
            return 0;
        }
        Integer  rating = 0;
        for (Integer integer : genreMappingForActor) {
            rating+=integer;
        }
        return rating;
    }

    @RequestMapping("/films") public List<Film> getFilms() {

        return filmService.getFilms();
    }

}


