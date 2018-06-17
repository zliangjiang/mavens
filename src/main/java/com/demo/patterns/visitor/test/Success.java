package com.demo.patterns.visitor.test;

public class Success extends Action {

	@Override
	public void getManConclusion(Man concreteElementA) {
		// TODO Auto-generated method stub
		System.out.printf("{%s} {%s}时 背后多半有一个伟大的女人", concreteElementA.getClass().getName(), this.getClass().getName());
		System.out.println();
	}

	@Override
	public void getWomanConclusion(Woman concreteElementB) {
		// TODO Auto-generated method stub
		System.out.printf("{%s} {%s}时 背后大多有一个不成功的男人", concreteElementB.getClass().getName(), this.getClass().getName());
		System.out.println();
	}

}
