package com.demo.patterns.factorymethod.test;

public class ClientTestMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		User user = new User();
		
		IFactory factory = new SqlserverFactory();
		
		IUser iu = factory.CreateUser();
		
		iu.insert(user);
		iu.getUser(1);
		
		factory = new AccessFactory();
		iu = factory.CreateUser();
		
		iu.insert(user);
		iu.getUser(1);
	}

}
