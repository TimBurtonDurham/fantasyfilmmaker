package com.example.springboot;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class CompanyService {

    @Autowired
    CompanyService CompanyService;

    public String greeting(){
        return "This is my service"+companytest();
    }

    private List<FilmCompany> companytest()   {
        List<FilmCompany> companys = new ArrayList<>();
        companys.add(new FilmCompany().withFilmCompanyName("Tims Company"));
        return companys;
    }

}
