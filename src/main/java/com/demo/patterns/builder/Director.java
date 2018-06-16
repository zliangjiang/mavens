package com.demo.patterns.builder;

public class Director {
	public void construct(Builder builder) {
		builder.buildPartA();
		builder.buildPartB();
	}
}
