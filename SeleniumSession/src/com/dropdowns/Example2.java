package com.dropdowns;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Example2 {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://omayo.blogspot.com/");
		WebElement carDropdown=driver.findElement(By.cssSelector("#multiselect1"));
		Select carDrop=new Select(carDropdown);
		System.out.println("is car dropdown allows selecting multiple options? "+carDrop.isMultiple());
		List<WebElement>optionsList=carDrop.getOptions();
		System.out.println("Number of car available in Skill dropdown:  "+optionsList.size());
		for(int i=0;i<optionsList.size();i++)
		{
			System.out.println(""+optionsList.get(i).getText());
			
		}
		//use any one method to select value from dropdown
		carDrop.selectByIndex(0);
		carDrop.selectByIndex(1);
		carDrop.selectByIndex(2);
		List<WebElement> list=carDrop.getAllSelectedOptions();
		System.out.println(""+list.size());
		
		for(int i=0;i<list.size();i++)
		{
			System.out.println(""+list.get(i).getText());
		}
		//to unselect already selected option dn use any one method from below
		carDrop.deselectAll();
		}

}
