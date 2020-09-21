package com.ffm;

import com.ffm.actor.Actor;
import com.ffm.actor.ActorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;
import javax.servlet.http.HttpServletRequest;

@Controller
public class RenderingController {

  @Autowired
  ActorService actorService;

  @Autowired
  protected HttpServletRequest request;

  @ModelAttribute
  public void getContextPath(Model model) {

    model.addAttribute("contextpath", request.getContextPath());
  }

  @GetMapping("/view/actor/{id}")
  public ModelAndView viewActor(@PathVariable Integer id) {

    Actor actor = actorService.getActorById(id);
    ModelAndView modelAndView = new ModelAndView("actor");
    modelAndView.addObject(actor);
    return modelAndView;
  }

  @PostMapping("/save/actor")
  public ModelAndView saveActor(@ModelAttribute("actor") Actor updatedActor, BindingResult bindingResult) {

    Actor actor = actorService.getActorById(updatedActor.getId()).withFirstname(updatedActor.getFirstname())
        .withLastname(updatedActor.getLastname());
    actorService.saveActor(actor);
    return new ModelAndView(String.format("redirect:%s/view/actor/%s", request.getContextPath(), actor.getId()));
  }

  @GetMapping("/edit/actor/{id}")
  public ModelAndView editActor(@PathVariable Integer id) {

    Actor actor = actorService.getActorById(id);
    ModelAndView modelAndView = new ModelAndView("edit-actor");
    modelAndView.addObject(actor);
    return modelAndView;
  }
}
