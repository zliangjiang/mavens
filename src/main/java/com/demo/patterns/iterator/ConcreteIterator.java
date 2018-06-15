package com.demo.patterns.iterator;

public class ConcreteIterator extends Iterator {
	private ConcreteAggregate aggregate;
	
	private int current = 0;
	
	public ConcreteIterator(ConcreteAggregate aggregate){
		this.aggregate = aggregate;
	}
	
	@Override
	public Object first() {
		// TODO Auto-generated method stub
		return aggregate.get(0);
	}

	@Override
	public Object next() {
		// TODO Auto-generated method stub
		Object ret = null;
		current++;
		if(current < aggregate.getCount()) {
			ret = aggregate.get(current);
		}
		return ret;
	}

	@Override
	public boolean isDone() {
		// TODO Auto-generated method stub
		return current >= aggregate.getCount() ? true : false;
	}

	@Override
	public Object currentItem() {
		// TODO Auto-generated method stub
		return aggregate.get(current);
	}

}
