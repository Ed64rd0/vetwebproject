package com.vet.maestria.service.customer;

import com.vet.maestria.domain.customer.Customer;

/**
 * This interface is used to declare all customer
 * transaction methods.
 *
 */
public interface CustomerMapper {

	/**
	 * Method used to update a customer.
	 * @param customer
	 */
	void updateCustomer(Customer customer);

	/**
	 * Method used to insert a new customer.
	 * @param customer
	 */
	void insertCustomer(Customer customer);

	/**
	 * Method used to retrieve all customer info
	 * for a specific id.
	 * @param id
	 * @return
	 */
	Customer getCustomer(int id);

}
