package com.vet.maestria.service.general;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.vet.maestria.domain.general.LabelValue;
import com.vet.maestria.domain.general.Species;

/**
 * Interface which contains each method used
 * to make a transaction with general values.
 *
 */
public interface GeneralMapper {

	/**
	 * Method used to retrieve all the
	 * genders available from the db.
	 * @return
	 */
	List<LabelValue> getGenders();

	/**
	 * Method used to retrieve all the species
	 * available from the db.
	 * @return
	 */
	List<Species> getSpecies();

	/**
	 * Method used to retrieve all the races
	 * available for an animal type.
	 * @param speciesId
	 * @return
	 */
	List<LabelValue> getRaces(@Param("speciesId") int speciesId);

}
