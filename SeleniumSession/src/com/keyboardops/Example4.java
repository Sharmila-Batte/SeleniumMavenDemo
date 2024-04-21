package com.keyboardops;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class Example4 {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://jqueryui.com/droppable/");
		Actions action=new Actions(driver);
		//to get inside the frame use below statement
		driver.switchTo().frame(0);
		//to perform drag and drop first identify source and target
		WebElement src=driver.findElement(By.id("draggable"));
		WebElement target=driver.findElement(By.id("droppable"));
		action.dragAndDrop(src, target).build().perform();

	}
	public static WebDriver setUp(String browserName,String appUrl)
	{
		WebDriver driver=null;
		if(browserName.equalsIgnoreCase("Chrome"))
		{
			driver = new ChromeDriver();
		}
		else if(browserName.equalsIgnoreCase("Firefox"))
		{
			driver = new FirefoxDriver();
		}
		else if(browserName.equalsIgnoreCase("Edge"))
		{
			driver = new EdgeDriver();
		}
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("appUrl");
		return driver;
		
	}

}
