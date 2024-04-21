package com.testngdemo;
import org.testng.annotations.Test;

public class Example5 {
	@Test(expectedExceptions = ArithmeticException.class, description = "this method might get impacted due to exception")
	public void testCase1() {
		System.out.println("Hello, TC1 started");
		int num=10/0;
		System.out.println("Bye, TC1 finished");
	}
	
}