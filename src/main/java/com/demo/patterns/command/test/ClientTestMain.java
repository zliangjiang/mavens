package com.demo.patterns.command.test;

public class ClientTestMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Barbecuer boy = new Barbecuer();
		Command bakeMuttonCommand1 = new BakeMuttonCommand(boy);
		Command bakeMuttonCommand2 = new BakeMuttonCommand(boy);
		Command bakeChickenWingCommand1 = new BakeChickenWingCommand(boy);
		Waiter girl = new Waiter();
		
		girl.setOrder(bakeMuttonCommand1);
		girl.setOrder(bakeMuttonCommand2);
		girl.setOrder(bakeChickenWingCommand1);
		
		girl.doNotify();
		
		
	}

}
