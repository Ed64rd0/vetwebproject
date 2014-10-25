package com.vet.maestria.service.customer;

import com.vet.maestria.domain.customer.Customer;

/**
 * Interface used to represent the service layer
 * and this one has declared customer methods.
 *
 */
public interface ICustomerService {

	/**
	 * Method used to insert or update
	 * customer information in the db. 
	 * @param customer
	 */
	void saveCustomer(Customer customer);

}
