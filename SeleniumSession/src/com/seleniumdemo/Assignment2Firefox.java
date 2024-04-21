package com.seleniumdemo;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Assignment2Firefox {

	private static Object object;

	public static void main(String[] args) {
	WebDriver driver=new FirefoxDriver();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	driver.get("https://demowebshop.tricentis.com/login");
	String pageTitle=driver.getTitle();
	int titleLength=pageTitle.length();
	System.out.println("Page Title: "+pageTitle);
	System.out.println("Title length: "+titleLength);
	String currentURL=driver.getCurrentUrl();
	String URL="https://demowebshop.tricentis.com/login";
	System.out.println("Compare 2 URLs: "+currentURL.equals(URL));
	driver.findElement(By.id("Email")).sendKeys("tester01@vomoto.com");
	driver.findElement(By.id("Password")).sendKeys("Abc@12345");
	System.out.println("Current URL: "+driver.getCurrentUrl());
	driver.findElement(By.className("login-button")).click();
	System.out.println("Page Title: "+driver.getTitle());
	System.out.println("Current URL: "+driver.getCurrentUrl());
	driver.findElement(By.className("ico-logout")).click();
	driver.close();
	}

}




/*
Launch a new firefox browser.
Open https://demowebshop.tricentis.com/login
Get Page Title name and Title length
Print Page Title and Title length on the Eclipse Console.
Get Page URL and verify if it is a correct page opened
Enter email as “tester01@vomoto.com”
Enter password as “Abc@12345”
Click on login button
Get the page title and current URL, print on console
Click on logout
Close the Browser.



*/