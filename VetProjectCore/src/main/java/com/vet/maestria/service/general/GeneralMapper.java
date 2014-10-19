package com.vet.maestria.service.general;

import java.util.List;

import com.vet.maestria.domain.general.LabelValue;

/**
 * Interface which contains each method used
 * to make a transaction with general values.
 * @author Edgardo Rosales
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
	List<LabelValue> getSpecies();

	/**
	 * Method used to retrieve all the status
	 * available from the db.
	 * @return
	 */
	List<LabelValue> getStatus();

}
