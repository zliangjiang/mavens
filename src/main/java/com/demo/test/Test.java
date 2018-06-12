package com.demo.test;

import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.util.Arrays;
import java.util.List;

public class Test {

	public static void main(String[] args) throws IllegalArgumentException, IllegalAccessException {
		// TODO Auto-generated method stub
		//add(5,8);
		//System.out.println(1/0);
//		System.out.println(System.getProperty("file.encoding"));
//		String text = "大家好";
//		System.out.println(text); 
//		boolean[] t = new boolean[10];
//		System.out.println(t.length+" ");
		List<String> obj = Arrays.asList(new String[] {"demp","test"});
		System.out.println(obj.getClass());
		Class<?>  cls = obj.getClass();
		for(Field f : cls.getDeclaredFields()) {
			f.setAccessible(true);
			System.out.println(f.getName() + "-"+ f.getType()+"-" + f.get(obj).toString()+"-"+Modifier.toString(f.getModifiers()));
		}
		
	}

	public static int add(int a, int b) {
		int c=a+b;
		int d=c+9;
		return d;
		
	}
}
