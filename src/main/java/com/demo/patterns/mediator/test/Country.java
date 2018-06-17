package com.demo.patterns.mediator.test;

public abstract class Country {
	protected UnitedNations mediator;
	
	public Country(UnitedNations mediator) {
		this.mediator = mediator;
	}
}
