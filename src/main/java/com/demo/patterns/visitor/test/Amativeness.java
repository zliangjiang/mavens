package com.demo.patterns.visitor.test;

public class Amativeness extends Action {

	@Override
	public void getManConclusion(Man concreteElementA) {
		// TODO Auto-generated method stub
		System.out.printf("{%s} {%s}时 凡事不懂，也要装懂", concreteElementA.getClass().getName(), this.getClass().getName());
		System.out.println();
	}

	@Override
	public void getWomanConclusion(Woman concreteElementB) {
		// TODO Auto-generated method stub
		System.out.printf("{%s} {%s}时 遇事懂也要装作不懂", concreteElementB.getClass().getName(), this.getClass().getName());
		System.out.println();
	}

}
