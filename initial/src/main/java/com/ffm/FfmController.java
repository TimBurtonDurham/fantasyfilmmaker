package com.ffm;

import com.ffm.company.FilmCompanyService;
import com.ffm.film.FilmService;
import com.ffm.film.GenreActorMapping;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

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


