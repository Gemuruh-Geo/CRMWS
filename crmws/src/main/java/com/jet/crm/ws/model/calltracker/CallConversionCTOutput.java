package com.jet.crm.ws.model.calltracker;

public class CallConversionCTOutput {
	//conversion
	private String call_ref_no;
	private String dialed_Number;
	private String answering_Point;
	private String answering_Point_Location;
	private String service_Name;
	private String caller_ID;
	private String caller_Location;
	private String cost_Center;
	private String call_Type;
	private String call_Status;
	private String call_Duration;
	private String call_Date;
	private String account_Number;
	private String number_Type;
	
	private CallConclutionO callconclusion;
	
	public CallConversionCTOutput(){
		
	}
	
	
	public CallConversionCTOutput(String call_ref_no, String dialed_Number,
			String answering_Point, String answering_Point_Location,
			String service_Name, String caller_ID, String caller_Location,
			String cost_Center, String call_Type, String call_Status,
			String call_Duration, String call_Date, String account_Number,
			String number_Type, CallConclutionO callconclusion) {
		super();
		this.call_ref_no = call_ref_no;
		this.dialed_Number = dialed_Number;
		this.answering_Point = answering_Point;
		this.answering_Point_Location = answering_Point_Location;
		this.service_Name = service_Name;
		this.caller_ID = caller_ID;
		this.caller_Location = caller_Location;
		this.cost_Center = cost_Center;
		this.call_Type = call_Type;
		this.call_Status = call_Status;
		this.call_Duration = call_Duration;
		this.call_Date = call_Date;
		this.account_Number = account_Number;
		this.number_Type = number_Type;
		this.callconclusion = callconclusion;
	}


	public String getCall_ref_no() {
		return call_ref_no;
	}

	public void setCall_ref_no(String call_ref_no) {
		this.call_ref_no = call_ref_no;
	}

	public String getDialed_Number() {
		return dialed_Number;
	}

	public void setDialed_Number(String dialed_Number) {
		this.dialed_Number = dialed_Number;
	}

	public String getAnswering_Point() {
		return answering_Point;
	}

	public void setAnswering_Point(String answering_Point) {
		this.answering_Point = answering_Point;
	}

	public String getAnswering_Point_Location() {
		return answering_Point_Location;
	}

	public void setAnswering_Point_Location(String answering_Point_Location) {
		this.answering_Point_Location = answering_Point_Location;
	}

	public String getService_Name() {
		return service_Name;
	}

	public void setService_Name(String service_Name) {
		this.service_Name = service_Name;
	}

	public String getCaller_ID() {
		return caller_ID;
	}

	public void setCaller_ID(String caller_ID) {
		this.caller_ID = caller_ID;
	}

	public String getCaller_Location() {
		return caller_Location;
	}

	public void setCaller_Location(String caller_Location) {
		this.caller_Location = caller_Location;
	}

	public String getCost_Center() {
		return cost_Center;
	}

	public void setCost_Center(String cost_Center) {
		this.cost_Center = cost_Center;
	}

	public String getCall_Type() {
		return call_Type;
	}

	public void setCall_Type(String call_Type) {
		this.call_Type = call_Type;
	}

	public String getCall_Status() {
		return call_Status;
	}

	public void setCall_Status(String call_Status) {
		this.call_Status = call_Status;
	}

	public String getCall_Duration() {
		return call_Duration;
	}

	public void setCall_Duration(String call_Duration) {
		this.call_Duration = call_Duration;
	}

	public String getCall_Date() {
		return call_Date;
	}

	public void setCall_Date(String call_Date) {
		this.call_Date = call_Date;
	}

	public String getAccount_Number() {
		return account_Number;
	}

	public void setAccount_Number(String account_Number) {
		this.account_Number = account_Number;
	}

	public String getNumber_Type() {
		return number_Type;
	}

	public void setNumber_Type(String number_Type) {
		this.number_Type = number_Type;
	}

	public CallConclutionO getCallconclusion() {
		return callconclusion;
	}

	public void setCallconclusion(CallConclutionO callconclusion) {
		this.callconclusion = callconclusion;
	}

	
}
