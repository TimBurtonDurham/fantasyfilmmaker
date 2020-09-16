package com.ffm.film;

import com.ffm.actor.Actor;
import com.ffm.director.Director;
import com.ffm.script.Script;

import java.util.List;

public class Film {

    private String filmtitle;

    private List<Actor> actors;

    private String posterurl;

    private Script script;

    private String genre;

    private Director director;

    private Actor leadactor;

    public String getFilmtitle() {

        return filmtitle;
    }

    public Film withFilmTitle(String filmtitle) {

        this.filmtitle = filmtitle;
        return this;
    }

    public Script getScript() {

        return script;
    }

    public Film withScript(Script script) {

        this.script = script;
        return this;
    }

    public String getGenre() {

        return genre;
    }

    public Film withGenre(String genre) {

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

    //
    //    @Override
    //    public String toString() {
    //        return new StringJoiner(", ", Film.class.getSimpleName() + "[", "]")
    //                .add("filmtitle='" + filmtitle + "'")
    //                .add("actors=" + actors)
    //                .add("ratings=" + getRatings())
    //                .toString();
    //    }

    @Override public String toString() {

        return String.format("filmtitle=%s,posterurl=%s,genre=%s,director=%s,actors=%s,totalfilmratings=%s", filmtitle, posterurl, genre, director, actors, getTotalRatings());
    }
}
