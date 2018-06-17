package com.demo.patterns.visitor;

public class ConcreteElementB extends Element {

	@Override
	public void accept(Visitor visitor) {
		// TODO Auto-generated method stub
		visitor.visitConcreteElementB(this);
	}
	
	public void OperationB() {}

}
