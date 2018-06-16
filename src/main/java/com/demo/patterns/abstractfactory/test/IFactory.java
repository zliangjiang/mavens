package com.demo.patterns.abstractfactory.test;

public interface IFactory {
	IUser createUser();
	
	IDepartment createDepartment();
}
