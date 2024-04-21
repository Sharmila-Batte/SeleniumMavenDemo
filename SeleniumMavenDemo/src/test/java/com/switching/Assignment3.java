package com.switching;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.utility.SeleniumUtility;

public class Assignment3 {

	public static void main(String[] args) throws InterruptedException {
		SeleniumUtility util = new SeleniumUtility();
		WebDriver driver = util.setUp("chrome","https://www.rakuten.com/");
		WebElement signInLink=driver.findElement(By.id("header_sign_in"));
		util.clickOnElement(signInLink);
		WebElement frame=driver.findElement(By.cssSelector("#auth-microsite-iframe"));
		driver.switchTo().frame(frame);
		WebElement usrenm=driver.findElement(By.id("emailAddress"));
		util.typeRequiredText(usrenm, "abc@gmail.com");
		WebElement passwd=driver.findElement(By.id("password"));
		util.typeRequiredText(passwd, "abcd@1234");
		//driver.switchTo().defaultContent();
		//WebElement frameSignInBtn=driver.findElement(By.cssSelector("iframe[style='display: none;']:nth-child(2)"));
		//driver.switchTo().frame(frameSignInBtn);
		WebElement signInBtn=driver.findElement(By.xpath("//button[@type='submit']"));
		signInBtn=driver.findElement(By.xpath("//button[@type='submit']"));
		util.clickOnElement(signInBtn);
		Thread.sleep(1000);
		//Validation
		WebElement errorMsg=driver.findElement(By.xpath("//div[@role='alert']"));
		//Validate error msg:
		String ActualErrorMsg=errorMsg.getText();
		String expectedErrorMsg="Captcha validation is required.";
		System.out.println(expectedErrorMsg.equals(ActualErrorMsg));
		//Validate error msg color
		System.out.println(errorMsg.getCssValue("color"));
		//Validate error msg background color
		System.out.println(errorMsg.getCssValue("background"));
		
        //Validate error msg getting displayed above email id field
		//error msg co-ordinates
	    Point errorPoint=errorMsg.getLocation();
	    int error_X=errorPoint.getX();
	    int error_Y= errorPoint.getY();
	    System.out.println("error msg x co-ordinate: "+error_X);
	    System.out.println("error msg Y co-ordinate: "+error_Y);
	    
	    //email id co-ordinates
	    Point emailPoint=usrenm.getLocation();
	    int email_X=emailPoint.getX();
	    int email_Y= emailPoint.getY();
	    System.out.println("email id x co-ordinate: "+email_X);
	    System.out.println("email id Y co-ordinate: "+email_Y);
	    
	    //Validate error msg getting displayed above email id field
	    System.out.println("error msg displayed above email id: "+(error_Y<email_Y));
	    
	    


	}

}



/*

TC2:
 Open any browser and enter url as https://www.rakuten.com/
 click on signin link enter username as abc@gmail.com
 enter password as abcd@1234
 click on SignIn button
 validate:
 	error msg
 	error msg color
 	error msg background color
	error msg getting displayed above email id field

*/