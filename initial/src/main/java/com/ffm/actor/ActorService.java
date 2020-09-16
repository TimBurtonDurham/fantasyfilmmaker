package com.ffm.actor;

import com.ffm.FfmEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ActorService {

    @Autowired
    ActorRepository actorRepository;

    public List<Actor> getActors()    {
        return actorRepository.getActors();
    }

    public Actor getActoById(Integer id) {
        return actorRepository.getActoById(id);
    }

}
