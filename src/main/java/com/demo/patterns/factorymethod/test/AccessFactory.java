package com.demo.patterns.factorymethod.test;

public class AccessFactory implements IFactory {

	public IUser CreateUser() {
		// TODO Auto-generated method stub
		return new AccessUser();
	}

}
