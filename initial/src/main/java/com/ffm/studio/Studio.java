package com.ffm.studio;

public class Studio {
    private String studioname;

    public String getStudioname() {
        return studioname;
    }

    public Studio withStudioname(String studioname) {
        this.studioname = studioname;
        return this;
    }
}
