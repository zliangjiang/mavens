package com.demo.patterns.proxy.test;

import java.io.IOException;

public class ClientTestMain {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		SchoolGirl jiaojiao = new SchoolGirl();
		jiaojiao.setName("李娇娇");
		
		Proxy daili = new Proxy(jiaojiao);
		
		daili.giveDolls();
		daili.giveFlowers();
		daili.giveChocolate();
		byte[] b = new byte[10];
		System.in.read(b, 0, 10);
		String str = new String(b);
		System.out.println(str);
		
	}

}
