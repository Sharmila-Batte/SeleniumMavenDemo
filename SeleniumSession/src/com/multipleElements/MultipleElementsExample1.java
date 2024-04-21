package com.multipleElements;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class MultipleElementsExample1 {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		// to maximize browser window use
		driver.manage().window().maximize();
		// implicit wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://online.actitime.com/cts1/login.do");
		List <WebElement> linkListCount=driver.findElements(By.tagName("a"));
		System.out.println("Count of links: "+linkListCount.size());
		
		for(int i=0;i<linkListCount.size();i++)
		{
//			WebElement link=linkListCount.get(i);
//			String hreflink=link.getAttribute("href");
//			System.out.println("href: "+hreflink);
			System.out.println("href link: "+linkListCount.get(i).getAttribute("href"));
			
		}
		
	}
}