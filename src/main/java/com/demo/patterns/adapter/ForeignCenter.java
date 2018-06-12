package com.demo.patterns.adapter;

public class ForeignCenter {
	private String name;
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getName() {
		return this.name;
	}
	
	public void doAttack() {
		System.out.printf("外籍中锋 {%s} 进攻", name);
		System.out.println();
	}
	
	public void doDefense() {
		System.out.printf("外籍中锋{%s} 防守", name);
		System.out.println();
	}
}
