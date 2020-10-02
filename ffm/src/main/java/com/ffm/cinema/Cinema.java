package com.ffm.cinema;

import com.ffm.FfmEntity;

import java.util.StringJoiner;

public class Cinema extends FfmEntity {

  private String cinemaname;

  private Integer minaudience;

  private Integer maxaudience;

  private Integer mindays;

  private Integer maxdays;

  public String getCinemaname() {
    return cinemaname;
  }

  public Cinema withCinemaname(String cinemaname) {
    this.cinemaname = cinemaname;
    return this;
  }

  public Integer getMinaudience() {
    return minaudience;
  }

  public Cinema withMinaudience(Integer minaudience) {
    this.minaudience = minaudience;
    return this;
  }

  public Integer getMaxaudience() {
    return maxaudience;
  }

  public Cinema withMaxaudience(Integer maxaudience) {
    this.maxaudience = maxaudience;
    return this;
  }

  public Integer getMindays() {
    return mindays;
  }

  public Cinema withMindays(Integer mindays) {
    this.mindays = mindays;
    return this;
  }

  public Integer getMaxdays() {
    return maxdays;
  }

  public Cinema withMaxdays(Integer maxdays) {
    this.maxdays = maxdays;
    return this;
  }

  @Override
  public String toString() {
    return new StringJoiner(", ", Cinema.class.getSimpleName() + "[", "]")
            .add("cinemaname='" + cinemaname + "'")
            .add("minaudience=" + minaudience)
            .add("maxaudience=" + maxaudience)
            .add("mindays=" + mindays)
            .add("maxdays=" + maxdays)
            .toString();
  }
}
