package com.example.springboot;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class CompanyService {

    @Autowired
    FilmService filmService;
    @Autowired
    BankAccountService bankAccountService;

    public String greeting(){
        return "This is my service"+getCompanys();
    }

    private List<FilmCompany> getCompanys()   {
        List<FilmCompany> companys = new ArrayList<>();
        companys.add(new FilmCompany().withFilmCompanyName("Tims Company").withBankaccount(bankAccountService.getBankAccounts()).withFilms(filmService.getFilms()));
        companys.add(new FilmCompany().withFilmCompanyName("Daves Company").withBankaccount(bankAccountService.getBankAccounts()).withFilms(filmService.getFilms()));
        return companys;
    }

}
