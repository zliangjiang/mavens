package com.demo.patterns.bridge;

public class RefinedAbstraction extends Abstraction {
	public void Operation() {
		implementor.Operation();
	}
}
