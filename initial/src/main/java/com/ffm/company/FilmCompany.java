package com.ffm.company;

import com.ffm.bank.BankAccount;
import com.ffm.film.Film;

import java.util.List;

public class FilmCompany {
    private String filmcompanyname;
    private List<Film> films;
    private List<BankAccount> bankaccount;
    private Boolean isBankrupt;

    public String getFilmCompanyName() {
        return filmcompanyname;
    }

    public FilmCompany withFilmCompanyName(String filmcompanyname) {
        this.filmcompanyname = filmcompanyname;
        return this;
    }

    public List<Film> getFilms() {

        return films;
    }

    public FilmCompany withFilms(List<Film> films) {
        this.films = films;
        return this;
    }

    public List<BankAccount> getBankaccount() {
        return bankaccount;
    }

    public FilmCompany withBankaccount(List<BankAccount> bankaccount) {
        this.bankaccount = bankaccount;
        return this;
    }

    public void setBankrupt(Boolean bankrupt) {
        isBankrupt = bankrupt;
    }

    public Boolean isBankrupt()   {
        return isBankrupt;
    }
    @Override
    public String toString() {
        return String.format("filmcompanyname=%s,films=%s,bankaccount=%s",filmcompanyname, films, bankaccount);
    }
}
