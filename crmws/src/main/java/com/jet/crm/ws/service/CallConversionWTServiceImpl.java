package com.jet.crm.ws.service;

import java.sql.Timestamp;
import java.text.ParseException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.jet.crm.ws.dao.CallConversionWTDao;
import com.jet.crm.ws.exceptions.InvalidDateFormatException;
import com.jet.crm.ws.exceptions.InvalidRequestException;
import com.jet.crm.ws.exceptions.InvalidTrackingCodeException;
import com.jet.crm.ws.model.WebtrackerModel;
import com.jet.crm.ws.util.ComUtils;

@Service
@Transactional
public class CallConversionWTServiceImpl implements CallConversionWTService {

	@Autowired
	private CallConversionWTDao wtDao;

	@Override
	public List<WebtrackerModel> getListWebtracker(String siteCode, String startDate, String enddate) throws InvalidTrackingCodeException, InvalidDateFormatException, InvalidRequestException  {
		
		if (startDate == null || enddate == null) {
			throw new InvalidRequestException();
		}

		Timestamp start = null;
		Timestamp end = null;
		try {
			start = ComUtils.buildTimeStamp(startDate);
			end = ComUtils.buildTimeStamp(enddate);
		} catch (ParseException e) {
			throw new InvalidDateFormatException();
		}
		
		List<WebtrackerModel> result = wtDao.getListWebtracker(siteCode, start, end);
		
		if (result == null || result.size() == 0) {
			throw new InvalidTrackingCodeException();
		}
		
		return result;
	}
}

