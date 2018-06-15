package com.demo.patterns.iterator;

public class ConcreteIteratorDesc extends Iterator {
	private ConcreteAggregate aggregate;
	
	private int current = 0;
	
	public ConcreteIteratorDesc(ConcreteAggregate aggregate) {
		this.aggregate = aggregate;
		current = aggregate.getCount() - 1;
	}
	@Override
	public Object first() {
		// TODO Auto-generated method stub
		return aggregate.get(aggregate.getCount() - 1);
	}

	@Override
	public Object next() {
		// TODO Auto-generated method stub
		Object ret = null;
		current--;
		if(current >= 0) {
			ret = aggregate.get(current);
		}
		
		return ret;
	}

	@Override
	public boolean isDone() {
		// TODO Auto-generated method stub
		return current < 0 ? true : false;
	}

	@Override
	public Object currentItem() {
		// TODO Auto-generated method stub
		return aggregate.get(current);
	}

}
