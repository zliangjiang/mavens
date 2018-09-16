package com.demo.interview.test;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Semaphore;

public class ConcurrencyTest { 
	// 请求的总数
	public static int clientTotal = 5000; 
	// 同时并发执行的线程数 
	public static int threadTotal = 200; 
	public static void main(String[] args) throws Exception { 
		ExecutorService executorService = Executors.newCachedThreadPool(); 
		final Semaphore semaphore = new Semaphore(threadTotal); 
		final CountDownLatch countDownLatch = new CountDownLatch(clientTotal); 
		for (int i = 0; i < clientTotal ; i++) { 
			executorService.execute(() -> { 
				try { 
					semaphore.acquire(); 
					testMethod(); 
					semaphore.release(); 
				} 
				catch (Exception e){ 
					//log.error("exception", e); 
				}
				countDownLatch.countDown(); }); 
		} 
		countDownLatch.await(); 
		executorService.shutdown(); 
		// 所有线程执行完，之后才能执行的部分 
	} 
	private static void testMethod() { // 待验证的方法 } }
		System.out.println("###:"+Thread.currentThread().getName());
		
	}
}
