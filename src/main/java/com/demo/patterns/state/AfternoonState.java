package com.demo.patterns.state;

public class AfternoonState extends State {

	@Override
	public void WriteProgram(Work w) {
		// TODO Auto-generated method stub
		if(w.getHour() < 17) {
			System.out.printf("当前时间:{%f}点 下午状态还不错，继续努力",w.getHour());
			System.out.println();
		}else {
			w.setState(new EveningState());
			w.writeProgram();
		}
	}

}
