package com.demo.constructors;

public class PersonBuilderPattern {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person person = new Person.Builder("zlj", "123456").Birthday("19900310").build();
		System.out.println(person.toString());
	}

}

class Person {
	private String name;
	private String password;
	private String birthday;
	
	public static class Builder{
		private String name;
		private String password;
		private String birthday;
		
		public Builder (String name, String password) {
			this.name = name;
			this.password = password;
		}
		
		public Builder Birthday(String date) {
			this.birthday = date;
			return this;
		}
		
		public Person build() {
			return new Person(this);
		}
	}
	
	private Person(Builder builder) {
		this.name = builder.name;
		this.password = builder.password;
		this.birthday = builder.birthday;
	}
	
	public String toString() {
		return "name:" + this.name + ", password:" + this.password + ", birthday:" + birthday;
	}
}
