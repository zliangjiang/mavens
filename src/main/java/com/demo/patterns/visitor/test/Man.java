package com.demo.patterns.visitor.test;

public class Man extends Person {

	@Override
	public void accept(Action visitor) {
		// TODO Auto-generated method stub
		visitor.getManConclusion(this);
	}
}
