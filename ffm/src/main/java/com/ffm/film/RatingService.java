package com.ffm.film;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service public class RatingService {

    private final Map<String, List<Integer>> map = new HashMap<>();

    public List<Integer> getGenreMappingForActor(Integer id, String genreIn) {
        /*
         select rating from table where actor=id and genre=genreIn

         lets create some dummy data that returns a list - the key here is made up of id and genre (for testing only)
         */
        if (map.isEmpty()) {
            List<Integer> actor1 = new ArrayList<>();
            actor1.add(10);
            actor1.add(5);
            actor1.add(12);
            actor1.add(14);
            actor1.add(11);
            List<Integer> actor2 = new ArrayList<>();
            actor2.add(1);
            actor2.add(50);
            actor2.add(90);
            map.put("1-Western", actor1);
            map.put("2-Action", actor2);
        }
        List<Integer> integers = map.get(String.format("%s-%s", id, genreIn));
        return integers;
    }

}
