package com.demo.patterns.decorator.test;

public  class Person {
	private String name;
	
	public Person() {
		
	}
	
	public Person(String name) {
		this.name = name;
	}
	
	public void show() {
		System.out.printf("装扮的{ %s}",name);
		System.out.println();
	}
}
