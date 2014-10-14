package com.vet.maestria.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.vet.maestria.domain.Response;

/**
 * This controller is used to retrieve all the data
 * available in the drop downs.
 *
 */
@Controller
@RequestMapping("/vet")
public class GeneralController {

	@RequestMapping(value="/general", method=RequestMethod.POST)
	public @ResponseBody Response getGeneralOptions() {
		return new Response();
	}
}