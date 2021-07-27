package com.demo.threads;

import java.util.concurrent.BrokenBarrierException;
import java.util.concurrent.CyclicBarrier;

public class ThreadCyclicBarrierDemo {
	private static CyclicBarrier barrier1 = new CyclicBarrier(2);
	private static CyclicBarrier barrier2 = new CyclicBarrier(2);
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		final Thread thread1 = new Thread(new Runnable() {
			@Override
			public void run() {
				try {
					System.out.println("产品经理规划新需求");
					barrier1.await();
				} catch (InterruptedException e) {
					e.printStackTrace();
				} catch (BrokenBarrierException e) {
					e.printStackTrace();
				}
			}
		});
		
		final Thread thread2 = new Thread(new Runnable() {
			@Override
			public void run() {
				try {
					barrier1.await();
					System.out.println("开发人员开发新需求功能");
					barrier2.await();
				} catch (InterruptedException e) {
					e.printStackTrace();
				} catch (BrokenBarrierException e) {
					e.printStackTrace();
				}
			}
		});
		
		final Thread thread3 = new Thread(new Runnable() {
			@Override
			public void run() {
				try {
					barrier2.await();
					System.out.println("测试人员测试新功能");
				} catch (InterruptedException e) {
					e.printStackTrace();
				} catch (BrokenBarrierException e) {
					e.printStackTrace();
				}
			}
		});
		
		System.out.println("早上:");
		System.out.println("测试人员来上班了...");
		thread3.start();
		System.out.println("产品经理来上班了...");
		thread1.start();
		System.out.println("开发人员来上班了...");
		thread2.start();
	}

}
