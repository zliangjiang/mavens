package com.demo.patterns.bridge.test;

public class ClientTestMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HandsetBrand ab;
		ab = new HandsetBrandN();
		
		ab.setHandsetSoft(new HandsetGame());
		ab.run();
		
		ab.setHandsetSoft(new HandsetAddressList());
		ab.run();
		
		ab = new HandsetBrandM();
		
		ab.setHandsetSoft(new HandsetGame());
		ab.run();
		
		ab.setHandsetSoft(new HandsetAddressList());
		ab.run();
	}

}
