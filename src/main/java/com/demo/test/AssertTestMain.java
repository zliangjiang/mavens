package com.demo.test;

import java.util.ArrayList;
import java.util.List;

import org.junit.Assert;
import org.junit.Test;

public class AssertTestMain {
	@Test
	public void testAssertNull() {
		String str = null;
		Assert.assertNull(str);
	}
	
	@Test
	public void testAssertNotNull() {
		String str = "Hello Java!!";
		Assert.assertNotNull(str);
	}
	
	@Test
	public void testAssertEqualsLong() {
		long long1 = 2;
		long long2 = 2;
		Assert.assertEquals(long1, long2);
	}
	
	@Test
	public void testAssertEqualsDouble() {
		double double1 = 1.236;
		double double2 = 1.237;
		double delta = 0.002;
		Assert.assertEquals(double1, double2, delta);
	}
	
	@Test
	public void testAssertTrue() {
		List<String> list = new ArrayList<String>();
		Assert.assertTrue(list.isEmpty());
	}
	
	@Test
	public void testAssertFalse() {
		List<String> list = new ArrayList<String>();
		list.add("hello");
		Assert.assertFalse(list.isEmpty());
	}
	
	@Test
	public void testAssertSame() {
		String str1 = "hello world!!";
		String str2 = "hello world!!";
		Assert.assertSame(str1, str2);
	}
	
	@Test
	public void testAssertNotSame() {
		String str1 = "hello world!!";
		String str2 = "hello Java!!";
		Assert.assertNotSame(str1, str2);
	}
}