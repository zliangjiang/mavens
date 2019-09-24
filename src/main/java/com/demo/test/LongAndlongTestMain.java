package com.demo.test;

public class LongAndlongTestMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
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
