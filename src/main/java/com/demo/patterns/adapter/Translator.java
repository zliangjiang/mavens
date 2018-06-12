package com.demo.patterns.adapter;

public class Translator extends Player {
	
	private ForeignCenter wjzf = new ForeignCenter();
	
	public Translator(String name) {
		super(name);
		wjzf.setName(name);
	}
	
	@Override
	public void attack() {
		// TODO Auto-generated method stub
		wjzf.doAttack();
	}

	@Override
	public void defense() {
		// TODO Auto-generated method stub
		wjzf.doDefense();
	}

}
