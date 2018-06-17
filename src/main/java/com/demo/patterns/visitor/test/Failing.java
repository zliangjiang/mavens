package com.demo.patterns.visitor.test;

public class Failing extends Action {

	@Override
	public void getManConclusion(Man concreteElementA) {
		// TODO Auto-generated method stub
		System.out.printf("{%s} {%s}时 闷头喝酒，谁也不用劝", concreteElementA.getClass().getName(), this.getClass().getName());
		System.out.println();
	}

	@Override
	public void getWomanConclusion(Woman concreteElementB) {
		// TODO Auto-generated method stub
		System.out.printf("{%s} {%s}时 眼泪汪汪，谁也劝不了", concreteElementB.getClass().getName(), this.getClass().getName());
		System.out.println();
	}

}
