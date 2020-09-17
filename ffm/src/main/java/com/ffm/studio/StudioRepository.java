package com.ffm.studio;

import org.springframework.stereotype.Repository;
import javax.annotation.PostConstruct;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

// Used to be known as a DOM....
@Repository
public class StudioRepository {

  // test data
  Map<Integer, Studio> studios = new HashMap<>();

  /*
   * for test data only... remove if you have a databse PostConstruct is called when Sprint Boot starts up and the
   * StudioRepository is created for the first time
   */
  @PostConstruct
  private void init() {

    Studio studio1 = new Studio().withStudioname("Studio 1");
    studio1.setId(1);
    studios.put(1, studio1);

    Studio studio2 = new Studio().withStudioname("Studio 2");
    studio2.setId(2);
    studios.put(2, studio2);

    Studio studio3 = new Studio().withStudioname("Studio 3");
    studio3.setId(3);
    studios.put(3, studio3);
  }

  public List<Studio> getStudios() {

    // select * from studios
    return new ArrayList<>(studios.values());
  }

  public Studio getStudioById(Integer id) {

    // select * from actors where id=id
    return studios.get(id);
  }

  public void saveStudio(Studio studio) {

    Integer newId = studios.size();
    studio.setId(newId);
    studios.put(newId, studio);
  }

}
