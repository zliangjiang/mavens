package com.demo.cpu;

public class CpuTestTwoMain {

	public static void main(String[] args)  {
		// TODO Auto-generated method stub

		for(int i=0; i<4; i++) {
			new Thread(new MyRunnable()).start();
		}
	}

}

class MyRunnable implements Runnable{
	public void run() {
		long busyTime = 5;
		Thread th = Thread.currentThread();
		long nowSys = System.currentTimeMillis();
		while(true) {
			nowSys = System.currentTimeMillis();
			while((System.currentTimeMillis() - nowSys)<busyTime) {
				;
			}
			try {
				th.sleep(5);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
