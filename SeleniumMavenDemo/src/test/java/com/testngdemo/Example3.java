package com.testngdemo;

import org.testng.annotations.Test;

public class Example3 {
	@Test(priority=3,enabled=false)
	public void testCase1() {
		System.out.println("Test case1");

	}
	@Test(priority=1,enabled=true)
	public void testCase2() {
		System.out.println("Test case2");

	}
	@Test(priority=4)
	public void testCase4() {
		System.out.println("Test case4");

	}
	@Test(priority=2,enabled=true)
	public void testCase3() {
		System.out.println("Test case3");

	}
	@Test(enabled=true)
	public void testCase5() {
		System.out.println("Test case5");

	}
}
