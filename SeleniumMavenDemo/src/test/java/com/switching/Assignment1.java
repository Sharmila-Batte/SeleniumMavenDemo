package com.switching;

import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import com.utility.SeleniumUtility;

public class Assignment1 {

	public static void main(String[] args) throws InterruptedException {

		SeleniumUtility util = new SeleniumUtility();
		WebDriver driver = util.setUp("Chrome", "https://erail.in/");
	
		WebElement catering= (driver.findElement(By.xpath("//a[text()='eCatering']")));
		util.clickOnElement(catering);
		Set<String> windows = driver.getWindowHandles();
		Iterator<String> itr = windows.iterator();
		String parentId = itr.next();
		String childId = itr.next();
		driver.switchTo().window(childId);
		
		WebElement search=driver.findElement(By.cssSelector(".form-input"));
		search=driver.findElement(By.cssSelector(".form-input"));
		util.waitForElement(search);
		util.clickOnElement(search);
		driver.findElement(By.xpath("//input[@placeholder='Start typing Nagpur, NGP, Rajdhani']")).sendKeys("12627");
		util.clickOnElement(driver.findElement(By.cssSelector(".body-3")));
	    Actions	action = new Actions(driver);
        driver.findElement(By.cssSelector(".custom-date-picker")).click();
	    //((Actions) date).keyDown(Keys.ARROW_DOWN).keyUp(Keys.ARROW_DOWN).build().perform();

	   //action.moveToElement(date).keyDown(Keys.CONTROL).click().keyUp(Keys.CONTROL).keyDown(Keys.ARROW_DOWN).keyUp(Keys.ARROW_DOWN).build().perform();



	    WebElement datePicker=driver.switchTo().activeElement();       
	    String dateActiElement=util.getAttributeValue(datePicker,"type");
        System.out.println(dateActiElement.equals("date"));
        
        driver.switchTo().activeElement().sendKeys((Keys.ARROW_DOWN),(Keys.ENTER));
        Thread.sleep(1000);
        WebElement boardingDrop=driver.findElement(By.xpath("//div/select"));
        util.clickOnElement(boardingDrop);
        Select select=new Select(boardingDrop);
       //WebElement itarasi= driver.findElement(By.xpath("//*[@value='ET']"));
       //action.scrollToElement(itarasi).perform();
        select.selectByValue("ET");
		Thread.sleep(1000);
		util.clickOnElement(driver.findElement(By.xpath("//button[text()='FIND FOOD']")));
		Thread.sleep(1000);
		List<WebElement> restroList=driver.findElements(By.xpath("//div[@class='flex w-2/3 flex-col gap-4 pb-24 pl-6 pt-10']//div/div/div/div[2]//h5[@class='tracking-normal ']"));
		//
		////div[@class='flex flex-wrap items-center mb-2 ']/h5
		System.out.println(restroList.size());
	    for(int i=0;i<restroList.size();i++)
	    {
	    	System.out.println(restroList.get(i).getText());
	    }
	}

}

/*
 * TC5: https://erail.in/ click on eCatering enter train number 12627 and select
 * from suggestion date from next month any station (Itarsi) click submit print
 * all resturent names go back home page perform following 1. from: Pune 2. to:
 * Bangalore 3. date from next month 4. click on get trains print all the train
 * numbers and name which are running on that particular date
 */