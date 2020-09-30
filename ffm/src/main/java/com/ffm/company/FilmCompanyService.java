package com.ffm.company;

import com.ffm.actor.Actor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FilmCompanyService {

  @Autowired
  FilmCompanyDao filmCompanyDao;

  public FilmCompany getFilmConpanyById(Integer id) {

    return filmCompanyDao.getFilmCompany(id);
  }
  public List<FilmCompany> getCompanies() {

    return filmCompanyDao.getAllCompanys();
  }

}
