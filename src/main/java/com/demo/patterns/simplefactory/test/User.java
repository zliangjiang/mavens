package com.demo.patterns.simplefactory.test;

public class User {
	private int _id;
	
	private String $name;

	public int get_id() {
		return _id;
	}

	public void set_id(int _id) {
		this._id = _id;
	}

	public String get$name() {
		return $name;
	}

	public void set$name(String $name) {
		this.$name = $name;
	}
}
