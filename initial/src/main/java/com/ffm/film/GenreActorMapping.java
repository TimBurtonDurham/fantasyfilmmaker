package com.ffm.film;

public class GenreActorMapping {

    private String mappingid;
    private Integer rating;

    public GenreActorMapping(String mappingid, Integer rating) {
        this.mappingid = mappingid;
        this.rating = rating;
    }

    public Integer getRating() {
        return rating;
    }
}
