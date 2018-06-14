package com.demo.patterns.singleton;

public class ClientTestMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Singleton s1 = Singleton.GetInstance();
		
		System.out.println("s1:"+s1);
		
		Singleton s2 = Singleton.GetInstance();
		
		System.out.println("s1:"+s1);
		
		if(s1 == s2) {
			System.out.println("s1 = s2");
		}
		
		if(s1.equals(s2)) {
			System.out.println("s1.equals(s2)");
		}
	}

}
