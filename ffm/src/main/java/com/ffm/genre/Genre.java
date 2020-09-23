package com.ffm.genre;

import com.ffm.FfmEntity;

import java.util.StringJoiner;

public class Genre extends FfmEntity {

  private String genrename;

  public String getGenrename() {

    return genrename;
  }

  public Genre withGenrename(String genrename) {

    this.genrename = genrename;
    return this;
  }

  @Override
  public String toString() {
    return new StringJoiner(", ", Genre.class.getSimpleName() + "[", "]")
            .add("genrename='" + genrename + "'")
            .toString();
  }
}
