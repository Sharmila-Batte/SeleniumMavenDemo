package com.multipleElements;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment1 {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		//to maximize browser window use
		driver.manage().window().maximize();
		//implicit wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://www.gsmarena.com/");
		WebElement phoneFinder=driver.findElement(By.cssSelector(".brandmenu-v2"));
		List<WebElement> deviceName=phoneFinder.findElements(By.cssSelector("#body>aside>div>ul>li>a"));
	
		
		System.out.println(deviceName.size());
		for(int i=0;i<deviceName.size();i++)
		{
			System.out.println(deviceName.get(i).getText());
		}
		
		
		
		

	}

}



/*
TC1:
	https://www.gsmarena.com/
	print mobile brand count and names
	*/