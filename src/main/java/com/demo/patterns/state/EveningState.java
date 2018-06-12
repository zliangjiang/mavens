package com.demo.patterns.state;

public class EveningState extends State {

	@Override
	public void WriteProgram(Work w) {
		// TODO Auto-generated method stub
		if(w.isFinish()) {
			w.setState(new RestState());
			w.writeProgram();
		}
		else {
				if(w.getHour() < 21) {
					System.out.printf("当前时间:{%f}点 加班哦，疲累之极",w.getHour());
					System.out.println();
				}else {
					w.setState(new SleepingState());
					w.writeProgram();
				}
		}
	}

}
