package com.demo.patterns.adapter;

public class ClientTestMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Player b = new Forwards("巴蒂尔");
		b.attack();
	
		Player ym = new Translator("姚明");
		ym.attack();
		
	}

}
