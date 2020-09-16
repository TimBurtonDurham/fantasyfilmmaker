package com.ffm;

public abstract class FfmEntity {
    Long id;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
    public FfmEntity withId(Long id) {
        this.id = id;
        return this;
    }
}
