package com.demo.patterns.interpreter.test;

public class Scale extends Expression {

	@Override
	public void execute(String key, double value) {
		// TODO Auto-generated method stub
		String scale = "";
		switch((int)value) {
		case 1:
			scale = "低音";
			break;
		case 2:
			scale = "中音";
			break;
		case 3:
			scale = "高音";
			break;
		}
		
		System.out.print(scale);
	}

}
