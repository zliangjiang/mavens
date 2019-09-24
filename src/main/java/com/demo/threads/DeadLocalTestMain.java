package com.demo.threads;

public class DeadLocalTestMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		final Object lockA = new Object();
		final Object lockB = new Object();
		new Thread(new Runnable() {
			public void run() {
				String name = Thread.currentThread().getName();
				synchronized(lockA) {
					System.out.println(name+" got lockA, want lockB");
					try {
							Thread.sleep(1000);
					}catch (InterruptedException e) {
						e.printStackTrace();
					}
					synchronized(lockB) {
						System.out.println(name+" got lockB");
						System.out.println(name+" :say Hello!");
					}
				}
			}
		}, "Thread-A").start();
		
		new Thread(new Runnable() {
			public void run() {
				String name = Thread.currentThread().getName();
				synchronized(lockB) {
					System.out.println(name+" got lockB, want lockA");
					try {
						Thread.sleep(1000);
					}catch(InterruptedException e) {
						e.printStackTrace();
					}
					synchronized(lockA) {
						System.out.println(name+" got lockA");
						System.out.println(name+" : say Hello!");
					}
				}
			}
		}, "Thread-B").start();
	}

}
