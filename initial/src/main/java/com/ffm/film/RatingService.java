package com.ffm.film;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class RatingService {

    private Map<Long,List<GenreActorMapping>> map = new HashMap<>();

    public List<GenreActorMapping> getGenreMappingForActor(Long id, String genre) {
        if(map.isEmpty())   {
            List<GenreActorMapping> actor1= new ArrayList<>();
            actor1.add(new GenreActorMapping("1-Western", 10));
            actor1.add(new GenreActorMapping("1-Western", 5));
            actor1.add(new GenreActorMapping("1-Western", 12));
            actor1.add(new GenreActorMapping("1-Western", 14));
            actor1.add(new GenreActorMapping("2-Comedy", 11));
            List<GenreActorMapping> actor2= new ArrayList<>();
            actor2.add(new GenreActorMapping("1-Western", 10));
            actor2.add(new GenreActorMapping("1-Western", 5));
            actor2.add(new GenreActorMapping("1-Western", 12));
            actor2.add(new GenreActorMapping("1-Western", 14));
            actor2.add(new GenreActorMapping("2-Comedy", 12));
            map.put(Long.valueOf(2), actor2);
        }
        return map.get(id);
    }

}
