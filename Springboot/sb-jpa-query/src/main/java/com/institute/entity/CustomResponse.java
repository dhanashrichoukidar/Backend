package com.institute.entity;

public class CustomResponse {
	
	private int code;
	private Object result;
	private String message;
	
	public CustomResponse(int code, String message) {
		this.code = code;
		this.message = message;
	}
	public CustomResponse(int code, Object result, String message) {
		this.code = code;
		this.result = result;
		this.message = message;
	}
	public int getCode() {
		return code;
	}
	public void setCode(int code) {
		this.code = code;
	}
	public Object getResult() {
		return result;
	}
	public void setResult(Object result) {
		this.result = result;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
}