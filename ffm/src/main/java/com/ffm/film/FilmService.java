package com.ffm.film;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class FilmService {

  @Autowired
  FilmDao filmDao;

  public List<Film> getFilms() {
    return filmDao.getAllFilms();
  }

  public Film getFilmById(Integer id) {

    return filmDao.getFilm(id);
  }
}
