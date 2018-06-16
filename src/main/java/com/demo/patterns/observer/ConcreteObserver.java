package com.demo.patterns.observer;

public class ConcreteObserver extends Observer {
	private String name;
	
	private String observerState;
	
	private ConcreteSubject subject;
	
	public ConcreteObserver(ConcreteSubject subject, String name) {
		this.subject = subject;
		this.name = name;
	}
	
	@Override
	public void update() {
		// TODO Auto-generated method stub
		observerState = subject.getSubjectState();
		System.out.println("观察者"+name+"的新状态是:"+observerState);
	}

	public ConcreteSubject getSubject() {
		return subject;
	}

	public void setSubject(ConcreteSubject subject) {
		this.subject = subject;
	}
}
