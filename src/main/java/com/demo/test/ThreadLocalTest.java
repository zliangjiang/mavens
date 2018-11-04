package com.demo.test;

import java.lang.management.ManagementFactory;
import java.lang.management.ThreadInfo;
import java.lang.management.ThreadMXBean;

public class ThreadLocalTest {
	static class ResourceClass{
		public final static ThreadLocal<String> RESOURCE_1 = new ThreadLocal<String>();
		public final static ThreadLocal<String> RESOURCE_2 = new ThreadLocal<String>();
	}
	
	static class A{
		public void setOne(String value) {
			ResourceClass.RESOURCE_1.set(value);
		}
		
		public void setTwo(String value) {
			ResourceClass.RESOURCE_2.set(value);
		}
	}
	
	static class B {
		public void display() {
			System.out.println("Resource1 and Resource2:" + ResourceClass.RESOURCE_1.get()
				+ ":"+ ResourceClass.RESOURCE_2.get());
		}
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		final A a = new A();
		final B b = new B();
		for(int i=0; i<15; i++){
			final String resource1 = "Thread-" + i;
			final String resource2 = " value = (" + i + ")";
			new Thread() {
					public void run() {
						try {
								a.setOne(resource1);
								a.setTwo(resource2);
								b.display();
								try {
									Thread.sleep(10000);
								} catch (InterruptedException e) {
									// TODO Auto-generated catch block
									e.printStackTrace();
								}
						} finally {
							ResourceClass.RESOURCE_1.remove();
							ResourceClass.RESOURCE_2.remove();
						}
					}
			}.start();
		}
		
		ThreadMXBean threadMXBean = ManagementFactory.getThreadMXBean();
		ThreadInfo[] threadInfos = threadMXBean.dumpAllThreads(false, false);
		for (ThreadInfo info : threadInfos) {
			System.out.println("[" + info.getThreadId() + "]" + info.getThreadName());
		}
		
	}

}
