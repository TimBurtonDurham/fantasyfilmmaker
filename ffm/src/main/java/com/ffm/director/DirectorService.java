package com.ffm.director;

import com.ffm.actor.Actor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DirectorService {

  @Autowired
  DirectorDao directorDao;

  public Director getDirectorById(Integer id) {

    return directorDao.getDirector(id);
  }

}
