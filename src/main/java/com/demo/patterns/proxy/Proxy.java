package com.demo.patterns.proxy;

public class Proxy extends Subject {
	RealSubject realSubject;
	
	@Override
	public void request() {
		// TODO Auto-generated method stub
		System.out.println("Proxy:request");
		if(realSubject == null) {
			realSubject = new RealSubject();
		}
		realSubject.request();
	}

}
