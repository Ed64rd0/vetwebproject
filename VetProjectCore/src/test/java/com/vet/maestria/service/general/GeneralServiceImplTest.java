package com.vet.maestria.service.general;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.when;
import static org.mockito.Mockito.verify;

import java.util.ArrayList;
import java.util.List;

import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import com.vet.maestria.domain.general.LabelValue;
import com.vet.maestria.domain.general.Species;
import com.vet.maestria.domain.pet.Pet;
import com.vet.maestria.domain.service.Service;

public class GeneralServiceImplTest {

	GeneralServiceImpl generalService = new GeneralServiceImpl();

	@Mock
	GeneralMapper generalMapper;

	List<LabelValue> genders;

	List<Species> species;

	List<LabelValue> races;

	List<Service> services;

	@Before
	public void setUp() {
		MockitoAnnotations.initMocks(this);
		generalService.setGeneralMapper(generalMapper);
		genders = getGenders();
		species = getSpecies();
		services = getServices();
	}

	private List<LabelValue> getGenders() {
		List<LabelValue> genders = new ArrayList<LabelValue>();
		LabelValue gender1 = new LabelValue();
		gender1.setLabel("MALE");
		gender1.setValue(1);

		LabelValue gender2 = new LabelValue();
		gender2.setLabel("FEMALE");
		gender2.setValue(2);

		genders.add(gender1);
		genders.add(gender2);
		return genders;
	}

	private List<Species> getSpecies() {
		List<Species> species = new ArrayList<Species>();
		Species specie1 = new Species();
		specie1.setSpecieName("CAT");
		specie1.setSpecieId(1);
		specie1.setRaces(getCats());

		Species specie2 = new Species();
		specie2.setSpecieName("DOG");
		specie2.setSpecieId(2);
		specie2.setRaces(getDogs());

		species.add(specie1);
		species.add(specie2);
		return species;
	}

	private List<LabelValue> getCats() {
		List<LabelValue> cats = new ArrayList<LabelValue>();
		LabelValue cat1 = new LabelValue();
		cat1.setLabel("SIAMES");
		cat1.setValue(1);

		LabelValue cat2 = new LabelValue();
		cat2.setLabel("ANGORA");
		cat2.setValue(2);

		cats.add(cat1);
		cats.add(cat2);
		return cats;
	}

	private List<LabelValue> getDogs() {
		List<LabelValue> dogs = new ArrayList<LabelValue>();
		LabelValue dog1 = new LabelValue();
		dog1.setLabel("LABRADOR");
		dog1.setValue(1);

		LabelValue dog2 = new LabelValue();
		dog2.setLabel("CHIHUAHUA");
		dog2.setValue(2);

		dogs.add(dog1);
		dogs.add(dog2);
		return dogs;
	}

	private List<Service> getServices() {
		List<Service> services = new ArrayList<Service>();
		Service service1 = new Service();
		service1.setServiceId(1);
		service1.setServiceName("Baño");
		service1.setPrice(75.8);

		Service service2 = new Service();
		service2.setServiceId(2);
		service2.setServiceName("corte");
		service2.setPrice(100);

		services.add(service1);
		services.add(service2);
		return services;
	}

	@Test
	public void testInitializePetArray() {
		when(generalMapper.getGenders()).thenReturn(genders);
		when(generalMapper.getSpecies()).thenReturn(species);
		when(generalMapper.getServices()).thenReturn(services);

		List<Pet> pets = generalService.initializePetArray();

		assertEquals(1, pets.size());
		assertEquals(2, pets.get(0).getGenders().size());
		assertEquals(2, pets.get(0).getServices().size());
		assertEquals(2, pets.get(0).getSpecies().size());

		verify(generalMapper).getGenders();
		verify(generalMapper).getServices();
		verify(generalMapper).getSpecies();
	}
}