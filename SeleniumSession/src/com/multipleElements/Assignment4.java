package com.multipleElements;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment4 {

	public static void main(String[] args) {

		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://demo.automationtesting.in/Register.html");
		List<WebElement>  headerList=driver.findElements(By.cssSelector(".navbar-inverse>.container>*:nth-child(2)>ul>li>a"));
		System.out.println(headerList.size());
		for(int i=0;i<headerList.size();i++)
		{
			System.out.println(headerList.get(i).getText());
		}

	}

}
