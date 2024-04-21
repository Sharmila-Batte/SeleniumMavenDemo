package com.multipleElements;

import java.time.Duration;
import java.util.HashMap;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class MultipleElementsExample2 {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		// to maximize browser window use
		driver.manage().window().maximize();
		// implicit wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
		driver.get("https://www.demoblaze.com/");
		// identify number link present in the page
		List<WebElement> deviceList = driver.findElements(By.cssSelector("#tbodyid>div>div>div>h4>a"));
		System.out.println("Device Count: " + deviceList.size());
		List<WebElement> devicePrice=driver.findElements(By.cssSelector("#tbodyid>div>div>div>h5"));
		
		
		
		
		
		for (int i = 0; i < deviceList.size(); i++) {
//	        WebElement element=deviceList.get(i);
//			String deviceName=element.getText();
//			System.out.println("device name: "+deviceName);
			//System.out.print(deviceList.get(i).getText());
			//System.out.println(devicePrice.get(i).getText());
			System.out.println("device name: "+deviceList.get(i).getText()+" ---> "+devicePrice.get(i).getText());
		}
	}
}
/*
 * Print device name along with its price
 * 
 */