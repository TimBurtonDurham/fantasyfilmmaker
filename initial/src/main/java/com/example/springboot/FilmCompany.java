package com.example.springboot;

import java.util.List;

public class FilmCompany {
    private String filmcompanyname;
    private List films;

    public String getFilmCompanyName() {
        return filmcompanyname;
    }

    public FilmCompany withFilmCompanyName(String filmcompanyname) {
        this.filmcompanyname = filmcompanyname;
        return this;
    }

    public List getFilms() {

        return films;
    }

    public FilmCompany withFilms(List films) {
        this.films = films;
        return this;
    }

    @Override
    public String toString() {
        return String.format("filmcompanyname=%s,films=%s",filmcompanyname, films);
    }
}
