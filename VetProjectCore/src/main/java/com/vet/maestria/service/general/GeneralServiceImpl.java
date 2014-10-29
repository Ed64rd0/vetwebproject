package com.vet.maestria.service.general;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

import com.vet.maestria.domain.general.General;

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
	 * use for the drop down options.
	 */
	@Transactional
	public General getGeneralOptions() {
		General general = new General();
		general.setGenders(generalMapper.getGenders());
		general.setSpecies(generalMapper.getSpecies());
		general.setStatus(generalMapper.getStatus());
		return general;
	}
	
}
