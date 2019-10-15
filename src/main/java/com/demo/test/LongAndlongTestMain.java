package com.demo.test;

public class LongAndlongTestMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Integer.MAX_VALUE:"+Integer.MAX_VALUE);
		System.out.println("Integer.MIN_VALUE:"+Integer.MIN_VALUE);
		System.out.println("Long。MAX_VALUE:"+Long.MAX_VALUE);
		System.out.println("Long。MIN_VALUE:"+Long.MIN_VALUE);
		System.out.println("Double。MAX_VALUE:"+Double.MAX_VALUE);
		System.out.println("Double。MIN_VALUE:"+Double.MIN_VALUE);	
		System.out.println("Float.MAX_VALUE:"+Float.MAX_VALUE);
		System.out.println("Float.MIN_VALUE:"+Float.MIN_VALUE);
		
		long begin = System.currentTimeMillis();
		Long sum =0L;
		for(int i=0; i<Integer.MAX_VALUE; i++){
			sum += i;
		}
		System.out.println(sum);
		long end = System.currentTimeMillis();
		System.out.println("cost time:"+ (end - begin)/1000 +"seconds");
		begin = System.currentTimeMillis();
		long sum2 = 0;
		for(int j=0; j<Integer.MAX_VALUE; j++) {
			sum2 += j;
		}
		System.out.println(sum2);
		end = System.currentTimeMillis();
		System.out.println("cost time2: " + (end-begin)+"milliseconds");
	}

}
