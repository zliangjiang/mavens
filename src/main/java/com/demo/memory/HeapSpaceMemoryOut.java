package com.demo.memory;

public class HeapSpaceMemoryOut {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//-Xms10m -Xmx10m -Xss512k
		char[] tmp = new char[500*1024*1024];
		for(int i=0; i< 1024*1024*8; i++) {
			tmp[i] = '0';
		}
	}

}
