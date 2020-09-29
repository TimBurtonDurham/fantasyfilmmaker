package com.ffm.company;

import com.ffm.FfmEntity;
import com.ffm.bank.BankAccount;
import com.ffm.film.Film;
import java.util.List;

public class FilmCompany extends FfmEntity {

  private String filmcompanyname;

  private String twitter;

  private String instagram;

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

  public Boolean isBankrupt() {

    return isBankrupt;
  }

  public String getTwitter() {
    return twitter;
  }

  public FilmCompany withTwitter(String twitter) {
    this.twitter = twitter;
    return this;
  }

  public String getInstagram() {
    return instagram;
  }

  public FilmCompany withInstagram(String instagram) {
    this.instagram = instagram;
    return this;
  }
  @Override
  public String toString() {
    return String.format("filmcompanyname=%s,films=%s,bankaccount=%s", filmcompanyname, films, bankaccount);
  }
}
