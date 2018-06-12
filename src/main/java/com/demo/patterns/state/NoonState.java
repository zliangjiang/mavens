package com.demo.patterns.state;

public class NoonState extends State {

	@Override
	public void WriteProgram(Work w) {
		// TODO Auto-generated method stub
		if(w.getHour() < 13) {
			System.out.printf("当前时间:{%f}点 饿了，午饭；犯困，午休", w.getHour());
			System.out.println();
		}else {
			w.setState(new AfternoonState());
			w.writeProgram();
		}
	}

}
