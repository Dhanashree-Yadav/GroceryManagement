package com.springboot.practice.response;

public class ErrorResponse {
	private String detail;
	private String statuscode;


	public ErrorResponse() {
		
	}


	public String getDetail() {
		return detail;
	}


	public void setDetail(String detail) {
		this.detail = detail;
	}


	public String getStatuscode() {
		return statuscode;
	}


	public void setStatuscode(String statuscode) {
		this.statuscode = statuscode;
	}


	

}