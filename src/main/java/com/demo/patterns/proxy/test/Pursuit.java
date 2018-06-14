package com.demo.patterns.proxy.test;

public class Pursuit implements IGiveGift {

	private SchoolGirl mm;
	
	public Pursuit(SchoolGirl mm) {
		this.mm  = mm;
	}
	
	public void giveDolls() {
		// TODO Auto-generated method stub
		System.out.println(mm.getName() + "送你洋娃娃");
	}

	public void giveFlowers() {
		// TODO Auto-generated method stub
		System.out.println(mm.getName() + "送你鲜花");
	}

	public void giveChocolate() {
		// TODO Auto-generated method stub
		System.out.println(mm.getName() + "送你巧克力");
	}

}
