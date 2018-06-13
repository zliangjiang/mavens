package com.demo.patterns.decorator;

public class ConcreteDecoratorA extends Decorator {
	private String addedState;
	
	public void Operation() {
		super.Operation();
		addedState = "New State";
		System.out.println("具体装饰对象A的操作"+ addedState);
	}
	
}
