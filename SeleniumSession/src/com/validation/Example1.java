package com.validation;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Example1 {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		//to maximize browser window use
		driver.manage().window().maximize();
		//implicit wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://demowebshop.tricentis.com/login");
		
		driver.findElement(By.className("login-button")).click();

		WebElement errorMsg=driver.findElement(By.className("validation-summary-errors"));
		
		String errorMsgTextColor=errorMsg.getCssValue("color");
		System.out.println("Error msg text color: "+errorMsgTextColor);		
		System.out.println("Error msg font size: "+errorMsg.getCssValue("font-size"));		
		System.out.println("Error msg font size: "+errorMsg.getCssValue("font-family"));
		
		Point errorPoint=errorMsg.getLocation();
		int error_x=errorPoint.getX();
		int error_y=errorPoint.getY();
		System.out.println("Error Msg x cord: "+error_x);
		System.out.println("Error Msg y cord: "+error_y);
		
		WebElement emailId=driver.findElement(By.id("Email"));
		Point emailPoint=emailId.getLocation();
		int emailId_x=emailPoint.getX();
		int emailId_y=emailPoint.getY();
		System.out.println("emailId x cord: "+emailId_x);
		System.out.println("emailId y cord: "+emailId_y);
		
		System.out.println("Is email id diplayed below error msg? "+(error_y<emailId_y));
		
		
	}

}
/*

validate error msg is in red color

validate error msg is getting displayed above email id input field

*/
