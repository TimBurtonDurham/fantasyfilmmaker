package com.ffm.director;

import org.springframework.stereotype.Service;

@Service public class DirectorService {

    public Director getDirectors() {

        return new Director().withFirstname("Alfred").withRating(6).withLastname("Hitchcock").withWage(1000000);
    }

}
