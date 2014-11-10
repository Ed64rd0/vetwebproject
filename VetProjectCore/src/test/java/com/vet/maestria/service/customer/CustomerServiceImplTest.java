package com.vet.maestria.service.customer;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.verify;

import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import com.vet.maestria.domain.customer.Customer;

public class CustomerServiceImplTest {

	CustomerServiceImpl customerService;

	@Mock
	private CustomerMapper customerMapper;

	Customer customer;

	@Before
	public void setUp() {
		MockitoAnnotations.initMocks(this);
		customerService = new CustomerServiceImpl();
		customerService.setCustomerMapper(customerMapper);

		customer = setCustomer();
	}

	private Customer setCustomer() {
		Customer customer = new Customer();
		customer.setName("Carmen");
		customer.setLastName("Rodriguez");
		customer.setEmail("c.rdrgz@gmail.com");
		customer.setColony("Santa Fe");
		customer.setCel("8888-8888-88");
		return customer;
	}

	@Test
	public void testSaveCustomer_Insert() {
		customerService.saveCustomer(customer);

		assertEquals(0, customer.getId());
		verify(customerMapper).insertCustomer(customer);
	}

	@Test
	public void testSaveCustomer_Update() {
		customer.setId(1);
		customerService.saveCustomer(customer);

		assertEquals(1, customer.getId());
		verify(customerMapper).updateCustomer(customer);
	}
}
