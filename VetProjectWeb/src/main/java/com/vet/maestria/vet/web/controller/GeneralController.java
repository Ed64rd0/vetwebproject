package com.vet.maestria.vet.web.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.vet.maestria.domain.customer.Customer;
import com.vet.maestria.domain.pet.Pet;
import com.vet.maestria.service.general.IGeneralService;
import com.vet.maestria.vet.web.domain.Vet;
import com.vet.maestria.vet.web.util.WebConstants;

/**
 * Controller used to retrieve/initialize all the data
 * to create a new service.
 *
 */
@Controller
@RequestMapping(WebConstants.VET)
public class GeneralController {

	@Autowired
	private IGeneralService generalService;

	/**
	 * Method to get the basic information that will be displayed
	 * in the UI.
	 * @return
	 */
	@RequestMapping(value=WebConstants.GENERAL, method=RequestMethod.POST)
	public @ResponseBody Vet initializeApp() {
		Vet vet = new Vet();
		vet.setCustomer(new Customer());
		vet.setPets(initializePetArray());
		return vet;
	}

	/**
	 * Method to initialize the Pet array
	 * and can display a pet form.
	 */
	public List<Pet> initializePetArray() {
		List<Pet> pets = new ArrayList<Pet>();
		pets.add(generalService.getPetInformation());
		return pets;
	}
}