package com.ffm.script;

import com.ffm.FfmEntity;

import java.util.StringJoiner;

public class Script extends FfmEntity {

  private String scriptitle;

  private String scripttagline;

  private String scriptfulltext;

  private String scriptbrief;

  private Integer hype;

  private Integer status;

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

  public Script withScripttagline(String scripttagline) {

    this.scripttagline = scripttagline;
    return this;
  }

  public String getScriptfulltext() {

    return scriptfulltext;
  }

  public Script withScriptfulltext(String scriptfulltext) {

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

  public Integer getStatus() {
    return status;
  }

  public Script withStatus(Integer status) {
    this.status = status;
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
            .add("status=" + status)
            .toString();
  }
}
