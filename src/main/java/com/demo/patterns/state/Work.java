package com.demo.patterns.state;

public class Work {
	
	private double hour;
	
	private boolean finish = false;
	
	public double getHour() {
		return hour;
	}

	public void setHour(double hour) {
		this.hour = hour;
	}

	public boolean isFinish() {
		return finish;
	}

	public void setFinish(boolean finish) {
		this.finish = finish;
	}
	
	private State current;
	
	public Work() {
		current = new ForenoonState();
	}
	
	public void setState(State s) {
		current = s;
	}
	
	public void writeProgram() {
		current.WriteProgram(this);
	}
}
