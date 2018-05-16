package com.demo.message;

public class BasicQueue {
	private static final int MAX_MSG_NUM = 1020*1024;
	private static final int MAX_MSG_BODY_SIZE = 1020;
	private static final int MSG_SIZE = MAX_MSG_BODY_SIZE + 4;
	private static final int DATA_FILE_SIZE = MAX_MSG_NUM * MSG_SIZE;
	private static final int META_SIZE = 8;
	
	
}
