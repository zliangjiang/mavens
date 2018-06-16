package com.demo.patterns.builder;

public abstract class Builder {
	public abstract void buildPartA();
	
	public abstract void buildPartB();
	
	public abstract Product getResult();
}
