package com.demo.patterns.simplefactory;

public class OperationSub extends Operation {
	public double getResult() {
		double result = 0;
		result = this.get_numberA() - this.get_numberB();
		return result;
	}
}
