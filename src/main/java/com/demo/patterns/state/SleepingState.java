package com.demo.patterns.state;

public class SleepingState extends State {

	@Override
	public void WriteProgram(Work w) {
		// TODO Auto-generated method stub
		System.out.printf("当前时间:{%f}点 不行了，睡着了。",w.getHour());
		System.out.println();
	}

}
