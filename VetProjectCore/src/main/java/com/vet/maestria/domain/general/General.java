package com.vet.maestria.domain.general;

import java.util.List;

public class General {

	private List<LabelValue> genders;
	private List<LabelValue> species;
	private List<LabelValue> status;

	public List<LabelValue> getGenders() {
		return genders;
	}

	public void setGenders(List<LabelValue> genders) {
		this.genders = genders;
	}

	public List<LabelValue> getSpecies() {
		return species;
	}

	public void setSpecies(List<LabelValue> species) {
		this.species = species;
	}

	public List<LabelValue> getStatus() {
		return status;
	}

	public void setStatus(List<LabelValue> status) {
		this.status = status;
	}

}
