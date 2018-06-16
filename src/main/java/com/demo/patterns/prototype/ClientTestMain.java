package com.demo.patterns.prototype;

public class ClientTestMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ConcretePrototype1 p1 = new ConcretePrototype1("I");
		ConcretePrototype1 c1 = (ConcretePrototype1)p1.clone();
		System.out.println("Cloned:"+c1.getID());
	}

}
