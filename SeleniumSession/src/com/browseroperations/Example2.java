package com.browseroperations;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Example2 {

	public static void main(String[] args) {

		WebDriver driver=new ChromeDriver();
		//to maximize browser window use
		driver.manage().window().maximize();
		//implicit wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://demowebshop.tricentis.com/");
		
		driver.findElement(By.className("ico-register")).click();
		System.out.println("Registration page url: "+driver.getCurrentUrl());
		
		//want to come back to main page
		driver.navigate().back();
		System.out.println("Main page url: "+driver.getCurrentUrl());
		
		//want to go back to Registration page
		driver.navigate().forward();
		System.out.println("Registration page url: "+driver.getCurrentUrl());
		
		//want to reload/refresh the page
		driver.navigate().refresh();
		
		//want to move to new application url directly
		driver.navigate().to("https://www.google.com");
		
	}

}