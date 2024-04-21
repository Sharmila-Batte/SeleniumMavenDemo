package com.testngdemo;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.utility.SeleniumUtility1;

public class Assignment1 extends SeleniumUtility1 {

	

		@Test
		public void sourceDemoShopping() {
			
			setUp("Chrome","https://www.saucedemo.com/");
			typeInput(driver.findElement(By.id("user-name")),"standard_user");
			typeInput(driver.findElement(By.id("password")),"secret_sauce");
			WebElement login=driver.findElement(By.id("login-button"));
			clickOnElement(login);
			cleanUp();
			
			
			
		}
		
		@Test(priority=1)
		public void orangeHRM_PIMCreation() throws InterruptedException {
			
			setUp("chrome", "https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
			//Login
			typeInput(driver.findElement(By.name("username")),"Admin");
			typeInput(driver.findElement(By.name("password")),"admin123");
			clickOnElement(driver.findElement(By.cssSelector(".orangehrm-login-button")));
			clickOnElement(driver.findElement(By.xpath("//span[text()='PIM']")));
			//clickOnElement(driver.findElement(By.cssSelector(".oxd-main-menu-item.active")));
			clickOnElement(driver.findElement(By.xpath("//div[@class='orangehrm-header-container']/button")));
			typeInput(driver.findElement(By.cssSelector(".orangehrm-firstname")), "Sharmila");
			typeInput(driver.findElement(By.cssSelector(".orangehrm-middlename")), "S");
			typeInput(driver.findElement(By.cssSelector(".orangehrm-lastname")), "Malkar");
			Thread.sleep(1000);
			// Emp id
			WebElement empId = driver.findElement(By.xpath("//div/div[2]/input[@class='oxd-input oxd-input--active']"));
			empId.sendKeys(Keys.chord(Keys.CONTROL, "a"), "9834");
			// click on save
			clickOnElement(driver.findElement(By.xpath("//button[@type='submit']")));
			Thread.sleep(1000);
			// verification
			clickOnElement(driver.findElement(By.cssSelector(".oxd-main-menu-item.active")));
			WebElement empId1 = driver.findElement(By.xpath("//div/div[2]/input"));
			empId1.sendKeys("9834");
			clickOnElement(driver.findElement(By.xpath("//div[@class='oxd-form-actions']/button[2]")));
			Thread.sleep(1000);
			WebElement record = driver.findElement(By.xpath("//div[@class='oxd-table-body']/div/div"));
			System.out.println(record.getText().contains("9834"));
			// Validation
			String actualURL = "viewEmployeeList";
			String ExpectedURL = "https://opensource-demo.orangehrmlive.com/web/index.php/pim/viewEmployeeList";
			Assert.assertTrue(ExpectedURL.contains(actualURL));
			//LogOut
			Thread.sleep(1000);
			clickOnElement(driver.findElement(By.xpath("//i[@class='oxd-icon bi-caret-down-fill oxd-userdropdown-icon']")));
			clickOnElement(driver.findElement(By.xpath("//a[text()='Logout']")));
			cleanUp();

			
			
			
		}
		
		@Test(priority=2,dependsOnMethods="orangeHRM_PIMCreation")
		public void orangeHRM_PIMUpdate() throws InterruptedException {
			
			setUp("chrome", "https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
			//Login
			typeInput(driver.findElement(By.name("username")),"Admin");
			typeInput(driver.findElement(By.name("password")),"admin123");
			clickOnElement(driver.findElement(By.cssSelector(".orangehrm-login-button")));
			clickOnElement(driver.findElement(By.xpath("//span[text()='PIM']")));
			// Emp id
			WebElement empId = driver.findElement(By.xpath("//div/div[2]/input"));
			empId.sendKeys("9834");
			// typeInput(empId,"4545");
			// search
			clickOnElement(driver.findElement(By.xpath("//div[@class='oxd-form-actions']/button[2]")));
			Thread.sleep(1000);
			// Click on edit
			clickOnElement(driver.findElement(By.xpath("//div[@class='oxd-table-cell-actions']/button[2]")));
			Thread.sleep(1000);
			// Click on job
			clickOnElement(driver.findElement(By.xpath("//a[text()='Job']")));
			Thread.sleep(3000);
			// select job
			WebElement selectJob = driver.findElement(By.cssSelector(".oxd-select-text-input"));
			clickOnElement(selectJob);
			Thread.sleep(1000);
			selectJob.sendKeys(Keys.ARROW_DOWN, Keys.ENTER);
            Thread.sleep(1000);
			// click on save button
			clickOnElement(driver.findElement(By.xpath("//button[@type='submit']")));
			// verification
			// click on PIM
			clickOnElement(driver.findElement(By.cssSelector(".oxd-main-menu-item.active")));
			typeInput(driver.findElement(By.xpath("//div/div[2]/input")), "9834");
			clickOnElement(driver.findElement(By.xpath("//div[@class='oxd-form-actions']/button[2]")));
			WebElement record = driver.findElement(By.xpath("//div[@class='oxd-table-body']"));
			System.out.println(record.getText().contains("Account Assistant"));

			// Validation
            String actualURL = "viewEmployeeList";
			String ExpectedURL = "https://opensource-demo.orangehrmlive.com/web/index.php/pim/viewEmployeeList";
			Assert.assertTrue(ExpectedURL.contains(actualURL));
			//LogOut
			Thread.sleep(1000);
			clickOnElement(driver.findElement(By.xpath("//i[@class='oxd-icon bi-caret-down-fill oxd-userdropdown-icon']")));
			clickOnElement(driver.findElement(By.xpath("//a[text()='Logout']")));
			cleanUp();

		}
		
		@Test(priority=3,dependsOnMethods="orangeHRM_PIMCreation")
		public void orangeHRM_PIMDelete() throws InterruptedException {
			setUp("chrome", "https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
			//Login
			typeInput(driver.findElement(By.name("username")),"Admin");
			typeInput(driver.findElement(By.name("password")),"admin123");
			clickOnElement(driver.findElement(By.cssSelector(".orangehrm-login-button")));
			clickOnElement(driver.findElement(By.xpath("//span[text()='PIM']")));
			WebElement empId = driver.findElement(By.xpath("//div/div[2]/input"));
			empId.sendKeys("9834");
			// typeInput(empId,"4545");
			clickOnElement(driver.findElement(By.xpath("//div[@class='oxd-form-actions']/button[2]")));
			Thread.sleep(1000);
			clickOnElement(driver.findElement(By.xpath("//div[@class='oxd-table-cell-actions']/button[1]")));
			clickOnElement(driver.findElement(By.xpath("//div[@class='orangehrm-modal-footer']/button[2]")));
			// typeInput(driver.findElement(By.xpath("//div/div[2]/input")),"86052");
			Thread.sleep(1000);
			empId.sendKeys("9834");
			// verification
			clickOnElement(driver.findElement(By.xpath("//div[@class='oxd-form-actions']/button[2]")));
			WebElement record = driver.findElement(By.xpath("//div[@class='oxd-table-body']"));
			System.out.println(record.getText().contains(""));
			// Validation

			String actualURL = "viewEmployeeList";
			String ExpectedURL = "https://opensource-demo.orangehrmlive.com/web/index.php/pim/viewEmployeeList";
			Assert.assertTrue(ExpectedURL.contains(actualURL));
			
			//LogOut
			Thread.sleep(1000);
			clickOnElement(driver.findElement(By.xpath("//i[@class='oxd-icon bi-caret-down-fill oxd-userdropdown-icon']")));
			clickOnElement(driver.findElement(By.xpath("//a[text()='Logout']")));
			cleanUp();

			
		}


	}


