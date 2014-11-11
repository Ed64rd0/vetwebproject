package com.vet.maestria.service.general;

import java.util.List;

import com.vet.maestria.domain.general.LabelValue;
import com.vet.maestria.domain.general.Species;
import com.vet.maestria.domain.service.Service;

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
	 * Retrieve all the services available
	 * in the vet.
	 * @return
	 */
	List<Service> getServices();

}
