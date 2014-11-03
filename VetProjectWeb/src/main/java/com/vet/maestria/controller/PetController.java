package com.vet.maestria.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.vet.maestria.domain.vet.Response;
import com.vet.maestria.service.pet.IPetService;

/**
 * Controller used to manage all
 * the request from pet screen.
 *
 */
@Controller
@RequestMapping("/pet")
public class PetController {

	@Autowired
	IPetService petService;

	/**
	 * Controller used to retrieve all the
	 * races for a specific species.
	 * @param typeId
	 * @return
	 */
	@RequestMapping(value="/getRaces/{typeId}", method=RequestMethod.GET)
	public @ResponseBody Response getTypes(@PathVariable int typeId) {
		return new Response();
	}
}
