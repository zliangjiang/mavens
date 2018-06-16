package com.demo.patterns.prototype;

public abstract class Prototype {
	private String id;
	
	public Prototype(String id) {
		this.id = id;
	}
	
	public String getID() {
		return this.id;
	}
}
