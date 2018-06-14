package com.demo.patterns.decorator.test;

public class ClientTestMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person xc = new Person("xiao cai");
		System.out.println("第一种装扮:");
		TShirts dts = new TShirts();
		BigTrouser bts = new BigTrouser();
		
		dts.decorate(xc);
		dts.show();
		System.out.println("");
		bts.decorate(dts);
		bts.show();
	}

}
