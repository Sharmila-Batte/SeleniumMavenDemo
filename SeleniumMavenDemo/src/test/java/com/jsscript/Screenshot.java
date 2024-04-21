package com.jsscript;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import com.utility.SeleniumUtility;

public class Screenshot  {

	public static void main(String[] args) throws IOException {
		SeleniumUtility util=new SeleniumUtility();
		WebDriver driver=util.setUp("chrome","https://www.google.com/");
		TakesScreenshot ts=	(TakesScreenshot)driver;
		File file=ts.getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(file, new File("./Screenshots/google2.jpg"));
		


	}

}
