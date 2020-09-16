package com.ffm.film;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class FilmGenreService {
    public List<FilmGenre> getGenres()    {
        List<FilmGenre> genres = new ArrayList<>();
        genres.add(new FilmGenre().withGenreName("Action"));
        genres.add(new FilmGenre().withGenreName("Western"));
        genres.add(new FilmGenre().withGenreName("Sci-Fi"));
        genres.add(new FilmGenre().withGenreName("Drama"));
        return genres;
    }

}
