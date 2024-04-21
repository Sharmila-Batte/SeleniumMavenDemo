package com.dropdowns;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Assignment2RedBus {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://www.redbus.in/");
		WebElement src = driver.findElement(By.xpath("//div/input[@id='src']"));
		src.click();
		src.sendKeys("Pune");
		WebElement target = driver.findElement(By.xpath("//div/input[@id='dest']"));
		target.click();
		target.sendKeys("Goa");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[@class='sc-kAzzGY llxTcS']")).click();
		WebElement selectDate = driver.findElement(By.xpath("//div[@class='sc-jzJRlG dPBSOp']//div/span[text()='23']"));

		selectDate.click();
		driver.findElement(By.xpath("//button[text()='SEARCH BUSES']")).click();
		// Thread.sleep(1000);

		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(1000));
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//ul/li/label[@class='custom-checkbox'][1]"))).click();
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,500)");

//		List<WebElement> dTime = driver.findElements(By.xpath("//ul/li/label[@class='custom-checkbox']"));
//		for (int i = 0; i < dTime.size(); i++) 
//		{
//			
//			System.out.println(dTime.get(i).getText());
//		}
		// driver.switchTo().alert().dismiss();
		// driver.findElement(By.xpath("//div[@class='tripleFive-block']"));

		// driver.findElement(By.xpath("//i[@class='icon icon-close']")).click();
		wait.until(ExpectedConditions
				.elementToBeClickable(By.xpath("//li/label[@for='bt_AC' and @class='custom-checkbox']"))).click();

		// driver.findElement(By.xpath("//label[@for='bt_AC' and
		// @class='custom-checkbox']")).click();
		// ul[@class='bus-items']
		List<WebElement> busList = driver.findElements(By
				.xpath("//div[@class='travels lh-24 f-bold d-color']"));
		System.out.println(busList.size());
		List<WebElement> busPrice = driver.findElements(By.xpath("//div[@class='fare d-block']"));
		for (int i = 0; i < busList.size(); i++) {
			System.out.println(busList.get(i).getText() + " ---> " + busPrice.get(i).getText());
		}

	}

}

/*
 * Open Redbus.in From Pune To Goa Date in future Click on search button
 * Departure time should be after 6am Bus type “AC” Get the bus name along with
 * its price
 * 
 * for freezing screen setTimeout(function(){debugger;}, 5000)
 */
