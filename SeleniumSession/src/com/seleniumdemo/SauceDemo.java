package com.seleniumdemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SauceDemo {

	public static void main(String[] args) {
	WebDriver driver =new ChromeDriver();
	driver.get("https://www.saucedemo.com/");
	 
	WebElement username=driver.findElement(By.id("user-name"));
	username.sendKeys("standard_user");
	
	WebElement password=driver.findElement(By.name("password"));
	password.sendKeys("secret_sauce");
	
	WebElement login=driver.findElement(By.id("login-button"));
	login.click();
	
	

	}

}
