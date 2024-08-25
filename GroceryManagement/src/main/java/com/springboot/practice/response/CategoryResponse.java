package com.springboot.practice.response;

public class CategoryResponse {
	private String message;
	private String status;
	private ErrorResponse response;

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public ErrorResponse getResponse() {
		return response;
	}

	public void setResponse(ErrorResponse response) {
		this.response = response;
	}

}
