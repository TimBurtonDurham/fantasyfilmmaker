package com.example.springboot;

import java.util.ArrayList;
import java.util.List;
import java.util.StringJoiner;

public class Film {
    private String filmtitle;
    private List<Actor> actors;
    private String posterurl;

    public String getFilmtitle() {
        return filmtitle;
    }

    public Film withFilmTitle(String filmtitle) {
        this.filmtitle = filmtitle;
        return this;
    }

    public List getActors() {
        return actors;
    }

    public Film withActors(List actors) {
        this.actors = actors;
        return this;
    }

    private Integer getActorRatings()    {
        Integer count=0;
        for (Actor actor : actors) {
            count+=actor.getRating();
        }
        return count;
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

    @Override
    public String toString() {
        return String.format("filmtitle=%s,posterurl=%s,actors=%s,ratings=%s",filmtitle,posterurl,actors,getActorRatings());
    }
}
