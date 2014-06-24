package com.jet.crm.ws.service;

import java.util.List;

import com.jet.crm.ws.exceptions.InvalidAccountNoException;
import com.jet.crm.ws.exceptions.InvalidCallReferenceNoException;
import com.jet.crm.ws.exceptions.InvalidDateFormatException;
import com.jet.crm.ws.model.calltracker.CallConclutionO;
import com.jet.crm.ws.model.calltracker.CallConversionCTOutput;
import com.jet.crm.ws.model.calltracker.CallConversionCallTrackerModel;

public interface CallConversionCTService {
	public List<CallConversionCallTrackerModel>getCallConversionsData(String site,String start,String end) throws InvalidDateFormatException,InvalidAccountNoException;
	public CallConclutionO getCallConclutions(String call_ref_no) throws InvalidCallReferenceNoException;
	public CallConversionCallTrackerModel getSingleCallConversionData(String call_ref_no)throws InvalidCallReferenceNoException;
	public List<CallConclutionO> getListOfCallConclutions(List<String> call_ref_nos)throws InvalidCallReferenceNoException;
	public List<CallConversionCTOutput> getCallConversionCallTrackerOutputList(String site, String start, String end) throws InvalidDateFormatException, InvalidAccountNoException, InvalidCallReferenceNoException;
	public CallConversionCTOutput getSingleCallConvCTOutput(String call_ref_no) throws InvalidCallReferenceNoException;
}
