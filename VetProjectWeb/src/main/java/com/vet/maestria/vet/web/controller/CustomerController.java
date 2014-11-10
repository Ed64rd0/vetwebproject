package com.vet.maestria.vet.web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.vet.maestria.domain.customer.Customer;
import com.vet.maestria.service.customer.ICustomerService;
import com.vet.maestria.vet.web.util.WebConstants;

/**
 * This controller is used to manage all the
 * request related with the customer.
 *
 */
@Controller
@RequestMapping(WebConstants.CUSTOMER)
public class CustomerController {

	@Autowired
	ICustomerService customerService;

	/**
	 * Rest service to manage the save customer
	 * process/request.
	 * @param customer
	 * @return 
	 */
	@RequestMapping(value=WebConstants.SAVE, method=RequestMethod.POST)
	public @ResponseBody Customer save(@RequestBody Customer customer) {
		customerService.saveCustomer(customer);
		return customer;
	}
}
