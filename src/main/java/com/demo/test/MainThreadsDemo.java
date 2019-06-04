package com.demo.test;

import java.lang.management.ManagementFactory;
import java.lang.management.ThreadInfo;
import java.lang.management.ThreadMXBean;

public class MainThreadsDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Hello World");
		ThreadGroup group = Thread.currentThread().getThreadGroup();
		ThreadGroup topGroup = group;
		while(group != null) {
			topGroup = group;
			group = group.getParent();
		}
		
		int nowThreads = topGroup.activeCount();
		Thread[] lstThreads = new Thread[nowThreads];
		topGroup.enumerate(lstThreads);
		for (int i=0; i<nowThreads; i++) {
			System.out.println("Thread Number:" + i + "=" + lstThreads[i].getName());
		}
		
		ThreadMXBean mbean = ManagementFactory.getThreadMXBean();
		long[] threadIds = mbean.getAllThreadIds();
		ThreadInfo[] threadInfos = mbean.getThreadInfo(threadIds);
		for (ThreadInfo threadInfo : threadInfos) {
			System.out.println("ThreadInfo:" + threadInfo.getThreadName());
		}
		
	}

}
