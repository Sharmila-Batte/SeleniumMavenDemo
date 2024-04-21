package com.jsscript;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;

import com.utility.SeleniumUtility;

public class Example2 extends SeleniumUtility {

	public static void main(String[] args) {
		Example2 e1=new Example2();
		e1.testCase1();

	}
	public void testCase1()
	{
		WebDriver driver=setUp("Chrome","https://online.actitime.com/cts1/login.do");
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("document.getElementById('username').value='admin01';");
		js.executeScript("document.getElementsByName('pwd')[0].value='admin01';");
		js.executeScript("document.getElementById('loginButton').click();");
	
		//WebElement element=driver.findElement(By.id("loginButton"));
		//js.executeScript("argunments[0].click();",element);
		
    }

}
