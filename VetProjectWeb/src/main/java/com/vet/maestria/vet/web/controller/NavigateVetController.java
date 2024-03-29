package com.vet.maestria.vet.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * This class control the navigation of the app.
 *
 */
@Controller
public class NavigateVetController {

	/**
	 * If the path doesn't contain anything (/)
	 * the app will display the index.html.
	 * @return
	 */
	@RequestMapping(value="/")
	public String getHome() {
		return "index";
	}
	
	/**
	 * Rest service used to open the home.html.
	 * @return
	 */
	@RequestMapping(value="/home", method=RequestMethod.GET)
	public String getApplicationHome() {
		return "vet/home";
	}

	/**
	 * Rest service used to open the customer page.
	 * @return
	 */
	@RequestMapping(value="/customer", method=RequestMethod.GET)
	public String getCustomer() {
		return "vet/customer";
	}

	/**
	 * Rest service used to open the pet page.
	 * @return
	 */
	@RequestMapping(value="/pet", method=RequestMethod.GET)
	public String getPet() {
		return "vet/pet";
	}
}