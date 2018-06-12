package com.demo.patterns.composite.test;

import java.util.ArrayList;
import java.util.List;

public class ConcreteCompany extends Company {
	private List<Company> children = new ArrayList<Company>();
	
	public ConcreteCompany(String name) {
		super(name);
	}
	
	@Override
	public void add(Company c) {
		// TODO Auto-generated method stub
		children.add(c);
	}

	@Override
	public void remove(Company c) {
		// TODO Auto-generated method stub
		children.remove(c);
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
		
		for(i=0; i<children.size(); i++) {
			children.get(i).display(depth + 2);
		}
	}

	@Override
	public void lineOfDuty() {
		// TODO Auto-generated method stub
		for(int i=0; i<children.size(); i++) {
			children.get(i).lineOfDuty();;
		}
	}

}
