package maventesting;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.utiliity.SeleniumUtility;

public class Example1 {

	public static void main(String[] args) {
		SeleniumUtility util=new SeleniumUtility();
		WebDriver driver=util.setUp("chrome", "https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		
		util.typeRequiredText(driver.findElement(By.name("username")), "Admin");
		util.typeRequiredText(driver.findElement(By.name("password")), "admin123");
		util.clickOnElement(driver.findElement(By.className("orangehrm-login-button")));
		String expectedUrl="dashboard";
		String actualUrl=util.getApplicationUrl();
		System.out.println("Url validation: "+actualUrl.contains(expectedUrl));
		
	}

}