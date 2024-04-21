package com.seleniumdemo;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment1Chrome {

	public static void main(String[] args) {
	WebDriver driver=new ChromeDriver();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	driver.get("https://online.actitime.com/tcs/login.do");
	String pageTitle=driver.getTitle();	
	int pageTitleLength=driver.getTitle().length();
	System.out.println("pageTitle: "+pageTitle);
	System.out.println("pageTitleLength: "+pageTitleLength);
//System.out.println(driver.getCurrentUrl());
	String currentURL=driver.getCurrentUrl();
	String URL="https://online.actitime.com/tcs/login.do";
	System.out.println("Compare cureentURL and URL:"+currentURL.equals(URL));
	driver.findElement(By.id("username")).sendKeys("admin01");
	driver.findElement(By.name("pwd")).sendKeys("admin01");
	driver.findElement(By.id("loginButton")).click();
	System.out.println("Title: "+driver.getTitle());
	driver.close();
	

	}

}










/*

Launch a new Chrome browser.
Open https://online.actitime.com/tcs/login.do
Get Page Title name and Title length
Print Page Title and Title length on the Eclipse Console.
Get Page URL and verify if it is a correct page opened
Enter valid username and password
Click on login button
Print the title on the console
Close the Browser.
*/