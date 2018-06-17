package com.demo.patterns.visitor;

public abstract class Visitor {
	public abstract void visitConcreteElementA(ConcreteElementA concreteElementA);
	
	public abstract void visitConcreteElementB(ConcreteElementB concreteElementB);
}
