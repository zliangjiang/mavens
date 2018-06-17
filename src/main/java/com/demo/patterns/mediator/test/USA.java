package com.demo.patterns.mediator.test;

public class USA extends Country {

	public USA(UnitedNations mediator) {
		super(mediator);
		// TODO Auto-generated constructor stub
	}
	
	public void declare(String message) {
		System.out.println("美国发送对方消息"+message);
		mediator.declare(message, this);
	}
	
	public void getMessage(String message) {
		System.out.println("美国获得对方信息:"+message);
	}
}
