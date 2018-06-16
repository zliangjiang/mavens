package com.demo.patterns.abstractfactory.test;

public class SqlserverFactory implements IFactory {

	public IUser createUser() {
		// TODO Auto-generated method stub
		return new SqlserverUser();
	}

	public IDepartment createDepartment() {
		// TODO Auto-generated method stub
		return new SqlserverDepartment();
	}

}
