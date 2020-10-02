package com.ffm.cinema;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CinemaService {

  @Autowired
  CinemaDao cinemaDao;

  public List<Cinema> getCinemas() {

    return cinemaDao.getAllCinemas();
  }

  public Cinema getCinemaById(Integer id) {

    return cinemaDao.getCinema(id);
  }

}
