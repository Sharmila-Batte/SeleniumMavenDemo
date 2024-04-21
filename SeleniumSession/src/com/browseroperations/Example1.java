package com.browseroperations;
import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Example1 {

	public static void main(String[] args) {

		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		//to maximize browser window use
		driver.manage().window().maximize();
		//to minimize browser window use
		driver.manage().window().minimize();
		//when you want to keep browser window based on required Dimension
		driver.manage().window().setSize(new Dimension(400,600));
		//to maximize browser window use
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");
		
		//driver.findElement(By.className("ico-register")).click();
	}


	}


