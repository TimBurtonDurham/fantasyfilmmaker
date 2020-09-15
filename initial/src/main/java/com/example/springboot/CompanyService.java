package com.example.springboot;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class CompanyService {

    @Autowired
    FilmService filmService;

    public String greeting(){
        return "This is my service"+getFilms();
    }

    private List<FilmCompany> getFilms()   {
        List<FilmCompany> companys = new ArrayList<>();
        companys.add(new FilmCompany().withFilmCompanyName("Tims Company").withFilms(filmService.filmtest()));
        companys.add(new FilmCompany().withFilmCompanyName("Daves Company").withFilms(filmService.filmtest()));
        return companys;
    }

}
