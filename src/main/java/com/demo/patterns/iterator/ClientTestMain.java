package com.demo.patterns.iterator;

public class ClientTestMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ConcreteAggregate a = new ConcreteAggregate();
		a.set("大鸟");
		a.set("小菜");
		a.set("行李");
		a.set("老外");
		a.set("小偷");
		
		//Iterator i = new ConcreteIterator(a);
		//Object item = i.first();
		Iterator i = new ConcreteIteratorDesc(a);
		while(!i.isDone()) {
			System.out.println(i.currentItem() + "请买车票");
			i.next();
		}
	}

}
