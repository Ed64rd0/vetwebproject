package com.vet.maestria.vet.web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.vet.maestria.domain.customer.Customer;
import com.vet.maestria.service.general.IGeneralService;
import com.vet.maestria.vet.web.domain.Vet;

/**
 * This controller is used to retrieve all the data
 * to create a service record.
 *
 */
@Controller
@RequestMapping("/vet")
public class GeneralController {

	@Autowired
	private IGeneralService generalService;

	/**
	 * Method to get the basic information to start a new service.
	 * @return
	 */
	@RequestMapping(value="/general", method=RequestMethod.POST)
	public @ResponseBody Vet initializeApp() {
		Vet vet = new Vet();
		vet.setCustomer(new Customer());
		vet.setPets(generalService.initializePetArray());
		return vet;
	}
}