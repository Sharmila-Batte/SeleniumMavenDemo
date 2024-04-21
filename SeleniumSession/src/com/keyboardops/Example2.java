package com.keyboardops;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Example2 {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://demo.automationtesting.in/Register.html");
		Actions action=new Actions(driver);
		List<WebElement> menuList = driver.findElements(By.xpath("//ul[@class='nav navbar-nav']/li/a"));
		//hover on particular element like webtable
		action.moveToElement(menuList.get(2)).perform();
		for(int i=0;i<menuList.size();i++)
		{
			System.out.println(menuList.get(i).getText());
			Thread.sleep(1000);
			action.moveToElement(menuList.get(i)).perform();
		}
		//hover on SwitchTo using Webtable
        action.moveToElement(menuList.get(2),100,0).perform();
	}

}
