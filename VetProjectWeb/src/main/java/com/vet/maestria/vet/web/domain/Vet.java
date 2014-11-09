package com.vet.maestria.vet.web.domain;

import java.util.List;

import com.vet.maestria.domain.customer.Customer;
import com.vet.maestria.domain.pet.Pet;

public class Vet {

	private List<Pet> pets;
	private Customer customer;

	public List<Pet> getPets() {
		return pets;
	}

	public void setPets(List<Pet> pets) {
		this.pets = pets;
	}

	public Customer getCustomer() {
		return customer;
	}

	public void setCustomer(Customer customer) {
		this.customer = customer;
	}

}
