package com.dropdowns;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Example1 {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://demo.automationtesting.in/Register.html");
		WebElement skillDropDown = driver.findElement(By.cssSelector("#Skills"));
		Select skillDrop = new Select(skillDropDown);
		System.out.println("is Skill dropdown allows selecting multiple options? " + skillDrop.isMultiple());
		System.out.println("By Default/already selected option: " + skillDrop.getFirstSelectedOption().getText());
		List<WebElement> optionsList = skillDrop.getOptions();
		System.out.println(optionsList.size());
		for (int i = -0; i < optionsList.size(); i++) {
			System.out.println(optionsList.get(i).getText());
		}
		//use any one method to select value from dropdown
		skillDrop.selectByIndex(2);
		Thread.sleep(1000);
		System.out.println("After selecting index 2 option: "+skillDrop.getFirstSelectedOption().getText());
		skillDrop.selectByValue("Analytics");
		Thread.sleep(1000);
		System.out.println("After selecting value as Analytics:  "+skillDrop.getFirstSelectedOption().getText());
		skillDrop.selectByVisibleText("Microsoft Office");
		Thread.sleep(1000);
		System.out.println("After selecting visibletext as Microsoft Office: "+skillDrop.getFirstSelectedOption().getText());
		
	}

}
