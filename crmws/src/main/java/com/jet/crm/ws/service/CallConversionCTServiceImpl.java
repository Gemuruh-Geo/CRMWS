package com.jet.crm.ws.service;

import java.sql.Timestamp;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.jet.crm.ws.dao.CallConversionTrackerDao;
import com.jet.crm.ws.exceptions.InvalidAccountNoException;
import com.jet.crm.ws.exceptions.InvalidCallReferenceNoException;
import com.jet.crm.ws.exceptions.InvalidDateFormatException;
import com.jet.crm.ws.model.calltracker.CallConclutionO;
import com.jet.crm.ws.model.calltracker.CallConversionCTOutput;
import com.jet.crm.ws.model.calltracker.CallConversionCallTrackerModel;
import com.jet.crm.ws.util.ComUtils;

@Service
@Transactional
public class CallConversionCTServiceImpl implements CallConversionCTService{
	@Autowired
	CallConversionTrackerDao calltrackerDao;
	@Override
	public List<CallConversionCallTrackerModel> getCallConversionsData(
			String site, String start, String end) throws InvalidDateFormatException, InvalidAccountNoException {
		
		/*
		 * 
		 * Validate URL In Here
		 * 
		 * */
		
		Timestamp startTms = null;
		Timestamp endTms = null;
		try {
			startTms = ComUtils.buildTimeStamp(start);
			endTms = ComUtils.buildTimeStamp(end);
		} catch (ParseException e) {
			throw new InvalidDateFormatException();
		}
		
		List<CallConversionCallTrackerModel> ctModels = calltrackerDao.getCallConversionsData(site, startTms, endTms);
		if(ctModels==null||ctModels.size()==0){
			throw new InvalidAccountNoException();
		}
		
		return ctModels;
	}
	@Override
	public CallConclutionO getCallConclutions(String call_ref_no) throws InvalidCallReferenceNoException {
		
		CallConclutionO co = calltrackerDao.getCallConclutions(call_ref_no);
		if(co==null){
			throw new InvalidCallReferenceNoException();
		}
		
		return co;
	}
	@Override
	public CallConversionCallTrackerModel getSingleCallConversionData(
			String call_ref_no) throws InvalidCallReferenceNoException {
		
		CallConversionCallTrackerModel cctm = calltrackerDao.getSingleCallConversionData(call_ref_no);
		if(cctm==null){
			throw new InvalidCallReferenceNoException();
		}
		
		return cctm;
	}
	@Override
	public List<CallConclutionO> getListOfCallConclutions(
			List<String> call_ref_nos) throws InvalidCallReferenceNoException {
		
		List<CallConclutionO> callConclutions = calltrackerDao.getListOfCallConclutions(call_ref_nos);
		if(callConclutions.size()==0){
			throw new InvalidCallReferenceNoException();
		}
		return callConclutions;
	}
	
	
	public List<CallConversionCTOutput> getCallConversionCallTrackerOutputList(String site, String start, String end) throws InvalidDateFormatException, InvalidAccountNoException, InvalidCallReferenceNoException{
		List<CallConversionCallTrackerModel> ctModels = this.getCallConversionsData(site, start, end);
		List<String> call_ref_nos = new ArrayList<>();
		for(CallConversionCallTrackerModel ctm:ctModels){
			call_ref_nos.add(ctm.getCall_ref_no());
		}
		List<CallConclutionO> cConclutionO = this.getListOfCallConclutions(call_ref_nos);
		
		
		Map<String, CallConclutionO> map = new HashMap<>();
		for(int i=0;i<call_ref_nos.size();i++){
			map.put(call_ref_nos.get(i), new CallConclutionO());
		}
		
		for(CallConclutionO co:cConclutionO){
			map.put(co.getCall_ref_no(), co);
		}
		List<CallConversionCTOutput> output = new ArrayList<>();
		for(CallConversionCallTrackerModel cm:ctModels){
			CallConversionCTOutput out= new CallConversionCTOutput();
			CallConclutionO co = map.get(cm.getCall_ref_no());
			out.setAccount_Number(cm.getAccount_Number());
			out.setAnswering_Point(cm.getAnswering_Point());
			out.setAnswering_Point_Location(cm.getAnswering_Point_Location());
			out.setCall_Date(cm.getCall_Date());
			out.setCall_Duration(cm.getCall_Duration());
			out.setCall_ref_no(cm.getCall_ref_no());
			out.setCall_Status(cm.getCall_Status());
			out.setCall_Type(cm.getCall_Type());
			out.setCallconclusion(co);
			out.setCaller_ID(cm.getCaller_ID());
			out.setCaller_Location(cm.getCaller_Location());
			out.setCost_Center(cm.getCost_Center());
			out.setDialed_Number(cm.getDialed_Number());
			out.setNumber_Type(cm.getNumber_Type());
			out.setService_Name(cm.getService_Name());
			
			output.add(out);
			
		}
		
		return output;
	}
	@Override
	public CallConversionCTOutput getSingleCallConvCTOutput(String call_ref_no) throws InvalidCallReferenceNoException {
		
		CallConversionCallTrackerModel ctmodel = this.getSingleCallConversionData(call_ref_no);
		CallConclutionO callConclution = this.getCallConclutions(call_ref_no);
		
		
		CallConversionCTOutput out = new CallConversionCTOutput();
		
		out.setAccount_Number(ctmodel.getAccount_Number());
		out.setAnswering_Point(ctmodel.getAnswering_Point());
		out.setAnswering_Point_Location(ctmodel.getAnswering_Point_Location());
		out.setCall_Date(ctmodel.getCall_Date());
		out.setCall_Duration(ctmodel.getCall_Duration());
		out.setCall_ref_no(ctmodel.getCall_ref_no());
		out.setCall_Status(ctmodel.getCall_Status());
		out.setCall_Type(ctmodel.getCall_Type());
		out.setCallconclusion(callConclution);
		out.setCaller_ID(ctmodel.getCaller_ID());
		out.setCaller_Location(ctmodel.getCaller_Location());
		out.setCost_Center(ctmodel.getCost_Center());
		out.setDialed_Number(ctmodel.getDialed_Number());
		out.setNumber_Type(ctmodel.getNumber_Type());
		out.setService_Name(ctmodel.getService_Name());
		
		return out;
	}

}
