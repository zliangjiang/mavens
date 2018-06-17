package com.demo.patterns.visitor.test;

public class Woman extends Person {

	@Override
	public void accept(Action visitor) {
		// TODO Auto-generated method stub
		visitor.getWomanConclusion(this);
	}

}
