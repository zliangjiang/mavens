package com.demo.patterns.visitor;

public abstract class Element {
	public abstract void accept(Visitor visitor);
}
