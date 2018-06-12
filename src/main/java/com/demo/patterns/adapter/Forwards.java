package com.demo.patterns.adapter;

public class Forwards extends Player {

	public Forwards(String name) {
		super(name);
	}
	
	@Override
	public void attack() {
		// TODO Auto-generated method stub
		System.out.printf("前锋 {%s} 进攻", name);
		System.out.println();
	}

	@Override
	public void defense() {
		// TODO Auto-generated method stub
		System.out.printf("前锋{%s} 防守", name);
		System.out.println();
	}

}
