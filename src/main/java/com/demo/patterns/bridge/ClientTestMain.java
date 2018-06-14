package com.demo.patterns.bridge;

public class ClientTestMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Abstraction ab = new Abstraction();
		
		ab.setImplementor(new ConcreteImplementorA());
		ab.Operation();
		
		ab.setImplementor(new ConcreteImplementorB());
		ab.Operation();
	}

}
