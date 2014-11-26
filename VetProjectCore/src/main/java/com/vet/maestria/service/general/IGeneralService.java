package com.vet.maestria.service.general;

import com.vet.maestria.domain.pet.Pet;

/**
 * Interface used to represent the service layer
 * and this one has declared general methods.
 *
 */
public interface IGeneralService {

	/**
	 * Method to get a Pet object
	 * with the standard data.
	 * @return
	 */
	public Pet getPetInformation();

}
