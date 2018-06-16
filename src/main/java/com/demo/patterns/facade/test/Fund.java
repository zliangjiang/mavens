package com.demo.patterns.facade.test;

public class Fund {
	Stock1 stock1;
	Stock2 stock2;
	Stock3 stock3;
	NationalDebt1 nd1;
	Realty1 rt1;
	
	public Fund() {
		stock1 = new Stock1();
		stock2 = new Stock2();
		stock3 = new Stock3();
		nd1 = new NationalDebt1();
		rt1 = new Realty1();
	}
	
	public void buyFund() {
		stock1.buy();
		stock2.buy();
		stock3.buy();
		nd1.buy();
		rt1.buy();
	}
	
	public void sellFund() {
		stock1.sell();
		stock2.sell();
		stock3.sell();
		nd1.sell();
		rt1.sell();
	}
}
