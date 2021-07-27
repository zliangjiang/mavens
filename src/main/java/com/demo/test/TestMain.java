package com.demo.test;

import java.lang.management.ManagementFactory;
import java.lang.management.ThreadInfo;
import java.lang.management.ThreadMXBean;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class TestMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> list = new ArrayList<String>();
		list.add("1");
		list.add("2");
		Iterator<String> iterator = list.iterator();
		while (iterator.hasNext()) {
			String item = iterator.next();
			System.out.println(item);
			if ("2".equals(item)) {
				iterator.remove();
			}
		}
		
		System.out.println(list.size());
		
		ThreadMXBean threadMXBean = ManagementFactory.getThreadMXBean();
		ThreadInfo[] threadInfos = threadMXBean.dumpAllThreads(false, false);
		for (ThreadInfo info : threadInfos) {
			System.out.println("[" + info.getThreadId() + "]" + info.getThreadName());
		}
		
		int i=0;
		for ( ; i<15; i++) {
			new Thread() {
				public void run() {
					try {
						Thread.sleep(6000);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					System.out.println("Thread i :" + Thread.currentThread().getId() + "priority:" + Thread.currentThread().getPriority());
				}
			}.start();
		}
		try {
			Thread.sleep(6);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("list size():"+list.size());
		System.out.println(Thread.currentThread().getName());
		int[] array = new int[10];
		System.out.println("array length:"+array.length);
		
		String a = "1234";
		String b = "12" + new String("34");
		System.out.println("a wheather equals b:" + a.equals(b));
	}
}

