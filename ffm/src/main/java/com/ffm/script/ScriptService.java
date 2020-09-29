package com.ffm.script;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ScriptService {

  @Autowired
  ScriptDao scriptDao;

  public Script getScriptById(Integer id) {

    return scriptDao.getScript(id);
  }

}
