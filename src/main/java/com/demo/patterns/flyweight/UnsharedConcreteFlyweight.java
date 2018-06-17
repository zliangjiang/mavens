package com.demo.patterns.flyweight;

public class UnsharedConcreteFlyweight extends Flyweight {

	@Override
	public void Operation(int extrinsicstate) {
		// TODO Auto-generated method stub
		System.out.println("不共享的具体Flyweight:"+extrinsicstate);
	}

}
