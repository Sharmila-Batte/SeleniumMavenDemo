package com.validation;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Assignment {

	public static void main(String[] args)  {

		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(0));
		driver.get("https://www.opencart.com/index.php?route=account/login");
	    driver.findElement(By.className("btn-primary")).click();
	    WebDriverWait wait =new WebDriverWait(driver,Duration.ofSeconds(20));
	    wait.until(ExpectedConditions.visibilityOfElementLocated(By.className("alert-danger")));
	    
	    
	    WebElement errorMsg=driver.findElement(By.className("alert-danger"));
	   System.out.println(errorMsg.getCssValue("color"));
	   System.out.println(errorMsg.getCssValue("background-color"));
	   System.out.println(errorMsg.getCssValue("font-family"));
	   System.out.println(errorMsg.getCssValue("font-family"));
	   
	
	}

}


/*
https://www.opencart.com/index.php?route=account/login

validate error msg is above Login header 

button:
	text color
	background color
	font size
	font-family
*/