package com.demo.patterns.visitor;

public class ConcreteVisitor1 extends Visitor {

	@Override
	public void visitConcreteElementA(ConcreteElementA concreteElementA) {
		// TODO Auto-generated method stub
		System.out.printf("{%s} 被 {%s}访问",concreteElementA.getClass().getName(), this.getClass().getName());
		System.out.println();
	}

	@Override
	public void visitConcreteElementB(ConcreteElementB concreteElementB) {
		// TODO Auto-generated method stub
		System.out.printf("{%s} 被 {%s}访问",concreteElementB.getClass().getName(), this.getClass().getName());
		System.out.println();
	}

}
