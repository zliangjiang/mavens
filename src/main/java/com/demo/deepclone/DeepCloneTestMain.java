package com.demo.deepclone;

public class DeepCloneTestMain {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] arrFavor = { "basketball", "football" };
		Person person = new Person("Jay", "123", arrFavor);
		Person p = (Person) person.clone();
		System.out.println(p.name);
		System.out.println(p.password);
		p.name = "Jolin";
		p.password = "555";
		p.arrFavor[0] = "valiball";
		for (String favor : p.arrFavor) {
				System.out.print(favor + " ");
		}
		System.out.println();
		for (String favor : person.arrFavor) {
				System.out.print(favor + " ");
		}
		System.out.println();
		
		java.util.Date date1 = new java.util.Date();
		java.util.Date date2 = date1;
		java.util.Date date3 =(java.util.Date) date1.clone();
		System.out.println("date1 == date2?"+(date1 == date2));
		System.out.println("date1 == date2?"+(date1 == date3));
	}
}

class Person implements Cloneable{
	String name;
	String password;
	String[] arrFavor;
	
	public Person(String name, String password, String[] arrFavor) {
		this.name = name;
		this.password = password;
		this.arrFavor = arrFavor;
	}
	
	@Override 
	protected Object clone() {
		Person person = null;
		try {
			person = (Person)super.clone();
			person.arrFavor = (String[])this.arrFavor.clone();//deep Clone
			return person;
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}
		return null;
	}
	
}
