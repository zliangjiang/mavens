package com.demo.patterns.abstractfactory.test;

public class AccessFactory implements IFactory {

	public IUser createUser() {
		// TODO Auto-generated method stub
		return new AccessUser();
	}

	public IDepartment createDepartment() {
		// TODO Auto-generated method stub
		return new AccessDepartment();
	}

}
