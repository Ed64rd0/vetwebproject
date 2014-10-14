package com.vet.maestria.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class NavigateVetController {

	@RequestMapping(value="/")
	public String getHome() {
		return "index";
	}
	
	@RequestMapping(value="/home", method=RequestMethod.GET)
	public String getApplicationHome() {
		return "vet/home";
	}
}
