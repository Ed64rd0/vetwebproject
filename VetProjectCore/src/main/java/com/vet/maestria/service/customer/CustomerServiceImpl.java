package com.vet.maestria.service.customer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

import com.vet.maestria.domain.customer.Customer;

/**
 * This class represent the service layer, it implements
 * all the methods related with customer and the transaction
 * methods are executed from here.
 *
 */
public class CustomerServiceImpl implements ICustomerService {

	@Autowired
	CustomerMapper customerMapper;

	/**
	 * @see ICustomerService
	 */
	@Transactional
	public void saveCustomer(Customer customer) {
		if (customerMapper.getCustomer(customer.getId())  == null) {
			customerMapper.insertCustomer(customer);
		} else {
			customerMapper.updateCustomer(customer);
		}
	}

	public void setCustomerMapper(CustomerMapper customerMapper) {
		this.customerMapper = customerMapper;
	}

}
