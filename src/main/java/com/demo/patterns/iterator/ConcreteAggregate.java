package com.demo.patterns.iterator;

import java.util.ArrayList;
import java.util.List;

public class ConcreteAggregate extends Aggregate {
	public List<Object> items = new ArrayList<Object>();
	
	@Override
	public Iterator createIterator() {
		// TODO Auto-generated method stub
		return new ConcreteIterator(this);
	}
	
	public int getCount() {
		return items.size();
	}
	
	public Object get(int index) {
		return items.get(index);
	}
	
	public void set(Object o) {
		items.add(o);
	}

}
