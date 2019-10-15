package com.demo.test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class StringConvertToArrayList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//ArrayList<String> 转换为String[]
		ArrayList<String> list = new ArrayList<>();
		list.add("aaa");
		list.add("bbb");
		String[] arrString = list.toArray(new String[list.size()]);
		System.out.println("String[]:" + arrString[0]);
		
		//String[] 转换为ArrayList<String>
		ArrayList<String> list1 = new ArrayList<String>();
		String[] str1 = new String[] {"aaa", "bbb"};
		Collections.addAll(list1, str1);
		System.out.println("list1:" + list1);
		
		//ArrayList<String> 转换为String
		ArrayList<String> list2 = new ArrayList<>();
		list2.add("aaa");
		list2.add("bbb");
		String str2 = String.join(",", list.toArray(new String[list.size()]));
		System.out.println("str2:" + str2);
		
		//String转换为ArrayList<String>
		String str3 = "1,2,3,4,5";
		List<String> list3 = Arrays.asList(str3.split(","));
		System.out.println("list3: " + list3);
	}

}
