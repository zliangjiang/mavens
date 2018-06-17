package com.demo.patterns.mediator;

public class ClientTestMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ConcreteMediator m = new ConcreteMediator();
		
		ConcreteColleague1 c1 = new ConcreteColleague1(m);
		ConcreteColleague2 c2 = new ConcreteColleague2(m);
		
		m.setConcreteColleague1(c1);
		m.setConcreteColleague2(c2);
		
		c1.send("吃过饭了吗?");
		c2.send("没有呢，你打算请客?");
	}

}
