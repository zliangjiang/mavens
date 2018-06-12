package com.demo.patterns.state;

public class ForenoonState extends State {

	@Override
	public void WriteProgram(Work w) {
		// TODO Auto-generated method stub
		if(w.getHour() < 12) {
			System.out.printf("当前时间:{%f}点 上午工作，精神百倍",w.getHour());
			System.out.println();
		}else {
			w.setState(new NoonState());
			w.writeProgram();
		}
	}

}
