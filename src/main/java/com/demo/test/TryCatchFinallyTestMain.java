package com.demo.test;

public class TryCatchFinallyTestMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TryCatchFinallyTestMain t = new TryCatchFinallyTestMain();
		System.out.println("main:" + t.tryCatchFinally());
	}
	
	public int  tryCatchFinally() {
		try {
			System.out.println("try{}");
			return 0;
		} catch (Exception e) {
			System.out.println("catch");
		} finally {
			System.out.println("finally");
		}
		return 2;
	}

}
