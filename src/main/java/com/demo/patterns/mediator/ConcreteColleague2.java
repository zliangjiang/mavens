package com.demo.patterns.mediator;

public class ConcreteColleague2 extends Colleague {

	public ConcreteColleague2(Mediator mediator) {
		super(mediator);
		// TODO Auto-generated constructor stub
	}
	
	public void send(String message) {
		System.out.println("同事2发送信息为:"+message);
		this.mediator.send(message, this);
	}
	
	public void doNotify(String message) {
		System.out.println("同事2得到信息:"+message);
	}

}
