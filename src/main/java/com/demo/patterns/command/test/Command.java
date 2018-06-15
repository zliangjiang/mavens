package com.demo.patterns.command.test;

public abstract class Command {
	protected Barbecuer receiver;
	
	public Command(Barbecuer receiver) {
		this.receiver = receiver;
	}
	
	public  abstract void executeCommand();
}
