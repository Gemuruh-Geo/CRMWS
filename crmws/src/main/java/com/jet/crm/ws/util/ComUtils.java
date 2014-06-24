package com.jet.crm.ws.util;

import java.sql.Timestamp;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.StringTokenizer;

import com.jet.crm.ws.exceptions.Exceptions;
import com.jet.crm.ws.exceptions.InvalidDateFormatException;
import com.jet.crm.ws.model.ExceptionModel;

public class ComUtils {
	
	public static Timestamp buildTimeStamp(String thedate) throws ParseException, InvalidDateFormatException{
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.SSZ");
		
		String[] thedates = thedate.split("T");
		
		String theDate = null;
		try{
			String years = thedates[0].substring(0, 4);
			String month = thedates[0].substring(4,6);
			String day = thedates[0].substring(6);
			
			String hours = thedates[1].substring(0,2);
			String minute = thedates[1].substring(2,4);
			String seconds = thedates[1].substring(4, 9);
			
			StringTokenizer stk = new StringTokenizer(sdf.format(new Date()), "+");
			String[] tokens = new String[stk.countTokens()];
			int i=0;
			while(stk.hasMoreTokens()){
				tokens[i] = stk.nextToken();
				i++;
			}
			
			theDate = years+"-"+month+"-"+day+" "+hours+":"+minute+":"+seconds+"+"+tokens[1];
			
		}catch(Exception ex){
			throw new InvalidDateFormatException();
		}
		
		System.out.println(theDate);
		
		Date date = sdf.parse(theDate);
		
		Timestamp timeStamp = new Timestamp(date.getTime());
		
		
		return timeStamp;
		
	}
	
	public static ExceptionModel contructExceptionModel(Exceptions exceptions){
		ExceptionModel em = null;
		switch(exceptions){
		case INVALID_ACCOUNTNO_EXCP:
			em = new ExceptionModel(Exceptions.INVALID_ACCOUNTNO_EXCP.code, Exceptions.INVALID_ACCOUNTNO_EXCP.status, Exceptions.INVALID_ACCOUNTNO_EXCP.message, Exceptions.INVALID_ACCOUNTNO_EXCP.data);
			break;
		case INVALID_CALL_REF_EXCP:
			em = new ExceptionModel(Exceptions.INVALID_CALL_REF_EXCP.code, Exceptions.INVALID_CALL_REF_EXCP.status, Exceptions.INVALID_CALL_REF_EXCP.message, Exceptions.INVALID_CALL_REF_EXCP.data);
			break;
		case INVALID_CONVERSIONID_EXCP:
			em = new ExceptionModel(Exceptions.INVALID_CONVERSIONID_EXCP.code, Exceptions.INVALID_CONVERSIONID_EXCP.status, Exceptions.INVALID_CONVERSIONID_EXCP.message, Exceptions.INVALID_CONVERSIONID_EXCP.data);
			break;
		case INVALID_SESSIONID_EXCP:
			em = new ExceptionModel(Exceptions.INVALID_SESSIONID_EXCP.code, Exceptions.INVALID_SESSIONID_EXCP.status, Exceptions.INVALID_SESSIONID_EXCP.message, Exceptions.INVALID_SESSIONID_EXCP.data);
			break;
		case INVALID_TRACKINGCODE_EXCP:
			em = new ExceptionModel(Exceptions.INVALID_TRACKINGCODE_EXCP.code, Exceptions.INVALID_TRACKINGCODE_EXCP.status, Exceptions.INVALID_TRACKINGCODE_EXCP.message, Exceptions.INVALID_TRACKINGCODE_EXCP.data);
			break;
		case INVALID_DATEFORMAT_EXCP:
			em = new ExceptionModel(Exceptions.INVALID_DATEFORMAT_EXCP.code, Exceptions.INVALID_DATEFORMAT_EXCP.status, Exceptions.INVALID_DATEFORMAT_EXCP.message, Exceptions.INVALID_DATEFORMAT_EXCP.data);
			break;
		case INVALID_REQUEST_EXCEPTION:
			em = new ExceptionModel(Exceptions.INVALID_REQUEST_EXCEPTION.code, Exceptions.INVALID_REQUEST_EXCEPTION.status, Exceptions.INVALID_REQUEST_EXCEPTION.message, Exceptions.INVALID_REQUEST_EXCEPTION.data);
			break;
		default:
			break;
		}
		
		return em;
	}

}
