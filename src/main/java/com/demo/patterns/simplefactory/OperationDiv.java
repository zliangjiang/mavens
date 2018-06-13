package com.demo.patterns.simplefactory;

public class OperationDiv extends Operation {
	public double getResult() {
		double result = 0;
		if(this.get_numberB() == 0) {
			try {
				throw new Exception("除数不能为0");
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		result = this.get_numberA()/this.get_numberB();
		return result;
	}
}
