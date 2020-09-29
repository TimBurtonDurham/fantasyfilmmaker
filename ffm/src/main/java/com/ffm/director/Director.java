package com.ffm.director;

import com.ffm.FfmEntity;
import java.util.StringJoiner;

public class Director extends FfmEntity {

  private String firstname;

  private Integer rating;

  private String lastname;

  private Integer wage;

  private Integer hype;

  public String getFirstname() {

    return firstname;
  }

  public Director withFirstname(String firstname) {

    this.firstname = firstname;
    return this;
  }

  public Integer getRating() {

    return rating;
  }

  public Director withRating(Integer rating) {

    this.rating = rating;
    return this;
  }

  public String getLastname() {

    return lastname;
  }

  public Director withLastname(String lastname) {

    this.lastname = lastname;
    return this;
  }

  public Integer getWage() {

    return wage;
  }

  public Director withWage(Integer wage) {

    this.wage = wage;
    return this;
  }

  public Integer getHype() {

    return hype;
  }

  public Director withHype(Integer hype) {

    this.hype = hype;
    return this;
  }

  @Override
  public String toString() {

    return new StringJoiner(", ", Director.class.getSimpleName() + "[", "]").add("firstname='" + firstname + "'")
        .add("rating=" + rating).add("lastname='" + lastname + "'").add("wage=" + wage).add("hype=" + hype).toString();
  }
}
