package com.jet.crm.ws.exceptions;


public enum Exceptions {

	INVALID_REQUEST_EXCEPTION("Request cannot be fulfilled due to bad syntax", "400", "error", "InvalidRequestException"),
	INVALID_CALL_REF_EXCP("Exceptions for InvalidCallReferenceNoException","404","error","InvalidCallReferenceNoException"),
	INVALID_CONVERSIONID_EXCP("Exceptions for InvalidConversionIdException","404","error","InvalidConversionIdException"),
	INVALID_SESSIONID_EXCP("Exceptions for InvalidSessionIdException","404","error","InvalidSessionIdException"),
	INVALID_TRACKINGCODE_EXCP("Exceptions for InvalidTrackingCodeException","404","error","InvalidTrackingCodeException"),
	INVALID_ACCOUNTNO_EXCP("Exceptions for InvalidAccountNoException","404","error","InvalidAccountNoException"),
	INVALID_DATEFORMAT_EXCP("Exceptions for InvalidDateFormatException","500","error","InvalidDateFormatException");
	
	public String message;
	public String code;
	public String status;
	public String data;
	private Exceptions(String message,String code,String status,String data){
		this.message = message;
		this.code = code;
		this.status = status;
		this.data = data;
	}

}
