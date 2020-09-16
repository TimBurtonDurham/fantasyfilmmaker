package com.ffm.company;

import com.ffm.bank.BankAccountService;
import com.ffm.film.FilmService;
import com.ffm.film.RatingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service public class FilmCompanyService {

    @Autowired FilmService filmService;

    @Autowired BankAccountService bankAccountService;

    @Autowired RatingService ratingService;

    public List<FilmCompany> getCompanies() {

        List<FilmCompany> companys = new ArrayList<>();
        companys.add(new FilmCompany().withFilmCompanyName("Tims Company").withBankaccount(bankAccountService.getBankAccounts()).withFilms(filmService.getFilms()));
        companys.add(new FilmCompany().withFilmCompanyName("Daves Company").withBankaccount(bankAccountService.getBankAccounts()).withFilms(filmService.getFilms()));
        return companys;
    }

}
