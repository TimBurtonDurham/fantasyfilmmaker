package com.ffm.actor;

import org.springframework.stereotype.Repository;
import javax.annotation.PostConstruct;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

// Used to be known as a DOM....
@Repository
public class ActorRepository {

  // test data
  Map<Integer, Actor> actors = new HashMap<>();

  /*
   * for test data only... remove if you have a databse PostConstruct is called when Sprint Boot starts up and the
   * ActorRepository is created for the first time
   */
  @PostConstruct
  private void init() {

    Actor actor1 = new Actor().withFirstname("Dave").withRating(6).withLastname("Hampton").withWage(1000000);
    actor1.setId(1);
    actors.put(1, actor1);

    Actor actor2 = new Actor().withFirstname("Tim").withRating(600).withLastname("Durham").withWage(1000000);
    actor2.setId(2);
    actors.put(2, actor2);

    Actor actor3 = new Actor().withFirstname("Bob").withRating(65).withLastname("Hampton").withWage(1000000);
    actor3.setId(3);
    actors.put(3, actor3);
  }

  public List<Actor> getActors() {

    // select * from actors
    return new ArrayList<>(actors.values());
  }

  public Actor getActoById(Integer id) {

    // select * from actors where id=id
    return actors.get(id);
  }

  public void saveActor(Actor actor) {

    Integer newId = actors.size();
    actor.setId(newId);
    actors.put(newId, actor);
  }

}
