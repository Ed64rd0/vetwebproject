package com.vet.maestria.service.general;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

import com.vet.maestria.domain.pet.Pet;

/**
 * This class represents the service layer for General where
 * each list will get it values.
 *
 */
public class GeneralServiceImpl implements IGeneralService {

	@Autowired
	private GeneralMapper generalMapper;

	/**
	 * Method used to fill each list that will be
	 * use to complete the basic information of each pet.
	 */
	@Transactional
	private Pet getPetInformation() {
		Pet pet = new Pet();
		pet.setGenders(generalMapper.getGenders());
		pet.setSpecies(generalMapper.getSpecies());
		pet.setServices(generalMapper.getServices());
		return pet;
	}

	/**
	 * Method to initialize the Pet array
	 * and can display the first form for a pet.
	 */
	@Override
	public List<Pet> initializePetArray() {
		List<Pet> pets = new ArrayList<Pet>();
		pets.add(getPetInformation());
		return pets;
	}
}