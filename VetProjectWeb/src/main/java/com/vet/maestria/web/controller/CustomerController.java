package com.vet.maestria.web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.vet.maestria.domain.customer.Customer;
import com.vet.maestria.service.customer.ICustomerService;
import com.vet.maestria.web.domain.vet.Response;
import com.vet.maestria.web.domain.vet.ResponseType;

/**
 * This controller is used to control all the
 * request related with the customer.
 *
 */
@Controller
public class CustomerController {

	@Autowired
	ICustomerService customerService;

	/**
	 * This rest service receive the save (insert/update)
	 * customer request.
	 * @param customer
	 * @return 
	 */
	@RequestMapping(value="customer/save", method=RequestMethod.POST)
	public @ResponseBody Response save(@RequestBody Customer customer) {
		customerService.saveCustomer(customer);
		return new Response(customer, ResponseType.SUCCESS);
	}
}
