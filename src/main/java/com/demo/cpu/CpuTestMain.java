package com.demo.cpu;

public class CpuTestMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(;;) {
			for(int i=0; i< 1000000000;i++) {
				;
			}
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

}
