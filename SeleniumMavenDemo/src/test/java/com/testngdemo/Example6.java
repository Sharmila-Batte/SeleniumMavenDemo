package com.testngdemo;

import org.testng.annotations.Test;

public class Example6 {
	@Test(priority=1)
	public void signUp() {
		int num=10/0;
		System.out.println("Create an account....");
	}
	@Test(priority=2,dependsOnMethods = "signUp")
	public void login() {
		System.out.println("Login successfull...");
	}
	@Test(priority=3,dependsOnMethods = "login")
	public void composeEmail() {
		System.out.println("Email composed and sent...");
		
	}
	@Test(priority=4,dependsOnMethods = "composeEmail")
	public void checkDraft() {
		System.out.println("There is not email in Draft");
	}
	@Test(priority=5,dependsOnMethods = "composeEmail")
	public void checkSentItems() {
		System.out.println("New Email found in sent item");
	}
}