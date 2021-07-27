package com.demo.memory;

import java.nio.ByteBuffer;

public class DirectBufferMemoryOut {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		// java -XX:MaxDirectMemorySize=100m
		ByteBuffer myBuffer = ByteBuffer.allocateDirect(500*1024*1024);
		Thread.sleep(60000L);
	}

}
