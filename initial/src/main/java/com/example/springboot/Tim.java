package com.example.springboot;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class Tim {

	@Autowired
	TimService timService;



	@RequestMapping("/tim")
	public String index() {
		return "Hello Tim! "+timService.greeting();
	}

}


