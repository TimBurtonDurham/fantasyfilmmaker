package com.example.springboot;

import java.util.List;

public class FilmCompany {
    private String filmcompanyname;
    private List films;
    private List bankaccount;

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

    public List getBankaccount() {
        return bankaccount;
    }

    public FilmCompany withBankaccount(List bankaccount) {
        this.bankaccount = bankaccount;
        return this;
    }

    @Override
    public String toString() {
        return String.format("filmcompanyname=%s,films=%s,bankaccount=%s",filmcompanyname, films, bankaccount);
    }
}
