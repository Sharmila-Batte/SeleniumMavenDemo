package com.dropdowns;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Example3 {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://thompsonsj.com/bootstrap-select-dropdown/");
		driver.findElement(By.cssSelector(".dropdown-toggle")).click();
		List <WebElement>countryList=driver.findElements(By.cssSelector(".dropdown-menu-right.show>div>a"));
		System.out.println(countryList.size());
		for(int i=0;i<countryList.size();i++)
		{
			System.out.println(countryList.get(i).getText());
		}
		countryList.get(3).click();

	}

}
