package com.ffm;

import java.io.Serializable;

public abstract class FfmEntity implements Serializable {

  Integer id;

  public Integer getId() {

    return id;
  }

  public void setId(Integer id) {

    this.id = id;
  }

  public FfmEntity withId(Integer id) {

    this.id = id;
    return this;
  }
}
