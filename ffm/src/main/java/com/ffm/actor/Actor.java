package com.ffm.actor;

import com.ffm.FfmEntity;
import java.util.StringJoiner;

public class Actor extends FfmEntity {

  private String firstname;

  private Integer rating;

  private String lastname;

  private Integer wage;

  private Integer hype;

  private String actorimage;

  public String getFirstname() {

    return firstname;
  }

  public Actor withFirstname(String firstname) {

    this.firstname = firstname;
    return this;
  }

  public Integer getRating() {

    return rating;
  }

  public Actor withRating(Integer rating) {

    this.rating = rating;
    return this;
  }

  public String getLastname() {

    return lastname;
  }

  public Actor withLastname(String lastname) {

    this.lastname = lastname;
    return this;
  }

  public Integer getWage() {

    return wage;
  }

  public Actor withWage(Integer wage) {

    this.wage = wage;
    return this;
  }

  public Integer getHype() {

    return hype;
  }

  public Actor withHype(Integer hype) {

    this.hype = hype;
    return this;
  }

  public String getActorimage() {

    return actorimage;
  }

  public Actor withActorimage(String actorimage) {

    this.actorimage = actorimage;
    return this;
  }

  @Override
  public String toString() {

    return new StringJoiner(", ", Actor.class.getSimpleName() + "[", "]").add("firstname='" + firstname + "'")
        .add("rating=" + rating).add("lastname='" + lastname + "'").add("wage=" + wage).add("hype=" + hype)
        .add("actorimage=" + actorimage).toString();
  }
}
