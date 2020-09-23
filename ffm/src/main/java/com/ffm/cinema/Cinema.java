package com.ffm.cinema;

import com.ffm.FfmEntity;

import java.util.StringJoiner;

public class Cinema extends FfmEntity {

  private String cinemaname;

  public String getCinemaname() {

    return cinemaname;
  }

  public Cinema withCinemaname(String cinemaname) {
    this.cinemaname = cinemaname;
    return this;
  }

  @Override
  public String toString() {
    return new StringJoiner(", ", Cinema.class.getSimpleName() + "[", "]")
            .add("cinemaname='" + cinemaname + "'")
            .toString();
  }
}
