package com.jet.crm.ws.dao;

import java.sql.Timestamp;
import java.util.List;

import com.jet.crm.ws.model.WebtrackerModel;

public interface CallConversionWTDao {

	public List<WebtrackerModel> getListWebtracker(String siteCode, Timestamp startDate, Timestamp enddate);
}
