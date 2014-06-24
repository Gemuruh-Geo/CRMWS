package com.jet.crm.ws.exceptions;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

import com.jet.crm.ws.model.ExceptionModel;
import com.jet.crm.ws.util.ComUtils;

@ControllerAdvice
public class GlobalExceptionHandler {
	@ExceptionHandler(value=InvalidCallReferenceNoException.class)
	public @ResponseBody ExceptionModel invalidCallRefHandler(Exception ex){
		return ComUtils.contructExceptionModel(Exceptions.INVALID_CALL_REF_EXCP);
	}
	@ExceptionHandler(value=InvalidConversionIdException.class)
	public @ResponseBody ExceptionModel invalidConversionHandler(Exception ex){
		return ComUtils.contructExceptionModel(Exceptions.INVALID_CONVERSIONID_EXCP);
	}
	@ExceptionHandler(value=InvalidSessionIdException.class)
	public @ResponseBody  ExceptionModel invalidSessionIdHandler(Exception ex){
		return ComUtils.contructExceptionModel(Exceptions.INVALID_SESSIONID_EXCP);
	}
	@ExceptionHandler(value=InvalidTrackingCodeException.class)
	public @ResponseBody  ExceptionModel invalidTrackingCodeHandler(Exception ex){
		return ComUtils.contructExceptionModel(Exceptions.INVALID_TRACKINGCODE_EXCP);
	}
	@ExceptionHandler(value=InvalidAccountNoException.class)
	public @ResponseBody ExceptionModel invalidAccountNoHandler(Exception ex){
		return ComUtils.contructExceptionModel(Exceptions.INVALID_ACCOUNTNO_EXCP);
	}
	@ExceptionHandler(value=InvalidDateFormatException.class)
	public @ResponseBody ExceptionModel invalidDateFormatExcHandler(Exception ex){
		return ComUtils.contructExceptionModel(Exceptions.INVALID_DATEFORMAT_EXCP);
	}
	@ExceptionHandler(value=InvalidRequestException.class)
	public @ResponseBody ExceptionModel invalidRequestExcHandler(Exception ex) {
		return ComUtils.contructExceptionModel(Exceptions.INVALID_REQUEST_EXCEPTION);
	}
	
	
}
