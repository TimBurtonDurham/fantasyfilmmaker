package com.ffm.studio;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class StudioService {

  @Autowired
  StudioDao studioDao;

  public List<String> getStudios() {
    return studioDao.getAllStudios();
  }

  public Studio getStudioById(Integer id) {

    return studioDao.getStudio(id);
  }

}
