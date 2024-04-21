package com.jsscript;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.utility.SeleniumUtility;

public class Example1 extends  SeleniumUtility{

	public static void main(String[] args) {
		Example1 e1=new Example1();
		e1.testCase1();
		e1.testCase2();

	}
	public void testCase1()
	{
		SeleniumUtility util=new SeleniumUtility();
		WebDriver driver=util.setUp("chrome","https://demo.vtiger.com/vtigercrm/index.php");
		WebElement element=driver.findElement(By.cssSelector(".buttonBlue"));
		JavascriptExecutor  js=(JavascriptExecutor)driver;
		js.executeScript("arguments[0].click();", element);
	}
	
	public void testCase2()
	{
		SeleniumUtility util=new SeleniumUtility();
	    WebDriver driver=util.setUp("chrome","https://demo.vtiger.com/vtigercrm/index.php");
	    JavascriptExecutor js=(JavascriptExecutor)driver;
	    js.executeScript("document.getElementsByClassName('button buttonBlue')[0].click();");
	    
	}

}
