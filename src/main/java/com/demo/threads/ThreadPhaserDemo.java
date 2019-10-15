package com.demo.threads;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Phaser;
import org.junit.Assert;


public class ThreadPhaserDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ExecutorService executorService = Executors.newCachedThreadPool();
		Phaser phaser = new Phaser(1);
		Assert.assertEquals(0, phaser.getPhase());
		
		executorService.submit(new LongRunningAction("thread-1", phaser));
		executorService.submit(new LongRunningAction("thread-2", phaser));
		executorService.submit(new LongRunningAction("thread-3", phaser));
		//phaser.arriveAndAwaitAdvance();
		//Assert.assertEquals(1, phaser.getPhase());
		
		executorService.submit(new LongRunningAction("thread-4", phaser));
		executorService.submit(new LongRunningAction("thread-5", phaser));
		//phaser.arriveAndAwaitAdvance();
		//Assert.assertEquals(2, phaser.getPhase());
		phaser.arriveAndDeregister();
			
	}

}


class LongRunningAction implements Runnable{
	private String threadName;
	private Phaser phaser;
	
	public LongRunningAction(String threadName, Phaser phaser){
		this.threadName = threadName;
		this.phaser = phaser;
		phaser.register();
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("This is phase " + phaser.getPhase());
		System.out.println("Thread " + threadName + " before long running action");
		phaser.arriveAndAwaitAdvance();
		try {
			System.out.println("Thread " + threadName + " is sleeping.");
			Thread.sleep(20);
			System.out.println("Thread " + threadName + " is closing.");
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		phaser.arriveAndDeregister();
	}
}

