package com.jet.crm.ws.service;

import java.util.List;

import com.jet.crm.ws.exceptions.InvalidDateFormatException;
import com.jet.crm.ws.exceptions.InvalidRequestException;
import com.jet.crm.ws.exceptions.InvalidTrackingCodeException;
import com.jet.crm.ws.model.WebtrackerModel;

public interface CallConversionWTService {
	public List<WebtrackerModel> getListWebtracker(String siteCode,String startDate, String enddate) throws InvalidTrackingCodeException, InvalidDateFormatException, InvalidRequestException;
}
