package com.demo.patterns.simplefactory.test;

public class ClientTestMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		User user = new User();
		Department dept = new Department();
		
		IUser iu = DataAccess.createUser();
		
		iu.insert(user);
		iu.getUser(1);
		
		IDepartment id = DataAccess.createDepartment();
		id.insert(dept);
		id.getDepartment(1);
		
	}

}
