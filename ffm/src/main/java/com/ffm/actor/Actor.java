package com.ffm.actor;

import com.ffm.FfmEntity;
import java.util.StringJoiner;

public class Actor extends FfmEntity {

  private String firstname;

  private Integer rating;

  private String lastname;

  private String fullname;

  private Integer wage;

  private Integer hype;

  private String actorimage;

  private Integer filmid;

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

  public String getFullname() {
    return getFirstname()+' '+getLastname();
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

  public void setFirstname(String firstname) {

    this.firstname = firstname;
  }

  public void setRating(Integer rating) {

    this.rating = rating;
  }

  public void setLastname(String lastname) {

    this.lastname = lastname;
  }

  public void setWage(Integer wage) {

    this.wage = wage;
  }

  public void setHype(Integer hype) {

    this.hype = hype;
  }

  public void setActorimage(String actorimage) {

    this.actorimage = actorimage;
  }

  public Integer getFilmid() {

    return filmid;
  }

  public void setFilmid(Integer filmid) {

    this.filmid = filmid;
  }

  @Override
  public String toString() {

    return new StringJoiner(", ", Actor.class.getSimpleName() + "[", "]").add("firstname='" + firstname + "'")
        .add("rating=" + rating).add("lastname='" + lastname + "'").add("wage=" + wage).add("hype=" + hype)
        .add("actorimage=" + actorimage).toString();
  }
}
