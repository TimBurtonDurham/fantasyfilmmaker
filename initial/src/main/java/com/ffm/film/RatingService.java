package com.ffm.film;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class RatingService {

    private Map<String,List<Integer>> map = new HashMap<>();

    public List<Integer> getGenreMappingForActor(Long id, String genreIn) {
        /*
         select rating from table where actor=id and genre=genreIn

        TIM >> In real world scenario the SQL is
           select SUM(value) from ACTOR_GENRE_RATINGS where actor=id and genre=genreIn
           So there would only be one value being returned.

         lets create some dummy data that returns a list - the key here is made up of id and genre (for testing only)
         */
        if(map.isEmpty())   {
            List<Integer> actor1= new ArrayList<>();
            actor1.add(10);
            actor1.add(5);
            actor1.add(12);
            actor1.add(14);
            actor1.add(11);
            List<Integer> actor2= new ArrayList<>();
            actor2.add(1);
            actor2.add(50);
            actor2.add(90);
            map.put("1-Western", actor1);
            map.put("2-Action", actor2);
        }
        String key = String.format("%s-%s", id, genreIn);
    //    System.out.println("Keys in map currently "+map.keySet());
    //    System.out.println("Looking for key "+key);
        List<Integer> integers = map.get(key);
        System.out.println("Found "+integers);
        return integers;
    }

}
