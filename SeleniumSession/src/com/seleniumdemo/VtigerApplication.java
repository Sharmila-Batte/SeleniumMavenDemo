package com.seleniumdemo;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class VtigerApplication {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://demo.vtiger.com/vtigercrm/index.php");
		
		WebElement userName=driver.findElement(By.id("username"));
		userName.clear();
		userName.sendKeys("admin");

		WebElement password=driver.findElement(By.id("password"));
		password.clear();
		password.sendKeys("admin");
		
		WebElement signIn=driver.findElement(By.className("buttonBlue"));
		signIn.click();
		
		//driver.close();
		
		}

}
