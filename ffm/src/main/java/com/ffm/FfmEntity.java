package com.ffm;

import java.io.Serializable;

public abstract class FfmEntity implements Serializable {

  Integer id;

 // Maybe should be boolean??
  Integer deleted;

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


  public Integer getDeleted() {

      return deleted;
  }

  public void setDeleted(Integer id)  {

      this.deleted = deleted;
  }

  public FfmEntity withDeleted(Integer id)  {
    this.deleted=deleted;
    return this;
  }


}
