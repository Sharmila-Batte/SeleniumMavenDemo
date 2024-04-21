package com.seleniumdemo;

import org.openqa.selenium.chrome.ChromeDriver;

public class Demo1 {

	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.google.com/");
		System.out.println(driver.getTitle());
		String currentURL=driver.getCurrentUrl();
		String URL="https://www.google.com/";
		System.out.println("Compare 2 URL: "+currentURL.equals(URL));
		String pagesource=driver.getPageSource();
		System.out.println("pagesource: "+pagesource.length());
		System.out.println(driver.getCurrentUrl());
		driver.close();

	}

}
