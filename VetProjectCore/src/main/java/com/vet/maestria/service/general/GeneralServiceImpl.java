package com.vet.maestria.service.general;

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
	public Pet getPetInformation() {
		Pet pet = new Pet();
		pet.setGenders(generalMapper.getGenders());
		pet.setSpecies(generalMapper.getSpecies());
		pet.setServices(generalMapper.getServices());
		return pet;
	}

	public void setGeneralMapper(GeneralMapper generalMapper) {
		this.generalMapper = generalMapper;
	}
}