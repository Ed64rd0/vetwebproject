package com.vet.maestria.service.pet;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

import com.vet.maestria.domain.pet.Pet;

/**
 * This class represents the service layer for Pet, here
 * are executed/called the transaction methods.
 *
 */
public class PetServiceImpl implements IPetService {

	@Autowired
	PetMapper petMapper;

	/**
	 * This method contains the flow to insert/update
	 * a pet in the DB.
	 */
	@Transactional
	public void savePet(Pet pet) {
		petMapper.savePet(pet);
	}

	/**
	 * Retrieve all the pets for a customer.
	 * @param customerId
	 * @return
	 */
	@Transactional
	public List<Pet> getPets(int customerId) {
		List<Pet> pets = petMapper.getPets(customerId);
		return pets;
	}
}
