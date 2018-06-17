package com.demo.patterns.visitor.test;

public abstract class Action {
	public abstract void getManConclusion(Man concreteElementA);
	
	public abstract void getWomanConclusion(Woman concreteElementB);
}
