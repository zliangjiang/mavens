package com.demo.patterns.visitor;

public class ConcreteElementA extends Element {

	@Override
	public void accept(Visitor visitor) {
		// TODO Auto-generated method stub
		visitor.visitConcreteElementA(this);
	}
	
	public void OperationA() {}

}
