package com.testngdemo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Example07 {
  @Test(enabled=true)
  public void testActitimeWithOutAssert() {
	  WebDriver driver=new ChromeDriver();
		driver.get("https://online.actitime.com/cts1/login.do");
		String actualTitle=driver.getTitle();
		String expectedTitle="actiTIME -  Login";
		System.out.println("Login page validation: "+actualTitle.equals(expectedTitle));
  }
  
  @Test
  public void testActitimeWithAssert1() {
	  WebDriver driver=new ChromeDriver();
		driver.get("https://online.actitime.com/cts1/login.do");
		String actualTitle=driver.getTitle();
		String expectedTitle="actiTIME - Login";
		Assert.assertTrue(actualTitle.equals(expectedTitle));
  }
  @Test
  public void testActitimeWithAssert2() {
	  WebDriver driver=new ChromeDriver();
		driver.get("https://online.actitime.com/cts1/login.do");
		String actualTitle=driver.getTitle();
		String expectedTitle="actiTIME -  Login";
		Assert.assertTrue(actualTitle.equals(expectedTitle),"Login page not opened or title got changed");
  }
  
  @Test
  public void testActitimeWithAssert3() {
	  WebDriver driver=new ChromeDriver();
		driver.get("https://online.actitime.com/cts1/login.do");
		String actualTitle=driver.getTitle();
		String expectedTitle="actiTIME - Login";
		Assert.assertEquals(actualTitle, expectedTitle);
  }
  @Test
  public void testActitimeWithAssert4() {
	  WebDriver driver=new ChromeDriver();
		driver.get("https://online.actitime.com/cts1/login.do");
		String actualTitle=driver.getTitle();
		String expectedTitle="actiTIME -  Login";
		Assert.assertEquals(actualTitle, expectedTitle,"Login page not opened or title got changed");
  }
}