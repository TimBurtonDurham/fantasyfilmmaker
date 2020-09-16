package com.ffm;

import com.ffm.company.FilmCompanyService;
import com.ffm.film.FilmService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FfmController {

	@Autowired
	FilmService filmService;
	@Autowired
	FilmCompanyService filmCompanyService;

	@RequestMapping("/tim")
	public String index() {
		return "Film Company "+ filmCompanyService.greeting();
	}


}


