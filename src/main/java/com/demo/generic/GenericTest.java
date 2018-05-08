package com.demo.generic;

public class GenericTest<T> {
	private T parameter;
	public GenericTest(T tmp) {
		parameter = tmp;
	}
	public T getParameter() {
		return parameter;
	}
	public void setParameter(T tmp) {
		this.parameter = tmp;
	}
}
