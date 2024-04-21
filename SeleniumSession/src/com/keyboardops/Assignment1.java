package com.keyboardops;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment1 {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://www.demoblaze.com/");
		System.out.println(driver.findElement(By.xpath("//a[text()='Sony xperia z5']/parent::h4/parent::div/h5")).getText());
		

	}

}
//get Sony xperia z5 price