package com.demo.patterns.composite.test;

public class FinanceDepartment extends Company {
	public FinanceDepartment(String name) {
		super(name);
	}
	
	@Override
	public void add(Company c) {
		// TODO Auto-generated method stub

	}

	@Override
	public void remove(Company c) {
		// TODO Auto-generated method stub

	}

	@Override
	public void display(int depth) {
		// TODO Auto-generated method stub
		int i = 0;
		StringBuilder sb = new StringBuilder();
		while(i<depth) {
			sb.append("-");
			i++;
		}
		System.out.println(sb.toString() + name);
	}

	@Override
	public void lineOfDuty() {
		// TODO Auto-generated method stub
		System.out.println(name + "公司财务收支管理");
	}

}
