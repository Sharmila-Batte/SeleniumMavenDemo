package com.keyboardops;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment2 {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://www.flipkart.com/samsung-mobile-store?otracker=nmenu_sub_Electronics_0_Samsung");
		System.out.println(driver.findElement(By.xpath("//a[text()='SAMSUNG Galaxy S24 Ultra 5G (Titanium Gray, 512 GB)']/parent::div/parent::div/parent::div/div/div/div/div[1]")).getText());
	}

}



//get any latest samsung mobile price. 