package com.testngdemo;

import org.testng.annotations.Test;

public class Example4 {
	@Test(priority=2,enabled=true,invocationCount = 5)
	public void testCase1() {
		System.out.println("Hi, TC1");
	}
	@Test(priority=1,enabled=false)
	public void testCase3() {
		System.out.println("Hi, TC3");
	}
	@Test(priority=3,enabled=true,timeOut = 2000)
	public void testCase2() throws InterruptedException {
		Thread.sleep(3000);
		System.out.println("Hi, TC2");
	}
	@Test(priority=3,enabled=true,timeOut = 2000)
	public void testCase4() throws InterruptedException {
		Thread.sleep(1000);
		System.out.println("Hi, TC4");
	}
}