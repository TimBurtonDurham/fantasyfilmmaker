package com.ffm.actor;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class ActorService {

  @Autowired
  ActorRepository actorRepository;

  @Autowired
  ActorDao actorDao;

  public List<Actor> getActors() {

    return actorRepository.getActors();
  }

  public Actor getActorById(Integer id) {

    return actorDao.getActor(id);
  }

  public void saveActor(Actor actor) {
    // do something to save to DB

  }
}
