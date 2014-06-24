package com.jet.crm.ws.dao;

import java.sql.Timestamp;
import java.util.List;

import com.jet.crm.ws.model.calltracker.CallConclutionO;
import com.jet.crm.ws.model.calltracker.CallConversionCallTrackerModel;

public interface CallConversionTrackerDao {
	public List<CallConversionCallTrackerModel>getCallConversionsData(String site,Timestamp start,Timestamp end);
	public CallConclutionO getCallConclutions(String call_ref_no);
	public List<CallConclutionO> getListOfCallConclutions(List<String> call_ref_nos);
	public CallConversionCallTrackerModel getSingleCallConversionData(String call_ref_no);
}
