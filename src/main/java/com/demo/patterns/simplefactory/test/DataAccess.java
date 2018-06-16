package com.demo.patterns.simplefactory.test;

public class DataAccess {
	private static String db = "Sqlserver";//Access
	
	public static IUser createUser() {
		IUser result = null;
		switch(db) {
		case "Sqlserver":
			result = new SqlserverUser();
			break;
		case "Access":
			result = new AccessUser();
			break;
		}
		return result;
	}
	
	public static IDepartment createDepartment() {
		IDepartment result = null;
		switch(db) {
		case "Sqlserver":
			result = new SqlserverDepartment();
			break;
		case "Access":
			result = new AccessDepartment();
			break;
		}
		return result;
	}
}
