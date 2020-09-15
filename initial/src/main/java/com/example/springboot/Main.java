package com.example.springboot;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class Main {

	@Autowired
	FilmService filmService;
	@Autowired
	CompanyService companyService;



	@RequestMapping("/tim")
	public String index() {
		return "Films "+ filmService.greeting()+"<br><br>Film Company "+companyService.greeting();
	}


}


