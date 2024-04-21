package com.validation;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Example2 {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		//to maximize browser window use
		driver.manage().window().maximize();
		//implicit wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://www.saucedemo.com/");
		
		WebElement loginButton=driver.findElement(By.id("login-button"));
		
		String buttonTextColor=loginButton.getCssValue("color");
		System.out.println("Button text color: "+buttonTextColor);
		System.out.println("Button background color: "+loginButton.getCssValue("background-color"));
		
		System.out.println("Button text size: "+loginButton.getCssValue("font-size"));
		System.out.println("Button text family: "+loginButton.getCssValue("font-family"));
		
		
		
	}

}
/*

validate error msg is in red color

validate error msg is getting displayed above email id input field

*/