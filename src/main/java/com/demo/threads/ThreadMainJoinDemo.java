package com.demo.threads;

/**
 * 通过主线程join使线程按顺序执行
 * @author BlackDragon2
 *
 */
public class ThreadMainJoinDemo {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		final Thread thread1 = new Thread(new Runnable() {
			@Override
			public void run() {
				System.out.println("产品经理正在规划新需求...");
			}
		});
		
		final Thread thread2 = new Thread(new Runnable() {
			@Override
			public void run() {
				System.out.println("开发人员开发新需求功能");
			}
		});
		
		final Thread thread3 = new Thread(new Runnable() {
			@Override
			public void run() {
				System.out.println("测试人员测试新功能");
			}
		});
		
		System.out.println("早上:");
		System.out.println("产品经理来上班了");
		System.out.println("测试人员来上班了");
		System.out.println("开发人员来上班了");
		thread1.start();
		System.out.println("开发人员和测试人员休息会...");
		thread1.join();
		System.out.println("产品经理新需求规划完成!");
		thread2.start();
		System.out.println("测试人员休息会...");
		thread2.join();
		System.out.println("开发人员开发新需求完成!");
		thread3.start();
		thread3.join();
		System.out.println("测试人员测试新功能完成!");
	}

}
