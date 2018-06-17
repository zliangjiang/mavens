package com.demo.patterns.chainofresponsibility.test;

public class Request {
	private String requestType;
	
	private String requestContent;
	
	private int number;

	public String getRequestType() {
		return requestType;
	}

	public void setRequestType(String requestType) {
		this.requestType = requestType;
	}

	public String getRequestContent() {
		return requestContent;
	}

	public void setRequestContent(String requestContent) {
		this.requestContent = requestContent;
	}

	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}
	
	public Request(String type, String content, int count) {
		this.requestType = type;
		this.requestContent = content;
		this.number = count;
	}
	
	public Request() {
		this.requestType = "";
		this.requestContent = "";
		this.number = 0;
	}
}
