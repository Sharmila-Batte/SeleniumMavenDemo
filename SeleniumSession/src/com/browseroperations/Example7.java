package com.browseroperations;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Example7 {

	public static void main(String[] args) {
		
		WebDriver driver=new ChromeDriver();
		//implicit wait - will be used as default wait for WebDriver instance
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		driver.get("https://online.actitime.com/tcs/login.do");//0-30sec
		
		driver.findElement(By.id("username")).sendKeys("admin01");//0-30sec
		
		driver.findElement(By.name("pwd")).sendKeys("admin01");//0-30sec
		
		driver.findElement(By.id("loginButton")).click();//0-30sec
		
		//waiting for logout link to be clickable
		Wait<WebDriver> wait=new FluentWait<WebDriver>(driver)
		.withTimeout(Duration.ofSeconds(30))//total time 
		.pollingEvery(Duration.ofSeconds(5))//retry time
		.ignoring(NoSuchElementException.class);//exception handling while re-try
		
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

*/