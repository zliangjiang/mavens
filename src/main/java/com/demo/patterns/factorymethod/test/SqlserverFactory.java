package com.demo.patterns.factorymethod.test;

public class SqlserverFactory implements IFactory {

	public IUser CreateUser() {
		// TODO Auto-generated method stub
		return new SqlserverUser();
	}

}
