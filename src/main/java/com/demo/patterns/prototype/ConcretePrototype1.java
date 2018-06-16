package com.demo.patterns.prototype;

public class ConcretePrototype1 extends Prototype implements Cloneable{

	public ConcretePrototype1(String id) {
		super(id);
		// TODO Auto-generated constructor stub
	}

	@Override
	public Object clone() {
		// TODO Auto-generated method stub
		ConcretePrototype1 cp = null;
		try {
			cp = (ConcretePrototype1)super.clone();
		}catch(CloneNotSupportedException e) { 
            e.printStackTrace(); 
        } 
		return cp;
	}

}
