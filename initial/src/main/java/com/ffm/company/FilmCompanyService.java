package com.ffm.company;

import com.ffm.actor.Actor;
import com.ffm.bank.BankAccountService;
import com.ffm.film.Film;
import com.ffm.film.FilmService;
import com.ffm.film.GenreActorMapping;
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
        return "This is my service"+getCompanys();
    }

    private List<FilmCompany> getCompanys()   {
        List<FilmCompany> companys = new ArrayList<>();
        companys.add(new FilmCompany().withFilmCompanyName("Tims Company").withBankaccount(bankAccountService.getBankAccounts()).withFilms(filmService.getFilms()));
        FilmCompany daves_company = new FilmCompany().withFilmCompanyName("Daves Company").withBankaccount(bankAccountService.getBankAccounts()).withFilms(filmService.getFilms());
        List<Film> films = daves_company.getFilms();
        for (Film film : films) {
            List<Actor> actors = film.getActors();
            for (Actor actor : actors) {
                System.out.println("Ratings for Actor "+actor.getLastname());
                List<GenreActorMapping> western = ratingService.getGenreMappingForActor(actor.getId(), "Western");
                if (western!=null) {
                    for (GenreActorMapping actorMapping : western) {
                        if (actorMapping != null) {
                            System.out.println(actorMapping.getRating());
                        }
                    }
                }
            }
        }
        companys.add(daves_company);
        return companys;
    }

}
