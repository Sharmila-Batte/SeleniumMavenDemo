package com.browseroperations;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Example6 {

	public static void main(String[] args) {
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		//implicit wait - will be used as default wait for WebDriver instance
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		driver.get("https://online.actitime.com/tcs/login.do");//0-30sec
		
		driver.findElement(By.id("username")).sendKeys("admin01");//0-30sec
		
		driver.findElement(By.name("pwd")).sendKeys("admin01");//0-30sec
		
		driver.findElement(By.id("loginButton")).click();//0-30sec
		
		//to get home page title, we need to use conditional wait
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(20));		
		//we can implement required wait condition
		wait.until(ExpectedConditions.titleIs("actiTIME - Licenses"));
		System.out.println("Home page title: "+driver.getTitle());
		
		//waiting for logout link to be clickable
		wait.until(ExpectedConditions.elementToBeClickable(By.id("logoutLink")));
		driver.findElement(By.id("logoutLink")).click();
	}
}
/*
here script will be failed due to Sync issue.

Sync- Speed of automation tool is not matching with application

Sync
	1.implicit wait
	2.explicit wait (conditional wait)
	
	implicit wait is used to show something means is not in visible mode it is visible by doing something operation like click.
	for e.g. after clicking on directly login button u got error msg
	explicit wait is used when it is in stable state. means it is alredy in page bt it is not visible state due to synchronization.

*/