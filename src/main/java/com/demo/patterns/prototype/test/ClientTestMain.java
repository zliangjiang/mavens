package com.demo.patterns.prototype.test;

public class ClientTestMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Resume a = new Resume("大鸟");
		a.setPersonalInfo("male", "29");
		a.setWorkExperience("1998-2000", "XX 公司");
		
		Resume b = (Resume)a.clone();
		b.setWorkExperience("1998-2006", "YY 企业");
		
		Resume c = (Resume)a.clone();
		c.setPersonalInfo("male", "24");
		c.setWorkExperience("1998-2003", "ZZ 企业");
		
		a.display();
		b.display();
		c.display();
	}

}
