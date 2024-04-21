package com.testngdemo;


import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.utility.SeleniumUtility1;



public class GoogleWithAssert extends SeleniumUtility1{

	@Test
	public void testGooglePage() {
		setUp("chrome", "https://www.google.com");
		String expectedTitle="Google";
		String actualTitle=getCurrentTitleOfApplication();
		Assert.assertEquals(actualTitle, expectedTitle);
	}
	
	@Test
	public void testSearchedGooglePage() {
		setUp("chrome", "https://www.google.com");
		typeInput(driver.findElement(By.name("q")), "selenium");
		getActiveElementFromUI().sendKeys(Keys.ENTER);
		String expectedTitle="selenium - Google Search";
		String actualTitle=getCurrentTitleOfApplication();
		Assert.assertEquals(actualTitle, expectedTitle);
	}
	
	@Test
	public void testSearchedGooglePage2() {
		setUp("chrome", "https://www.google.com");
		typeInput(driver.findElement(By.name("q")), "selenium");
		getActiveElementFromUI().sendKeys(Keys.ENTER);
		String expectedTitle="selenium";
		String actualTitle=getCurrentTitleOfApplication();
		Assert.assertEquals(actualTitle, expectedTitle);
	}
	
	@Test
	public void testSearchedGooglePage3() {
		setUp("chrome", "https://www.google.com");
		typeInput(driver.findElement(By.name("q")), "selenium");
		getActiveElementFromUI().sendKeys(Keys.ENTER);
		String expectedTitle="selenium";
		String actualTitle=getCurrentTitleOfApplication();
		Assert.assertEquals(actualTitle, expectedTitle,"Either google search page not opened or title got changed");
	}
	
	@Test
	public void testSearchedGooglePag4() {
		setUp("chrome", "https://www.google.com");
		typeInput(driver.findElement(By.name("q")), "selenium");
		getActiveElementFromUI().sendKeys(Keys.ENTER);
		String expectedTitle="selenium - Google Search";
		String actualTitle=getCurrentTitleOfApplication();
		Assert.assertEquals(actualTitle, expectedTitle,"Either google search page not opened or title got changed");
	}
	
}