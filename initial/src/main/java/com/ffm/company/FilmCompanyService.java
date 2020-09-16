package com.ffm.company;

import com.ffm.actor.Actor;
import com.ffm.bank.BankAccountService;
import com.ffm.film.Film;
import com.ffm.film.FilmService;
import com.ffm.film.RatingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class FilmCompanyService {

    @Autowired
    FilmService filmService;

    @Autowired
    BankAccountService bankAccountService;

    @Autowired
    RatingService ratingService;

    public String greeting(){
        testDisplay();
        return "Check you logs";
    }

    private List<FilmCompany> testDisplay()   {
        List<FilmCompany> companys = new ArrayList<>();
        companys.add(new FilmCompany()
            .withFilmCompanyName("Tims Company")
            .withBankaccount(
                bankAccountService.getBankAccounts())
            .withFilms(filmService.getFilms()));
        FilmCompany daves_company = new FilmCompany()
            .withFilmCompanyName("Daves Company")
            .withBankaccount(
                bankAccountService
                    .getBankAccounts())
            .withFilms(filmService.getFilms());
        List<Film> films = daves_company.getFilms();
        for (Film film : films) {
            /*
            List through the films
             */
            System.out.println(film.getFilmtitle());
            List<Actor> actors = film.getActors();
            for (Actor actor : actors) {
                /*
                List throught the actors
                 */
                System.out.println("Ratings for Actor in a Western "+actor);
                checkRating(actor, "Western");
                checkRating(actor, "Action");
            }
        }
        companys.add(daves_company);
        return companys;
    }

    private void checkRating(Actor actor, String genre) {

        System.out.println("Checking rating for "+genre);
        List<Integer> western = ratingService.getGenreMappingForActor(actor.getId(), genre);
        Integer total = 0;
        if (western!=null) {
            for (Integer rating : western) {
                if (rating != null) {
                    total+=rating;
                }
            }
        }
        System.out.println("Rating is "+total);
    }

}
