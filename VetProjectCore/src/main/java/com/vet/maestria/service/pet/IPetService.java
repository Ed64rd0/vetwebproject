package com.vet.maestria.service.pet;

import java.util.List;

import com.vet.maestria.domain.pet.Pet;

/**
 * Interface used to represent the service layer
 * and this one has declared pet methods.
 *
 */
public interface IPetService {

	/**
	 * Method used to save a pet.
	 * @param pet
	 */
	public void savePet(Pet pet);

	/**
	 * Method to retrieve all the pets
	 * for a specific customer.
	 * @param customerId
	 * @return
	 */
	public List<Pet> getPets(int customerId);

}
