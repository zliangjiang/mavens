package com.demo.patterns.proxy.test;

public class Proxy implements IGiveGift {
	private Pursuit gg;
	
	public Proxy(SchoolGirl mm) {
		gg = new Pursuit(mm);
	}
	
	public void giveDolls() {
		// TODO Auto-generated method stub
		gg.giveDolls();
	}

	public void giveFlowers() {
		// TODO Auto-generated method stub
		gg.giveFlowers();
	}

	public void giveChocolate() {
		// TODO Auto-generated method stub
		gg.giveChocolate();
	}

}
