package com.multipleElements;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ExampleCssSelector {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		//to maximize browser window use
		driver.manage().window().maximize();
		//implicit wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://online.actitime.com/cts1/login.do");
		
		driver.findElement(By.cssSelector("#username")).sendKeys("admin01");
		
		driver.findElement(By.cssSelector("input[placeholder='Password']")).sendKeys("admin01");
		
		driver.findElement(By.cssSelector(".initial")).click();
	}

}