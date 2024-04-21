package com.jsscript;

import org.openqa.selenium.WebDriver;

import com.utility.SeleniumUtility;

public class ScreenshotUsingUtility {

	public static void main(String[] args) {
	
		SeleniumUtility util=new SeleniumUtility();
		WebDriver driver=util.setUp("chrome", "https://www.google.com/");
		util.getScreenshot("./Screenshots/google.jpg");
		

	}

}
