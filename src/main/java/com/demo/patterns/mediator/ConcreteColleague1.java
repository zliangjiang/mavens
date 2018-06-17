package com.demo.patterns.mediator;

public class ConcreteColleague1 extends Colleague {

	public ConcreteColleague1(Mediator mediator) {
		super(mediator);
		// TODO Auto-generated constructor stub
	}
	
	public void send(String message) {
		System.out.println("同事1发送信息为:"+message);
		this.mediator.send(message, this);
	}
	
	public void doNotify(String message) {
		System.out.println("同事1得到信息:"+message);
	}
}
