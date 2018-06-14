package com.demo.patterns.singleton;

public class Singleton {
	private static Singleton instance;
	
	private static Object lock = new Object();
	
	private Singleton() {}
	
	public static Singleton GetInstance() {
		if(instance == null) {
			synchronized(lock) {
				if(instance == null) {
					instance = new Singleton();
				}
			}
		}
		
		return instance;
	}
}
