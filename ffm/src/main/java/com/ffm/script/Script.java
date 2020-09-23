package com.ffm.script;

import java.util.StringJoiner;

public class Script {

  private String scriptitle;

  private String scripttagline;

  private String scriptfulltext;

  private String scriptbrief;

  private Integer hype;

  public String getScriptitle() {

    return scriptitle;
  }

  public Script withScriptitle(String scriptitle) {

    this.scriptitle = scriptitle;
    return this;
  }

  public String getScripttagline() {

    return scripttagline;
  }

  public Script setScripttagline(String scripttagline) {

    this.scripttagline = scripttagline;
    return this;
  }

  public String getScriptfulltext() {

    return scriptfulltext;
  }

  public Script setScriptfulltext(String scriptfulltext) {

    this.scriptfulltext = scriptfulltext;
    return this;
  }

  public String getScriptbrief() {

    return scriptbrief;
  }

  public Script setScriptbrief(String scriptbrief) {

    this.scriptbrief = scriptbrief;
    return this;
  }

  public Integer getHype() {

    return hype;
  }

  public Script withHype(Integer hype) {

    this.hype = hype;
    return this;
  }

  @Override
  public String toString() {
    return new StringJoiner(", ", Script.class.getSimpleName() + "[", "]")
            .add("scriptitle='" + scriptitle + "'")
            .add("scripttagline='" + scripttagline + "'")
            .add("scriptfulltext='" + scriptfulltext + "'")
            .add("scriptbrief='" + scriptbrief + "'")
            .add("hype=" + hype)
            .toString();
  }
}
