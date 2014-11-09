package com.vet.maestria.vet.web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

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
//	@RequestMapping(value="/save", method=RequestMethod.POST)
//	public @ResponseBody  savePet(@RequestBody Pet pet) {
//		petService.savePet(pet);
//		return new Response();
//	}
//
//	@RequestMapping(value="/getPets/{customerId}", method=RequestMethod.GET)
//	public @ResponseBody Response getPets(@PathVariable int customerId) {
//		List<Pet> pets = petService.getPets(customerId);
//		return new Response();
//	}
}
