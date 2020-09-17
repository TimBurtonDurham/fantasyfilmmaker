package com.ffm.studio;

import com.ffm.FfmEntity;

import java.util.StringJoiner;

public class Studio extends FfmEntity {

    private String studioname;

    private Integer costperday;

    private Integer rating;

    public String getStudioname() {
        return studioname;
    }

    public Studio withStudioname(String studioname) {
        this.studioname = studioname;
        return this;
    }

    public Integer getCostperday() {
        return costperday;
    }

    public Studio withCostperday(Integer costperday) {
        this.costperday = costperday;
        return this;
    }

    // Rating is a SUM of all improvements from the STUDIO_ASSETS table for this studio id
    public Integer getRating() {
        return rating;
    }

    public Studio withRating(Integer rating) {
        this.rating = rating;
        return this;
    }

    @Override
    public String toString() {
        return new StringJoiner(", ", Studio.class.getSimpleName() + "[", "]")
                .add("studioname='" + studioname + "'")
                .add("costperday=" + costperday)
                .add("rating=" + rating)
                .toString();
    }
}
