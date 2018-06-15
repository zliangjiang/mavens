package com.demo.patterns.command.test;

public class BakeMuttonCommand extends Command {
	public BakeMuttonCommand(Barbecuer receiver) {
		super(receiver);
	}
	
	@Override
	public void executeCommand() {
		// TODO Auto-generated method stub
		receiver.bakeMutton();
	}

}
