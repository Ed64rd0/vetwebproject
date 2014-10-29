package com.vet.maestria.service.pet;

import org.springframework.beans.factory.annotation.Autowired;

/**
 * This class represents the service layer for Pet, here
 * are executed/called the transaction methods.
 *
 */
public class PetServiceImpl implements IPetService {

	@Autowired
	PetMapper petMapper;
}
