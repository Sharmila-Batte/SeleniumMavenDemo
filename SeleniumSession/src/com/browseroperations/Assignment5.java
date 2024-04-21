package com.browseroperations;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.utiliity.SeleniumUtility;

public class Assignment5 {

	public static void main(String[] args) {
		
		SeleniumUtility util=new SeleniumUtility();
		WebDriver driver=util.setUp("chrome", "https://www.saucedemo.com/");
		
		String userNames=driver.findElement(By.id("login_credentials")).getText();
		System.out.println("Usernames: "+userNames);
		String[] nameList=userNames.split("\n");
		String username=nameList[1].trim();
		System.out.println(nameList[1]);
		String pwd=driver.findElement(By.xpath("//div[@class='login_password']")).getText();
		String arrPwd[]=pwd.split("\n");
		String password=arrPwd[1].trim();
		driver.findElement(By.id("user-name")).sendKeys(username);
		driver.findElement(By.id("password")).sendKeys(password);
		driver.findElement(By.id("login-button")).click();
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	
		
	
		

	}



/*
https://www.saucedemo.com/

get the username and password from the application and store it into a variable

enter username 
enter password
click on login button
*/