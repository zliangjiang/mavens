package com.demo.patterns.state;

public class RestState extends State {

	@Override
	public void WriteProgram(Work w) {
		// TODO Auto-generated method stub
		System.out.printf("当前时间:{%f}点下班回家了",w.getHour());
		System.out.println();
	}

}
