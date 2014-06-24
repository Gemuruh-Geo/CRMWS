package com.jet.crm.ws.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.jet.crm.ws.exceptions.InvalidDateFormatException;
import com.jet.crm.ws.exceptions.InvalidRequestException;
import com.jet.crm.ws.exceptions.InvalidTrackingCodeException;
import com.jet.crm.ws.model.WebtrackerModel;
import com.jet.crm.ws.service.CallConversionWTService;


@Controller
public class CallConversionWTController {
	
	@Autowired
	private CallConversionWTService wtService;
	
	@RequestMapping(value = {"/v1/conversions/{site}"}, method = RequestMethod.GET)
	public @ResponseBody List<WebtrackerModel> callConversionWebTracker(@PathVariable(value = "site") String site, HttpServletRequest request) throws InvalidTrackingCodeException, InvalidDateFormatException, InvalidRequestException {
		return wtService.getListWebtracker(site, request.getParameter("start"), request.getParameter("end"));
	}
}
