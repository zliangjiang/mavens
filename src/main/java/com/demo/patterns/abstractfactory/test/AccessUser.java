package com.demo.patterns.abstractfactory.test;

public class AccessUser implements  IUser {

	public void insert(User user) {
		// TODO Auto-generated method stub
		System.out.println("在Access中给User表增加一条记录");
	}

	public User getUser(int id) {
		// TODO Auto-generated method stub
		System.out.println("在Access中根据ID得到User表一条记录");
		return null;
	}

}
