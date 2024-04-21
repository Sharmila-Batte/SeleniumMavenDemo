package com.browseroperations;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment4 {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.manage().window().maximize();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		String unm=driver.findElement(By.cssSelector(".orangehrm-demo-credentials>*:nth-child(1)")).getText();
		String arrUnm[]=unm.split(":");
		String username=arrUnm[1].trim();
		String pwd=driver.findElement(By.cssSelector(".orangehrm-demo-credentials>*:nth-child(2)")).getText();
		String arrPwd[]=pwd.split(":");
		String password=arrPwd[1].trim();
		driver.findElement(By.name("username")).sendKeys(username);
		driver.findElement(By.name("password")).sendKeys(password);
		driver.findElement(By.className("orangehrm-login-button")).click();

	}

}


/*
https://opensource-demo.orangehrmlive.com/web/index.php/auth/login

get the username and password from the application and store it into a variable

enter username 
enter password
click on login button
*/