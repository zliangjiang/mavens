package com.demo.patterns.mediator.test;

public class Iraq extends Country {

	public Iraq(UnitedNations mediator) {
		super(mediator);
		// TODO Auto-generated constructor stub
	}
	
	public void declare(String message) {
		System.out.println("伊拉克发送消息:"+message);
		mediator.declare(message, this);
	}

	public void getMessage(String message) {
		System.out.println("伊拉克获得对方信息:"+message);
	}
}
