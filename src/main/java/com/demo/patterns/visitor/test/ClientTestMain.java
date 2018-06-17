package com.demo.patterns.visitor.test;

public class ClientTestMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ObjectStructure o = new ObjectStructure();
		o.attach(new Man());
		o.attach(new Woman());
		
		Success v1 = new Success();
		o.display(v1);
		
		Failing v2 = new Failing();
		o.display(v2);
		
		Amativeness v3 = new Amativeness();
		o.display(v3);
	}

}
