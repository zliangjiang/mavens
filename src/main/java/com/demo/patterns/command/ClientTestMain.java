package com.demo.patterns.command;

public class ClientTestMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Receiver r = new Receiver();
		Command c = new ConcreteCommand(r);
		Invoker i = new Invoker();
		
		i.setCommand(c);
		i.executeCommand();
		
	}

}
