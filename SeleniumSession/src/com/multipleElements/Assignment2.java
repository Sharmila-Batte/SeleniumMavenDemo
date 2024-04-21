package com.multipleElements;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment2 {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		//to maximize browser window use
		driver.manage().window().maximize();
		//implicit wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://www.gsmarena.com/samsung-phones-9.php");
		List <WebElement> samsungName=driver.findElements(By.cssSelector(".section-body>div>ul>li>a"));
		System.out.println(samsungName.size());
		for(int i=0;i<samsungName.size();i++)
		{
			System.out.println(samsungName.get(i).getText());
		}

	}

}


/*

TC2: 
https://www.gsmarena.com/samsung-phones-9.php
print all device count and name
*/