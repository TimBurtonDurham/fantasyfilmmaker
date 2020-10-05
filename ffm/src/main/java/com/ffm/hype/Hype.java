package com.ffm.hype;

import com.ffm.FfmEntity;

import java.util.StringJoiner;

public class Hype extends FfmEntity {

  private String hypename;

  public String gethypename() {

    return hypename;
  }

  public Hype withHypename(String hypename) {

    this.hypename = hypename;
    return this;
  }

  @Override
  public String toString() {
    return new StringJoiner(", ", Hype.class.getSimpleName() + "[", "]")
            .add("hypename='" + hypename + "'")
            .toString();
  }
}
