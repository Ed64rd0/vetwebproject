package com.vet.maestria.domain.general;

import java.util.List;

/**
 * Class used to represent the animal type
 * available for a pet.
 *
 */
public class Species {

	private int specieId;
	private String specieName;
	private List<LabelValue> races;

	public int getSpecieId() {
		return specieId;
	}

	public void setSpecieId(int specieId) {
		this.specieId = specieId;
	}

	public String getSpecieName() {
		return specieName;
	}

	public void setSpecieName(String specieName) {
		this.specieName = specieName;
	}

	public List<LabelValue> getRaces() {
		return races;
	}

	public void setRaces(List<LabelValue> races) {
		this.races = races;
	}

}