package com.demo.patterns.memento;

public class ClientTestMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Originator o = new Originator();
		o.setState("On");
		o.show();
		
		Caretaker c = new Caretaker();
		c.setMemento(o.CreateMemento());
		
		o.setState("Off");
		o.show();
		
		o.setMemento(c.getMemento());
		o.show();
		
		System.out.println("closed");
	}

}
