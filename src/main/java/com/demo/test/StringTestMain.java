package com.demo.test;

public class StringTestMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "Hello World !";
		//int i_arr[] = str.toString().codePoints().toArray();
		
		for(int i = 0; i< str.length(); i++)	{
			System.out.println(i);
			System.out.println(str.toString().codePointAt(i));
		}
				
	}
}
