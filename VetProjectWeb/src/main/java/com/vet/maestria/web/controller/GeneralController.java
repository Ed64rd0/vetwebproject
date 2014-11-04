package com.vet.maestria.web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.vet.maestria.domain.general.General;
import com.vet.maestria.service.general.IGeneralService;
import com.vet.maestria.web.domain.vet.Response;
import com.vet.maestria.web.domain.vet.ResponseType;

/**
 * This controller is used to retrieve all the data
 * available in the drop downs.
 *
 */
@Controller
@RequestMapping("/vet")
public class GeneralController {

	@Autowired
	private IGeneralService generalService;

	/**
	 * In this method will retrieve all the options available
	 * for some drop downs.
	 * @return
	 */
	@RequestMapping(value="/general", method=RequestMethod.POST)
	public @ResponseBody Response getGeneralOptions() {
		General general = generalService.getGeneralOptions();
		return new Response(general, ResponseType.SUCCESS);
	}
}