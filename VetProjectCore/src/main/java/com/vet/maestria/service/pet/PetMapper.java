package com.vet.maestria.service.pet;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.vet.maestria.domain.pet.Pet;

/**
 * Interface which contains each method used
 * to make a transaction related with the pet object.
 *
 */
public interface PetMapper {

	/**
	 * Method used to save a pet.
	 * @param pet
	 */
	public void savePet(@Param("pet") Pet pet);

	/**
	 * Method used to retrieve all the pets
	 * for a specific customer.
	 * @param customerId
	 * @return
	 */
	public List<Pet> getPets(@Param("customerId") int customerId);

}
