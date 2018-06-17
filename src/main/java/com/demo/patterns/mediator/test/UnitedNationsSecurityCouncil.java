package com.demo.patterns.mediator.test;

public class UnitedNationsSecurityCouncil extends UnitedNations {
	private USA colleague1;
	
	private Iraq colleague2;
	
	public void setUSA(USA usa) {
		this.colleague1 = usa;
	}
	
	public void setIraq(Iraq iraq) {
		this.colleague2 = iraq;
	}
	
	@Override
	public void declare(String message, Country colleague) {
		// TODO Auto-generated method stub
		if(colleague == colleague1) {
			colleague2.getMessage(message);
		}else {
			colleague1.getMessage(message);
		}
	}

}
