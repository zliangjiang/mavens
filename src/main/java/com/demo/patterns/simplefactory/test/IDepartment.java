package com.demo.patterns.simplefactory.test;

public interface IDepartment {
	void insert(Department department);
	
	Department getDepartment(int id);
}
