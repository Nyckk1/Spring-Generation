package com.objetivos.objetivos.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/objetivos")
public class objetivosController {
	
	@GetMapping
	public String objetivos() {
		return "Tenho como objetivo aprender os conceitos de Spring";
	}

}
