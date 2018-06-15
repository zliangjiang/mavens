package com.demo.patterns.command.test;

public class BakeChickenWingCommand extends Command {
	public BakeChickenWingCommand(Barbecuer receiver) {
		super(receiver);
	}
	
	@Override
	public void executeCommand() {
		// TODO Auto-generated method stub
		receiver.bakeChickenWing();
	}

}
