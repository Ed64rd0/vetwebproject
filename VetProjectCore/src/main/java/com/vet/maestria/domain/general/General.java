package com.vet.maestria.domain.general;

import java.util.List;

/**
 * Class used to general purpose.
 *
 */
public class General {

	private List<LabelValue> genders;
	private List<Species> species;

	public List<LabelValue> getGenders() {
		return genders;
	}

	public void setGenders(List<LabelValue> genders) {
		this.genders = genders;
	}

	public List<Species> getSpecies() {
		return species;
	}

	public void setSpecies(List<Species> species) {
		this.species = species;
	}

}
