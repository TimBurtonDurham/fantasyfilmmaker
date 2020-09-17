package com.ffm;

public abstract class FfmEntity {

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
