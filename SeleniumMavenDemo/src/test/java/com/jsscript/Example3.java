package com.jsscript;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;

import com.utility.SeleniumUtility;

public class Example3 extends SeleniumUtility{

	public static void main(String[] args) throws InterruptedException {
		Example3 e1=new Example3();
		e1.testCase1();

	}
	public void testCase1() throws InterruptedException
	{
		WebDriver driver=setUp("Chrome","https://www.amazon.in/ref=nav_logo");
		JavascriptExecutor js=(JavascriptExecutor)driver;
		//vertical scrolling
		js.executeScript("window.scrollBy(0,25000)");
		Thread.sleep(2000);
		js.executeScript("window.scrollBy(0,-25000)");
		Thread.sleep(2000);
		js.executeScript("window.scrollTo(0,document.bodyscrollHeight);");
		Thread.sleep(2000);
		//Horizontal scrolling
		js.executeScript("window.scrollBy(500,0)");
		
				
	}

}
