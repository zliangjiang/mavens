package com.demo.interview.singleton;

public class Singleton3 {
	private Singleton3() {
	}
	
	public static Singleton3 getInstance() {
		return Holder.instance;
	}
	
	private static class Holder
	{
		private static Singleton3  instance = new Singleton3();
	}
}
