package com.testngdemo;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import com.utility.SeleniumUtility1;

public class OrangeHrmPIM extends SeleniumUtility1 {

	@Test(priority = 2)
	public void testOrangeHrmLogin_PositiveFlow() {
		setUp("chrome", "https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		typeInput(driver.findElement(By.name("username")), "Admin");
		typeInput(driver.findElement(By.name("password")), "admin123");
		clickOnElement(driver.findElement(By.cssSelector(".orangehrm-login-button")));
		String expectedUrl = "dashboard";
		System.out.println("Positive login validation: " + getCurrentUrlOfApplication().contains(expectedUrl));
		driver.close();
	}

	@Test(priority = 1)
	public void testOrangeHrmLogin_NegativeFlow() {
		setUp("chrome", "https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		typeInput(driver.findElement(By.name("username")), "Admin");
		typeInput(driver.findElement(By.name("password")), "admin123");
		clickOnElement(driver.findElement(By.cssSelector(".orangehrm-login-button")));
		String expectedUrl = "login";
		System.out.println("Negative login validation: " + getCurrentUrlOfApplication().contains(expectedUrl));
		driver.close();
	}
}