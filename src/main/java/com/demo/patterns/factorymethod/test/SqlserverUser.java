package com.demo.patterns.factorymethod.test;

public class SqlserverUser implements IUser {

	public void insert(User user) {
		// TODO Auto-generated method stub
		System.out.println("在SQL Server中给User表增加一条记录");
	}

	public User getUser(int id) {
		// TODO Auto-generated method stub
		System.out.println("在SQL Server中根据ID得到User表一条记录");
		return null;
	}

}
