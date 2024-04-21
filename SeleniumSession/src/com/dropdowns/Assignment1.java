package com.dropdowns;

import java.time.Duration;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Assignment1 {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://demo.automationtesting.in/Register.html");
		// year dropdown
		WebElement yearSelect = driver.findElement(By.cssSelector("#yearbox"));
		Select yearDrop = new Select(yearSelect);
		// check multiple selection
		System.out.println("Allows to select multiple options or not:  " + yearDrop.isMultiple());
		// check whether your allowed to select any option or not
		yearDrop.selectByIndex(1);
		System.out.println("After selecting index 1 option: " + yearDrop.getFirstSelectedOption().getText());
		yearDrop.selectByIndex(2);
		System.out.println("After selecting index 2 option: " + yearDrop.getFirstSelectedOption().getText());
		yearDrop.selectByIndex(3);
		System.out.println("After selecting index 3 3option: " + yearDrop.getFirstSelectedOption().getText());
		List<WebElement> yearList = yearDrop.getOptions();
		System.out.println("" + yearList.size());

		for (int i = 1; i < yearList.size(); i++) {
			System.out.println(Integer.parseInt(yearList.get(i).getText()));
		}

		// validate year is in ascending order or not
		List<Integer> list = new ArrayList<Integer>();
		for (int i = 1; i < yearDrop.getOptions().size(); i++) {
			list.add(Integer.parseInt(yearDrop.getOptions().get(i).getText()));

		}
		List<Integer> clonedArray = new ArrayList<Integer>(list);
		Collections.sort(clonedArray);
		System.out.println(list.equals(clonedArray));

		// months
		//
		WebElement monthSelect = driver.findElement(By.cssSelector("select[placeholder='Month']"));
		Select monthDrop = new Select(monthSelect);
		// check multiple selection
		System.out.println("Allows to select multiple options or not:  " + monthDrop.isMultiple());
		// check whether your allowed to select any option or not
		monthDrop.selectByIndex(1);
		System.out.println("After selecting index 1 option: " + monthDrop.getFirstSelectedOption().getText());
		monthDrop.selectByIndex(2);
		System.out.println("After selecting index 2 option: " + monthDrop.getFirstSelectedOption().getText());
		monthDrop.selectByIndex(3);
		System.out.println("After selecting index 3 3option: " + monthDrop.getFirstSelectedOption().getText());
		
		//validate months option are in required sequence:
		
		List<String> monthList = new ArrayList<String>();
		for(int i=1;i<monthDrop.getOptions().size();i++){
			monthList.add(monthDrop.getOptions().get(i).getText());
			
		}
		List<String> monthSequence = new ArrayList<String>();
		monthSequence.add("January");
		monthSequence.add("February");
		monthSequence.add("March");
		monthSequence.add("April");
		monthSequence.add("May");
		monthSequence.add("June");
		monthSequence.add("July");
		monthSequence.add("August");
		monthSequence.add("September");
		monthSequence.add("October");
		monthSequence.add("November");
		monthSequence.add("December");
		System.out.println(	monthList.equals(monthSequence));
	}

}

/*
 * validate year and month dropdown - check multiple selection - check whether
 * your allowed to select any option or not - validate year is in ascending
 * order or not - validate months option are in required sequence
 */
