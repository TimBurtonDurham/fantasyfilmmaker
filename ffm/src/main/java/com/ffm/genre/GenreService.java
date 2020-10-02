package com.ffm.genre;

import com.ffm.genre.Genre;
import com.ffm.film.FilmDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GenreService {

  @Autowired
  GenreDao genreDao;

  public List<Genre> getGenres() {

    return genreDao.getAllGenres();
  }

  public Genre getGenreById(Integer id) {

    return genreDao.getGenre(id);
  }
}
