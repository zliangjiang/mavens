package com.demo.patterns.strategy;

public class Context {
	Strategy strategy;
	public Context(Strategy strategy) {
		this.strategy = strategy;
	}
	
	public void contextInterface() {
		strategy.AlgorithmInterface();
	}
}
