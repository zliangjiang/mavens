package com.demo.patterns.observer;

public class ClientTestMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ConcreteSubject s = new ConcreteSubject();
		
		s.attach(new ConcreteObserver(s,"X"));
		s.attach(new ConcreteObserver(s,"Y"));
		s.attach(new ConcreteObserver(s,"Z"));
		
		s.setSubjectState("ABC");
		s.doNotify();
	}

}
