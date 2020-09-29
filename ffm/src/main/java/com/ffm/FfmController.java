package com.ffm;

import com.ffm.actor.Actor;
import com.ffm.actor.ActorDao;
import com.ffm.actor.ActorService;
import com.ffm.company.CompanyDao;
import com.ffm.company.FilmCompany;
import com.ffm.company.FilmCompanyService;
import com.ffm.film.Film;
import com.ffm.film.FilmService;
import com.ffm.film.RatingService;
import com.ffm.studio.Studio;
import com.ffm.studio.StudioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class FfmController {

  @Autowired
  FilmService filmService;

  @Autowired
  FilmCompanyService filmCompanyService;

  @Autowired
  ActorService actorService;

  @Autowired
  RatingService ratingService;

  @Autowired
  StudioService studioService;

  @Autowired
  CompanyDao companyDao;

  @Autowired
  ActorDao actorDao;

  @RequestMapping("/companies")
  public List<FilmCompany> getCompanies() {

    return filmCompanyService.getCompanies();
  }

  @GetMapping("/companiesdb")
  public List<String> getCompaniesFromDb() {

    return companyDao.getAllCompanies();
  }

  @RequestMapping("/actors")
  public List<Actor> getActors() {

    return actorService.getActors();
  }

  @GetMapping("/actor/{id}")
  public Actor getActor(@PathVariable Integer id) {

    return actorService.getActorById(id);
  }

  @GetMapping("/actor/rating/{id}")
  public Integer getActorRating(@PathVariable Integer id) {

    return actorDao.getActorRatingByGenre(1, id);
  }


  @GetMapping("/actor/rating/{id}/{genre}")
  public Integer getActorRating(@PathVariable Integer id, @PathVariable String genre) {

    List<Integer> genreMappingForActor = ratingService.getGenreMappingForActor(id, genre);
    if (genreMappingForActor == null) {
      return 0;
    }
    Integer rating = 0;
    for (Integer integer : genreMappingForActor) {
      rating += integer;
    }
    return rating;
  }

  @RequestMapping("/films")
  public List<Film> getFilms() {

    return filmService.getFilms();
  }

  @RequestMapping("/film/{id}")
  public Film getFilm(@PathVariable Integer id) {

    return filmService.getFilmById(id);
  }

  @RequestMapping("/studios")
  public List<Studio> getStudios() {

    return studioService.getStudios();
  }

  @RequestMapping("/studio/{id}")
  public Studio getStudio(@PathVariable Integer id) {

    return studioService.getStudioById(id);
  }
}
