package com.multipleElements;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class MultipleElementsExample3 {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://www.google.com/");
		driver.findElement(By.cssSelector("#APjFqb")).sendKeys("Selenium");
		List<WebElement> listSelenium=driver.findElements(By.cssSelector((".G43f7e>li>div>*:nth-child(2)>div>*:nth-child(1)>span")));
		
		System.out.println("Suggestion count"+listSelenium.size());
		System.out.println("Suggestion count validation: "+(listSelenium.size()==10));
		for(int i=0;i<listSelenium.size();i++)
		{
			listSelenium=driver.findElements(By.cssSelector((".G43f7e>li>div>*:nth-child(2)>div>*:nth-child(1)>span")));
			System.out.println(i+"suggestion list: "+listSelenium.get(i).getText());
			System.out.println("\t\t\tSuggestion validation status: "+listSelenium.get(i).getText().contains("selenium"));
		}
		
		

	}

}

/*
 * open google and type selenium
 * check suggestion count is 10 or not
 * check each suggestion is having selenium or not
 */
