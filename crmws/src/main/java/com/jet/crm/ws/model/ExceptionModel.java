package com.jet.crm.ws.model;

public class ExceptionModel {
	private String code;
	private String status;
	private String messages;
	private String data;
	
	public ExceptionModel(){}
	
	

	public String getCode() {
		return code;
	}

	public ExceptionModel(String code, String status, String messages,
			String data) {
		super();
		this.code = code;
		this.status = status;
		this.messages = messages;
		this.data = data;
	}



	public void setCode(String code) {
		this.code = code;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getMessages() {
		return messages;
	}

	public void setMessages(String messages) {
		this.messages = messages;
	}

	public String getData() {
		return data;
	}

	public void setData(String data) {
		this.data = data;
	}
}
