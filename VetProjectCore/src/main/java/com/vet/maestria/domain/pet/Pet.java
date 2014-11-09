package com.vet.maestria.domain.pet;

import java.util.List;

import com.vet.maestria.domain.general.LabelValue;
import com.vet.maestria.domain.general.Species;
import com.vet.maestria.domain.service.Service;

/**
 * Class used to represent a pet
 * with the data related.
 *
 */
public class Pet {

	private int petId;
	private String petName;
	private int speciesId;
	private int raceId;
	private int genderId;
	private int serviceselected;

	private List<LabelValue> genders;
	private List<Species> species;
	private List<Service> services;

	public int getPetId() {
		return petId;
	}

	public void setPetId(int petId) {
		this.petId = petId;
	}

	public String getPetName() {
		return petName;
	}

	public void setPetName(String petName) {
		this.petName = petName;
	}

	public int getSpeciesId() {
		return speciesId;
	}

	public void setSpeciesId(int speciesId) {
		this.speciesId = speciesId;
	}

	public int getRaceId() {
		return raceId;
	}

	public void setRaceId(int raceId) {
		this.raceId = raceId;
	}

	public int getGenderId() {
		return genderId;
	}

	public void setGenderId(int genderId) {
		this.genderId = genderId;
	}

	public int getServiceselected() {
		return serviceselected;
	}

	public void setServiceselected(int serviceselected) {
		this.serviceselected = serviceselected;
	}

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

	public List<Service> getServices() {
		return services;
	}

	public void setServices(List<Service> services) {
		this.services = services;
	}

}