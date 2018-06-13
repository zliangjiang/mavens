package com.demo.patterns.simplefactory;

public class ClientTestMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Operation oper;
		oper = OperationFactory.createOperate('/');
		oper.set_numberA(1001);
		oper.set_numberB(2910);
		double result = oper.getResult();
		System.out.println(result);
	}

}
