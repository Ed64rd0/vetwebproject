package com.vet.maestria.service.general;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

import com.vet.maestria.domain.general.General;
import com.vet.maestria.domain.general.LabelValue;
import com.vet.maestria.domain.general.Species;

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
		if (general.getSpecies() != null) {
			for(Species species: general.getSpecies()) {
				species.setRaces(getRaces(species.getSpecieId()));
			}
		}
		return general;
	}

	/**
	 * Method used to retrieve all the races
	 * available for a specific species. 
	 * @param speciesId
	 * @return
	 */
	private List<LabelValue> getRaces(int speciesId) {
		List<LabelValue> races = generalMapper.getRaces(speciesId);
		return races;
	}
}
