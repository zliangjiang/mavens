package com.demo.patterns.mediator.test;

public class ClientTestMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		UnitedNationsSecurityCouncil UNSC = new UnitedNationsSecurityCouncil();
		
		USA c1 = new USA(UNSC);
		Iraq c2 = new Iraq(UNSC);
		
		UNSC.setUSA(c1);
		UNSC.setIraq(c2);
		
		c1.declare("不准研制核武器，否则要发动战争!");
		c2.declare("我们没有核武器，也不怕侵略。");
	}

}
