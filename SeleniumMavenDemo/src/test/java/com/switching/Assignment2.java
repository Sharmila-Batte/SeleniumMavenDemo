package com.switching;

import java.util.Collections;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import com.utility.SeleniumUtility;

public class Assignment2 {

	public static void main(String[] args) throws InterruptedException {
		SeleniumUtility util = new SeleniumUtility();
		WebDriver driver = util.setUp("chrome","https://jqueryui.com");
		Actions action=new Actions(driver);
		util.clickOnElement(driver.findElement(By.xpath("//a[text()='Sortable']")));
		WebElement frame1=driver.findElement(By.xpath("//iframe[@class='demo-frame']"));
		driver.switchTo().frame(frame1);
		List<WebElement> sortElement=driver.findElements(By.cssSelector(".ui-state-default.ui-sortable-handle"));
		//Collections.sort(sortElement);
		System.out.println("Elemnts are in asscending order");
		for(int i=0;i<sortElement.size();i++)
		{
			
			System.out.println(sortElement.get(i).getText());
		}
		/*Collections.reverse(sortElement);
		System.out.println("Elemnts are in descending order");
		for(int i=0;i<sortElement.size();i++)
		{
			
			System.out.println(sortElement.get(i).getText());
		}*/
		
		WebElement src=driver.findElement(By.xpath("//li[@class='ui-state-default ui-sortable-handle'][7]"));
		WebElement target=driver.findElement(By.xpath("//li[@class='ui-state-default ui-sortable-handle'][1]"));
		action.dragAndDrop(src, target).build().perform();
		Thread.sleep(1000); 
		
		WebElement src1=driver.findElement(By.xpath("//li[@class='ui-state-default ui-sortable-handle'][7]"));
	    WebElement target1=driver.findElement(By.xpath("//li[@class='ui-state-default ui-sortable-handle'][2]"));
	    action.dragAndDrop(src1, target1).build().perform();
	    Thread.sleep(1000);
	    
	    WebElement src2=driver.findElement(By.xpath("//li[@class='ui-state-default ui-sortable-handle'][7]"));
	    WebElement target2=driver.findElement(By.xpath("//li[@class='ui-state-default ui-sortable-handle'][3]"));
	    action.dragAndDrop(src2, target2).build().perform();
	    Thread.sleep(1000);
	    
	    WebElement src3=driver.findElement(By.xpath("//li[@class='ui-state-default ui-sortable-handle'][7]"));
	    WebElement target3=driver.findElement(By.xpath("//li[@class='ui-state-default ui-sortable-handle'][4]"));
	    action.dragAndDrop(src3, target2).build().perform();
	    Thread.sleep(1000);
	    
	    WebElement src4=driver.findElement(By.xpath("//li[@class='ui-state-default ui-sortable-handle'][7]"));
	    WebElement target4=driver.findElement(By.xpath("//li[@class='ui-state-default ui-sortable-handle'][5]"));
	    action.dragAndDrop(src4, target2).build().perform();
	    Thread.sleep(1000);
	    
	    WebElement src5=driver.findElement(By.xpath("//li[@class='ui-state-default ui-sortable-handle'][7]"));
	    WebElement target5=driver.findElement(By.xpath("//li[@class='ui-state-default ui-sortable-handle'][6]"));
	    action.dragAndDrop(src5, target2).build().perform();
	    Thread.sleep(1000);
	
//		
	}

}
/*
TC1:
Open browser and enter URL as https://jqueryui.com 
click on sortable 
 sort the element from 7 to 1
*/