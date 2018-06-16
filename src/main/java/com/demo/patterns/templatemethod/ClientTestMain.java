package com.demo.patterns.templatemethod;

public class ClientTestMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AbstractClass c;
		
		c = new ConcreteClassA();
		c.templateMethod();
		
		c = new ConcreteClassB();
		c.templateMethod();
		
	}

}
