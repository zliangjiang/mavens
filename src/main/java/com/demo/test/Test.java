package com.demo.test;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//add(5,8);
		//System.out.println(1/0);
		System.out.println(System.getProperty("file.encoding"));
		String text = "大家好";
		System.out.println(text); 
		boolean[] t = new boolean[10];
		System.out.println(t.length+" ");
		
	}

	public static int add(int a, int b) {
		int c=a+b;
		int d=c+9;
		return d;
		
	}
}
