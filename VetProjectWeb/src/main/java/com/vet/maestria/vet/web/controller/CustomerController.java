package com.vet.maestria.vet.web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.vet.maestria.service.customer.ICustomerService;

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
//	@RequestMapping(value="customer/save", method=RequestMethod.POST)
//	public @ResponseBody  save(@RequestBody Customer customer) {
//		customerService.saveCustomer(customer);
//		return new Response(customer, ResponseType.SUCCESS);
//	}
}
