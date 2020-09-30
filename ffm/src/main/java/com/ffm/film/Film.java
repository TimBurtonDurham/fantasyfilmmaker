package com.ffm.film;

import com.ffm.FfmEntity;
import com.ffm.actor.Actor;
import com.ffm.director.Director;
import com.ffm.genre.Genre;
import com.ffm.script.Script;
import com.ffm.studio.Studio;
import java.util.List;
import java.util.StringJoiner;

public class Film extends FfmEntity {

  private String filmtitle;

  private String filmtagline;

  private List<Actor> actors;

  private String posterurl;

  private Script script;

  private Genre genre;

  private Director director;

  private Actor leadactor;

  private Studio studio;


  public String getFilmtitle() {

    return filmtitle;
  }

  public Film withFilmTitle(String filmtitle) {

    this.filmtitle = filmtitle;
    return this;
  }
  public String getFilmTagline() {

    return filmtagline;
  }

  public Film withFilmTagline(String filmtagline) {

    this.filmtagline = filmtagline;
    return this;
  }

  public Script getScript() {

    return script;
  }

  public Film withScript(Script script) {

    this.script = script;
    return this;
  }

  public Genre getGenre() {

    return genre;
  }

  public Film withGenre(Genre genre) {

    this.genre = genre;
    return this;
  }

  public Director getDirector() {

    return director;
  }

  public Film withDirector(Director director) {

    this.director = director;
    return this;
  }

  public Actor getLeadactor() {

    return leadactor;
  }

  public Film withLeadactor(Actor leadactor) {

    this.leadactor = leadactor;
    return this;
  }

  public List getActors() {

    return actors;
  }

  public Film withActors(List actors) {

    this.actors = actors;
    return this;
  }

  private Integer getActorRatings() {

    Integer count = 0;
    for (Actor actor : actors) {
      count += actor.getRating();
    }
    return count;
  }

  private Integer getTotalActorRatings() {

    return getActorRatings();
  }

  private Integer getTotalRatings() {

    return getTotalActorRatings();
  }

  public String getPosterurl() {

    return posterurl;
  }

  public Film withPosterurl(String posterurl) {

    this.posterurl = posterurl;
    return this;
  }

  public Studio getStudio() {

    return studio;
  }

  public Film withStudio(Studio studio) {

    this.studio = studio;
    return this;
  }
  //
  // @Override
  // public String toString() {
  // return new StringJoiner(", ", Film.class.getSimpleName() + "[", "]")
  // .add("filmtitle='" + filmtitle + "'")
  // .add("actors=" + actors)
  // .add("ratings=" + getRatings())
  // .toString();
  // }

  @Override
  public String toString() {
    return new StringJoiner(", ", Film.class.getSimpleName() + "[", "]")
            .add("filmtitle='" + filmtitle + "'")
            .add("filmtagline='" + filmtagline + "'")
            .add("actors=" + actors)
            .add("posterurl='" + posterurl + "'")
            .add("script=" + script)
            .add("genre=" + genre)
            .add("director=" + director)
            .add("leadactor=" + leadactor)
            .add("studio=" + studio)
            .toString();
  }
}
