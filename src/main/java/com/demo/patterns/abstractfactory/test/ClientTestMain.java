package com.demo.patterns.abstractfactory.test;

public class ClientTestMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		User user = new User();
		Department dept = new Department();
		
		IFactory factory = new SqlserverFactory();
		//IFactory factory = new AccessFactory();
		
		IUser iu = factory.createUser();
		iu.insert(user);
		iu.getUser(1);
		
		IDepartment id = factory.createDepartment();
		id.insert(dept);
		id.getDepartment(0);
	}

}
