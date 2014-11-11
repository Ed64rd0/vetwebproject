package com.vet.maestria.service.general;

import java.util.List;

import com.vet.maestria.domain.pet.Pet;

/**
 * Interface used to represent the service layer
 * and this one has declared general methods.
 *
 */
public interface IGeneralService {

	/**
	 * Method to initialize the Pet array
	 * and can display the first form for a pet.
	 */
	public List<Pet> initializePetArray();

}
