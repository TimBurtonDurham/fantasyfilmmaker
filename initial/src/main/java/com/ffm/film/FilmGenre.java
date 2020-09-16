package com.ffm.film;

public class FilmGenre {

    private String genrename;

    public String getGenrename() {
        return genrename;
    }

    public FilmGenre withGenreName(String genrename) {
        this.genrename = genrename;
        return this;
    }
}
