package com.ffm;

import com.ffm.actor.Actor;
import com.ffm.actor.ActorDao;
import com.ffm.actor.ActorService;
import com.ffm.bank.BankAccount;
import com.ffm.bank.BankAccountService;
import com.ffm.cinema.Cinema;
import com.ffm.cinema.CinemaService;
import com.ffm.company.FilmCompany;
import com.ffm.company.FilmCompanyService;
import com.ffm.director.Director;
import com.ffm.director.DirectorService;
import com.ffm.film.Film;
import com.ffm.film.FilmService;
import com.ffm.film.RatingService;
import com.ffm.genre.Genre;
import com.ffm.genre.GenreService;
import com.ffm.script.Script;
import com.ffm.script.ScriptService;
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
  DirectorService directorService;

  @Autowired
  RatingService ratingService;

  @Autowired
  StudioService studioService;

  @Autowired
  BankAccountService bankaccountService;

  @Autowired
  CinemaService cinemaService;

  @Autowired
  GenreService genreService;

  @Autowired
  ScriptService scriptService;

  @Autowired
  ActorDao actorDao;

  @RequestMapping("/companies")
  public List<FilmCompany> getCompanies() {

    return filmCompanyService.getCompanies();
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

  @GetMapping("/actors/{film}")
  public List<Actor> getActorByFilm(@PathVariable Integer film) {

    return actorDao.getActorsForFilm(film);
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
  public List<String> getStudios() {

    return studioService.getStudios();
  }

  @RequestMapping("/studio/{id}")
  public Studio getStudio(@PathVariable Integer id) {

    return studioService.getStudioById(id);
  }

  @RequestMapping("/bankaccounts")
  public List<BankAccount> getBankAccounts() {

    return bankaccountService.getBankAccounts();
  }

  @RequestMapping("/bankaccount/{id}")
  public BankAccount getBankAccount(@PathVariable Integer id) {

    return bankaccountService.getBankAccountById(id);
  }

  @RequestMapping("/directors")
  public List<Director> getDirectors()  {

    return directorService.getDirectors();
  }

  @RequestMapping("/director/{id}")
  public Director getDirector(@PathVariable Integer id) {

    return directorService.getDirectorById(id);
  }

  @RequestMapping("/genres")
  public List<Genre> getGenres()  {
    return genreService.getGenres();
  }

  @RequestMapping("/genre/{id}")
  public Genre getGenre(@PathVariable Integer id) {
    return genreService.getGenreById(id);
  }

  @RequestMapping("/cinemas")
  public List<Cinema> getCinemas()  {
    return cinemaService.getCinemas();
  }

  @RequestMapping("/cinema/{id}")
  public Cinema getCinema(@PathVariable Integer id) {
    return cinemaService.getCinemaById(id);
  }

  @RequestMapping("/scripts")
  public List<Script> getScripts()  {
    return scriptService.getScripts();
  }

  @RequestMapping("/script/{id}")
  public Script getScript(@PathVariable Integer id) {
    return scriptService.getScriptById(id);
  }
}
