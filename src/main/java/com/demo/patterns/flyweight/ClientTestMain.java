package com.demo.patterns.flyweight;

public class ClientTestMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int extrinsicstate = 22;
		
		FlyweightFactory f = new FlyweightFactory();
		
		Flyweight fx = f.getFlyweight("X");
		fx.Operation(--extrinsicstate);
		
		Flyweight fy = f.getFlyweight("Y");
		fy.Operation(--extrinsicstate);
		
		Flyweight fz = f.getFlyweight("Z");
		fz.Operation(--extrinsicstate);
		
		Flyweight uf = new UnsharedConcreteFlyweight();
		uf.Operation(--extrinsicstate);
	}

}
