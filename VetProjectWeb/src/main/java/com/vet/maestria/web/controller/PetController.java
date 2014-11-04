package com.vet.maestria.web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.vet.maestria.domain.pet.Pet;
import com.vet.maestria.service.pet.IPetService;
import com.vet.maestria.web.domain.vet.Response;

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
	@RequestMapping(value="/save", method=RequestMethod.POST)
	public @ResponseBody Response getTypes(@RequestBody Pet pet) {
		petService.savePet(pet);
		return new Response();
	}
}
