package com.keyboardops;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Assignment3 {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://www.amazon.in/gift-card-store/b?ie=UTF8&node=3704982031");
	//WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(2000));
	//	wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[span[text()='Birthday']]/div/label/input"))).click();
		driver.findElement(By.xpath("//a[span[text()='Anniversary']]/div/label/input")).click();
	}
////a[span[text()='Birthday']]/div/label/input
}
