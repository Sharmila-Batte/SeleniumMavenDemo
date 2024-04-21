package com.keyboardops;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseAssignment1 {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://www.flipkart.com/");
		Actions action=new Actions(driver);
		List<WebElement> menuList=driver.findElements(By.xpath("//div[@class='_1ch8e_']"));
		for(int i=0;i<menuList.size();i++)
		{
			System.out.println(menuList.get(i).getText());
			Thread.sleep(1000);
			action.moveToElement(menuList.get(i)).perform();
		}

	}

}
/*

TC1:
Open any browser and enter flipkart url
Get the top menu count 
One by one print top menu names and also perform mouse hover operations

TC2:
Open any browser and enter https://www.espncricinfo.com/
Get the top menu count 
One by one print top menu names and also perform mouse hover operations

*/