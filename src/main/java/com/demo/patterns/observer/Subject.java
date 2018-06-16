package com.demo.patterns.observer;

import java.util.ArrayList;
import java.util.List;

abstract public class Subject {
	private List<Observer> observers = new ArrayList<Observer>();
	
	public void attach(Observer observer) {
		observers.add(observer);
	}
	
	public void detach(Observer observer) {
		observers.remove(observer);
	}
	
	public void doNotify() {
		for(Observer o:observers) {
			o.update();
		}
	}
}
