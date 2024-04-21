package com.browseroperations;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Example3 {

	public static void main(String[] args) {

		WebDriver driver=new ChromeDriver();
		//to maximize browser window use
		driver.manage().window().maximize();
		//implicit wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://online.actitime.com/tcs/login.do");
		
		//username input field validation
		WebElement userNameInputField=driver.findElement(By.id("username"));
		System.out.println("Username input field, visible or not? "+userNameInputField.isDisplayed());
		System.out.println("Username input field, editable or not? "+userNameInputField.isEnabled());
		System.out.println("Username input field, default text displayed: "+userNameInputField.getAttribute("placeholder"));

		//keep me logged in check validation
		WebElement keepLoggedInCheckBox=driver.findElement(By.id("keepLoggedInCheckBox"));
		System.out.println("keepLoggedInCheckBox, visible or not? "+keepLoggedInCheckBox.isDisplayed());
		System.out.println("keepLoggedInCheckBox, clickable or not? "+keepLoggedInCheckBox.isEnabled());
		System.out.println("keepLoggedInCheckBox, by default selected or not? "+keepLoggedInCheckBox.isSelected());
		keepLoggedInCheckBox.click();
		System.out.println("keepLoggedInCheckBox,after clicking selected or not? "+keepLoggedInCheckBox.isSelected());
	
		//login button validation
		WebElement loginButton=driver.findElement(By.id("loginButton"));
		System.out.println("loginButton, visible or not? "+loginButton.isDisplayed());
		System.out.println("loginButton, clickable or not? "+loginButton.isEnabled());
		System.out.println("loginButton, button name: "+loginButton.getText());
	}

}