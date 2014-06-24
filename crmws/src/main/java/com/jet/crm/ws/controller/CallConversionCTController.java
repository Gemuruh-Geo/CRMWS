package com.jet.crm.ws.controller;

import java.text.ParseException;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.jet.crm.ws.exceptions.InvalidCallReferenceNoException;
import com.jet.crm.ws.model.calltracker.CallConversionCTOutput;
import com.jet.crm.ws.service.CallConversionCTService;

@Controller
public class CallConversionCTController {
	
	@Autowired
	private CallConversionCTService calltrackerServ;
	
	@RequestMapping(value={"/v1/calls/{site}","/v1/calls.xml/{site}"},method=RequestMethod.GET)
	public @ResponseBody List<CallConversionCTOutput> callConversionCallTracker (
			@PathVariable String site,
			HttpServletRequest request,
			HttpServletResponse response) throws Exception,ParseException{
		
		
	
		String start = request.getParameter("start");
		String end = request.getParameter("end");
		
		return calltrackerServ.getCallConversionCallTrackerOutputList(site, start, end);
	}
	
	@RequestMapping(value={"/v1/calls/ref/{call_ref_no}"},method=RequestMethod.GET)
	public @ResponseBody CallConversionCTOutput callConclution(@PathVariable String call_ref_no) throws InvalidCallReferenceNoException{
		return calltrackerServ.getSingleCallConvCTOutput(call_ref_no);
	}
	
	
}
