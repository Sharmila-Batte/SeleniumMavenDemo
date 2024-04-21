package com.browseroperations;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment3 {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.manage().window().maximize();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		WebElement usrnm=driver.findElement(By.name("username"));
		System.out.println("Username input field, visible or not?"+usrnm.isDisplayed());
		System.out.println("Username input field, editable or not?"+usrnm.isEnabled());
		System.out.println("Username input field, default text displayed:"+usrnm.getAttribute("name"));
		
		WebElement password=driver.findElement(By.name("password"));
		System.out.println("password input field, visible or not?"+password.isDisplayed());
		System.out.println("password input field, editable or not?"+password.isEnabled());
		System.out.println("password input field, default text displayed"+password.getAttribute("placeholder"));
		
		WebElement loginBtn=driver.findElement(By.className("orangehrm-login-button"));
		System.out.println("Login button field visible or not?"+loginBtn.isDisplayed());
		System.out.println("Login button field, clickable or not?"+loginBtn.isEnabled());
		System.out.println("Login Button, button name: "+loginBtn.getText());

		WebElement forgotPwd=driver.findElement(By.className("orangehrm-login-forgot-header"));
		System.out.println("Forgot password field, visible or not?"+forgotPwd.isDisplayed());
		System.out.println("Forgot password field,	clickable or not?"+forgotPwd.isEnabled());
		System.out.println("Forgot password button name: "+forgotPwd.getText());
	}

}




/*
https://opensource-demo.orangehrmlive.com/web/index.php/auth/login
Admin/admin123

validation:
	Username:
	visible or not --->
	editable or not--->
	default value--->
	
	password:
	visible or not --->
	editable or not--->
	default value--->

Login button:
	visible or not--->
	clickable or not--->
	button name--->

Forgot your password?
	visible or not--->
	clickable or not--->
	link name--->

*/